public class c3 
{
    public static void main(String[] args) 
    {
        int n=4;
        int s=(n*2)-2;
        for(int i=0;i<n;i++)
        {
            int l=0;
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
                l++; 
            }
            for(int k=l;k<=s;k++)
            {
                System.out.print("  ");
            }
            for(int m=s+1;m<n*2;m++)
            {
                System.out.print("* ");
            }
            s=s-1;
            System.out.println();
        }
        int p=(n*2)-2;
        for(int i=n;i>=0;i--)
        {
            int l=0;
            for(int j=i;j>0;j--)
            {
                System.out.print("* ");
                l++; 
            }
            System.out.println();
        }
    }    
}
