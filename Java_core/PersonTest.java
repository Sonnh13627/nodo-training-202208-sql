
public class PersonTest {
    public static void main(String[] args) {
        Persontest(new String[]{"Vinh","Son"});
    }
    public static void Persontest(String[] args){
        Person persion = new Person(args[0]);
        Person persion1 = new Person( args[1]);
        System.out.println("Person 1's name is"+ persion.getName());
        System.out.println("Person 2's name is"+ persion1.getName());
    }
}
