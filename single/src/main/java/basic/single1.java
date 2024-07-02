package basic;
class bank
{
    public void customer_details() {

        String name = "Manju";
        int account_number = 876654;
        System.out.println(name);
        System.out.println(account_number);
    }
}
class transaction extends bank
{
    public void transaction() {
        String bank_name = " Indian";
        System.out.println(bank_name);
    }

}
public class single1 {
    public static void main(String args[]) {
        bank c1 =new bank();
        c1.customer_details();
    }
}


