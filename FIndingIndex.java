public class FIndingIndex
{
    public static void main(String[] args)
    {
        int arr[]={2,2,3,3,3,4,5,7,8};
        int k=3;
        int f=0,l=arr.length-1;
        int res=0;
        while(f<=l)
        {
            int mid=(f+l)/2;
            if(arr[mid]==k)
            {
                res=mid;
                l=mid-1;
            }
            else if(arr[mid]<k)
            {
                f=mid+1;
            }
            else
            {
                l=mid-1;
            }
        }
        System.out.println("Found at index "+(res));
    }    
}
