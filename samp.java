public class samp
{
    public static void main(String[] args)
    {
        String s="banana";
        int ch[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            ch[s.charAt(i)-'a']++;
        }
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>0)
            {
                System.out.println((char)(i+'a')+"-->"+ch[i]);
            }
        }   
    }
}