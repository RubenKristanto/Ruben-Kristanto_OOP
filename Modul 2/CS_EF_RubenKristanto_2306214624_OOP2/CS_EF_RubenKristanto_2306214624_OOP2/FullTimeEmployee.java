
/**
 * Write a description of class FullTimeEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeEmployee extends Employee implements CalculateBonus
{
    private double baseBonus;
    private double performanceRating;
    private double baseSalary;
    
    public void displayInfo(){
        System.out.println("Nama :" + super.getName());
        System.out.println("ID :" + super.getId());
        System.out.println("Posisi :"+ super.position);
        System.out.println("Divisi :" + super.division);
        System.out.println("Base Salary :" + baseSalary);
        System.out.println("Base Bonus :" + baseBonus);
        System.out.println("totalSalary :" + this.totalSalary());
    }
    
    public double bonusSalary(){
        int bonus;
        if(performanceRating <0.2){
            bonus = 0;
            return bonus;
        }
        else{
            bonus = baseBonus*performanceRating;
            return bonus;
        }
    }
    
    public double totalSalary(){
        int total;
        total = baseSalary + this.bonusSalary();
        return total;
    }
    
    public FullTimeEmployee(String name, int id, Position position, Division division, double blaseSalary, double baseBonus, double performanceRating){
        super.position = position;
        super.division = division;
        this.baseSalary = baseSalary;
        this.baseBonus = baseBonus;
        this.performanceRating = performanceRating;
        this.name = name;
        this.id=id;
    }
}
