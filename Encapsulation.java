package basic;

    class Student
    {
        public int stdid;

        public int getStdid() {
            return stdid;
        }

        public void setStdid(int stdid) {
            this.stdid = stdid;
        }

        public String getStdaddress() {
            return stdaddress;
        }

        public void setStdaddress(String stdaddress) {
            this.stdaddress = stdaddress;
        }

        public String stdname;

        public String getStdname() {
            return stdname;
        }

        public void setStdname(String stdname) {
            this.stdname = stdname;
        }

        public String stdaddress;
    }

public class Encapsulation {
    public static void main(String[] args) {
        Student ss = new Student();
        ss.setStdid(103);
        ss.setStdname("Manju");

        ss.setStdaddress("Salem");
        System.out.println(ss.getStdid() + "\n" + ss.getStdname() + "\n" + ss.getStdaddress());
    }
}