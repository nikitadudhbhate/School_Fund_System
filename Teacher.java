public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

     //creates a new teacher object
    public Teacher(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;


    }


    //Return the Id of a teacher
    public int getId() {
            return id;
    }

    //Returns the name of the teacher
    public String getName() {
        return name;
    }

    //Returns the Salary of the Teacher
    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }


    public void receiveSalary(int salary)
    {
        salaryEarned += salary;
        School.updateTotalMoneyEarned(salary);
    }
    @Override
    public String toString()
    {
        return "Name of the Teacher : " +name+ " " + "Total Salary earned till now rs." + salaryEarned;
    }
}
