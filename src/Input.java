public class MedicalForm {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Are you a smoker? (true/false)");
        boolean isSmoker = scanner.nextBoolean();

        System.out.println("\nMedical Form Summary: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Smoker: " + isSmoker);

        scanner.close();
    }
}
