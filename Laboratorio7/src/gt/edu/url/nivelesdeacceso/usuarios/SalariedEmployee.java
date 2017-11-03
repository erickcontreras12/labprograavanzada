
package gt.edu.url.nivelesdeacceso.usuarios;

public abstract class SalariedEmployee extends Employee{
    int annualSalary;
    
    public SalariedEmployee(){
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
