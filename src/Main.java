public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastname = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastname;
        System.out.println("Имя сотрудника " + fullName);
        String result = fullName.toUpperCase();
        System.out.println("Имя сотрудника для отчёта " + result);
        String secondFullName = "Иванов Семён Семёнович";
        secondFullName = secondFullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + secondFullName);
    }

}