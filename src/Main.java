import java.util.Random;

class PermissionChecker {
    public static void main(String[] args) {
        int age1 = generateRandomAge();
        int age2 = generateRandomAge();
        int age3 = generateRandomAge();
        int age4 = generateRandomAge();
        int age5 = generateRandomAge();

        int temperature = 10;

        System.out.println("Возраст: " + age1 + ", Температура: " + temperature + ", Результат: " + permission(age1, temperature));
        System.out.println("Возраст: " + age2 + ", Температура: " + temperature + ", Результат: " + permission(age2, temperature));
        System.out.println("Возраст: " + age3 + ", Температура: " + temperature + ", Результат: " + permission(age3, temperature));
        System.out.println("Возраст: " + age4 + ", Температура: " + temperature + ", Результат: " + permission(age4, temperature));
        System.out.println("Возраст: " + age5 + ", Температура: " + temperature + ", Результат: " + permission(age5, temperature));
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
