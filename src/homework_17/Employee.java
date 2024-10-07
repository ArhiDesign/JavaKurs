package homework_17;

public class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getSalary(){
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String info(){
        return String.format("Employee %s, Age: %d, salary: %s", name, age, salary);
    }
}
