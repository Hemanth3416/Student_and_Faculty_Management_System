package Implimentations;
import java.util.*;
public class Student_Management_System 
{
	static Scanner sc=new Scanner(System.in);
	static String [] studentFirstNameArray=new String[1000];
	static String [] studentLastNameArray=new String[1000];
	static int [] studentRollNoArray=new int[1000];
	static long [] studentPhNoArray=new long[1000];
	static String [] studentGenderArray=new String[1000];
	static String [] studentCourseArray=new String[1000];
	static int countRollNo=0,countStudents=0;
	
	static String [] facultyFirstNameArray=new String[1000];
	static String [] facultyLastNameArray=new String[1000];
	static int [] facultyRegNoArray=new int[1000];
	static long [] facultyPhNoArray=new long[1000];
	static String [] facultyGenderArray=new String[1000];
	static String [] facultyCourseArray=new String[1000];
	static int countRegNo=0,countFaculty=0;
	
	public static void main(String[]args)
	{
		menu();
	}
	public static void menu()
	{
		int menuOption=1;
		do
		{
			System.out.println(" A. Upload Student Details \n B. Upload Faculty Details \n C. Exit \n  \n You want to Open Details(1/0)");
			int option1=1;
			option1=sc.nextInt();
			while(option1!=0)
			{
				System.out.println(" Choose one Option");
				char menu=sc.next().charAt(0);
				switch(menu)
				{
				     case 'A': StudentDetails();
				          break;
				     case 'B': facultyDetails();
			              break;   
				     case 'C': System.exit(0);
			              break;
			         default: System.out.println(" Invalid Input.....!");
			              break;
				}
				option1=0;
			}
			menuOption=0;
		}
		while(menuOption!=0);
	}
	
