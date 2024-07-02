package basic;

public class kycaccount {
    public class Customer Details
    {

        public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Customer Details for SB Account Opening in MEC_BANK");

            System.out.print("Name: "); String name = scanner.nextLine();

            System.out.print("Date of Birth: ");

            String dob = scanner.nextLine();

            System.out.print("Contact Number: ");

            String contact = scanner.nextLine();

            System.out.print("Email: ");

            String email = scanner.nextLine();

            System.out.print("Aadhaar Number: ");

            String aadhaar = scanner.nextLine();

            System.out.print("PAN Number: ");

            String pan = scanner.nextLine();

            System.out.println("Application submitted successfully for " + name + " in MEC_BANK. Thank you!");

            scanner.close();

        }


