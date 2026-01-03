import java.util.HashSet;
import java.util.Scanner;

public class hashmap8
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        HashSet<Integer> map=new HashSet<>();
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            map.add(scan.nextInt());
        }
        int high=0;
        for(Integer i:map)
        {
            int max=0;
            while(map.contains(i))
            {
                max++;
                i++;
            }
            if(max>high)
            {
                high=max;
            }
        }
        System.out.println(high);
    }    
}
