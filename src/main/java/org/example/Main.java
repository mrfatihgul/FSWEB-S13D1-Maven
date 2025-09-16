package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 8) + " " + hasTeen(23, 15, 42) + " " + isCatPlaying(false, 36) + " " + area(-1.0, 4.0) + " " + areaCircle(5.0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (isBarking && clock >= 8 && clock < 20 ) {
            return true;
        } else if (clock > 0 && clock < 23) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if (firstAge<19 && firstAge>13 || secondAge<19 && secondAge>13 || thirdAge<19 && thirdAge>13){
           return true;
       } else {
           return false;
       }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (!isSummer && temp < 35 && temp > 25) {
            return true;
        } else if (isSummer && temp < 45 && temp > 35) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(double width, double height) {
       if (width>=0 && height>=0) {
           return width*height;
       } else {
           return -1;
       }
    }

    public static double areaCircle(double radius) {
       if (radius>=0) {
           return radius*radius*Math.PI;
       } else {
           return -1;
       }
    }

}
