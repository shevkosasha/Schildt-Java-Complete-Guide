package threads.interaction.wrong;

class Producer implements Runnable {
    Q qWrong;
    Producer(Q qWrong) {
        this.qWrong = qWrong;
        new Thread(this, "Поставщик").start();
    }
    public void run() {
        int i = 0;
        while(true) {
            qWrong.put(i++);
        }
    }
}
