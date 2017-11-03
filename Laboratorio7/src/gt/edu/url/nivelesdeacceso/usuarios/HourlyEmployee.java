
package gt.edu.url.nivelesdeacceso.usuarios;

public abstract class HourlyEmployee extends Employee{
    int hoursPerWeek;
    double hoursWage;
    
    public HourlyEmployee(){
        name = "Erick";
        setHireYear(1999);
        country = "Guatemala";
    }

    @Override
    public double monthlyPay() {
         return 1000.00;
    }

    @Override
    protected abstract double annualPay();
}