 /**/	public static void StudentDetails()
	{
		int studentOption1=1;
		do
		{
			System.out.println(" A. Add Student details \n B. Update Student Details \n C. Delete Student Details \n D. Display Student Details \n E. Back \n \n You want to perform Details tab(1/0)");
			int option2=1;
		    option2=sc.nextInt();
		    while(option2!=0)
		    {
		    	System.out.println(" Choose One Option");
		    	char studentDetailsMenu=sc.next().charAt(0);
		    	switch(studentDetailsMenu)
		    	{
				     case 'A': addStudentDetails();
				          break;
				     case 'B': updateStudentDetails();
			              break;
				     case 'C': deleteStudentDetails(); 
			              break;    
			         case 'D': displayStudentDetails(); 
			              break;           
				     case 'E': menu();
			              break;
			         default: System.out.println(" Invalid Input.....!");
			              break;
		    	}
		    	option2=0;
		    }
		    studentOption1=0;
		    
		}
		while(studentOption1!=0);
	}
	
	
	
/**/	public static void studentFirstName() 
	{
		int countFirstName=countRollNo;
		//countFirstName++;
		
		//String studentFirstName;
		System.out.println(" Enter First Name");
		for(int i=countFirstName; i<=countFirstName;i++)
		{
			studentFirstNameArray[i]=sc.next();
		}
		
	}
	
/**/	public static void studentLastName() 
	{
		int countLastName=countRollNo;
		//countLastName++;
		
		//String studentLastName;
		System.out.println(" Enter Last Name");
		for(int i=countLastName; i<=countLastName;i++)
		{
			studentLastNameArray[i]=sc.next();
		}
		
	}
	
/**/	public static void studentRollNo() 
	{
		
		countRollNo++;
				//String studentRollNo;
		System.out.println(" Roll Number of this Student is "+countRollNo+" save this number for future Purpose");
//		System.out.println(" Enter Roll No");
		for(int i=1; i<=countRollNo;i++)
		{
			studentRollNoArray[i]=countRollNo;
		}
		
	}
/**/	public static void studentPhNo() 
	{ 
		int countPhNo=countRollNo;
		//countPhNo++;
		
		//long studentPhNo;
		System.out.println(" Enter Phone No");
		for(int i=countPhNo; i<=countPhNo;i++)
		{
			studentPhNoArray[i]=sc.nextLong();
		}
		
	}
	
/**/	public static void studentGender() 
	{ 
		int countGender=countRollNo;
		//countGender++;
		
		//long studentPhNo;
		System.out.println(" Enter Gender (M/F/O)");
		char gender=sc.next().charAt(0);
		switch(gender)
		{
		    case 'M' :  for(int i=countGender; i<=countGender;i++)
						{
							studentGenderArray[i]="Male";
							System.out.println("Male");
							System.out.println();
						}
		                break;
		    case 'F' :  for(int i=countGender; i<=countGender;i++)
						{
							studentGenderArray[i]="Female";
							System.out.println("Female");
							System.out.println();
						}
			            break;
		    case 'O' :  for(int i=countGender; i<=countGender;i++)
						{
							studentGenderArray[i]="Others";
							System.out.println("Transgender/Others");
							System.out.println();
						}
			            break;
			default  : System.out.println(" Invalid Gender .....! ");
		}
		
	}
	
/**/	public static void studentCourse() 
	{ 
		int countCourse=countRollNo;
		//countCourse++;
		
		//long studentPhNo;
		System.out.println(" Enter Course \n A. EEE \n B. ECE \n C. CSE \n D. CE \n E. MECH \n F. AGR \n G. Others \n H. Exit \n \n Select One Option");
		char course=sc.next().charAt(0);
		switch(course)
		{
		    case 'A' :  for(int i=countCourse; i<=countCourse;i++)
						{
		    	            studentCourseArray[i]="Electrical & Electronics Engineering";
		    	            System.out.println("Electrical & Electronics Engineering");
		    	            System.out.println();
						}
		                break;
		    case 'B' :  for(int i=countCourse; i<=countCourse;i++)
						{
		    	            studentCourseArray[i]="Electronics & Communication Engineering";
		    	            System.out.println("Electronics & Communication Engineering");
		    	            System.out.println();
						}
			            break;
		    case 'C' :  for(int i=countCourse; i<=countCourse;i++)
						{
		    	            studentCourseArray[i]="Computer Science Engineering";
		    	            System.out.println("Computer Science Engineering");
		    	            System.out.println();
						}
			            break;
		    case 'D' :  for(int i=countCourse; i<=countCourse;i++)
						{
		    	            studentCourseArray[i]="Civil Engineering";
		    	            System.out.println("Civil Engineering");
		    	            System.out.println();
						}
			            break;
			case 'E' :  for(int i=countCourse; i<=countCourse;i++)
						{
				            studentCourseArray[i]="Mechanical Engineering";
				            System.out.println("Mechanical Engineering");
		    	            System.out.println();
						}
			            break;
			case 'F' :  for(int i=countCourse; i<=countCourse;i++)
						{
				            studentCourseArray[i]="Agricultural Engineering";
				            System.out.println("Agricultural Engineering");
		    	            System.out.println();
						}
			            break;
			case 'G' :  for(int i=countCourse; i<=countCourse;i++)
						{
				            studentCourseArray[i]="Others";
				            System.out.println("Chemical Engineering / Aerospace Engineering / Auto Mobile Engineering / Bio-Medical Engineering / etc...., ");
		    	            System.out.println();
						}
			            break;
			case 'H' :  System.exit(0);			           
			            break;
			default  : System.out.println(" Invalid Course .....! ");
		}
		
	}
	
/**/	public static void addStudentDetails()
	{
		//String [] studentRollNoArray=new String[1000];
		studentRollNo();
		
		//String [] studentFirstNameArray=new String[1000];
		studentFirstName();
		
		//String [] studentLastNameArray=new String[1000];
		studentLastName();
		
		//long [] studentPhNoArray=new long[1000];
		studentPhNo();
		
		//String [] studentGenderArray=new String[1000];
		studentGender();
		
		//String [] studentCourseArray=new String[1000];
		studentCourse();
		
		countStudents++;
		System.out.println(" Add One More Student Details (Y/N)");
		char addOne=sc.next().charAt(0);
		if(addOne=='Y')
		{
			addStudentDetails();
		}
		else if(addOne=='N')
		{
			StudentDetails();
		}
		else
		{
			System.out.println(" Invalid Input.......! ");
		}
	}
	
	
	//  update Methods...............!
/**/	public static void updateFirstName()
	{
		System.out.print(" Enter The Student RollNo: ");
		int inputRollNo=sc.nextInt();
		
		int countFirstName=inputRollNo;
		//countFirstName++;
		//String [] studentFirstNameArray=new String[1000];
		System.out.println(" Edit First Name");
		String studentFirstName=sc.next();
		String tempFirstName="";
		for(int i=0; i<=countFirstName;i++)
		{
			if(countFirstName==i)
			{
				tempFirstName=studentFirstNameArray[i];
				studentFirstNameArray[i]=studentFirstName;
			}
		}
		System.out.println(" Updated First Name "+tempFirstName+" of Roll No "+countFirstName+" into "+ studentFirstNameArray[inputRollNo]+" Successfully");
		System.out.println();
	}
/**/	public static void updateLastName()
	{
		System.out.print(" Enter The Student RollNo: ");
		int inputRollNo=sc.nextInt();
		
		int countLastName=inputRollNo;
		//countLastName++;
		//String [] studentFirstNameArray=new String[1000];
		System.out.println(" Edit Last Name");
		String studentLastName=sc.next();
		String tempLastName="";
		for(int i=0; i<=countLastName;i++)
		{
			if(countLastName==i)
			{
				tempLastName=studentLastNameArray[i];
				studentLastNameArray[i]=studentLastName;
			}
			
		}
		System.out.println(" Updated Last Name "+tempLastName+" into "+ studentLastNameArray[inputRollNo]+" Successfully");
		System.out.println();
	}
/**/	public static void updatePhNo()
	{
		System.out.print(" Enter The Student RollNo: ");
		int inputRollNo=sc.nextInt();
		
		int countPhNo=inputRollNo;
		//countPhNo++;
		//long [] studentPhNoArray=new long[1000];
		System.out.println(" Edit Phone Number");
		long studentPhNo=sc.nextLong();
		long tempPhNo=0;
		
		for(int i=0; i<=countPhNo;i++)
		{
			if(countPhNo==i)
			{
				tempPhNo=studentPhNoArray[i];
				studentPhNoArray[i]=studentPhNo;
			}
		}
		System.out.println(" Updated Phone No "+tempPhNo+" into "+ studentPhNoArray[inputRollNo]+" Successfully");
		System.out.println();
	}
	
/**/	public static void updateGender()
	{
		System.out.print(" Enter The Student RollNo: ");
		int inputRollNo=sc.nextInt();
		int countGender=inputRollNo;
		//countGender++;
		//String [] studentGenderArray=new String[1000];
		//long studentPhNo;
		System.out.println(" Edit Gender (M/F/O)");
		char gender=sc.next().charAt(0);
		String tempGender="";
		switch(gender)
		{
		    case 'M' :  for(int i=0; i<=countGender;i++)
						{
					    	if(countGender==i)
							{
					    		tempGender=studentGenderArray[i];
								studentGenderArray[i]="Male";
								System.out.println("Male");
							}
						}
					    System.out.println(" Updated Gender "+tempGender+" into "+ studentGenderArray[inputRollNo]+" Successfully");
						System.out.println();
		                break;
		    case 'F' :  for(int i=0; i<=countGender;i++)
						{
					    	if(countGender==i)
							{
					    		tempGender=studentGenderArray[i];
								studentGenderArray[i]="Female";
								System.out.println("Female");
							}
						}
					    System.out.println(" Updated Gender "+tempGender+" into "+ studentGenderArray[inputRollNo]+" Successfully");
						System.out.println();
			            break;
		    case 'O' :  for(int i=0; i<=countGender;i++)
						{
					    	if(countGender==i)
							{
					    		tempGender=studentGenderArray[i];
								studentGenderArray[i]="Others";
								System.out.println("Transgender/Others");
							}
						}
					    System.out.println(" Updated Gender "+tempGender+" into "+ studentGenderArray[inputRollNo]+" Successfully");
						System.out.println();
			            break;
			default  : System.out.println(" Invalid Gender .....! ");
		}
	}
	
/**/	public static void updateCourse()
	{
		System.out.print(" Enter The Student RollNo: ");
		int inputRollNo=sc.nextInt();
		int countCourse=inputRollNo;
		//countCourse++;
		//String [] studentCourseArray=new String[1000];
		//long studentPhNo;
		System.out.println(" Edit Course \n A. EEE \n B. ECE \n C. CSE \n D. CE \n E. MECH \n F. AGR \n G. Others \n H. Exit \n \n Select One Option");
		char course=sc.next().charAt(0);
		String tempCourse="";
		switch(course)
		{
		    case 'A' :  for(int i=0; i<=countCourse;i++)
						{
		    	            if(countCourse==i)
		    	            {
		    	            	tempCourse=studentCourseArray[i];
			    	            studentCourseArray[i]="Electrical & Electronics Engineering";
			    	            System.out.println("Electrical & Electronics Engineering");
			    	            System.out.println();
		    	            }

						}
		    
					    System.out.println(" Updated Course "+tempCourse+" into "+ studentCourseArray[inputRollNo]+" Successfully");
						System.out.println();
		                break;
		    case 'B' :  for(int i=0; i<=countCourse;i++)
						{
		    	            if(countCourse==i)
		    	            {
		    	            	tempCourse=studentCourseArray[i];
			    	            studentCourseArray[i]="Electronics & Communication Engineering";
			    	            System.out.println("Electronics & Communication Engineering");
			    	            System.out.println();
		    	            }
						}
					    System.out.println(" Updated course "+tempCourse+" into "+ studentCourseArray[inputRollNo]+" Successfully");
						System.out.println();
			            break;
		    case 'C' :  for(int i=0; i<=countCourse;i++)
						{
		    	              if(countCourse==i)
		    	              {
		    	            	  tempCourse=studentCourseArray[i];
				    	          studentCourseArray[i]="Computer Science Engineering";
				    	          System.out.println("Computer Science Engineering");
				    	          System.out.println();
		    	              }
		    	              
						}
					    System.out.println(" Updated course "+tempCourse+" into "+ studentCourseArray[inputRollNo]+" Successfully");
						System.out.println();
			            break;
		    case 'D' :  for(int i=0; i<=countCourse;i++)
						{
					    	  if(countCourse==i)
				              {
					    		    tempCourse=studentCourseArray[i];
				    	            studentCourseArray[i]="Civil Engineering";
				    	            System.out.println("Civil Engineering");
				    	            System.out.println();
				              }
		    	
						}
					    System.out.println(" Updated course "+tempCourse+" into "+ studentCourseArray[inputRollNo]+" Successfully");
						System.out.println();
			            break;
			case 'E' :  for(int i=0; i<=countCourse;i++)
						{
							 if(countCourse==i)
				             {
								tempCourse=studentCourseArray[i];
					            studentCourseArray[i]="Mechanical Engineering";
					            System.out.println("Mechanical Engineering");
			    	            System.out.println();
				             }
				
						}
						System.out.println("Updated course "+tempCourse+" into "+ studentCourseArray[inputRollNo]+" Successfully");
						System.out.println();
			            break;
			case 'F' :  for(int i=0; i<=countCourse;i++)
						{
							if(countCourse==i)
				            {
								tempCourse=studentCourseArray[i];
					            studentCourseArray[i]="Agricultural Engineering";
					            System.out.println("Agricultural Engineering");
			    	            System.out.println();
				            }
				
						}
						System.out.println("Updated course "+tempCourse+" into "+ studentCourseArray[inputRollNo]+" Successfully");
						System.out.println();
			            break;
			case 'G' :  for(int i=0; i<=countCourse;i++)
						{
							if(countCourse==i)
				             {
								tempCourse=studentCourseArray[i];
					            studentCourseArray[i]="Others";
					            System.out.println("Chemical Engineering / Aerospace Engineering / Auto Mobile Engineering / Bio-Medical Engineering / etc...., ");
			    	            System.out.println();
				             }
				
						}
						System.out.println("Updated course "+tempCourse+" into "+ studentCourseArray[inputRollNo]+" Successfully");
						System.out.println();
			            break;
			case 'H' :  System.exit(0);			           
			            break;
			default  : System.out.println(" Invalid Course .....! ");
		}
	}
	
	
/**/	public static void updateStudentDetails()
	{
		
		System.out.println(" Edit below details \n A. First Name \n B. Last Name \n C. Phone Number \n D. Gender \n E. Course \n F. Exit ");
		char update=sc.next().charAt(0);
		switch(update)
		{
			case 'A' : updateFirstName();
			break;
			case 'B' : updateLastName();
			break;
			case 'C' : updatePhNo();
			break;
			case 'D' : updateGender();
			break;
			case 'E' : updateCourse();
			break;
			case 'F' : System.exit(0);
			break;
			default : System.out.println(" Invalid Input......! ");
		}
		System.out.println(" Update One More Student Details (Y/N)");
		char editOne=sc.next().charAt(0);
		if(editOne=='Y')
		{
			updateStudentDetails();
		}
		else if(editOne=='N')
		{
			StudentDetails();
		}
		else
		{
			System.out.println(" Invalid Input.......! ");
		}
		
	}
	
/**/	public static void deleteStudent()
	{
		System.out.println(" Enter the Student Roll No ");
		int countRollNo=sc.nextInt();
		
		String tempFirstName="";
		for(int i=0; i<=countRollNo;i++)
		{
			if(countRollNo==i)
			{
				tempFirstName=studentFirstNameArray[i];
				studentFirstNameArray[i]="";
			}
			
		}
		String tempLastName="";
		for(int i=0; i<=countRollNo;i++)
		{
			if(countRollNo==i)
			{
				tempLastName=studentLastNameArray[i];
				studentLastNameArray[i]="";
			}
			
		}
		long tempPhNo=0;
		for(int i=0; i<=countRollNo;i++)
		{
			if(countRollNo==i)
			{
				tempPhNo=studentPhNoArray[i];
				studentPhNoArray[i]=0;
			}
		}
		
		String tempGender="";
        for(int i=0; i<=countRollNo;i++)
        {
        	if(countRollNo==i)
			{
        		tempGender=studentGenderArray[i];
        		studentGenderArray[i]="";
			}
		}
		    
        String tempCourse="";
        for(int i=0; i<=countRollNo;i++)
		{
        	if(countRollNo==i)
			{
        		tempCourse=studentCourseArray[i];
        		studentCourseArray[i]="";
			}
		}
		
        
        System.out.println(" Details of "+countRollNo+" "+tempFirstName+" "+tempLastName+" is Successfully deleted");
        System.out.println();
        
        
		System.out.println(" Delete One More Student Details (Y/N)");
		char optionOne=sc.next().charAt(0);
		if(optionOne=='Y')
		{
			deleteStudent();
		}
		else
		{
			StudentDetails();
		}
		
		
	}
	
/**/	public static void deleteStudentDetails()
	{
		System.out.println(" Delete Student Details (Y/N)");
		char deleteOne=sc.next().charAt(0);
		if(deleteOne=='Y')
		{
			deleteStudent();
		}
		else if(deleteOne=='N')
		{
			StudentDetails();
		}
		else
		{
			System.out.println(" Invalid Input.......! ");
		}
	}
	
/**/	public static void displayStudent()
	{
		System.out.print(" Enter the Student Roll No ");
		int countRollNo=sc.nextInt();
		for(int i=0; i<=countRollNo;i++)
		{
			if(countRollNo==i)
			{
				System.out.println( " Roll No          : "+ i);
				System.out.println( " Full Name        : "+ studentFirstNameArray[i]+" "+studentLastNameArray[i]);
				System.out.println( " Phone No         : "+ studentPhNoArray[i]);
				System.out.println( " Gender           : "+ studentGenderArray[i]);
				System.out.println( " Course           : "+ studentCourseArray[i]);
			}
			
		}
		displayStudentDetails();
		System.out.println();
	}
/**/	public static void displayAllStudents()
	{
		for(int i=1; i<=countStudents;i++)
		{
				System.out.println( " Roll No          : "+ i);
				System.out.println( " Full Name        : "+ studentFirstNameArray[i]+" "+studentLastNameArray[i]);
				System.out.println( " Phone No         : "+ studentPhNoArray[i]);
				System.out.println( " Gender           : "+ studentGenderArray[i]);
				System.out.println( " Course           : "+ studentCourseArray[i]);
				System.out.println( "-------------------------------------------------------------------");
			
		}
		displayStudentDetails();
		System.out.println();
	}
/**/	public static void displayStudentDetails()
	{
		System.out.println();
		System.out.println(" Display Student Details \n A. Display One Student \n B. Display All Students \n C. Back");
		char displayOne=sc.next().charAt(0);
		switch(displayOne)
		{
	     	case 'A': displayStudent(); 
	     	break;
	     	case 'B': displayAllStudents(); 
	     	break;
	     	case 'C': StudentDetails(); 
	     	break;
	     	default : System.out.println(" Invalid Input.......! ");
		}
	}




/*******************************************************************************Faculty Code****************************************************************************************************/


