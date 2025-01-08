package exercicio4;

public class GenericEmployee implements Employee {
    private String name;
    private int id;

    public GenericEmployee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public String getName(){
        return name;
    }


    public int getId(){
        return id;
    }
}
