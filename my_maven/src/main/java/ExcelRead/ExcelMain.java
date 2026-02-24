package ExcelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String s= ExcelCode.readStringData(0, 0);
		double j=ExcelCode.readIntegerData(0, 1);
		System.out.println(s);
		System.out.println(j);

	}

}
