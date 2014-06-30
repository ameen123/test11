/**
 * Created by msyed on 6/30/2014.
 */
public class StringTest {
    public static void main(String[] args)
    {
        String s="ameen";
        char[] ch=s.toCharArray();
        int count=0;
        for(Object obj:ch)
        {
            count++;
        }
        System.out.println(count);
    }
}
