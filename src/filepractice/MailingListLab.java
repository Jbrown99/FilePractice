/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filepractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jbrown99
 */
public class MailingListLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // boolean append = true;
        
       BufferedReader in = null;
       
        File data = new File( "C:" + File.separatorChar+ "Temp" + File.separatorChar + "lab1" + File.separatorChar +  "mailinglist.txt");
        
        
        List<String> mailingList = new ArrayList<>();
        
        try{
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while(line != null){
                mailingList.add(line);
            }
                    
        }catch(Exception e){
            System.out.println("There was a problem");
        }finally{
            try{
                in.close();
            }catch(Exception e){
                
            }
        }
        
        
        
        
       
       
      //SOLUTIONS FOR PART 2 OF LAB
        
//        BufferedReader in = null;
//        PrintWriter out = null;
//        
//       try{
//           in= new BufferedReader(new FileReader(data));
//           String line = in.readLine();
//           while(line != null){
//               System.out.println(line);
//               line = in.readLine();
//           }
//           
//       }
//       catch(IOException ioe){
//           System.out.println("There is a problem with the file");
//           
//       }finally{
//           try{
//           in.close();
//           }catch(Exception e){
//               
//           }
//       }
//       try{
//        out = new PrintWriter(new BufferedWriter(new FileWriter(data,append)));
//       
//       out.print("John");
//       out.println("doe");
//       out.println("632 Cherry Street");
//       out.print("Dallas, ");
//       out.print("Texas");
//       out.println("78945");
//       
//       out.print("Sally");
//       out.println("Jones");
//       out.println("452 Walnut Street");
//       out.print("Orlando, ");
//       out.print("Florida");
//       out.println("53220");
//       
//        
//       }catch(Exception e){
//           
//       }finally{
//           
//           out.close();
//                   }
        
        
       }
        
        
        
    }
    

