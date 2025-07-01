package GoodCode.ConcreateClasses;

import GoodCode.Approver;

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
