/**
 * Created by msyed on 6/18/2014.
 */
import java.util.*;
public class Map2 {
    public static void main(String[] args)
    {
        Emp1 e1=new Emp1();
        e1.setEid(1);
        e1.setEname("aaa");
        e1.setEsalary(1000);

        Emp1 e2=new Emp1();
        e2.setEid(2);
        e2.setEname("bbb");
        e2.setEsalary(2000);


        Map m=new HashMap();
        m.put(111,e1);
        m.put(112,e2);

        Set s=m.keySet();
        Iterator keys=s.iterator();
        while (keys.hasNext())
        {
            Object obj=keys.next();
            Object values=m.get(obj);
            Emp1 ee=(Emp1)values;
            System.out.println(ee.getEid()+" "+ee.getEname()+" "+ee.getEsalary());

        }

    }
}
