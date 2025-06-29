package BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses;

import BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.Approver;

public class Director extends Approver {
    @Override
    public void processLeaveRequest(int leaveDays) {
        if(leaveDays <= 14) {
            System.out.println("Director approved the request");
        } else if(nextApprover != null) {
            nextApprover.processLeaveRequest(leaveDays);
        } else {
            System.out.println("Leave Request Denied, Too many leave days");
        }
    }
}
