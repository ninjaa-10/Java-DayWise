import java.util.*;
public class LongPalindrome
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        String str="forgeeksskeegfor";
        int i=0,j=str.length()-1;
        String str1="";
        while (i<j)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                i++;
                j--;
                str1+=str.charAt(i);
            }
            else
            {
                i++;j--;
                str1="";
            }   
        }
        for(int k=0;k<str1.length();k++)
        {
            System.out.print(str1.charAt(k));
        }
        for(int k=str1.length()-3;k>=0;k--)
        {
            System.out.print(str1.charAt(k));
        }
    }    
}
