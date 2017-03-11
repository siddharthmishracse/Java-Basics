/**
*        int roll = args[0];
*  
*      In command Line Argument When A String value will be stored in an integer variable then it provides the following error
*      	
*       incompatible types:String cannot be converted to int 
*                roll=args[0];
*
*       Therefore The Command Line Argument must be converted to their respective type while writing.
*
*/

class Student{

	public static void main(String[] args){

		int roll;
		String name;

		roll=Integer.parseInt(args[0]);
		name=args[1];
		System.out.println("Roll Number = "+roll);
		System.out.println("Name = "+name);
	}
}