	public static void facultyDetails() 
	{
		int facultyOption1=1;
		do
		{
			System.out.println(" A. Add Faculty details \n B. Update Faculty Details \n C. Delete Faculty Details \n D. Display Faculty Details \n E. Back \n \n You want to perform Details tab(1/0)");
			int facultyOption2=1;
			facultyOption2=sc.nextInt();
		    while(facultyOption2!=0)
		    {
		    	System.out.println(" Choose One Option");
		    	char facultyDetailsMenu=sc.next().charAt(0);
		    	switch(facultyDetailsMenu)
		    	{
				     case 'A': addFacultyDetails();
				          break;
				     case 'B': updateFacultyDetails();
			              break;
				     case 'C': deleteFacultyDetails(); 
			              break;    
			         case 'D': displayFacultyDetails(); 
			              break;           
				     case 'E': menu();
			              break;
			         default: System.out.println(" Invalid Input.....!");
			              break;
		    	}
		    	facultyOption2=0;
		    }
		    facultyOption1=0;
		    
		}
		while(facultyOption1!=0);
	}
	
	public static void addFacultyDetails()
	{
		//String [] facultyRollNoArray=new String[1000];
		facultyRegNo();
		
		//String [] facultyFirstNameArray=new String[1000];
		facultyFirstName();
		
		//String [] facultyLastNameArray=new String[1000];
		facultyLastName();
		
		//long [] facultyPhNoArray=new long[1000];
		facultyPhNo();
		
		//String [] facultyGenderArray=new String[1000];
		facultyGender();
		
		//String [] facultyCourseArray=new String[1000];
		facultyCourse();
		
		countFaculty++;
		System.out.println(" Add One More Faculty Details (Y/N)");
		char addOne=sc.next().charAt(0);
		if(addOne=='Y')
		{
			addFacultyDetails();
		}
		else if(addOne=='N')
		{
			facultyDetails();
		}
		else
		{
			System.out.println(" Invalid Input.......! ");
		}
	}
	public static void facultyFirstName() 
	{
		int countFirstName=countRegNo;
		//countFirstName++;
		
		//String facultyFirstName;
		System.out.println();
		System.out.println(" Enter First Name");
		for(int i=countFirstName; i<=countFirstName;i++)
		{
			facultyFirstNameArray[i]=sc.next();
		}
		
	}
	
