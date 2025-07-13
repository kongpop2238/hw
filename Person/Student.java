package Person;
public class Student extends Person {
    // สร้างคราสสำหรับเก็บข้อมูลของนักเรียน
    private int year;
    private String program;
    private double fee;

    // คอนสตรัคเตอร์สำหรับกำหนดค่าเริ่มต้น
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.fee = fee;
    }

    // เมธอดสำหรับดึงค่าโปรแกรม
    public String getProgram() {
        return program;
    }
    // เมธอดสำหรับเซ็ทค่าโปรแกรม
    public void setProgram(String program) {
        this.program = program;
    }
    // เมธอดสำหรับดึงค่าปีที่เข้าเรียน
    public int getYear() {
        return year;
    }
    // เมธอดสำหรับเซ็ทค่าปีที่เข้าเรียน
    public void setYear(int year) {
        this.year = year;
    }

    // เมธอดสำหรับดึงค่าทำเนียม
    public double getFee() {
        return fee;
    }
    // เมธอดสำหรับเซ็ทค่าทำเนียม
    public void setFee(double fee) {
        this.fee = fee;
    }

    //แสดงข้อมูลของนักเรียน
    @Override
    public String toString() {
        return "Student["+super.toString() +
                ", program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ']';
    }


}

