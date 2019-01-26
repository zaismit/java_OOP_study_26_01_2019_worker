public class worker extends main_file
{
    String name;
    String position;
    int salary;
    int month;

    public worker (
                   String name,
                   String position,
                   int salary,
                   int month
                   )
    {
        this.name       = name;
        this.position   = position;
        this.salary     = salary;
        this.month      = month;
    }

    int salary()
    {
        int times;
        times = month * salary;
        return times;
    }
}