	public static void facultyLastName() 
	{
		int countLastName=countRegNo;
		//countLastName++;
		
		//String facultyLastName;
		System.out.println(" Enter Last Name");
		for(int i=countLastName; i<=countLastName;i++)
		{
			facultyLastNameArray[i]=sc.next();
		}
		
	}
	
	public static void facultyRegNo() 
	{
		
		countRegNo++;
				//String studentRollNo;
		System.out.println(" Registration Number of this Faculty is "+countRegNo+" save this number for future Purpose");
	//	System.out.println(" Enter Roll No");
		for(int i=1; i<=countRegNo;i++)
		{
			facultyRegNoArray[i]=countRegNo;
		}
		
	}
	public static void facultyPhNo() 
	{ 
		int countPhNo=countRegNo;
		//countPhNo++;
		
		//long facultyPhNo;
		System.out.println(" Enter Phone No");
		for(int i=countPhNo; i<=countPhNo;i++)
		{
			facultyPhNoArray[i]=sc.nextLong();
		}
		
	}
	
	public static void facultyGender() 
	{ 
		int countGender=countRegNo;
		//countGender++;
		
		//long facultyPhNo;
		System.out.println(" Enter Gender (M/F/O)");
		char gender=sc.next().charAt(0);
		switch(gender)
		{
		    case 'M' :  for(int i=countGender; i<=countGender;i++)
						{
							facultyGenderArray[i]="Male";
							System.out.println("Male");
							System.out.println();
						}
		                break;
		    case 'F' :  for(int i=countGender; i<=countGender;i++)
						{
							facultyGenderArray[i]="Female";
							System.out.println("Female");
							System.out.println();
						}
			            break;
		    case 'O' :  for(int i=countGender; i<=countGender;i++)
						{
							facultyGenderArray[i]="Others";
							System.out.println("Transgender/Others");
							System.out.println();
						}
			            break;
			default  : System.out.println(" Invalid Gender .....! ");
		}
		
	}
	
