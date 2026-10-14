package ChallangeWeek1;

import java.util.ArrayList;
import java.util.Scanner;

public class extraDetails{
    ArrayList<day1> students = new ArrayList<>();
    Scanner Student = new Scanner(System.in);
    public  void addStudent(){

        System.out.println("enter your id");
        int id = Student.nextInt();

        Student.nextLine();

        System.out.println("enter your name");
        String name = Student.nextLine();

        System.out.println("enter your age");
        int age = Student.nextInt();
        Student.nextLine();

        System.out.println("enter your first grade");
        double grade1 = Student.nextDouble();
        Student.nextLine();

        System.out.println("enter your second grade");
        double grade2 = Student.nextDouble();
        Student.nextLine();

        System.out.println("enter your third grade grade");
        double grade3 = Student.nextDouble();
        Student.nextLine();

        Student.close();

        day1 student= new day1(id,age, name, grade1,grade2,grade3);






    }

    public void ViewStudents(){
  for( day1 student : students){
      System.out.println("student id:" +student.getId());
      System.out.println("student name:" +student.getName());
      System.out.println("student age:" +student.getAge());
      System.out.println("student grade1:" +student.getGrade1());
      System.out.println("student grade2:" +student.getGrade2());
      System.out.println("student grade3" +student.getGrade3());
  }

  }
}
