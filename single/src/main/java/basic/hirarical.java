package basic;
class students
{
    public  student_rollnumber;

    public void students_name()
    {
        String name = "Manju";
        int mark = 404;
        System.out.println(name);
        System.out.println(mark);
    }


}

class parent extends students
{
    public void parent()
    {
        String parent_name = "subramani";
        System.out.println("parent name");
    }
}
class student_rollnumber extends students
{
    public void student_number()
    {
        int student_number = 103;
        System.out.println("student rollnumber");
    }
}
public class hirarical {
    public static void main(String args[])
    {
        students c1 = new students();
        c1.students_name();


    }

    }
