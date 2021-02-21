/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
           
package career.guide;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.stream.Collectors; 
import java.util.stream.Stream; 
import java.util.Map;
import java.util.*;

/**
 *
 * @author hp
 */
public class Student {
    String Surname;
    String firstName;
    String otherName;
    String regNo;
    int age;
    String phone;
    boolean faculty;
    String department;
    int level;
    String courseKeysString;
    String [] courseKeysArray;
    public static List<String> FAVORITE_COURSES_CAREERS = new ArrayList <String> ();
    public static Map<String,Course> CS1 = new HashMap<>();
    public static Map<String,Course> CS2 = new HashMap<>();
    public static Map<String,Course> CS3 = new HashMap<>();
    public static Map<String,Course> CS4 = new HashMap<>();
    
    Scanner input = new Scanner (System.in);
   
    
    //Register Student
    public boolean Register (){
        System.out.println("");
        System.out.println("Hello, I'm your CAREER GUIDE. Pls input your Student Details Below.");
        System.out.print("Surname: ");
        this.Surname=input.nextLine();
        System.out.print("First Name: ");
        this.otherName=input.nextLine();
        System.out.print("Other Name: ");
        this.firstName=input.nextLine();
        System.out.print("Reg No: ");
        this.regNo=input.nextLine();
        System.out.print("Phone No. (+234...): ");
        this.phone=input.nextLine();
        System.out.print("Age: ");
        this.age=input.nextInt();
        System.out.print("Faculty: Physical Sciences? Answer TRUE or FALSE:   ");
        this.faculty=input.nextBoolean();
        
        if (this.faculty==false){
          System.out.println("This CAREER GUIDE is for students of Physical Sciences. Bye.");
          System.out.println("");
          return false;
        } 
         return true;
    }
    //Allow Selection of 4 fav Courses
    public void selCourse ()
    {     //To input dept
           Map<Integer,String> dept = new HashMap<>();
           dept.put(1,"Computer Science");
           dept.put(2,"Geology");
           dept.put(3,"Mathematics");
           dept.put(4,"Physics and Astronomy");
           dept.put(5,"Pure and Industrial Chemistry");
           dept.put(6,"Science Laboratory Technology");
           dept.put(7,"Statistics");
           
           System.out.println("");
           System.out.println(this.firstName+ "  "+this.Surname+", PLS SELECT YOUR DEPARTMENT WITH CORRESPONDING NO. (1-7):");
           dept.forEach((k,v)->System.out.println(k+ "    "+v));
           System.out.print("Enter Here: ");
           int chosenDept = input.nextInt();
           this.department = dept.get(chosenDept);
           
           //To input level
           Map<Integer,String> lvl = new HashMap<>();
           lvl.put(1,"First Year");
           lvl.put(2,"Second Year");
           lvl.put(3,"Third Year");
           lvl.put(4,"Fourth Year");
           lvl.put(5,"Fifth Year");
           System.out.println("");
           if ("Computer Science".equals(this.department)){
           System.out.println("PLS SELECT YOUR LEVEL WITH CORRESPONDING NO. (1-5): "); 
           lvl.forEach((k,v)->System.out.println(k+ "    "+v));
           System.out.print("Enter Here: ");
           int chosenLvl = input.nextInt();
           this.level= chosenLvl;
           System.out.println("");
           }
           
           
           //CS Lvl100
           Student.CS1.put("1",new Course("Computing Practice (COS 102)", new String[]{"Lecturer", "Researcher", "Computer Maintenance Expert", "IT Essentals Instructor"}));
           Student.CS1.put("2",new Course("Computer Hardware Organization (COS 103)", new String[]{"CISCO Essentials Instructor", "Computer Engineer", "Lecturer"}));
           Student.CS1.put("3",new Course("Elementary Mathematics I (MTH 111)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS1.put("3",new Course("Elementary Mathematics I (MTH 111)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS1.put("4",new Course("Elementary Mathematics II (MTH 121)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS1.put("5",new Course("General Physics for Physical Sciences I (PHY 115)", new String[]{"Lecturer", "Research Assistant", "Astrologer"}));
           Student.CS1.put("6",new Course("Inference I (STA 131)", new String[]{"Statistician", "Lecturer", "Researcher"}));
           Student.CS1.put("7",new Course("Use of library I (GSP 111)", new String[]{"Researcher", "Lecturer", "Librarian"}));
           Student.CS1.put("8",new Course("The use of English I (GSP 101)", new String[]{"Lecturer", "English Teacher", "Philosopher"}));
           
           //CS Lvl200
           Student.CS2.put("1",new Course("Computing Programming (COS 201)", new String[]{"Software developer", "DevOps Engineer", "QA Tester", "Games Developer", "Computer Engineer"}));
           Student.CS2.put("2",new Course("Introduction to Microcomputer Systems (COS 203)", new String[]{"CISCO Essentials Instructor", "Electrical Engineer", "Computer Engineer", "Lecturer", "IT Essentials Instructor"}));
           Student.CS2.put("3",new Course("Assembly Language Programmer (COS 231)", new String[]{"Software developer", "Mathematician"}));
           Student.CS2.put("3",new Course("Linear Algebra I (MTH 211)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS2.put("4",new Course("Real Analysis I (MTH 221)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS2.put("5",new Course("Basic Electrical Engineering (EEE 211)", new String[]{"Lecturer", "Research Assistant", "Electrical Engineer"}));
           Student.CS2.put("6",new Course("Statistics for Physical Sciences (STA 205)", new String[]{"Statistician", "Lecturer", "Researcher"}));
           Student.CS2.put("7",new Course("Social Sciences (GSP 111)", new String[]{"Researcher", "Lecturer", "Social Worker", "Philosopher", "Economist"}));
           Student.CS2.put("8",new Course("Logic, Philosophy & Human Existence (GSP 207)", new String[]{"Lecturer", "Philosopher", "Researcher"}));
           
           //CS Lvl300
           Student.CS3.put("1",new Course("Switching Algebra & Discrete Structures (COS 311)", new String[]{"Lecturer", "Researcher", "Computer Maintenance Expert", "IT Essentals Instructor"}));
           Student.CS3.put("2",new Course("Operating Systems (COS 331)", new String[]{"CISCO Essentials Instructor", "Computer Engineer", "Lecturer"}));
           Student.CS3.put("3",new Course("Software Engineering II (COS 333)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS3.put("3",new Course("Artificial Intelligence (COS 337)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS3.put("4",new Course("Automa Theory and Formal Languages (COS 335)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS3.put("5",new Course("Computer Architecture (COS 341)", new String[]{"Lecturer", "Research Assistant", "Astrologer"}));
           Student.CS3.put("6",new Course("Laboratory for Digital System Design (COS 351)", new String[]{"Statistician", "Lecturer", "Researcher"}));
           Student.CS3.put("7",new Course("Introduction to Entrepreneurship (CED 341)", new String[]{"Researcher", "Lecturer", "Librarian"}));
           
           //CS Lvl400
           Student.CS4.put("1",new Course("Computer System Performance Evaluation (COS 417)", new String[]{"Lecturer", "Researcher", "Computer Maintenance Expert", "IT Essentals Instructor"}));
           Student.CS4.put("2",new Course("Operations Research (COS 419)", new String[]{"CISCO Essentials Instructor", "Computer Engineer", "Lecturer"}));
           Student.CS4.put("3",new Course("Database Design and Management (COS 421)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS4.put("3",new Course("Algorithms (COS 431)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS4.put("4",new Course("Computer Graphics and Animations (COS 435)", new String[]{"Lecturer", "Mathematician"}));
           Student.CS4.put("5",new Course("Advanced Computer Network (COS 441)", new String[]{"Lecturer", "Research Assistant", "Astrologer"}));
           Student.CS4.put("6",new Course("Structured Programming (COS 463)", new String[]{"Statistician", "Lecturer", "Researcher"}));
           
           
           //Allow selection of courses for CS
           if ("Computer Science".equals(this.department)){
            System.out.print("PLS INPUT YOUR 4 FAVOURITE COURSES USING CORR. NO. & SEPARATING WITH COMMAS:  ");

            if (this.level == 1){
               CS1.forEach ((k,v)->System.out.println(k+"   "+v.name));
               System.out.print("Enter Here: ");
               this.courseKeysString = input.next();
               this.courseKeysArray = this.courseKeysString.split(",");
               
               if (this.courseKeysArray.length != 4) { 
                  System.out.println("PLS INPUT JUST 4 COURSES.");
                  selCourse();
               } else {
                   CS1.forEach((k,v) -> {
                       for(String element : v.careers) {
                       Student.FAVORITE_COURSES_CAREERS.add(element);
                       }
                    });
                   recCareer(Student.FAVORITE_COURSES_CAREERS);
                }
            }
            
            if (this.level == 2){
               CS2.forEach ((k,v)->System.out.println(k+"   "+v.name));
               System.out.print("Enter Here: ");
               this.courseKeysString = input.next();
               this.courseKeysArray = this.courseKeysString.split(",");
               
               if (this.courseKeysArray.length != 4) { 
                  System.out.println("PLS INPUT JUST 4 COURSES.");
                  selCourse();
               } else {
                   CS2.forEach((k,v) -> {
                       for(String element : v.careers) {
                       Student.FAVORITE_COURSES_CAREERS.add(element);
                       }
                    });
                   recCareer(Student.FAVORITE_COURSES_CAREERS);
                }
            }
            
            if (this.level == 3){
               CS3.forEach ((k,v)->System.out.println(k+"   "+v.name));
               System.out.print("Enter Here: ");
               this.courseKeysString = input.next();
               this.courseKeysArray = this.courseKeysString.split(",");
               
               if (this.courseKeysArray.length != 4) { 
                  System.out.println("PLS INPUT JUST 4 COURSES.");
                  selCourse();
               } else {
                   CS3.forEach((k,v) -> {
                       for(String element : v.careers) {
                       Student.FAVORITE_COURSES_CAREERS.add(element);
                       }
                    });
                   recCareer(Student.FAVORITE_COURSES_CAREERS);
                }
            }
            
            if (this.level == 4){
               CS4.forEach ((k,v)->System.out.println(k+"   "+v.name));
               System.out.print("Enter Here: ");
               this.courseKeysString = input.next();
               this.courseKeysArray = this.courseKeysString.split(",");
               
               if (this.courseKeysArray.length != 4) { 
                  System.out.println("PLS INPUT JUST 4 COURSES.");
                  selCourse();
               } else {
                   CS4.forEach((k,v) -> {
                       for(String element : v.careers) {
                       Student.FAVORITE_COURSES_CAREERS.add(element);
                       }
                    });
                   recCareer(Student.FAVORITE_COURSES_CAREERS);
                }
            }
          } else System.out.println("Your department has not been added to the system.");
    }
    
    //Finds most frequently occuring career and reccomends it
    public static void recCareer (List <String> list) {
     Map<String, Integer> stringsCount = new HashMap<>();
     for(String s: list) {
        Integer c = stringsCount.get(s);
        if(c == null) c = new Integer(0);
        c++;
        stringsCount.put(s,c);
    }
     
    Map.Entry<String,Integer> mostRepeated = null;
    for(Map.Entry<String, Integer> e: stringsCount.entrySet()){
        if(mostRepeated == null || mostRepeated.getValue()<e.getValue())
        mostRepeated = e;
    }
  
    if(mostRepeated != null)
        System.out.println("The career that suits you the most is:" + mostRepeated.getKey());  
    }
}
 



        
    


