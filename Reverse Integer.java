Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:
class Solution {
public:
int reverse(int x)
{
//example 123 --> 010+3=[3] --> 310+ 2=[32] -->3210 +1=[321 ] ...hence //number_reverse
bool mi = false;
long int reverse_the_Number=0;
long int reminder=0;
// In case number is negative!!
if(x<0){ x=abs(x);
mi=true;
}
while(x>0){
reminder=x%10;
reverse_the_Number=(reverse_the_Number10)+ reminder;
x/=10;
}
//if in case range of reverse number is more then the range of integer value so..
if(reverse_the_Number<pow(-2,31)||reverse_the_Number>(pow(2,31)-1)) return 0;
//if in case number negative!!!
if(mi){
return -1*reverse_the_Number;
}

    return reverse_the_Number;
} 
};
