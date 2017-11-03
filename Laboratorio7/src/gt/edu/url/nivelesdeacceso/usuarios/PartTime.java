
package gt.edu.url.nivelesdeacceso.usuarios;
public class PartTime extends HourlyEmployee{
    public PartTime(){
        name = "Julia";
        setHireYear(2000);
        country = "Guatemala";
    }
    
    @Override
    public double annualPay() {
        return (this.monthlyPay() / 2)*12;
    }
}
