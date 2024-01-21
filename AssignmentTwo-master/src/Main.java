import interfaces.Payable;
import models.Employee;
import models.Person;
import models.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Cristiano","Ronaldo","Football player",200000000);
        Employee employee2 = new Employee("Lionelya","Pepsi","Short Football player",100);
        Employee employee3 = new Employee("Jude","Belligol","Football player",100000000);

        Student student1 = new Student("Damir", "Kairlbay", 1.43);
        Student student2 = new Student("Andrey", "Pirozhkov", 0.3);
        Student student3 = new Student("Holi", "Bolli", 2.3);

        ArrayList<Person> people = new ArrayList<>();

        people.add(employee2);
        people.add(employee1);
        people.add(employee3);

        people.add(student1);
        people.add(student2);
        people.add(student3);

        Collections.sort(people);

        printData(people);



    }
    public static void printData(Iterable<Person> people){
        for (Person p : people) {
            System.out.println(p + " earns " + p.getPaymentAmount() + " tenge");
        }
    }
}
