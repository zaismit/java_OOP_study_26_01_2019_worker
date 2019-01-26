public class main_file
{
    public static void main(String args[])
    {
        worker  new_worker;
                new_worker = new worker(
                                        "ALEXANDER",
                                        "ceo",
                                        300,
                                        5
                                       );

        System.out.println(
                           new_worker.name + "\n"+
                           new_worker.position +"\n"+
                           new_worker.salary +"\n"+
                           new_worker.salary()
                          );
    }
}
