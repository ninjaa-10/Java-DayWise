public class StringRotation
{
    public static void main(String[] args)
    {
        one a=new one();
        StringBuilder s1=new StringBuilder("abcd");
        StringBuilder s2=new StringBuilder("dcab");
        int i=0;
        int count=0;
        boolean bol=true;
        while(i<s2.length())
        {
            count++;
            StringBuilder s3=new StringBuilder(a.add(s2));
            if(s1.toString().equals(s3.toString()))
            {
                System.out.println(count);
                bol=false;
                break;
            }
            else
            {
                s2=new StringBuilder(a.add(s2));
            }
            i++;
        }
        if(bol)
        {
            System.out.println("the roation cannot be done ");
        }
    }    
}
class one
{
    String add(StringBuilder s2)
    {
        String s="";
        char ch=s2.charAt(0);
        for(int i=0;i<s2.length()-1;i++)
        {
            s+=s2.charAt(i+1);
        }
        s+=ch;
        return s;
    }
}

