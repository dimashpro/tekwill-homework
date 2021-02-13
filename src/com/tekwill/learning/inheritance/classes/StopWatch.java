package com.tekwill.learning.inheritance.classes;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        this.startTime = LocalTime.now();
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void stop() {
        endTime = LocalTime.now();
    }

    public long getElapsedTime() {
        Duration duration;
        duration = Duration.between(startTime, endTime);
        return duration.toMillis();
    }


    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallestNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallestNumber;
        }
    }

    public int[] randomIntArray() {
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public void run() {
        start();
        selectionSort(randomIntArray());
        stop();
        System.out.println("The execution time of sorting 100000 numbers using selection sort is " + getElapsedTime() + " milliseconds.");
    }
}
