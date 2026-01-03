public class RecursiveInsertionsort
{
    public static void main(String[] args)
    {
        int arr[]={3,5,1,6,2};
        int i=1;
        insertionsort(i,arr);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
    static void insertionsort(int i,int arr[])
    {
        if(i==arr.length)
        {
            return;
        }
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        insertionsort(i+1, arr);
    }  
}
