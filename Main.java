import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecOne());
        Thread t2 = new Thread(new ExecTwo());
        Thread t3 = new Thread(new ExecThree());

        t1.start();
        t2.start();
        t3.start();
    }
}

class ExecOne implements Runnable {
    public void run() {
        walk();
    }
    public void walk() {
        Random rand = new Random();
        int n1 = rand.nextInt(3000);
        for (int i = 1; i < 51; i++) {
            System.out.println("Thread #<1>: <" + i + ">");  
            try {
                Thread.sleep(n1); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ExecTwo implements Runnable {
    public void run() {
        walk();
    }
    public void walk() {
        Random rand = new Random();
        int n2 = rand.nextInt(3000);
        for (int i = 1; i < 51; i++) {
            System.out.println("Thread #<2>: <" + i + ">");  
            try {
                Thread.sleep(n2); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ExecThree implements Runnable {
    public void run() {
        walk();
    }
    public void walk() {
        Random rand = new Random();
        int n3 = rand.nextInt(3000);
        for (int i = 1; i < 51; i++) {
            System.out.println("Thread #<3>: <" + i + ">");
            try {
                Thread.sleep(n3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Before adding Thread.sleep(): เห็นว่า Output ของแต่ละ Thread ดูไม่เป็นระเบียบ เนื่องจากเมื่อ Thread ใดทำเสร็จก็จะ Print Output ออกมาทันที
// After adding Thread.sleep(): เห็นว่า Output ของแต่ละ Thread ดูเป็นระเบียบขึ้น เนื่องจาก Output ในแต่ละ Thread จะรอเวลา Delay ก่อนค่อย Print Output ออกมา
// Multithreading หมายถึง การที่ Thread หลายๆ ตัวทำงานไปพร้อมๆ กัน ทำให้มีการรันไปพร้อมๆ กันด้วย จึงทำให้เกิดการทำงานแบบ Parallel ขึ้น ส่งผลให้ลำดับ Output ของ Thread เปลี่ยนแปลง
