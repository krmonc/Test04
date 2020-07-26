
public class School {
 
    public static void main(String[] args) {
    	
        Student student = new Student("Ali", "Yilmaz");
        
        
        System.out.println("Student's name is set (Constructor): " + student.getFirstName());
 
        student.setFirstName("Veli");
        
        System.out.println("Student's name is set (Main): " + student.getFirstName());
        
        System.out.println("Student's lastname is set (Constructor): " + student.getFamilyName());
        
        student.setFamilyName("Korkmaz");
        
        System.out.println("Student's lastname is set (Main): " + student.getFamilyName());
        
    }
 
}