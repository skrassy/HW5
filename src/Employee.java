public class Employee {
    String name;
    String post;
    String eMail;
    String tel;
    int salary;
    int age;

    Employee(String name, String post, String eMail, String tel, int salary, int age) {
        this.name = name;
        this.post = post;
        this.eMail = eMail;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }

    void info() {
        System.out.println("Ф.И.О.: " +
                name + " Должность: " + post + " eMail: " +
                " Телефон: " + " Зарплата: " + salary + " Возраст: " + age);

    }
}
