import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by msyed on 6/19/2014.
 */
public class FileRead {
    public static void main(String[] args)throws Exception
    {
        FileReader fr=new FileReader("bbb");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();

        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }
    }
}
