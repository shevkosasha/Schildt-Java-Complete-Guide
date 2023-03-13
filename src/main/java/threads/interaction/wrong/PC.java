package threads.interaction.wrong;

class PC {
    public static void main(String args[]) {
        Q qWrong = new Q();
        new Producer(qWrong);
        new Consumer(qWrong);
        System.out.println("Для остановки нажмите Ctrl+C.");
    }
}
