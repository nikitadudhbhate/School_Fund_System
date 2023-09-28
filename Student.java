
// keeping the track of students fees name grade and fees paid.
public class Student {
    
    private int  id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;




// to create a new student by intialising 
public Student(int id,String name,int grade)
{
    this.id = id;
    this.name = name;
    this.grade = grade;
    this.feesPaid = 0;
    this.feesTotal = 110000;

}


//Update grades of the Student
public void setGrade(int grade) {
    this.grade = grade;
}

public void payFees(int fees)
{
    feesPaid += fees;
    School.updateTotalMoneyEarned(feesPaid);
}

//Return the id of the Student
public int getId() {
    return id;
}

//Return the  name of the Student
public String getName() {
    return name;
}

public int getGrade()
{
    return grade;
}

public int getFeesPaid()
{
    return feesPaid;

}
public int getFeesTotal()
{
    return feesTotal;
}

public int getRemainingFees()
{
    return feesTotal-feesPaid;
}

@Override
public String toString()
{
    return "Student's Name :" +name+ " " + "Total Fees paid till now Rs ." + feesPaid;
}

}