public class a4_palindrome
{
    public static void main(String[] args)
    {
        String s="MadaMa";
        boolean bol=palin(s);
        if(bol)
        {
            System.out.println("it is palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
    static boolean palin(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i!=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
               return false;
            }
        }
        return true;
    }    
}