	public static void facultyCourse() 
	{ 
		int countCourse=countRegNo;
		//countCourse++;
		
		//long facultyPhNo;
		System.out.println(" Enter Course \n A. EEE \n B. ECE \n C. CSE \n D. CE \n E. MECH \n F. AGR \n G. Others \n H. Exit \n \n Select One Option");
		char course=sc.next().charAt(0);
		switch(course)
		{
		    case 'A' :  for(int i=countCourse; i<=countCourse;i++)
						{
		    	            facultyCourseArray[i]="Electrical & Electronics Engineering";
		    	            System.out.println("Electrical & Electronics Engineering");
		    	            System.out.println();
						}
		                break;
		    case 'B' :  for(int i=countCourse; i<=countCourse;i++)
						{
		    	            facultyCourseArray[i]="Electronics & Communication Engineering";
		    	            System.out.println("Electronics & Communication Engineering");
		    	            System.out.println();
						}
			            break;
		    case 'C' :  for(int i=countCourse; i<=countCourse;i++)
						{
		    	            facultyCourseArray[i]="Computer Science Engineering";
		    	            System.out.println("Computer Science Engineering");
		    	            System.out.println();
						}
			            break;
		    case 'D' :  for(int i=countCourse; i<=countCourse;i++)
						{
		    	            facultyCourseArray[i]="Civil Engineering";
		    	            System.out.println("Civil Engineering");
		    	            System.out.println();
						}
			            break;
			case 'E' :  for(int i=countCourse; i<=countCourse;i++)
						{
				            facultyCourseArray[i]="Mechanical Engineering";
				            System.out.println("Mechanical Engineering");
		    	            System.out.println();
						}
			            break;
			case 'F' :  for(int i=countCourse; i<=countCourse;i++)
						{
				            facultyCourseArray[i]="Agricultural Engineering";
				            System.out.println("Agricultural Engineering");
		    	            System.out.println();
						}
			            break;
			case 'G' :  for(int i=countCourse; i<=countCourse;i++)
						{
				            facultyCourseArray[i]="Others";
				            System.out.println("Chemical Engineering / Aerospace Engineering / Auto Mobile Engineering / Bio-Medical Engineering / etc...., ");
		    	            System.out.println();
						}
			            break;
			case 'H' :  System.exit(0);			           
			            break;
			default  : System.out.println(" Invalid Course .....! ");
		}
		
	}
	public static void updateFacultyDetails()
	{
		
		System.out.println(" Edit below details \n A. First Name \n B. Last Name \n C. Phone Number \n D. Gender \n E. Course \n F. Exit ");
		char update=sc.next().charAt(0);
		switch(update)
		{
			case 'A' : updateFacultyFirstName();
			break;
			case 'B' : updateFacultyLastName();
			break;
			case 'C' : updateFacultyPhNo();
			break;
			case 'D' : updateFacultyGender();
			break;
			case 'E' : updateFacultyCourse();
			break;
			case 'F' : System.exit(0);
			break;
			default : System.out.println(" Invalid Input......! ");
		}
		System.out.println(" Update One More Faculty Details (Y/N)");
		char editOne=sc.next().charAt(0);
		if(editOne=='Y')
		{
			updateFacultyDetails();
		}
		else if(editOne=='N')
		{
			facultyDetails();
		}
		else
		{
			System.out.println(" Invalid Input.......! ");
		}
	}
	
