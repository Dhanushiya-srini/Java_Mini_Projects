import java.util.Scanner;
public class J_001_StudentGradeCalculator{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Students.");
        int c = scan.nextInt();
        int [] total = new int [c];
        int [] average = new int [c];
        char [] grade = new char [c];
        for(int i= 0;i<c;i++){
            System.out.println("Enter the Marks for 5 subjects of Students: "+(i+1));
            int t =0;
            for(int j =0;j<5;j++){
                int mark = scan.nextInt();
                if(mark>100 || mark<0)
                    System.out.println("Invalid mark enter within 1 to 100.");
                else
                    t+=mark;
            }
            total[i]=t;
            average[i]=t/5;
            if( average[i]>=75)
                grade[i]='A';
            else if( average[i]>=50)
                grade[i]='B';
            else if( average[i]>=25)
                grade[i]='C';
            else
                grade[i]='F';
        }
        for(int i=0;i<c;i++){
            System.out.println("Student "+(i+1)+":");
            System.out.println("Total marks: "+total[i]+"/500");
            System.out.println("Average Mark: "+average[i]);
            System.out.println("Grade: "+grade[i]);
        }
        scan.close();
        }
    }
