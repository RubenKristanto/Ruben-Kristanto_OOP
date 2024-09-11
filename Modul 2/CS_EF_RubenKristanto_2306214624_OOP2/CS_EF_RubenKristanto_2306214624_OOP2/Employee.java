
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee extends Person implements CalculateSalary
{
    protected Division division;
    protected Position position;
    
    public void receiveTask(String){
        
    }
    
    public double totalSalary(){
        return 0;
    }
}
