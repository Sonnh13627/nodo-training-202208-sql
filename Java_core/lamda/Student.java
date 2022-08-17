package lamda;

public class Student {
    private int id;
    private int age;
    private String name;
    public Student(){

    }
    public Student(String name,Integer age){
        id = (int)(Math.random()*1000);
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public  interface Filter<T>{
        public boolean valid(T t);
    }
}
