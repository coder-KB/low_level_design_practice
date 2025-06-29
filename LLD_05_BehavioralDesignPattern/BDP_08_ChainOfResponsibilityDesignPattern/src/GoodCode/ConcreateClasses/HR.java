package BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses;

import BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.Approver;

public class HR extends Approver {
    @Override
    public void processLeaveRequest(int leaveDays) {
        System.out.println("Too many leaves, need further discussion");
    }
}
