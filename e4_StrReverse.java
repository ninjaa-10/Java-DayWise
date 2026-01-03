public class e4_StrReverse
{
    public static void main(String[] args)
    {
        String str="hello";
        String rev="";
        for(int j=str.length()-1;j>=0;j--)
        {
            rev+=str.charAt(j);
        }
        System.out.println(rev);     
    }    
}
