public class Homework5 {
    public static void main (String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов П.И.", "Менеджер", "ivanov@mail.ru", "35-26-12", 35600, 32);
        employee[1] = new Employee("Петров А.Н.", "Стажер", "petrov@mail.ru", "35-26-12", 19900, 23);
        employee[2] = new Employee("Сидоров Я.А.", "Начальник отдела", "sidorov@mail.ru", "35-45-41", 58300, 46);
        employee[3] = new Employee("Жукова А.А.", "Менеджер", "jukova@mail.ru", "35-26-05", 37000, 28);
        employee[4] = new Employee("Смирнова П.И.", "Менеджер", "smirnova@mail.ru", "35-26-34", 35000, 49);

        for (int i = 0; i < employee.length; i++) {
            if (employee[i].age >= 40) {
                employee[i].info();
            }
        }
    }
}
