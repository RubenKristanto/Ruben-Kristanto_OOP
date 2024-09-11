
import java.util.List;

public class Manager extends Person
{
    private List<Employee> employees;
    
    private Manager(String name, int id){
        super.name = name;
        super.id = id;
        
        employees = new ArrayList<>();
            
            
    }
    
    public void addEmployee (Employee employee){
        employees.add(employee);
    }
    
    public void assignTask(Employee employee, String Task){
        
    }
    
    public void displayInfo(){
        System.out.println("Nama :" + super.getName());
        System.out.println("ID :" + super.getId());
        
        if(employee instanceof employees){
            System.out.println("Employee yang dipimpin :"+super.employee.getName);
        }
    }
}
    
    

