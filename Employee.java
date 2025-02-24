public class Employee {
    // Atributos da classe //
    private int id;
    private String name;
    private double wage;


    // Getters e Setters dos atributos //
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getWage(){
        return wage ;
    }
    public void setWage(double wage){
        this.wage = wage;
    }

    @Override
    public String toString() {
    return "ID: " + id + ", Nome: " + name + ", Salário: R$ " + wage;
}


    // Construtores do objeto
    public Employee(){
    }

    public Employee(int id, String name,  double wage){
        this.id = id;
        this.name = name;
        this.wage = wage;
    }
}

