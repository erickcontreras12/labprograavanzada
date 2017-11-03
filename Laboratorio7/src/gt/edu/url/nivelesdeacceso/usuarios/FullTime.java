
package gt.edu.url.nivelesdeacceso.usuarios;

/**
 *
 * @author t203
 */
public class FullTime extends HourlyEmployee{
    public FullTime(){
        name = "Enrique";
        setHireYear(1998);
        country = "Guatemala";
    }
    
    @Override
    public double annualPay() {
        return this.monthlyPay()*12;
    }
}