	//update Methods...............!
	public static void updateFacultyFirstName()
	{
		System.out.print(" Enter The Faculty RegNo: ");
		int inputRegNo=sc.nextInt();
		
		int countFirstName=inputRegNo;
		//countFirstName++;
		//String [] facultyFirstNameArray=new String[1000];
		System.out.println(" Edit First Name");
		String facultyFirstName=sc.next();
		String tempFirstName="";
		for(int i=0; i<=countFirstName;i++)
		{
			if(countFirstName==i)
			{
				tempFirstName=facultyFirstNameArray[i];
				facultyFirstNameArray[i]=facultyFirstName;
			}
		}
		System.out.println(" Updated First Name "+tempFirstName+" of Reg No "+countFirstName+" into "+ facultyFirstNameArray[inputRegNo]+" Successfully");
		System.out.println();
	}
	public static void updateFacultyLastName()
	{
		System.out.print(" Enter The Faculty RegNo: ");
		int inputRegNo=sc.nextInt();
		
		int countLastName=inputRegNo;
		//countLastName++;
		//String [] facultyFirstNameArray=new String[1000];
		System.out.println(" Edit Last Name");
		String facultyLastName=sc.next();
		String tempLastName="";
		for(int i=0; i<=countLastName;i++)
		{
			if(countLastName==i)
			{
				tempLastName=facultyLastNameArray[i];
				facultyLastNameArray[i]=facultyLastName;
			}
			
		}
		System.out.println(" Updated Last Name "+tempLastName+" into "+ facultyLastNameArray[inputRegNo]+" Successfully");
		System.out.println();
	}
	public static void updateFacultyPhNo()
	{
		System.out.print(" Enter The Faculty RegNo: ");
		int inputRegNo=sc.nextInt();
		
		int countPhNo=inputRegNo;
		//countPhNo++;
		//long [] facultyPhNoArray=new long[1000];
		System.out.println(" Edit Phone Number");
		long facultyPhNo=sc.nextLong();
		long tempPhNo=0;
		
		for(int i=0; i<=countPhNo;i++)
		{
			if(countPhNo==i)
			{
				tempPhNo=facultyPhNoArray[i];
				facultyPhNoArray[i]=facultyPhNo;
			}
		}
		System.out.println(" Updated Phone No "+tempPhNo+" into "+ facultyPhNoArray[inputRegNo]+" Successfully");
		System.out.println();
	}
	
	public static void updateFacultyGender()
	{
		System.out.print(" Enter The Faculty RegNo: ");
		int inputRegNo=sc.nextInt();
		int countGender=inputRegNo;
		//countGender++;
		//String [] facultyGenderArray=new String[1000];
		//long facultyPhNo;
		System.out.println(" Edit Gender (M/F/O)");
		char gender=sc.next().charAt(0);
		String tempGender="";
		switch(gender)
		{
		    case 'M' :  for(int i=0; i<=countGender;i++)
						{
					    	if(countGender==i)
							{
					    		tempGender=facultyGenderArray[i];
					    		facultyGenderArray[i]="Male";
								System.out.println("Male");
							}
						}
					    System.out.println(" Updated Gender "+tempGender+" into "+ facultyGenderArray[inputRegNo]+" Successfully");
						System.out.println();
		                break;
		    case 'F' :  for(int i=0; i<=countGender;i++)
						{
					    	if(countGender==i)
							{
					    		tempGender=facultyGenderArray[i];
					    		facultyGenderArray[i]="Female";
								System.out.println("Female");
							}
						}
					    System.out.println(" Updated Gender "+tempGender+" into "+ facultyGenderArray[inputRegNo]+" Successfully");
						System.out.println();
			            break;
		    case 'O' :  for(int i=0; i<=countGender;i++)
						{
					    	if(countGender==i)
							{
					    		tempGender=facultyGenderArray[i];
					    		facultyGenderArray[i]="Others";
								System.out.println("Transgender/Others");
							}
						}
					    System.out.println(" Updated Gender "+tempGender+" into "+ facultyGenderArray[inputRegNo]+" Successfully");
						System.out.println();
			            break;
			default  : System.out.println(" Invalid Gender .....! ");
		}
	}
	
