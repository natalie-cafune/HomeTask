package HomeTask;

public class Human {
    private String name;
    private String surname;
    //private String sex;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void menuPrint(){
        System.out.println("Method menuPrint of class Human");
    }
}
