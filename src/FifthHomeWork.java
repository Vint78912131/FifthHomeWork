/**
 * Lesson 5. HomeWork
 *
 * @author SotnikovVS
 * @version 15.11.2021
 *
 */
public class FifthHomeWork {
    public static Employee[] employees;
    public static void main(String[] args) {
        employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich","carpenter","carpenterIvan@gmail.com","89101231230",650,41);
        employees[1] = new Employee("Petrov Sergey Sergeevich","turner","turnerSergey@gmail.com","89101231231",750,42);
        employees[2] = new Employee("Sidorov Pavel Pavlovich","locksmith","locksmithPavel@gmail.com","89101231232",550,39);
        employees[3] = new Employee("Igumnov Andrey Andreevich","smith","smithAndrey@gmail.com","89101231233",950,43);
        employees[4] = new Employee("Liliputin Vladimir Vladimirovich","chief master","chiefMasterVV@gmail.com","89101231777",1100,45);

        for (Employee e: employees) {
            if (e.getAge() >= 40)
                System.out.println(e);
        }
    }
}