	public static void updateFacultyCourse()
	{
		System.out.print(" Enter The Faculty RegNo: ");
		int inputRegNo=sc.nextInt();
		int countCourse=inputRegNo;
		//countCourse++;
		//String [] facultyCourseArray=new String[1000];
		//long facultytPhNo;
		System.out.println(" Edit Course \n A. EEE \n B. ECE \n C. CSE \n D. CE \n E. MECH \n F. AGR \n G. Others \n H. Exit \n \n Select One Option");
		char course=sc.next().charAt(0);
		String tempCourse="";
		switch(course)
		{
		    case 'A' :  for(int i=0; i<=countCourse;i++)
						{
		    	            if(countCourse==i)
		    	            {
		    	            	tempCourse=facultyCourseArray[i];
		    	            	facultyCourseArray[i]="Electrical & Electronics Engineering";
			    	            System.out.println("Electrical & Electronics Engineering");
			    	            System.out.println();
		    	            }
	
						}
		    
					    System.out.println(" Updated Course "+tempCourse+" into "+ facultyCourseArray[inputRegNo]+" Successfully");
						System.out.println();
		                break;
		    case 'B' :  for(int i=0; i<=countCourse;i++)
						{
		    	            if(countCourse==i)
		    	            {
		    	            	tempCourse=facultyCourseArray[i];
		    	            	facultyCourseArray[i]="Electronics & Communication Engineering";
			    	            System.out.println("Electronics & Communication Engineering");
			    	            System.out.println();
		    	            }
						}
					    System.out.println(" Updated course "+tempCourse+" into "+ facultyCourseArray[inputRegNo]+" Successfully");
						System.out.println();
			            break;
		    case 'C' :  for(int i=0; i<=countCourse;i++)
						{
		    	              if(countCourse==i)
		    	              {
		    	            	  tempCourse=facultyCourseArray[i];
		    	            	  facultyCourseArray[i]="Computer Science Engineering";
				    	          System.out.println("Computer Science Engineering");
				    	          System.out.println();
		    	              }
		    	              
						}
					    System.out.println(" Updated course "+tempCourse+" into "+ facultyCourseArray[inputRegNo]+" Successfully");
						System.out.println();
			            break;
		    case 'D' :  for(int i=0; i<=countCourse;i++)
						{
					    	  if(countCourse==i)
				              {
					    		    tempCourse=facultyCourseArray[i];
					    		    facultyCourseArray[i]="Civil Engineering";
				    	            System.out.println("Civil Engineering");
				    	            System.out.println();
				              }
		    	
						}
					    System.out.println(" Updated course "+tempCourse+" into "+ facultyCourseArray[inputRegNo]+" Successfully");
						System.out.println();
			            break;
			case 'E' :  for(int i=0; i<=countCourse;i++)
						{
							 if(countCourse==i)
				             {
								tempCourse=facultyCourseArray[i];
								facultyCourseArray[i]="Mechanical Engineering";
					            System.out.println("Mechanical Engineering");
			    	            System.out.println();
				             }
				
						}
						System.out.println("Updated course "+tempCourse+" into "+ facultyCourseArray[inputRegNo]+" Successfully");
						System.out.println();
			            break;
			case 'F' :  for(int i=0; i<=countCourse;i++)
						{
							if(countCourse==i)
				            {
								tempCourse=facultyCourseArray[i];
								facultyCourseArray[i]="Agricultural Engineering";
					            System.out.println("Agricultural Engineering");
			    	            System.out.println();
				            }
				
						}
						System.out.println("Updated course "+tempCourse+" into "+ facultyCourseArray[inputRegNo]+" Successfully");
						System.out.println();
			            break;
			case 'G' :  for(int i=0; i<=countCourse;i++)
						{
							if(countCourse==i)
				             {
								tempCourse=facultyCourseArray[i];
								facultyCourseArray[i]="Others";
					            System.out.println("Chemical Engineering / Aerospace Engineering / Auto Mobile Engineering / Bio-Medical Engineering / etc...., ");
			    	            System.out.println();
				             }
						}
						System.out.println("Updated course "+tempCourse+" into "+ facultyCourseArray[inputRegNo]+" Successfully");
						System.out.println();
			            break;
			case 'H' :  System.exit(0);			           
			            break;
			default  : System.out.println(" Invalid Course .....! ");
		}
	}

	public static void deleteFaculty()
	{
		System.out.println(" Enter the Faculty RegNo ");
		int countRegNo=sc.nextInt();
		
		String tempFirstName="";
		for(int i=0; i<=countRegNo;i++)
		{
			if(countRegNo==i)
			{
				tempFirstName=facultyFirstNameArray[i];
				facultyFirstNameArray[i]="";
			}
			
		}
		String tempLastName="";
		for(int i=0; i<=countRegNo;i++)
		{
			if(countRegNo==i)
			{
				tempLastName=facultyLastNameArray[i];
				facultyLastNameArray[i]="";
			}
			
		}
		long tempPhNo=0;
		for(int i=0; i<=countRegNo;i++)
		{
			if(countRegNo==i)
			{
				tempPhNo=facultyPhNoArray[i];
				facultyPhNoArray[i]=0;
			}
		}
		
		String tempGender="";
	    for(int i=0; i<=countRegNo;i++)
	    {
	    	if(countRegNo==i)
			{
	    		tempGender=facultyGenderArray[i];
	    		facultyGenderArray[i]="";
			}
		}
		    
	    String tempCourse="";
	    for(int i=0; i<=countRegNo;i++)
		{
	    	if(countRegNo==i)
			{
	    		tempCourse=facultyCourseArray[i];
	    		facultyCourseArray[i]="";
			}
		}
		
	    
	    System.out.println(" Details of "+countRegNo+" "+tempFirstName+" "+tempLastName+" is Successfully deleted");
	    System.out.println();
	    
	    
		System.out.println(" Delete One More Faculty Details (Y/N)");
		char optionOne=sc.next().charAt(0);
		if(optionOne=='Y')
		{
			deleteFaculty();
		}
		else
		{
			facultyDetails();
		}
		
		
	}
	
	public static void deleteFacultyDetails()
	{
		System.out.println(" Delete Fcaulty Details (Y/N)");
		char deleteOne=sc.next().charAt(0);
		if(deleteOne=='Y')
		{
			deleteFaculty();
		}
		else if(deleteOne=='N')
		{
			facultyDetails();
		}
		else
		{
			System.out.println(" Invalid Input.......! ");
		}
	}
	
