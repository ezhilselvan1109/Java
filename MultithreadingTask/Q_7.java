//Do Producer Consumer Problem.
class Q_7{
    public static void main(String[] args) {
        Product q=new Product();
        new Producer(q);
        new Consumer(q);
    }
}
class Product{
    int num;
    boolean valueSet=false;
    public synchronized void put(int num) throws InterruptedException {
        while (valueSet){
             wait();
        }
        System.out.println("Put: "+num);
        valueSet=true;
        this.num=num;
        notify();
    }
    public  synchronized void get() throws InterruptedException {
        while (!valueSet){
            wait();
        }
        System.out.println("Get: "+num);
        valueSet=false;
        notify();
    }
}

class Producer implements Runnable{
    Product q;
    public Producer(Product q) {
        this.q=q;
        Thread thread=new Thread(this,"Producer");
        thread.start();
    }
    public void run() {
        int i=0;
        while (true){
            try {
                q.put(i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    Product q;
    public Consumer(Product q) {
        this.q = q;
        Thread thread=new Thread(this,"Consumer");
        thread.start();
    }

    public void run() {
        while (true){
            try {
                q.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}