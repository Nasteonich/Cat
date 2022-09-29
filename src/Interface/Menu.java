package Interface;

import Healing.Disease;
import Hospital.Admin;
import Hospital.Client;
import Hospital.Doctor;
import Hospital.Patient;

import java.util.Scanner;

public class Menu {

    public static void print_menu(){

        System.out.println("1 - Add Doctor");
        System.out.println("2 - Add Patient");
        System.out.println("3 - Add Client");
        System.out.println("4 - Add Admin");
        System.out.println("0 - Exit");

    }

    public static void menu() {

        print_menu();
        System.out.println("Input menu's number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (number != 0) {
            if (number == 1) {

                System.out.println("Creating Doctor............");
                Doctor doctor = new Doctor();

                System.out.println("Input id: ");
                int is_id = scan.nextInt();
                doctor.setId(is_id);

                System.out.println("Input Name: ");
                String is_Name = scan.next();
                doctor.setName(is_Name);

                System.out.println("Input Surname: ");
                String is_Surname = scan.next();
                doctor.setSurname(is_Surname);

                System.out.println("Input Age: ");
                int is_age = scan.nextInt();
                doctor.setAge(is_age);

                System.out.println("Input Salary: ");
                double is_Salary = scan.nextDouble();
                doctor.setSalary(is_Salary);

                System.out.println(doctor);

            } else if (number == 2) {

                System.out.println("Creating patient............");
                Patient patient = new Patient();

                System.out.println("Input id: ");
                int is_id = scan.nextInt();
                patient.setId(is_id);

                System.out.println("Input nickname: ");
                String nickname = scan.next();
                patient.setNickname(nickname);

                System.out.println(patient);

            } else if (number == 3) {

                System.out.println("Creating client............");
                Client client = new Client();

                System.out.println("Input id: ");
                int is_id = scan.nextInt();
                client.setId(is_id);

                System.out.println("Input Name: ");
                String is_Name = scan.next();
                client.setName(is_Name);

                System.out.println("Input Surname: ");
                String is_Surname = scan.next();
                client.setSurname(is_Surname);

                System.out.println("Input Age: ");
                int is_Age = scan.nextInt();
                client.setAge(is_Age);

                System.out.println("Input NameTier: ");
                String is_NameTier = scan.next();
                client.setNameTier(is_NameTier);

                System.out.println(client);


            } else if (number == 4) {

                System.out.println("Creating admin............");
                Admin admin = new Admin();

                System.out.println("Input id: ");
                int is_id = scan.nextInt();
                admin.setId(is_id);

                System.out.println("Input Name: ");
                String is_Name = scan.next();
                admin.setName(is_Name);

                System.out.println("Input Surname: ");
                String is_Surname = scan.next();
                admin.setSurname(is_Surname);

                System.out.println("Input Age: ");
                int is_Age = scan.nextInt();
                admin.setAge(is_Age);

                System.out.println("Input Number: ");
                String is_Number = scan.next();
                admin.setNumber(is_Number);

                System.out.println(admin);

            } else {
                System.out.println("This number doesn't exist!");
            }

            print_menu();
            System.out.println("Input menu's number: ");
            number = scan.nextInt();

        }


    }


}
