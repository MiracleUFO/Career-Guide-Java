
package career.guide;

public class CareerGuide {
    public static void main(String[] args) {
        //To Register Student
        
       Student student = new Student();
        
       while (!student.Register()) { 
       student.Register();
       }
       student.selCourse();
  }
        
 }
    
