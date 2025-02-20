import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManager {
    private Map<Integer, Employee> employees = new HashMap<>();
    private Scanner scan = new Scanner(System.in);

    public void addEmployee(){
        System.out.println("Informe o ID: ");
        int id = scan.nextInt();
        scan.nextLine();

        System.out.println("Informe o Nome: ");
        String name = scan.nextLine();

        System.out.println("Informe o salário: ");
        double wage = scan.nextDouble();


        Employee employee = new Employee(id, name, wage);
        employees.put(id, employee);
        System.out.println("-----");
        System.out.println("Funcionario Adicionado com sucesso! \n");
        System.out.println("-----");
    }

    public void deleteEmployee(){
        System.out.println("informe o ID do funcionário que deseja deletar: ");
        int id = scan.nextInt();
        scan.nextLine();

        if (employees.remove(id) != null){
            System.out.println("Funcionário removido com sucesso! \n");
        } else{
            System.out.println("ID não contrado! \n");
        }
    }

    public void showEmployees(){
        System.out.println("-----");
        System.out.println("Lista de Funcionários:");
        System.out.println("-----");
        for (Employee i : employees.values()) {
            System.out.println(i);
        }
        System.out.println("----- \n");
    }

    public void run(){
        while (true) {
            
        
            System.out.println("O que deseja fazer? ");
            System.out.println("[1] Exibir funcionários \n[2] Adicionar funcionário \n[3] Remover Funcionário \n[0] SAIR");
            System.out.println("---");
            int option = scan.nextInt();


            switch (option) {
                case 1:
                    showEmployees();
                    break;
            
                case 2:
                    addEmployee();
                    break;

                case 3:
                    showEmployees();
                    deleteEmployee();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Escolha uma das opções válidas!! \n \n");
            }
        }
    }
}
