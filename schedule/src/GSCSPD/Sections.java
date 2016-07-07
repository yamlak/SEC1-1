package GSCSPD;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sections {
	private static ArrayList<Course> degreePlanCourse;
	static HashMap<String, Integer> courseNeeded;
	static TreeMap<String,String> keyValue;
	Section section;  
	

	public static TreeMap<String,Integer> CourseNeeded(University univ)
	{
		int c=0;  int c1=0;
		degreePlanCourse = new ArrayList<Course>();
		courseNeeded = new HashMap<String, Integer>();
		keyValue= new TreeMap<String, String>();
		for (Entry<String, Student> studentEntry : univ.getStudents().entrySet()) 
		{  /* if(c>10) 
			break;
		c++;*/
	  //      System.out.println(studentEntry.getValue().getId());
	    //    System.out.println(univ.findDegree(studentEntry.getValue().getDegree().getCode()));
	       // for( Degree degreeEntry : univ.findDegree(studentEntry.getValue().getDegree().getCode()))
	    Degree degree=  univ.findDegree(studentEntry.getValue().getDegree().getCode());
	    
	   	     for(DegreePlanReq degreePlanReq : degree.getDegreePlanReqs())
	    	{ degreePlanCourse= degreePlanReq.getCourses();
	   	    	 c1=0;
	   	    	// System.out.println(degreePlanReq.getCourses());
	   	    	for(Course courseToTake : degreePlanCourse)
	   	    		if(studentEntry.getValue().findStudentCourseByCourse(courseToTake.getNumber())==null)
	   	    		{//	System.out.println(courseToTake.getNumber());
	   	    		String key = courseToTake.getNumber();
	   	    		if (key.length()>0){
						if(!courseNeeded.containsKey(key)){
							courseNeeded.put(key, Integer.parseInt( degree.getForecast()));
						}
						else {
							int value= courseNeeded.get(key);
							value++;
							courseNeeded.put(key, value);}}
	   	    		}
	   	    		}
	    	
	    	}
	
		
		Set<Map.Entry<String, Integer>> courseList = courseNeeded.entrySet();
		for(Map.Entry<String, Integer> lists: courseList){
	   // 	  System.out.println(lists.getValue()+ "   " + lists.getKey());
		}
		TreeMap<String, Integer> sortedMap = sortMapByValue(courseNeeded);
	//	System.out.println(sortedMap.firstKey());
		return sortedMap;
	    		}
	
	
	
	public static TreeMap<String, Integer> sortMapByValue(HashMap<String, Integer> map){
		Comparator<String> comparator = new ValueComparator(map);
		//TreeMap is a map sorted by its keys. 
		//The comparator is used to sort the TreeMap by keys. 
		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
		result.putAll(map);
		return result;
		}
	public static TreeMap<String, Integer> assignFaculty(University univ, Map.Entry<String, Integer> lists)
	{ //Schedule schedule;
//	Course course;
	ArrayList<Faculty> faculty = new ArrayList<Faculty>();
	TreeMap<String, Integer> sortedFaculty = new TreeMap<String, Integer>();
	HashMap<String, Integer> afaculty = new HashMap<String, Integer>();
		
		//fCourses=Sections.CourseNeeded(univ);
	//course=univ.findCourse(fCourses.firstKey());
	
	//	System.out.println(((Entry<String, Integer>) lists).getKey()+ "  "+ ((Entry<String, Integer>) lists).getValue());
	for ( Faculty entry : univ.findCourse(((Entry<String, Integer>) lists).getKey()).getFaculty())
	{  int x = 0;
      //  System.out.println(entry.getLastName());
        for (FacultyLoad facultyLoad : entry.getFacultyLoad())
        {	if(facultyLoad.getSemester()==univ.findSemester("2016FA")&& facultyLoad.getHours()>0)
        //	System.out.println(facultyLoad.getSemester().getName()+" " + facultyLoad.getHours());
        afaculty.put(entry.getLastName(),facultyLoad.getHours());
       sortedFaculty= Sections.sortMapByValue(afaculty);
     //  System.out.println(sortedFaculty.firstKey());//+ " " +entry.getLastName());
       if(facultyLoad.getHours()>0&& x<1){
        facultyLoad.setHours(facultyLoad.getHours()-1); x++;}
        }
       
        
	}
	//faculty=course.getFaculty();
	return sortedFaculty;
	
	}
	
	public static  TreeMap<String, Integer> assignSection(University myuniv){
		Section section;
		Faculty faculty;
		int c=0, x=0;
		TreeMap<String, Integer> sortedFaculty = new TreeMap<String, Integer>();
		TreeMap<String, Integer> sortedCourseList = new TreeMap<String, Integer>();
		HashMap<String, Integer> sortedCourse = new HashMap<String, Integer>();
	sortedCourseList=Sections.CourseNeeded(myuniv);
		for(Entry<String, Integer> lists: sortedCourseList.entrySet()){ 
			c++; x=0;
			if(lists.getValue()>=30){
//	System.out.println(printSection(myuniv,lists));
			sortedFaculty=	assignFaculty(myuniv,lists);
			for(Map.Entry<String, Integer> sFaculty : sortedFaculty.entrySet()){
				if(x<1&& sFaculty.getValue()>0){
					faculty= myuniv.findFaculty(sFaculty.getKey());
					System.out.println(lists.getKey()+ " " +" Number of Student  "+  lists.getValue() + " " + faculty.getLastName());
			//	System.out.println(myuniv.findSemester("2016FA")+"  "+myuniv.findFaculty(sFaculty.getKey())+ "  "  + myuniv.findCourse(lists.getKey())+" "+ "section"+ c);
				x++;} 
//	section = new Section(myuniv,myuniv.findSemester("2016FA"),myuniv.findFaculty(sFaculty.getKey()),myuniv.findCourse(lists.getKey()),"section"+c);
//	sections.setSemester(myuniv.findSemester("2016FA"));
//	sections.setFaculty(myuniv.findFaculty(sortedFaculty.firstEntry().getKey()));
//	sections.setCourse(myuniv.findCourse(lists.getKey()));
//	sections.setNumber("section"+c);} 
//	section.add(sections);
	}
//	addSection(sections);
//	System.out.println(sortedFaculty.entrySet());
			
			sortedCourse.put(lists.getKey(),lists.getValue()-30);
			sortedCourseList = sortMapByValue(sortedCourse);}
			System.out.println(lists.getKey()+" "+ lists.getValue());
	}   
		return sortedFaculty;
	} 
	
	}
class ValueComparator implements Comparator<String>{
	 
	HashMap<String, Integer> map = new HashMap<String, Integer>();
 
	public ValueComparator(HashMap<String, Integer> map){
		this.map.putAll(map);
	}
 
	@Override
	public int compare(String s1, String s2) {
		if(map.get(s1) >= map.get(s2)){
			return -1;
		}else{
			return 1;
		}	
	}
	
	
	
	
	

}

