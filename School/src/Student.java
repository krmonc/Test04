public class Student {
 
    String firstName;
    String familyName;
    int age;
 
    public Student(){
 
    }
 
    public Student(String firstName, String familyName){
        this.firstName = firstName;
        this.familyName = familyName;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getFamilyName() {
        return familyName;
    }
 
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
}