public class Student {
    private int id;
    private String name;

    //Getter
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    //method show student info
    public void sayHello() {
        String info = String.format("Hello! I am %s , ID number: %d \n", name, id);
        System.out.printf(info);
    }
}
