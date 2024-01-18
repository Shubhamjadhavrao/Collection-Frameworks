package Map;

import java.util.LinkedHashMap;

public class Teacher {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> teacher = new LinkedHashMap<>();
		teacher.put(1, "Ram");
		teacher.put(2, "Sham");
		teacher.put(3, "Shubham");
		teacher.put(4, "RajVeer");
		
		System.out.println("Original Listy:"+teacher);
//		Checked if Key is exit or not using containsKey
		System.out.println("<<<<<<Check key is exist or not>>>>>>>>>");
		Integer id =3;
		if(teacher.containsKey(id))
			System.out.println("Teacher Fonud in List with id " +id+ ":" +teacher.get(id));
		else
			System.out.println("Teacher Not Fonud in List"+id);
		
		
		
//		Checked if Value is exit or not using containsValue
		System.out.println("<<<<<<Check Value is exist or not>>>>>>>>>");
		String name ="Ram";
		if(teacher.containsValue(name))
			System.out.println("Teacher Name " + name + " Found in List  ");
		else
			System.out.println("Teacher Name "+name+"Not Found in List");
		
		System.out.println("<<<<<<Change Value Associated with key >>>>>>>>>");
		id=4;
		teacher.put(id, "Shambu");
		System.out.println("Change Teacher Name with id " +id+ " New Name is:" + teacher);
		System.out.println("<<<<<<<<Checked Contains key or not>>>>>>");
		System.out.println("3 is contains key by Id:"+teacher.containsKey(3));
		
	}

}
