package Day45_Encapsulation2;

public class Person2 {

    private String name;
    private int age;
    public char gender;

    public Person2(String name, int age, char gender){
        //this.name = name;
        //this.age = age;
        //this.gender = gender;
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        //condition
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        //condition
        this.age = age;
    }

    public char getGender(){
        return this.gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }
}
