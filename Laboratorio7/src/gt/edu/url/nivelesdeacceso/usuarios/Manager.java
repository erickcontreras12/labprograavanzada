
package gt.edu.url.nivelesdeacceso.usuarios;

/**
 *
 * @author t203
 */
public class Manager extends SalariedEmployee{
    
    public Manager(){
        name = "Juan";
        setHireYear(1998);
        country = "Guatemala";
    }
    
    @Override
    public double annualPay() {
        return (this.monthlyPay()*12) * 1.20;
    }
    
}
