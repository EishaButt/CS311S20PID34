package com.za.ga.cs.connectionProvider;

import java.util.ArrayList;
import java.util.Arrays;

import com.za.ga.cs.domain.ClassTime;
import com.za.ga.cs.domain.Course;
import com.za.ga.cs.domain.Department;
import com.za.ga.cs.domain.Instructor;
import com.za.ga.cs.domain.Rooms;

public class Data {
	public static Data data;
	private ArrayList<Rooms> rooms;
    private ArrayList<Instructor> instructor;
    private ArrayList<Course> course;
    private ArrayList<Department> dept;
    private ArrayList<ClassTime> classtime;

    private int numberOfClasses = 0;
    /*public Data(){initialize();}
    private Data initialize(){
        Rooms room1= new Rooms("R1",50);
        Rooms room2= new Rooms("R2",50);
        Rooms room3= new Rooms("R3",50);
        rooms=new ArrayList<Rooms> (Arrays.asList(room1,room2,room3));
        ClassTime classtime1=new ClassTime("CT1","MWF 09:00 - 10:00");
        ClassTime classtime2=new ClassTime("CT2","TTH 11:00 - 12:00");
        ClassTime classtime3=new ClassTime("CT3","MWF 10:00 - 11:00");
        ClassTime classtime4=new ClassTime("CT4","MWF 08:00 - 09:00");
        ClassTime classtime5=new ClassTime("CT5","TTH 01:00 - 02:00");
        classtime=new ArrayList<ClassTime> (Arrays.asList(classtime1,classtime2,classtime3,classtime4,classtime5));
        Instructor instructor1=new Instructor("I1","Dr. Amna");
        Instructor instructor2=new Instructor("I2","Dr Awais");
        Instructor instructor3=new Instructor("I3","Dr Riaz");
        Instructor instructor4=new Instructor("I4","Dr Ali");
        Instructor instructor5=new Instructor("I5","Dr Ayesha");
        instructor=new ArrayList<Instructor> (Arrays.asList(instructor1,instructor2,instructor3,instructor4,instructor5));
        Course course1=new Course("C1","325K",new ArrayList<Instructor>(Arrays.asList(instructor1,instructor2)),50);
        Course course2=new Course("C2","303K",new ArrayList<Instructor>(Arrays.asList(instructor1)),25);
        Course course3=new Course("C3","306K",new ArrayList<Instructor>(Arrays.asList(instructor5,instructor3)),40);
        Course course4=new Course("C4","317K",new ArrayList<Instructor>(Arrays.asList(instructor4,instructor3)),30);


        course=new ArrayList<Course>(Arrays.asList(course1,course2,course3,course4));
       Department dept1=new Department("Math",new ArrayList<Course>(Arrays.asList(course1,course2)));
       Department dept2=new Department("Bio",new ArrayList<Course>(Arrays.asList(course1)));
       Department dept3=new Department("Comp",new ArrayList<Course>(Arrays.asList(course2,course3)));
       dept=new ArrayList<Department> (Arrays.asList(dept1,dept2,dept3));
       dept.forEach(x -> numberOfClasses += x.getCourses().size());
       return this;
    } 

    public ArrayList<Rooms> getRooms(){return rooms;}
    public ArrayList<Instructor> getInstructors(){return instructor;}
    public ArrayList<Course> getCourse(){return course;}
    public ArrayList<Department> getDept(){return dept;}
    public ArrayList<ClassTime> getClassTime(){return classtime;}
    public int getNumberOfClasses(){return this.numberOfClasses;}*/
    	
}
