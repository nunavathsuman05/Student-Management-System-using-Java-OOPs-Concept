import java.util.ArrayList;
import java.util.Scanner;

/*
* @author Suman Nayak
* @date 31-05-2025
*/

public class StudentManagementSystem {

	private static ArrayList<Student> students = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("   *****           *****");
        System.out.println("  *  *  *         *  *  *");
        System.out.println("  *  ^  *         *  ^  *");
        System.out.println("   *****           *****");
        System.out.println("    ***           **   **");
        System.out.println("  *******       **   *   **");
        System.out.println(" *   *   *          ***");
        System.out.println("*    *    *         ***");
        System.out.println("    ***           **   **");
        System.out.println("    ***          **     **");
        System.out.println("   *   *");
        System.out.println("  *     *");
	    while(true)
	    {
	    	System.out.println("\n====== Student Management System ========");
	    	System.out.println("1. Add Student");
	    	System.out.println("2. View Students");
	    	System.out.println("3. Update Student");
	    	System.out.println("4. Delete Student");
	    	System.out.println("5. Exit");
	    	
	    	System.out.println("Enter Choice: ");
	    	int choice = sc.nextInt();
	    	sc.nextLine();
	    	
	    	switch(choice)
	    	{
	    	case 1 : addStudent(); break;
	    	case 2 : viewStudent(); break;
	    	case 3 : updateStudent(); break;
	    	case 4 : deleteStudent(); break;
	    	case 5 : System.out.println("Exting... Goodbye!");
	    	      System.exit(0); 
	    	      
	    	 default : System.out.println("Invalid choice! Try again.");
	    	}
	    }
	}
	
	// add student deatails
	private static void addStudent()
	{
		System.out.println("Enter Student id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Student Branch: ");
		String branch = sc.nextLine();
		System.out.println("Enter Student Marks : ");
		int marks = sc.nextInt();
		students.add(new Student(id,name,branch,marks));
		System.out.println("Successfully added Student Details....");
	}
	
	// View Student Details
    private static void viewStudent()
    {
    	if(students.isEmpty())
    	{
    		System.out.println("No Students Found..!");
    	}
    	else
    	{
    		System.out.println("\n---- Students List -----");
    		for(Student s :students)
    		{
    			System.out.println(s);
    		}
    	}
    }
    
   // Update Student Details
    private static void updateStudent()
    {
    	System.out.println("Enter student Id :");
    	int id = sc.nextInt();
    	sc.nextLine();
    	for(Student s : students)
    	{
    		if(s.getId()==id)
    		{
    			System.out.println("\n---Update Student Deatails----");
    			System.out.println("1. Update Name");
    			System.out.println("2. Update Branch");
    			System.out.println("3. Update Marks");
    			
    			System.out.println("Enter choice : ");
    			int n = sc.nextInt();
    			switch(n)
    			{
    			case 1 : s.setName(sc.next()); break;
    			case 2 : s.setBranch(sc.next());   break;
    			case 3 : s.setMarks(sc.nextInt()); break;
    			default : System.out.println("Invalid Choice..!");
    			}
    			System.out.println("Updated Successfully...!");
    			return ;
    		}
    		
    	}
    	System.out.println("Student Not Found");
    }
      
      // Delete Student Deatails
  private static void deleteStudent()
    {
      System.out.println("Enter Student Id : ");
      int id = sc.nextInt();
      sc.nextLine();
      for(Student s: students)
      {
    	  if(s.getId()==id)
    	  {
    		  students.remove(s);
    		  System.out.println("Deleted Successfully..!");
    		  return ;
    	  }
      }
      System.out.println("Student not Found");
    }
    
}
class Student
{
	private int id;
	private String name;
	private String branch;
	private int marks;
	
	//constructor
	 Student(int id,String name,String branch,int marks)
	 {
		 this.id = id;
		 this.name = name;
		 this.branch = branch;
		 this.marks = marks;
	 }
	 
	 // getter Method
	 public int getId()
	 {
		 return id;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public String getBranch()
	 {
		 return branch;
	 }
	 public int getMarks()
	 {
		return marks; 
	 }
	 
	 // Setters method
	 
	 public void setId(int id)
	 {
		 this.id = id;
	 }
	 public void setName(String name)
	 {
		 this.name = name;
	 }
	 public void setBranch(String branch)
	 {
		 this.branch = branch;
	 }
	 public void setMarks(int marks)
	 {
		 this.marks = marks;
	 }
	 
	 public String toString()
	 {
		 return "Student Id :"+id+"\n"+"Student Name :"+name+"\n"+"Student Branch :"+branch+"\n"+"Student Marks :"+marks;    
	 }
}
