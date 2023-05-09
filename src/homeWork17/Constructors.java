package homeWork17;

public class Constructors {
   /* Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class:
        1 - inside same class; 2 - from outside the class;
        3 - from different class inside different package  and observe result.*/
    String name;
    int age;
    char grade;
    String city;
    String country;

    public Constructors(String name, int age, char grade, String city, String country) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.city = city;
        this.country = country;
    }

    private Constructors(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        System.out.println(name + " is " + age + " years oid , currently living in " + city);
    }
    Constructors(String name,char grade){
        this.name=name;
        this.grade=grade;

    }
     void printInfo() {

         System.out.println(name + " is studying in grade " + grade);
     }
     public void printInfo2() {

         System.out.println(name + " " + age + " " + grade + " " + city + " " + country);
     }


    public static void main(String[] args) {

        Constructors obj=new Constructors("Abeeha",19,"Virginia");
    }


}
