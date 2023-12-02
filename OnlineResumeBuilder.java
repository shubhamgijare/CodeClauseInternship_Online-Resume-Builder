# CodeClauseInternship_Online-Resume-Builder
import java.util.Scanner;
class Candidate {
    String name;
    String email;
    String phoneNumber;
    String profession;
    String qualification;
    String skills;
Candidate(String name, String email, String phoneNumber, String profession, String qualification, String skills) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
        this.qualification = qualification;
        this.skills = skills;
    }
}
class OnlineResumeBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Online Resume Builder!");
        System.out.println("Enter your details below:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Profession: ");
        String profession = scanner.nextLine();

        System.out.print("Qualification: ");
        String qualification = scanner.nextLine();

        System.out.print("Skills: ");
        String skills = scanner.nextLine();

        Candidate candidate = new Candidate(name, email, phoneNumber, profession, qualification, skills);
        System.out.println("\nResume:");
        System.out.println("Name: " + candidate.name);
        System.out.println("Email: " + candidate.email);
        System.out.println("Phone Number: " + candidate.phoneNumber);
        System.out.println("Profession: " + candidate.profession);
        System.out.println("Qualification: " + candidate.qualification);
        System.out.println("Skills: " + candidate.skills);

        scanner.close();
    }
}
