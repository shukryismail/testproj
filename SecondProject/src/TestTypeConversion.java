/**
 * 
 */

/**
 * @author User
 *
 */
public class TestTypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accept a double from Command line 
		Double salaryDbl = new Double (args[0]);
		if(salaryDbl.isNaN()) {
			System.out.println("Salary is not walid: " + salaryDbl);
		} else {
		double salary = salaryDbl.doubleValue();
		
		String salaryStr = String.valueOf(salary);
		System.out.println(salaryStr);

	}

}
