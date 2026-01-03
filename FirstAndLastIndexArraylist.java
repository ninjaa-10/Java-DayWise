import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class FirstAndLastIndexArraylist 
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("ENter the size");
        int n=scan.nextInt();
        System.out.println("Enter elements into array");
        for(int i=0;i<n;i++)
        {
            arr.add(i,scan.nextInt());
        }
        System.out.println("Enter k value");
        int k=scan.nextInt();
        int res[]=arraylis(arr, n, k);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
    static int [] arraylis(ArrayList<Integer> arr,int n, int k)
    {
        int arr1[]=new int[2];
        int l=0,h=arr.size()-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr.get(mid)==k)
            {
                arr1[0]=mid;
                h=mid-1;
            }
            else if(k<arr.get(mid))
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return arr1;
    } 
}
