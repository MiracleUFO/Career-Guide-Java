/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package career.guide;
import java.util.List;

/**
 *
 * @author hp
 */
public class Course {
    public String name;
    public String[] careers;
    public String[] getCareers () {
     return this.careers;
    }
    
    public Course(String name, String[] careers){
        this.name = name;
        this.careers = careers;
    }
}
