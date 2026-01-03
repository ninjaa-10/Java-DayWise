public class c4_dupliRemove
{
    public static void main(String[] args)
    {
        String s="programming";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=0;j<i;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                str+=s.charAt(i);

            }
            /*else
            {
                int c=0;
                for(int k=0;k<str.length();k++)
                {
                    if(str.charAt(k)==s.charAt(i))
                    {
                        c=1;
                    }
                }
                if(c==0)
                {
                    str+=s.charAt(i);
                }*/
        }
        System.out.println(str);    
    }    
}
