import java.util.ArrayList;
import java.util.List;

public class Main {

    static void callPersonToDuty(Person person) {
        person.performDuty();
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Student("Иван", 16, 10));
        people.add(new Teacher("Мария Ивановна", 35, "Математика"));
        people.add(new Principal("Александр Петрович", 50, 25));

        // Вызываем метод callPersonToDuty для каждого человека
        for (Person person : people) {
            callPersonToDuty(person);

            // Вызов уникальных методов
            if (person instanceof Student) {
                ((Student) person).study();
            } else if (person instanceof Teacher) {
                ((Teacher) person).teach();
            } else if (person instanceof Principal) {
                ((Principal) person).manage();
            }

            System.out.println();
        }
    }

}