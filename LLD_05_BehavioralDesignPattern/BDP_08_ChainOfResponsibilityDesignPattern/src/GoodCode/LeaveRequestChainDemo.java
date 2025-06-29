package BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode;

import BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses.Director;
import BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses.HR;
import BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses.Manager;
import BDP_08_ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses.Supervisor;

public class LeaveRequestChainDemo {
    public static void main(String[] args) {
        Approver superVisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver hr = new HR();

        superVisor.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(hr);

        superVisor.processLeaveRequest(18);
    }
}
