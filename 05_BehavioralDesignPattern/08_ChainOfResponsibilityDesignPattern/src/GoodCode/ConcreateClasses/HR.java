package GoodCode.ConcreateClasses;

import GoodCode.Approver;

public class HR extends Approver {
    @Override
    public void processLeaveRequest(int leaveDays) {
        System.out.println("Too many leaves, need further discussion");
    }
}
