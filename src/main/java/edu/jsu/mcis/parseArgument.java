package edu.jsu.mcis;

import java.lang.*;
import java.util.*;
import java.io.*;


public class parseArgument{
	//protected static Map<String, Argument> kmap;
	protected List<genArg> listArgs;
	
    private String programName;
    private String programDescription;
    private String message;

	public parseArgument() {
                    
        listArgs = new ArrayList<genArg>();
        message = "usage: java ";    
    }
	public void addArgs(String name, String description, genArg.Type type){
        genArg temp = new genArg();
        temp.setName(name);
        temp.setDescription(description);
        temp.setType(type);
		listArgs.add(temp);
       // map.put(name, temp);
    }
	
	public void addArgs(genArg arg){
		listArgs.add(arg);
	}
	
	public void parseArgs(String[] arg){
		if(listArgs.size()!=arg.length){
			errorMessage(arg);
		}
		else {
			for(int i=0; i<arg.length; i++){
				listArgs.get(i).setValue(arg[i]);
			}	
		}		
	}
		
	public genArg getArg(String name){
		for(int i=0; i<listArgs.size(); i++){
			if(name.equals(listArgs.get(i).getName())){
				return listArgs.get(i);
			}
		}
		return null;
	}	
	public int getlistSize(){
		return listArgs.size();
	}
	public String getProgramName(){
		return programName;
	}
	
	public void setProgramName(String name){
		programName = name;
	}	
	public void errorMessage(String[] arg){
		String name = "";
		String extra = "";
		
		for(genArg k : listArgs){
			name += " " + k.getName();
		}         
		if (arg.length > listArgs.size()){
			for (int i = listArgs.size(); i < arg.length; i++){
				extra += arg[i] + " "  ;
			}
		}
				
		message = message + getProgramName() + name + "\n" + getProgramName() + ".java: error: unrecognized arguments: " + extra;
		//message.trim();
		throw new IllegalArgumentException (message);
	}
	
	public String getMessage(){
		return message;
	}
			
	//usage: java VolumeCalculator length width height\nVolumeCalculator.java: error: unrecognized arguments: 43 |
}
	
	