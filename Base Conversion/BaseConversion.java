/**
 * Program that converts a number from any base to any base using recursion.
 * 
 * @author Atharva Manjrekar
 * @version 3/16/16
 */
public class BaseConversion
{
    public static void main(){
        System.out.println(pconvert("89", 10, 2)); //1011001
        System.out.println(pconvert("347", 10, 5)); //2342
        System.out.println(pconvert("3289", 10, 8)); //6331
        System.out.println(pconvert("1056543", 10, 26)); //282O7
        System.out.println(pconvert("784434", 10, 36)); //GT9U
        System.out.println(pconvert("983123", 10, 36)); //L2KZ
        System.out.println(pconvert("40", 5, 8)); //24
        System.out.println(pconvert("100", 2, 8)); //4
        System.out.println(pconvert("1101", 2, 8)); //15
        System.out.println(pconvert("100000", 2, 8)); //40
        System.out.println(pconvert("172", 8, 2)); //1111010
        System.out.println(pconvert("A72", 36, 16)); //336E
        System.out.println(pconvert("ABC", 2, 16)); //invalid
        System.out.println(pconvert("ABC", 11, 16)); //invalid
        System.out.println(pconvert("567", 4, 16)); //invalid
        System.out.println(pconvert("A334", 4, 16)); //invalid
        System.out.println(pconvert("Atharva Manjrekar", 4, 16)); //invalid
    }

    public static String pconvert(String num, int origBase, int newBase){
        return (toString(num, origBase, newBase, toBase10(num, origBase, newBase)));
    }

    public static String convert(int num, int base)
    {
        int quotient = num/base;
        int remainder = num%base;

        if(quotient == 0)
        {
            if (remainder > 9){
                return String.valueOf(Character.toChars((65+(remainder-10))));
            } else 
                return Integer.toString(remainder);      
        }
        else
        {
            if (remainder > 9){
                return convert(quotient, base) +  String.valueOf(Character.toChars((65+(remainder-10))));
            } else 
                return convert(quotient, base) + Integer.toString(remainder);
        }    

    }

    public static String toBase10(String num, int origBase, int outBase){
        if (checkInput(num, origBase) == true){ //check if input is valid
            //convert orig number to base 10
            int ans=0;
            int index=0;

            for(int i=num.length()-1; i>=0; i--)
            {
                char val=num.charAt(i);
                if(val>=65 && val<=70)//between A-Z
                {   
                    val-=55;
                    ans+=(val*((int)Math.pow(origBase,index)));
                }
                else //numbers
                {
                    val-=48;
                    ans+=(val*((int)Math.pow(origBase,index)));
                }
                index++;
            }
            return convert(ans, outBase);
        }
        return "";
    }

    public static boolean checkInput(String num, int origBase){
        if (origBase < 2 || origBase > 36){ //check the base range
            System.out.println("Base "+origBase+" out of range, must be between 2 and 36 inclusive.");
            return false;
        } else { //check for invalid digits for provided base
            int index = num.length()-1; //calculate total number of integers and letters
            while (index >= 0){
                char val = num.charAt(index);
                //check for digits in base 2 - 10
                if (val > (char)(47+origBase)){
                    System.out.println("Your number "+num+" contains invalid digit "+val+" for base "+origBase+"");
                    return false;
                } 
                //check for digits and letters for bases 11- 36
                if( val > (char)(54+origBase)){ //out of range
                    System.out.println("Your number "+num+" contains invalid letter "+val+" for base "+origBase+""); 
                    return false;
                }
                //}
                index--;
            }
            return true; //valid input
        }
    }

    public static String toString(String num, int origBase, int outBase, String result){
        if (result.equals("")){
            return ""; 
        }
        return num+" (base "+origBase+") is equal to "+result+" (base "+outBase+").\n";
    }
}