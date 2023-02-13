package Person;

import java.time.LocalDate;

public class Person {
    private final String name ;
    private static LocalDate age;

   public void working(){
       System.out.println(name+" workt at Peaksoft");
   }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
