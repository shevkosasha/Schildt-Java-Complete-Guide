package threads.interaction.correct;


class Consumer implements Runnable {
    Q qWrong;
    Consumer(Q qWrong) {
        this.qWrong = qWrong;
        new Thread(this, "Потребитель").start();
    }
    public void run() {
        while(true) {
            qWrong.get();
        }
    }
}
