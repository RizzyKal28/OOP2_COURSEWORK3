
public class oop2_coursework_3 {
    private String Name;
    private int YOB;
    private String regNo;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
    
    private int marks;
    
    public oop2_coursework_3(int coursemarks){
        this.marks = coursemarks;
    }
public oop2_coursework_3(){}
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}
