import java.io.ObjectOutputStream;

/**
 * Created by msyed on 6/26/2014.
 */
//public class ChargeProfile {
    import java.io.ObjectOutputStream;
    public class ChargeProfile {
        public static void main(final String args[])throws Exception {

            Emp1 ee=new Emp1();
            ee.setEid(10);
            ee.setEname("basha");
            ee.setEsalary(1000);
            System.out.println(ee.getEid()+" "+ee.getEname()+" "+ee.getEsalary());
            //ChargeTest t = new ChargeTest();
            //t.setUp();
            long startTime = System.currentTimeMillis();
            System.out.println(startTime);

            int iterations = 1;

            if (args.length > 0) {
                try {
                    iterations = Integer.parseInt(args[0]);
                } catch (NumberFormatException e) {
                    iterations = 1;
                }
            }
            try {
               // t.timingTest(iterations);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }

            long endTime = System.currentTimeMillis();
            System.out.println(endTime);

            System.out.print("Test complete.\n" + "\tTotal time: " + (endTime - startTime) + "\n" + "\tAverage time: " + (float) (endTime - startTime) / (float) iterations + "\n");
        }
    }
//}
