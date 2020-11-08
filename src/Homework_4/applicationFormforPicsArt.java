package Homework_4;

public class applicationFormforPicsArt {
    public String firstName;
    public String lastName;
    private int year = 1996;
    public char gender;
    public String country = "Bangalore, India";
    public boolean isArmenian;
    public String email;
    public int phoneNumber;
    public char anotherMail = 'N';
    public String password;
    public String confirmPassword;
    public String education;
    public boolean student;
    public boolean workExperience;
    public String currentCompanyName;

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        if (y >= 1989 && y <= 2005) {
            year = y;
        }
    }
}
