
package gt.edu.url.nivelesdeacceso.usuarios;

/**
 *
 * @author t203
 */
public abstract class Employee {
    
    public String name; 
    private int hireYear;
    protected String country;
    
    public void setHireYear(int hy){
        this.hireYear = hy;
    }
    
    public int getHireYear(){
        return hireYear;
    }
    
    protected abstract double monthlyPay();
    protected abstract double annualPay();
}
