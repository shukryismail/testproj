/**

/**
 * This class test Java Arrays
 * @author User
 *
 */
public class TestMultiArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course_subject [] [] = new String [2] [2];
		course_subject [0] [0] = "CS-Maths";
		course_subject [1] [1] = "CS-English";
		course_subject [2] [2] = "AC-Accounting";
		course_subject [3] [3] = "AC-Bahasa Melayu";
		
		String course_subject2 [] [] = { { "CS-Math","CS-English"}, {"AC-Accounting","AC-Bahasa Melayu"} } ;
		
		
		for(int i=0;i < course_subject.length; i++) {
			
			for (int j=0; j<course_subject [i].length; j++) {
			System.out.println("Course of " +i + " Subject of " + j + "is" +course_subject [i] [j] );
		}

		}
	}
}