public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private int wage;
    private int age;


    public Employee(String fio, String position, String email, String phoneNumber, int wage, int age) {
        this.setFio(fio);
        this.setPosition(position);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setWage(wage);
        this.setAge(age);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ("Emploee:  " + this.getFio() +
                "\n Position: " + this.getPosition() +
                "\n Wage: " + this.getWage() + " $" +
                "\n Email: " + this.getEmail() +
                "\n Phone number: " + this.getPhoneNumber() +
                "\n Age: " + this.getAge() + " y.o.\n");
    }
}
