package quickstart;    // like somthing could contain many class

/**
 * Created by billy on 11/13/16.
 */

// main class with the name the same as the filename
public class Puppy {
    int puppyAge;

    /** the constructor **/
    public Puppy(String name){
        System.out.println("Name chosen is : " + name);
    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("Puppy's age is : " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args){

        Puppy myPuppy = new Puppy("tommy");    // create an object

        myPuppy.setAge(2);

        myPuppy.getAge();

        System.out.println("Variable Value : " + myPuppy.puppyAge);
    }
}
