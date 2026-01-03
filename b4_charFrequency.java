public class b4_charFrequency 
{
    public static void main(String[] args)
    {
        String s="banana";
        char str[]=new char[s.length()];
        int str1[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int count=1;
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            int f=0;
            for(int k=0;k<=i;k++)
            {
                if(s.charAt(i)==str[k])
                {
                    f=1;
                }
            }
            if(f==0)
            {
                str[i]=s.charAt(i);
                str1[i]=count;
            }   
        }
        for(int i=0;i<str.length;i++)
        {
            if(str1[i]!=0)
            {
                System.out.println(str[i]+"-->"+str1[i]);
            }
        }
    }    
}
