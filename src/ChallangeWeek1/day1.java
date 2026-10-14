package ChallangeWeek1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day1 {
  private  int id, age;
  private String name;
   private double grade1, grade2, grade3;

    public day1(int id, int age, String name, double grade1, double
            grade2, double grade3) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double getGrade3() {
        return grade3;
    }


}





