package popularException;

/**
 * Created by glebus on 03.08.17.
 */
public class IllegalArgumentExceptionExample {
    public static void main (String[] args){
        createNewUser("2", -1);
    }

    public static void createNewUser(String name, int age){
        if(name == null) {
            throw new IllegalArgumentException("Name must be not null");
        }
        if(age < 0 || age > 256) {
            throw new IllegalArgumentException("Age must be in interval [0 256]. Age = " + age);
        }
    }
}
