public class d4_duplicRemove
{
    public static void main(String[] args)
    {
        String s="programming";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(str.indexOf(ch)==-1)
            {
                str+=s.charAt(i);
            }
        }
        System.out.println(str);    
    }
    
}