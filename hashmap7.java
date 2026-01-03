import java.util.*;
public class hashmap7
{
    public static void main(String[] args)
    {
        String str="abcabcbb";
        int j=0;
        int max=0;
        int start=0;
        HashSet<Character> map=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            while(map.contains(str.charAt(i)))
            {
                map.remove(str.charAt(j));
                j++;
            }
            map.add(str.charAt(i));
            if((i-j+1)>max)
            {
                max=Math.max(max,i-j+1);
                start=j;
            }
        }
        System.out.println(str.substring(start,max));
        System.out.println(max);    
    }    
}
