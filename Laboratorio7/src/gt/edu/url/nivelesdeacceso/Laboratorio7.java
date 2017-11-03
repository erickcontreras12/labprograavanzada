
package gt.edu.url.nivelesdeacceso;
import gt.edu.url.nivelesdeacceso.usuarios.Employee;
import gt.edu.url.nivelesdeacceso.usuarios.FullTime;
import gt.edu.url.nivelesdeacceso.usuarios.Manager;
import gt.edu.url.nivelesdeacceso.usuarios.PartTime;
import gt.edu.url.nivelesdeacceso.usuarios.Staff;

/**
 *
 * @author t203
 */
public  class Laboratorio7 {

    public static void main(String[] args) {
        Manager emp1 = new Manager();
        Staff emp2 = new Staff();
        FullTime emp3 = new FullTime();
        PartTime emp4 = new PartTime();
        
        
        System.out.println(emp1.name + " // " + emp1.getHireYear() + " // " + emp1.annualPay());
        System.out.println(emp2.name + " // " + emp2.getHireYear() + " // " + emp2.annualPay());
        System.out.println(emp3.name + " // " + emp3.getHireYear() + " // " + emp3.annualPay());
        System.out.println(emp4.name + " // " + emp4.getHireYear() + " // " + emp4.annualPay());
    }
    
}
