package xuanke;


public class Test2 {
    public static void main(String args[]){
        Students stu0 = new Students("李华",111,"男",19);
        Students stu1 = new Students("张明",222,"女",18);
        Students stu2 = new Students("胡天",333,"男",19);
        Teacher tea0 = new Teacher("张华","男",35,3120);
        Teacher tea1 = new Teacher("刘琴","女",36,2537);
        Teacher tea2 = new Teacher("王辉","女",55,8573);
        Course cour0 = new Course(5278,"数学",tea0);
        Course cour1 = new Course(4527,"化学",tea1);
        Course cour2 = new Course(8645,"物理",tea2);
        stu0.addCourse(cour0);
        stu0.addCourse(cour1);
        stu1.addCourse(cour2);
        stu0.addCourse(cour0);
        stu2.addCourse(cour0);
        stu2.addCourse(cour1);
        System.out.println("\n");
        System.out.println("每个课的学生"+ "\n");
        cour0.displayStudent();
        cour1.displayStudent();
        cour2.displayStudent();
        System.out.println("\n");
        System.out.println("学生所选的课"+ "\n");
        stu0.removeCourse(cour0);
        stu1.removeCourse(cour0);
        stu2.removeCourse(cour2);
        stu0.displayCourse();
        stu1.displayCourse();
        stu2.displayCourse();
        System.out.println("\n");
        System.out.println("学生信息"+ "\n");
        System.out.println(stu0);
        System.out.println(stu1);
        System.out.println(stu2);
    }
}