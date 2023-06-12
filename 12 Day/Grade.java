import java.util.Scanner;

class Person {
    protected java.lang.String firstName;
    protected java.lang.String lastName;
    protected int idNumber;

    // Constructor
    Person(java.lang.String firstName2, java.lang.String lastName2, int identification) {
        this.firstName = firstName2;
        this.lastName = lastName2;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    Student(java.lang.String firstName, java.lang.String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    char calculate() {
        int total = 0;
        for (int testScore : testScores) {
            total += testScore;
        }
        int avg = total / testScores.length;
        if (avg >= 90 && avg <= 100) {
            return 'O';
        } else if (avg >= 80 && avg < 90) {
            return 'E';
        } else if (avg >= 70 && avg < 80) {
            return 'A';
        } else if (avg >= 55 && avg < 70) {
            return 'P';
        } else if (avg >= 40 && avg < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}

class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        java.lang.String firstName = scanner.next();

        System.out.print("Enter last name: ");
        java.lang.String lastName = scanner.next();

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter the number of test scores: ");
        int numScores = scanner.nextInt();

        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
        }

        scanner.close();

        Student student = new Student(firstName, lastName, id, testScores);

        System.out.println();
        student.printPerson();
        System.out.println("Grade: " + student.calculate());
    }
}
