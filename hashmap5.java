import java.util.*;
public class hashmap5
{
    public static void main(String[] args)
    {
        int arr[]={2,7,11,5};
        int target=9;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(target-arr[i]))
            {
                System.out.println("["+i+" "+map.get(target-arr[i])+"]");
                break;
            }
        }
    }
}
