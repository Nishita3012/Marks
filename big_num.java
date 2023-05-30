package bigger_num;
import java.util.Scanner;

public class big_num {
	
	public static void main(String []args) {
		
	Scanner ss=new Scanner(System.in);
	
	System.out.print("Physics:");
	int phy=ss.nextInt();
	
	System.out.print("Chemistry:");
	int che=ss.nextInt();
	
	System.out.print("Maths:");
	int math=ss.nextInt();
	
	System.out.print("English:");
	int eng=ss.nextInt();
	
	int Total_marks = phy+che+math+eng;
	System.out.println("TOtal Marks:"+Total_marks);
	
	int average = Total_marks/4;
	System.out.println("Average:"+ average);
	
	if(average>90)
	  {
	    	System.out.println("Grade A");
	  }
	
	else if(average>80)
	  {
	    	System.out.println("Grade B");
	  }
	
	else if(average>70)
	  {
	    	System.out.println("Grade C");
	  }
	
	else if(average<70)
	  {
	    	System.out.println("Fail");
	  }
	
	}

}
