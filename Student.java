class Student {

int studentMark = 22; //instance variable

static String studentColleName = "VLT"; // static variable

public static void main(String args[])
{
 	int studentRollNo = 30; //local variable

	System.out.println(studentRollNo);

	//System.out.println(studentMark);

	Student obj = new Student(); // Object Creation

	System.out.println(obj.studentMark);

	System.out.println(studentColleName);

//To access Non-Static variable inside the static method
//we need to create an object. with the help of object we can access the non static variable

}

}