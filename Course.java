package bOYI;

public class Course {
	 private String courseName;
	 private int courseId;
	 private Teacher teacher;
	 private float credit;
	 private Student[] students;
	 //构造函数
	 public Course(int courseId,String courseName,float credit,Teacher teacher) {
	  super();
	  this.courseId=courseId;
	  this.courseName=courseName;
	  this.credit=credit;
	  this.setTeacher(teacher);
	  students = new Student[30];
	 }
	 public Course(int courseId,String courseName,float credit) {
	  super();
	  this.courseId=courseId;
	  this.courseName=courseName;
	  this.credit=credit;
	  students = new Student[30];
	 }
	 
	 public Course(int courseId,String courseName) {
	  super();
	  this.courseId=courseId;
	  this.courseName=courseName;
	  students = new Student[30];
	 }
	 
	 public Course() {//默认形式，要有以防万一
	  super();
	  students = new Student[30];
	 }
	 
	 //修改或获取属性值id，name，credit，
	 public void setId(int id){
	  this.courseId=id;
	 }
	 public int getId(){
	  return this.courseId;
	 }
	 public void setName(String name){
	  this.courseName=name;
	 }
	 public String getName(){
	  return this.courseName;
	 }
	 public void setCredit(float credit ){
	  this.credit=credit;
	 }
	 public float getCredit(){
	  return this.credit;
	 }
	 public Teacher getTeacher() {
	  return teacher;
	 }
	 public void setTeacher(Teacher teacher) {
	  this.teacher = teacher;
	 }
	 
	 //课加入学生
	 public boolean addStudent(Student stu){
	  boolean flag = false;//标志值：是否加入成功
	  //如果学生没有选过这门课，同时课的学生还没满则执行
	  if(!isSelectedStudent(stu)&&isNullStudent(stu)){
	   for(int i=0;i<students.length;i++){
	    if(students[i]==null){
	     students[i]=stu;
	     flag=true;
	     break;
	    }
	   }
	  }
	  return flag;
	 }
	 //课移除学生
	 public boolean removeStudent(Student stu){
	  boolean flag=false;
	  if(isSelectedStudent(stu)){//选过这门课
	   for(int i=0;i<students.length;i++){
	    if(students[i]==stu){
	     students[i]=null;
	     flag=true;
	     break;
	    }
	   }
	  }
	  return flag;
	 }
	 //显示选择课程的学生：
	 public void displayStudent(){
	  System.out.println("选择的课程："+this.courseName+"的学生有:");
	  for(Student s:students){
	   if(s!=null){
	    System.out.print(s.getStuName()+" ");
	   }
	  }
	  System.out.println();
	 }
	 //子方法1：学生是否选过这门课
	 public boolean isSelectedStudent(Student stu){
	  boolean flag=false;
	  for(Student s:students){//只能用于检查，不能修改
	   if(s==stu){
	    flag=true;
	    break;
	   }
	  }
	  return flag;
	 }
	 //子方法2：学科学生未达到限定人数吗
	 public boolean isNullStudent(Student stu){
	  boolean flag=false;
	  for(Student s:students){
	   if(s==null){//还有空位
	    flag=true;
	    break;
	   }
	  }
	  return flag;
	 }
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	 
	 }
	 
	 
	}