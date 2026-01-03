public class d3 
{
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int s=0;s<5-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(combination(i,j)+" ");
            }
            System.out.println();
        }
    }
    static int combination(int r,int c)
    {
        int ans=1;
        for(int i=1;i<=c;i++)
        {
            
            ans*=(r-i+1);
            ans/=i;
        }
        return ans;
    }    
}
