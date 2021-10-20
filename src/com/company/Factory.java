package com.company;

import java.util.Random;

public class Factory extends Thread {
    private static volatile int count;

    @Override
    public void run() {

        while(count<99) {
            Random random = new Random();
            int rand = random.nextInt(6) + 3;
            try {
                sleep(rand * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count<99) {
                Baloon bal = new Baloon();
                Storage.arr.add(bal);
                synchronized (this){count++;}
                System.out.println("Baloon " + count + " ready. Factory "+ currentThread().getName());
            }
        }

    }
}
