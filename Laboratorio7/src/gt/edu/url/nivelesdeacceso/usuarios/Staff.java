
package gt.edu.url.nivelesdeacceso.usuarios;

/**
 *
 * @author t203
 */
public class Staff extends SalariedEmployee{
    public Staff(){
        name = "Pedro";
        setHireYear(1998);
        country = "Guatemala";
    }
    
    @Override
    public double annualPay() {
        return this.monthlyPay()*12;
    }
}
