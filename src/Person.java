public class Person {
    public String name;
    public String cohort;
    private int grade;

    public Person(String name, String cohort, int grade){
        this.name = name;
        this.cohort = cohort;
        this.grade = grade;
    }

    public String sayHello(){
        return String.format("%s says hello! They are assigned to the %s cohort and has a %d for a grade", this.name, this.cohort, this.grade);
    }


    public static void main (String [] args){
        Person person = new Person("John", "Azeban", 90);

        Person pete = new Person("Pete", "Dookie", 82);
        System.out.println(person.sayHello());
        System.out.println(pete.sayHello());
    }

}
