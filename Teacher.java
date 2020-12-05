package xuanke;



public class Teacher extends Member{
    private String teaName;
    private String teaGender;
    private int teaAge;
    private int teaNumbering;
    public Course[] course;
    public Teacher(String teaName,String teaGender,int teaAge,int teaNumbering){
        super();
        this.teaName = teaName;
        this.teaGender = teaGender;
        this.teaAge = teaAge;
        this.teaNumbering = teaNumbering;
        course = new Course[3];
    }
    @Override
    void setName(String name) {
        this.teaName = name;
    }

    @Override
    String getName() {
        return teaName;
    }

 
    int getNumbering() {
        return teaNumbering;
    }

    @Override
    void setGender(String gender) {
        this.teaGender = gender;
    }

    @Override
    String getGender() {
        return teaGender;
    }

    @Override
    void setAge(int age) {
        this.teaAge = age;
    }

    @Override
    int getAge() {
        return teaAge;
    }
	@Override
	void setNumbering(int numbering) {
		// TODO Auto-generated method stub
		
	}

    


}
