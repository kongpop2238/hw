package Person;
public class Staff extends Person {
    //สร้างคลาสสำหรับเก็บข้อมูลของเโรงเรียน
    private Stirng school;
    private double pay;

    //คอนสตรัคเตอร์สำหรับกำหนดค่าเริ่มต้น
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    // เมธอดสำหรับดึงค่าชื่อโรงเรียน
    public String getSchool() {
        return school;
    }
    // เมธอดสำหรับเซ็ทชื่อโรงเรียน
    public void setSchool(String school) {
        this.school = school;
    }
    // เมธอดสำหรับดึงค่าจ้าง
    public double getPay() {
        return pay;
    }
    // เมธอดสำหรับเซ็ทค่าจ้าง
    public void setPay(double pay) {
        this.pay = pay;
    }
    //แสดงข้อมูลของStaff
    @Override
    public String toString() {
        return "Staff[" + super.toString() +
                ", school='" + school + '\'' +
                ", pay=" + pay +
                ']';
    }
}