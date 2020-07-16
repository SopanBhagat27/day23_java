public class wage_for_month
{
    public static void main(String[] args)
    {

        int  is_full=1;
        int is_part=2;
        //wage per day for full time
        int fulltime=160;
        //wage per day for part time
        int parttime=80;
        int  days_of_month=20;


                double emp = Math.floor(Math.random() * 10) % 3;
                if (is_full == emp )
                 {
                                System.out.println("employee is present for full day");
                                int  cal=(fulltime*days_of_month);
                                System.out.println("monthly wage for full time employee " +cal);

                 }
                else if (is_part == emp)
                        {
                                System.out.println("employee is present for half day");
                                int  cal=(parttime*days_of_month);
                                System.out.println("monthly wage for part time employee " +cal);

                        }

                else
                        {
                                System.out.println("employee is absent");
                        }
    }
}
