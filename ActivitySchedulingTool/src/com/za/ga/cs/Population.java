package com.za.ga.cs;

import java.util.ArrayList;
import java.util.stream.IntStream;

import com.za.ga.cs.connectionProvider.Dbmgr;

public class Population {
	 private final ArrayList<Schedule> schedules;
	    public Population(final int size, final Dbmgr data){
	        schedules=new ArrayList<Schedule>(size);
	        IntStream.range(0,size).forEach(x -> schedules.add(new Schedule(data).initialize()));

	    }
	    public ArrayList <Schedule> getSchedule(){return this.schedules;}
	        public Population sortByFitness(){
	        schedules.sort( (schedule1 , schedule2) -> {
	                     int returnValue = 0;
	                    if(schedule1.getFitness() > schedule2.getFitness())
	                    returnValue=-1;
	                    else if (schedule1.getFitness() < schedule2.getFitness())
	                     returnValue=1;
	                return returnValue;
	        });
	        return this;
	    }
}
