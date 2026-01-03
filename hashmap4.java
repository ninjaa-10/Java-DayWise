import java.util.HashMap;
import java.util.LinkedHashMap;
public class hashmap4
{
    public static void main(String[] args)
    {
        String str="swiss";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else
            {
                map.put(ch, 1);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))<2)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }    
}
