import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    //object School is created

    public School(List<Teacher> teachers, List<Student> students)
    {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    //Returns the teachers in the School
    public List<Teacher> getTeachers()
    {
        return teachers;
    }

    //updates the Teachers in the school
    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }

    public List<Student> getStudents()
    {
        return students;
    }
    
    public void addStudent(Student student)
    {
        students.add(student);
    }


    //total money earned
    public int getTotalMoneyEarned()
    {
        return totalMoneyEarned;
    }

    //updates the money earned
    public static void updateTotalMoneyEarned(int MoneyEarned)
    {
        totalMoneyEarned += MoneyEarned;
    }

    //Returns total money spent by the Student
    public int getTotalMoneySpent()
    {
        return totalMoneySpent;
    }

    //update the money Spent
    public static void updateTotalMoneySpent(int moneySpent)
    {
        totalMoneySpent -= moneySpent;

    }
}
