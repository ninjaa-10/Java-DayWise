public class quicksort
{
    public static void main(String[] args)
    {
        int arr[]={ 7,6,10,5,9,2,1,15,7};
        int l=0;
        int h=arr.length-1;
        quick(arr,l,h);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
    static void quick(int arr[],int l,int h)
    {
        if(l<h)
        {
            int mid=partition(arr,l,h);
            quick(arr, l, mid-1);
            quick(arr, mid+1, h);
        }
    }
    static int partition(int arr[],int l,int h)
    {
        int pivot=arr[l];
        int i=l+1;
        int j=h;
        while(i<j)
        {
            while(arr[i]<pivot && i<j)
            {
                i++;
            }
            while(arr[j]>pivot && j>=i)
            {
                j--;
            }
            if(i<j)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return j;
    }   
}
