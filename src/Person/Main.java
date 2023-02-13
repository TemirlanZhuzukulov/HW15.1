package Person;

import Person.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Aibek");
        System.out.println(person);
        person.working();

        Programmer programmer =new Programmer("Abylai");
        System.out.println(programmer);
        programmer.working();

        Builder builder = new Builder("Asan");
        System.out.println(builder);
        builder.working();

        Driver driver=new Driver("Beka");
        System.out.println(driver);
        driver.working();



    }

}
