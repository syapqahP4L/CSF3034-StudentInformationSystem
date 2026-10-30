/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author capik
 */
import java.util.Scanner;
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      String name = "Nik Amri";
      System.out.println("Student Name: "+name);
      String id = "S84886";
      System.out.println("Student ID: "+id);
      int mark1 = 75;
      int mark2= 86;
      System.out.println("Mark 1: "+mark1);
      System.out.println("Mark 2: "+mark2);
      double totalMark = mark1 + mark2 ;
      System.out.println("Total Mark: "+totalMark);
      if (totalMark>=160)
      {
          System.out.println("Remarks: Excellent");
      }
      else if (totalMark >=100)
      {
          System.out.println("Remarks: Good");
      }
      else 
      {
          System.out.println("Remarks: Needs Improvement");
      }
      System.out.println("Congrats . Study harder ");
      
      
      
      
      
      
      
      
      
    }
    
}
