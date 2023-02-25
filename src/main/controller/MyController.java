package main.controller;

import java.util.concurrent.locks.ReentrantLock;

public class MyController {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try{
            // your code
        }finally {
            lock.unlock();
        }
    }
}
