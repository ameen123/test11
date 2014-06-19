/**
 * Created by msyed on 6/18/2014.
 */
import java.util.*;
public class Map1 {
    public static void main(String[] args)
    {
        Map m=new HashMap();
        m.put(10,"ameen");
        m.put(20,"basha");
        m.put(30,"hai");
        //System.out.println("hai");

        Set keys=m.keySet();
        Iterator it=keys.iterator();
        while(it.hasNext())
        {
            Object obj=it.next();
            System.out.println(m.get(obj));
        }
    }
}
