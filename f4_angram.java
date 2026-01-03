import java.util.Arrays;

public class f4_angram 
{
    public static void main(String[] args)
    {
        String s1="Amma";
        String s2="mama";
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean bol=true;
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i]!=ch2[i])
            {
                System.out.println("Not a anagram");
                bol=false;
                break;
            }
        }
        if(bol)
        {
            System.out.println("It is a anagram");
        }
           
    }    
}
