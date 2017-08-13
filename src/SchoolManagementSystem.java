	import java.util.*;
public class SchoolManagementSystem {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	                
	                System.out.println(" ****** School Management System ******\n"
	                		+ "1. Student Information \n"
	                		+ "2. Fees Information\n"
	                		+ "3. Result\n"
	                		+ "Enter Menu:");
	               
	             int module=input.nextInt();
	                boolean h = true;
	                
	                    switch(module){
	                        case 1:
	                            System.out.println("\n      --Student Information-- \n");
	                            System.out.print("Enter Name: ");
	                            @SuppressWarnings("unused")
								String name=input.next();
	                            System.out.print("Enter Roll No.: ");
	                            @SuppressWarnings("unused")
								int roll=input.nextInt();
	                            System.out.println("Father Name: Shams Ur Rehman.\n"
	                            		+ "Class:  Matric \n"
	                            		+ "Last Class: 9th \n"
	                            		+ "Last Passing Marks: 625 Out of 850");
	                            case 2:
	                            System.out.println("\n      --Fees Information-- \n"
	                            		+ "Admission Fees: Paid\n"
	                            		+ "Extracirculum Fees: Paid\n"
	                            		+ "Game Fees: Paid\n"
	                            		+ "Monthly Fees:Paid");
	                               
	                            int mfees=input.nextInt();
	                                if(mfees == 4000){
	                                    h=true;
	                                    System.out.println("Paid");
	                                }else{
	                                    h=false;
	                                    System.out.println("\nYour Result can not be shown due to nonpayment of result");
	                                }
	                        
	                        case 3:
	                            System.out.println("      --Result-- \n");
	                            if(h){
	                                
	                                
	                                System.out.println("Insert all the Marks out of 100\n");
	                                System.out.print("Enter Physics Marks: ");
	                                int phy=input.nextInt();
	                                if(phy >= 45){
	                                    System.out.println("Pass");
	                                }else{System.out.println("Fail");}
	                                
	                                System.out.print("Enter biology Marks: ");
	                                int biology=input.nextInt();
	                                if(biology >= 45){
	                                    System.out.println("Pass");
	                                }else{System.out.println("Fail");}
	                                
	                                System.out.print("Enter Mathematics Marks: ");
	                                int mathematics=input.nextInt();
	                                if(mathematics >= 45){
	                                    System.out.println("Pass");
	                                }else{System.out.println("Fail");}
	                                
	                                System.out.print("Enter English Marks: ");
	                                int english=input.nextInt();
	                                if(english >= 45){
	                                    System.out.println("Pass");
	                                }else{System.out.println("Fail");}
	                                
	                                System.out.print("Enter physics Marks: ");
	                                int physics=input.nextInt();
	                                if(physics >= 45){
	                                    System.out.println("Pass");
	                                }else{System.out.println("Fail");}
	                            
	                            }else{
	                                System.out.println("----\n");
	                            }
	                    }
	}

}

