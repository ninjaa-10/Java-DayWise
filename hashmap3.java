import java.util.HashMap;
public class hashmap3
{
    public static void main(String[] args)
    {
        String str1="mama";
        String str2="amma";
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        System.out.println(check( str2, map));
    }
    static boolean check(String str2 , HashMap<Character,Integer> map)
    {
        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            if(!map.containsKey(ch))
            {
                return false;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0)
            {
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }    
}
