public class SplitBinaryString
{
    public static void main(String[] args)
    {
        String str="101000101101010011";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(i!=str.length()-1&&str.charAt(i)=='1' && str.charAt(i+1)=='0')
            {
                count++;
            }
        }
        System.out.println(count+1);
    }    
}
