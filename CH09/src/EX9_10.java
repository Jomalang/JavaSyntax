
public class EX9_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = iVal+""; //int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + "";
		
		double sum = Integer.parseInt("+"+strVal) +Double.valueOf(strVal2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
	}

}
