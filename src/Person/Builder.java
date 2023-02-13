package Person;

public class Builder extends  Person{
    public Builder(String name) {
        super(name);
    }

    @Override
    public void working() {
        System.out.println("work at kut stroy");
    }
}
