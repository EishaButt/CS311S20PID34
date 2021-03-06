package com.za.ga.cs;

import java.util.ArrayList;

import com.za.ga.cs.connectionProvider.Dbmgr;
import com.za.ga.cs.domain.Class;
import com.za.ga.cs.domain.Department;

public class Schedule{
	    private  ArrayList<Class> classes;
	    private boolean isFitnesssChanged=true;
	    private double fitness=-1;
	    private int classNum = 0;
	    private int numbOfConflicts=0;
	    private  Dbmgr data;
	    public Dbmgr getData(){return data;}
	    public Schedule( Dbmgr  data){
	        this.data= data;
	        classes = new ArrayList<Class>(data.getNumberOfClasses());
	    }
	    public Schedule initialize(){
	        new ArrayList<Department>(data.getDept()).forEach(dept ->{
	            dept.getCourses().forEach(course ->{
	                 Class newClass = new Class(classNum++,course,dept);
	                newClass.setClassTime(data.getClassTime().get((int)(data.getClassTime().size()*Math.random())));
	                newClass.setRoom(data.getRooms().get((int)(data.getRooms().size()*Math.random())));
	                newClass.setInstructor(course.getInstructors().get((int)(course.getInstructors().size()* Math.random())));
	                classes.add(newClass);
	            });
	        });
	        return this;
	    }
	    
	    public int getNumbOfConflicts(){return numbOfConflicts;}
	    public ArrayList<Class> getClasses(){
	        isFitnesssChanged=true;
	        return classes;
	    }
	    public double getFitness(){
	        if(isFitnesssChanged==true)
	         {   fitness=calculateFitness();
	            isFitnesssChanged=false;

	    }
	    return fitness;
	}
	    private double calculateFitness(){
	        numbOfConflicts=0;
	        classes.forEach(x -> {
	            if(x.getRoom().getSeatingCapacity()< x.getCourse().getmaxNoOfStudent()) numbOfConflicts++;
	            classes.stream().filter(y->classes.indexOf(y)>=classes.indexOf(x)).forEach(y->{
	                if(x.getClassTime()==y.getClassTime()&&x.getId()!=y.getId()){
	                    if(x.getRoom()==y.getRoom()) numbOfConflicts++;
	                    if(x.getInstructor()==y.getInstructor()) numbOfConflicts++;
	                }
	            });
	        });
	        return 1/(double)(numbOfConflicts+1);
	    }
	    public String toString() {
	    	String returnValue = new String();
	    	for(int x = 0; x < classes.size()-1;x++)returnValue += classes.get(x) + ",";
	    	returnValue += classes.get(classes.size()-1);
	    	return returnValue;
	    }
}
