package threads.synchronizingThreads;

// Эта программа не синхронизирована
class Callme {

    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(500);
        } catch(InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}
