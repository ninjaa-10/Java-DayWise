public class g4_stringRotation
{
    public static void main(String[] args)
    {
        String s1="ABCD";
        String s2="CDAB";
        if(s1.length()!=s2.length())
        {
            System.out.println("we cannot rotate");
        }
        int i=0,count=0;
        while(i<s2.length())
        {
            if(s1.equals(rev(s2)))
            {   
                System.out.println(count);
                break;
            }
            s2=rev(s2);
            count++;
            i++;
        }
    }
    static String rev(String s1)
    {
        return s1.substring(1)+s1.charAt(0);
    }   
}

