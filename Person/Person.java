package Person;
// สร้างคราสสำหรับเก็บข้อมูลของบุคคล
 public class Person{
    private Stirng name;
    private String address;

    // คอนสตรัคเตอร์สำหรับกำหนดค่าเริ่มต้น
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    // เมธอดสำหรับเข้าถึงข้อมูล
    public Stirng getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    // เมธอดสำหรับตั้งค่าใหม่
    public void setAddress(String address) {
        this.address = address;
    }

    // เมธอดสำหรับแสดงข้อมูล
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}