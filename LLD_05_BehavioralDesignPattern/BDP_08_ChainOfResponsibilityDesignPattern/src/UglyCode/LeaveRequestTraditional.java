package BDP_08_ChainOfResponsibilityDesignPattern.src.UglyCode;

public class LeaveRequestTraditional {
    public static void main(String[] args) {
        int leaveDays = 10; // Employee request 10 days off
        if(leaveDays <= 3) {
            System.out.println("Supervisor approved the request");
        } else if(leaveDays <= 7) {
            System.out.println("Manager approved the request");
        } else if (leaveDays <= 14) {
            System.out.println("Director approved the request");
        } else {
            System.out.println("Leave request denied, too many days");
        }
    }
}
