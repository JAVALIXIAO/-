package xuanke;

public class Course {

    private String courseName;
    private int courseId;
    private Teacher teacher;
    private Students[] students;
    public Course(int courseId,String courseName,Teacher teacher){
        super();
        this.courseId = courseId;
        this.courseName = courseName;
        this.setTeacher(teacher);
        students = new Students[30];
    }
    public void setId(int Id){
        this.courseId = Id;
    }

    public int getId(){
        return this.courseId;
    }
    public void setName(String name){
        this.courseName = name;
    }

    public String getName(){
        return this.courseName;
    }
    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }

    /*that two was check class is full or null*/
    public boolean isSelectedStudent(Students stu){
        boolean flag = false;
        for(Students s:students){
            if(s == stu){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public boolean isNullStudent(Students stu){
        boolean flag = false;
        for(Students s:students){
            if(s == null){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public boolean addStudent(Students stu){
        boolean flag = false;
        if(!isSelectedStudent(stu)&&isNullStudent(stu)){
            for(int i = 0;i<students.length;i++){
                if(students[i]==null){
                    students[i] = stu;
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }/*course add student*/
    public boolean removeStudent(Students stu){
        boolean flag=false;
        if(isSelectedStudent(stu)){
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
    public void displayStudent(){
        System.out.println("选"+this.courseName+"课的有");
        for(Students s:students){
            if(s!=null){
                System.out.print(s.getName()+" ");
            }
        }
       System.out.println("      ");
    }
}

