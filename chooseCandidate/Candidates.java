
import java.util.Scanner;

public class Candidates {

    String name, qualifications, status;
    private int age;

    public void getCandidatesDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your qualifications: ");
        qualifications = sc.next();
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        AgeValidation obj = new AgeValidation();
        obj.validateAge();
        obj.printCandidatesDetails();
        sc.close();
    }

    public static void main(String[] args) {

        Candidates candidates = new Candidates();
        candidates.getCandidatesDetails();

    }

    public class AgeValidation {
        public void validateAge() {
            if (age > 21 && age <= 25) {
                status = "selected";
            } else {
                status = "rejected";
            }
        }

        public void printCandidatesDetails() {
            System.out.println("name: " + name);
            System.out.println("Qualifications: " + qualifications);
            System.out.println("Age: " + age);
            System.out.println("Selection status: " + status);
        }

    }

}
