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
        employee.setExperYear(4);
        System.out.println(employee.getExperYear());
        employee.setGradYear(2018);
        System.out.println(employee.getExperYear());
    /*    int y = employee.sum(employee.year, employee.phoneNumber);
        System.out.println(y);
        */
        applicationFormforPicsArt employee1 = new applicationFormforPicsArt();
        employee1.firstName = "Arevik";
        employee1.lastName = "Sargsyan";
        employee1.printFullName();
        employee1.isArmenian=true;
        System.out.println(employee1.isArmenian);
        employee1.setGradYear(2016);
        System.out.println(employee1.getExperYear());
        employee1.setExperYear(2);
        System.out.println(employee1.getExperYear());

        additional employee2 = new additional();
        employee2.setFullName("Narine Gevorgyan");
        System.out.println(employee2.getFullName());
        System.out.println(employee2.getCardNumber());

        applicationFormforPicsArt employee3 = new applicationFormforPicsArt();
        employee3.firstName = "Grigor";
        employee3.lastName = "Gevorgyan";
        employee3.printFullName();
        employee3.setGradYear(2009);
        System.out.println(employee3.getExperYear());
        employee3.setExperYear(6);
        System.out.println(employee3.getExperYear());
        employee3.country = "California";
        System.out.println(employee3.country);
        employee3.anotherMail='Y';
        System.out.println(employee3.anotherMail);

    }

}
