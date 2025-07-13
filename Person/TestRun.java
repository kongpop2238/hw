
//ทดการทำงาน
public class TestRun {
    
    System.out.println("========Staff #1 ============================");
        // สร้าง Object ของ Staff คนแรก
        Staff ck = new Staff("Chanakarn Kingkaew","85/1 PIM Nonthaburi","PIM",1_000_000);
        System.out.println(ck);

        System.out.println("\n========Student #1 ============================");
        // สร้าง Object ของ Student คนแรก
        Student cv = new Student("Katarina Blu","85/1 PIM Nonthaburi","CAI",2558,50000);
        System.out.println(cv);

        // --- exam ---

        System.out.println("\n========Person #1 ============================");
        // สร้าง Object ของ Person เพิ่ม 1 คน
        Person person2 = new Person("ประยุทธ์ จันทร์โอชา", "ทำเนียบรัฐบาล");
        System.out.println(person2);

        System.out.println("\n========Staff #2 ============================");
        // สร้าง Object ของ Staff เพิ่มอีก 1 คน
        Staff staff2 = new Staff("ประวิตร วงษ์สุวรรณ", "มูลนิธิป่ารอยต่อ 5 จังหวัด", "PIM", 800000.00);
        System.out.println(staff2);

        System.out.println("\n========Student #2 ============================");
        // สร้าง Object ของ Student เพิ่มอีก 2 คน (รวมเป็น 3 คน)
        Student student2 = new Student("ณเดชน์ คูกิมิยะ", "กรุงเทพฯ", "นิเทศศาสตร์", 2560, 60000.00);
        System.out.println(student2);

        System.out.println("\n========Student #3 ============================");
        Student student3 = new Student("ญาญ่า อุรัสยา", "เชียงใหม่", "อักษรศาสตร์", 2561, 55000.00);
        System.out.println(student3);
    }


