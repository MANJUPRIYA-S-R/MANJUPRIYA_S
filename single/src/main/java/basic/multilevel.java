package basic;
class Student{
    public void teacher()
    {
        String name = " Hari";
        System.out.println(name);
    }
}
class parents extends Student
{
    public void parent()
    {
        String parent_name = " Sabiya";
        System.out.println(parent_name);
    }
}
class Student_name extends parents
{
    public void Student_name()
    {
        String Student_nmae =" Manju";
        int Roll_number = 103;
        System.out.println(Student_nmae);
        System.out.println(Roll_number);
    }
}
public class multilevel {
    public static void main(String args[]) {
        students c1 = new students();
        c1.students_name();

    }
}
