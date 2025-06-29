package ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses;

import ChainOfResponsibilityDesignPattern.src.GoodCode.Approver;

public class Supervisor extends Approver {
    @Override
    public void processLeaveRequest(int leaveDays) {
        if(leaveDays <= 3) {
            System.out.println("Supervisor approved the request");
        } else if(nextApprover != null) {
            nextApprover.processLeaveRequest(leaveDays);
        }
    }
}
