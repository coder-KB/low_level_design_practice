package BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses;

import BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.Approver;

public class Manager extends Approver {
    @Override
    public void processLeaveRequest(int leaveDays) {
        if(leaveDays <= 7) {
            System.out.println("Manager approved the request");
        } else if(nextApprover != null) {
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
