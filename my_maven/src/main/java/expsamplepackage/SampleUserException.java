package expsamplepackage;

public class SampleUserException {

    public void test(int age) throws LicenseException {
        if(age >= 18) {
            throw new LicenseException("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String args[]) throws LicenseException {
        SampleUserException obj = new SampleUserException();
        
        	obj.test(20);
        
        
        }// Change to 14 if you want "Eligible"
        }
    
