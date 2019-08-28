package d01_create_variates.exercise;

import d01_create_variates.entity.HighSchoolStudent;

public class TestStudent {
	public static void main(String[] ages){
		HighSchoolStudent stu = new HighSchoolStudent("nanami","0001","femail",17,"art");
		System.out.println(stu.toString());
	}
}