	public static void displayFaculty()
	{
		System.out.print(" Enter the Faculty RegNo ");
		int countRegNo=sc.nextInt();
		for(int i=0; i<=countRegNo;i++)
		{
			if(countRegNo==i)
			{
				System.out.println( " Registration No  : "+ i);
				System.out.println( " Full Name        : "+ facultyFirstNameArray[i]+" "+facultyLastNameArray[i]);
				System.out.println( " Phone No         : "+ facultyPhNoArray[i]);
				System.out.println( " Gender           : "+ facultyGenderArray[i]);
				System.out.println( " Course           : "+ facultyCourseArray[i]);
			}
			
		}
		displayFacultyDetails();
		System.out.println();
	}
	public static void displayAllFaculty()
	{
		for(int i=1; i<=countFaculty;i++)
		{
			System.out.println( " Registration No  : "+ i);
			System.out.println( " Full Name        : "+ facultyFirstNameArray[i]+" "+facultyLastNameArray[i]);
			System.out.println( " Phone No         : "+ facultyPhNoArray[i]);
			System.out.println( " Gender           : "+ facultyGenderArray[i]);
			System.out.println( " Course           : "+ facultyCourseArray[i]);
			System.out.println( "-------------------------------------------------------------------");
			
		}
		displayFacultyDetails();
		System.out.println();
	}
	public static void displayFacultyDetails()
	{
		System.out.println();
		System.out.println(" Display Faculty Details \n A. Display One Faculty \n B. Display All Faculty \n C. Back");
		char displayOne=sc.next().charAt(0);
		switch(displayOne)
		{
	     	case 'A': displayFaculty(); 
	     	break;
	     	case 'B': displayAllFaculty(); 
	     	break;
	     	case 'C': facultyDetails(); 
	     	break;
	     	default : System.out.println(" Invalid Input.......! ");
		}
	}
	
	
	
	
	
	
	
//	public static void courseDetails()
//	{
//		
//		int courseOption1=1;
//		do
//		{
//			System.out.println(" Select your Course \n A. EEE \n B. ECE \n C. CSE \n D. CE \n E. MECH \n F. AGR \n G. Others \n H. Back \n \n You want to perform Details tab(1/0)");
//			int courseOption2=1;
//			courseOption2=sc.nextInt();
//		    while(courseOption2!=0)
//		    {
//		    	System.out.println(" Choose One Option");
//		    	char courseDetailsMenu=sc.next().charAt(0);
//		    	switch(courseDetailsMenu)
//		    	{
//				     case 'A': EEE();
//				          break;
//				    /* case 'B': ECE();
//			              break;
//				     case 'C': CSE(); 
//			              break;    
//			         case 'D': CE(); 
//			              break;           
//				     case 'E': MECH();
//			              break;
//				     case 'F': AGR();
//		                  break;
//				     case 'G': OTHERS();
//		                  break;*/
//				     case 'H': menu();
//		                  break;
//			         default: System.out.println(" Invalid Input.....!");
//			              break;
//		    	}
//		    	courseOption2=0;
//		    }
//		    courseOption1=0;
//		    
//		}
//		while(courseOption1!=0);
//	}
//	
//	/*
//	
//	public static void EEE()
//	{
//		System.out.println(" Select year details");
//		int eeeOption1=1;
//		do
//		{
//			System.out.println(" A. First Year \n B. Second Year \n C. Third Year \n D. Fourth Year \n E. Back \n \n You want to perform years tab(1/0)");
//			int eeeOption2=1;
//		    eeeOption2=sc.nextInt();
//		    while(eeeOption2!=0)
//		    {
//		    	System.out.println(" Choose One Option");
//		    	char yearDetailsMenu=sc.next().charAt(0);
//		    	switch(yearDetailsMenu)
//		    	{
//				     case 'A': firstYearDetails();
//				          break;
//				     case 'B': secondYearDetails();
//			              break;
//				     case 'C': thirdYearDetails(); 
//			              break;    
//			         case 'D': fourthYearDetails(); 
//			              break;           
//				     case 'E': menu();
//			              break;
//			         default: System.out.println(" Invalid Input.....!");
//			              break;
//		    	}
//		    	eeeOption2=0;
//		    }
//		    eeeOption1=0;
//		    
//		}
//		while(eeeOption1!=0);
//	}
	
//	public static void firstYearDetails()
//	{
//		System.out.println(" Select subject details");
//		int eeeOption1=1;
//		do
//		{
//			System.out.println(" A. Applied Chemistry \n B. Second Year \n C. Third Year \n D. Fourth Year \n E. Back \n \n You want to perform years tab(1/0)");
//			int eeeOption2=1;
//		    eeeOption2=sc.nextInt();
//		    while(eeeOption2!=0)
//		    {
//		    	System.out.println(" Choose One Option");
//		    	char yearDetailsMenu=sc.next().charAt(0);
//		    	switch(yearDetailsMenu)
//		    	{
//				     case 'A': firstYearDetails();
//				          break;
//				     case 'B': secondYearDetails();
//			              break;
//				     case 'C': thirdYearDetails(); 
//			              break;    
//			         case 'D': fourthYearDetails(); 
//			              break;           
//				     case 'E': menu();
//			              break;
//			         default: System.out.println(" Invalid Input.....!");
//			              break;
//		    	}
//		    	eeeOption2=0;
//		    }
//		    eeeOption1=0;
//		    
//		}
//		while(eeeOption1!=0);
//	}*/
}
