package bOYI;
public class Teacher {
	 private int id;
	 private String teacherName;
	 private Course[] courses;
	 //构造函数
	 public Teacher() {
	  super();
	  courses= new Course[3];
	 }
	 public Teacher(int id,String teacherName){
	  this.id=id;
	  this.teacherName=teacherName;
	  courses = new Course[3];
	 }
	 //修改或是添加属性
	 public int getId() {
	  return id;
	 }
	 public void setId(int id) {
	  this.id = id;
	 }
	 public String getTeacherName() {
	  return teacherName;
	 }
	 public void setTeacherName(String teacherName) {
	  this.teacherName = teacherName;
	 }
	 
	 
	}