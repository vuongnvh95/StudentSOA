package models;

import java.util.List;

import libs.StringMap;

public class Student {
	private static String KEY_ID 		= "id";
//	private static String KEY_NAME 		= "name";
//	private static String KEY_PHONE 	= "phone";
//	private static String KEY_EMAIL 	= "email";
//	private static String KEY_GRADE 	= "grade";
//	private static String KEY_LOCATION 	= "location";
//	private static String KEY_BIRDHDAY 	= "birth_day";
	
	private Student(){};
	
	private static StringMap ResultError = new StringMap("result", "success");
	private static StringMap ResultSuccess = new StringMap("result", "error");
	
	private static List<StringMap> simpledb;
	
	
	public static StringMap getInfo(String id){
		
		for (StringMap student : simpledb){
			String current_id = student.get(KEY_ID);
			if (current_id.equals(id)){
				return student;
			}
		}
		return null;
	}
	
	
	public static StringMap createStudent(StringMap info){
		
		if (getInfo(info.get(KEY_ID)) != null){
			return ResultError;
		} else {
			simpledb.add(info);
			return ResultSuccess;	
		}		
	}
	
	public static StringMap deleteStudent(String id){		
		for (StringMap student : simpledb){
			String current_id = student.get(KEY_ID);
			if (current_id.equals(id)){
				simpledb.remove(student);
			}
		}			
		return ResultSuccess;
	}
	
	public static StringMap editStudent(StringMap info){
		deleteStudent(info.get(KEY_ID));
		createStudent(info);		
		return ResultSuccess;
	}
	
	
	
}
