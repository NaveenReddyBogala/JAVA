class Person {

    String fname;

    int age;
    String food;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Person(String fname,  int age, String food) {
        this.fname = fname;

        this.age = age;
        
        this.food = food;
    }

    @Override
    public String toString() {
        return fname  + age + food;
    }
}

public class Consumers {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("tarun", 28));
        persons.add(new Person("arun", 29));
        persons.add(new Person("varun", 12));
        persons.add(new Person("arun", 22));

        Collections.sort(persons, new Comparator<Person>() {

            @Override
            public int compare(Person t, Person t1 Person t2) {
                return t.getAge() - t1.getAge() - t2.getFood();
            }
        });
        System.out.println(persons);

    }
}