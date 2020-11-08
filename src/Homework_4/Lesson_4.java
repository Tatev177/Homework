package Homework_4;

public class Lesson_4 {
    public static void main(String[] args) {
        applicationFormforPicsArt employee = new applicationFormforPicsArt();
        employee.firstName = "Tatevik";
        employee.lastName = "Chibukhchyan";
        employee.country = "Yerevan, Armenia";
        employee.isArmenian = true;
        employee.student = true;
        System.out.println(employee.firstName + " " + employee.lastName);
        System.out.println(employee.getYear());
        System.out.println(employee.student);
        System.out.println(employee.isArmenian);
        System.out.println(employee.currentCompanyName);
        employee.setYear(19);
        System.out.println(employee.getYear());

    /*    int y = employee.sum(employee.year, employee.phoneNumber);
        System.out.println(y);
        */
        applicationFormforPicsArt employee1 = new applicationFormforPicsArt();
        employee1.firstName = "Arevik";
        employee1.lastName = "Sargsyan";
        employee1.printFullName();
    }
}
