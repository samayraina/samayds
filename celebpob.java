import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            st.push(i);
        }
        
    while(st.size()>=2){
        int i =st.pop();
        int j=st.pop();
        
        if(arr[i][j]==1){
            st.push(j);
        }
        else{
            st.push(i);
        }
    }
    int pot =st.pop();
    for(int i=0; i<arr.length; i++)
{
    if(pot!=i){// the potential should be not equal to becausing we are checking in the same row and same column i.e 2must not be equal to 2
        if(arr[i][pot]==1 || arr[pot][i]==0){
            System.out.println("none");
            return;
        }
    }
}        
        
        
System.out.println(pot);
    }    
        
        
    }

