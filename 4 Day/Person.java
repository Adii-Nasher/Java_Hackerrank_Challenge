import java.util.Scanner;

public class Person {
private int age;

public Person(int initialAge) {
    if (initialAge < 0) {
        age = 0;
        System.out.println("Age is not valid, setting age to 0.");
    } else {
        age = initialAge;
    }
}

public void amIOld() {
    String ans;
    if (age < 13) {
        ans = "You are young.";
    } else if (age >= 13 && age < 18) {
        ans = "You are a teenager.";
    } else {
        ans = "You are old.";
    }
    System.out.println(ans);
}

public void yearPasses() {
    age += 1;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of persons: ");
    int numberOfPersons = sc.nextInt();

    for (int personIndex = 0; personIndex < numberOfPersons; personIndex++) {
        System.out.print("Enter the age of person " + (personIndex + 1) + ": ");
        int age = sc.nextInt();
        Person person = new Person(age);

        person.amIOld();

        for (int year = 0; year < 3; year++) {
            person.yearPasses();
        }

        person.amIOld();
        System.out.println();
    }

    sc.close();
}
}
