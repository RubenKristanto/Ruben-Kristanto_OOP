
/**
 * Write a description of class Intern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Intern extends Employee
{
    private double hourlyRate;
    private int hoursWorked;
    
    public Intern(String name, int id, Position position, Division division, double hourlyRate, int hoursWorked){
        super.name = name;
        super.position = position;
        super.division = division;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public double totalSalary(){
        int monthlyWorked = hoursWorked*20;
        double salary;
        if(mothlyWorked < 20){
            salary = 0;
            return salary;
        }
        else if(mothlyWorked<80){
            salary = hoursWorked*hourlyRate;
            return salary;
        }
        else{
            salary = hoursWorked*hourlyRate;
            salary = salary + salary*0.1;
            return salary;
        }
    }
    
    public void DisplayInfo(){
        System.out.println("Nama :" + super.getName());
        System.out.println("ID :" + super.getId());
        System.out.println("posisi :" + super.position);
        System.out.println("divisi :" + super.division);
        System.out.println("Hourly Rate :" + hourlyRate);
        System.out.println("Hours Worked :" + hoursWorked);
        System.out.println("total Salary :" + totalSalary());
    }
}
