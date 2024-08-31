import java.util.ArrayList;

class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name) {
        this.name = name;
    }

    public void run() {
        this.work();
    }

    public void work() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Sleep error");
            }
        }
        System.out.printf("%s done.\n", this.name);
    }
}

public class code7_3 {
    public static void main(String [] args) {
        ArrayList <Thread> array = new ArrayList<>();
        long start  = System.currentTimeMillis();
        for (int i = 1; i < 5; i++) {
            Thread w = new Thread(new HeavyWork("w" + i));
            w.start();
            array.add(w);
        }
        for (Thread t : array)
        {
            try {
                t.join();
            } catch (Exception e){
                System.out.println("join error.");
            }
        }
        long end = System.currentTimeMillis();
        System.out.printf("elasped time:%s ms\n", end - start);
    }
}
