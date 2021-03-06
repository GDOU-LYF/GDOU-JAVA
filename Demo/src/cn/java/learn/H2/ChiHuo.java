package cn.java.learn.H2;

public class ChiHuo extends Thread{
    private BaoZi bz;
    public ChiHuo(String name,BaoZi bz){
        super(name);
        this.bz=bz;
    }

    @Override
    public void run(){
        while(true){
            synchronized(bz){
                if(bz.flag==false){
                    try{
                        bz.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货在吃"+bz.pier+bz.xianer+"包子");
                bz.flag=false;
                bz.notify();
            }
        }


    }
}
