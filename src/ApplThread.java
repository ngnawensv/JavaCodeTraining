public class ApplThread{

    public static void main(String[] args) {
        //Créer une instance d'une classe anonyme de type Thread et implémenter sa méthode run().
        Thread thread1=new Thread(){
            @Override
            public void run() {
                System.out.println("Thread test via la classe Thread");
            }
        };

        //Thread avec la classe anonyme
        Runnable thread2 =new Runnable() {
            @Override
            public void run() {
                System.out.println("thread via l'interface Runnable");
            }
        };

        //Thread avec les lamda expression
        Runnable thread3 = ()-> System.out.println("thread via l'interface Runnable");


        thread1.start();
        new Thread(thread2).start();
        new Thread(thread3).start();
        new ClassThread1().start();
        new Thread(new ClassThread2()).start();
    }
}

//Créer une classe fille qui hérite de la classe Thread.
class ClassThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread qui extends la classe Thread");
    }
}

//Créer une classe qui implémente l'interface Runnable
class ClassThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread qui implemente l'interface Runnable");
    }
}

