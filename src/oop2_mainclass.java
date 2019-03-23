
import java.util.Scanner;
import java.util.ArrayList;
public class oop2_mainclass {
    
    public static void main(String[] args){
        ArrayList<Integer>  allMarks = new ArrayList<Integer>();
        ArrayList<String> allNames = new ArrayList();
        oop2_coursework_3 stds = new oop2_coursework_3(67);
        Scanner Smarks = new Scanner(System.in);
      while(true){
          oop2_coursework_3 stdt = new oop2_coursework_3();
          System.out.print("Enter Name: ");
          stdt.setName(Smarks.next());
          System.out.println("Enter RegNo: ");
      stdt.setRegNo(Smarks.next());
      System.out.println("Enter YOB: ");
      stdt.setYOB(Smarks.nextInt());
          if(stdt.getName().toLowerCase().equals("reagan"))
              break;
          else
          {
        //System.out.println(stds.marks);
        String course[] = {"oop2", "Computer", "Information Management", "Research", "E-Commerce", "Information System", "Numerical"};
        
         int studentsmarks;
         System.out.println("Enter student Details");
        for (int x = 0; x < 6; x++){
            System.out.print(course[x] + ":");
            studentsmarks = Smarks.nextInt();
            stds.setMarks(studentsmarks);
            allMarks.add(x,stds.getMarks());
            
        } 
        int total = 0;
        for (int k =0; k < allMarks.size(); k++){
            total += allMarks.get(k);
        }
        int aver = total/6;
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + aver); 
        
        allMarks.clear();
          }
          allNames.add(stdt.getName());
    }
         } 
}
