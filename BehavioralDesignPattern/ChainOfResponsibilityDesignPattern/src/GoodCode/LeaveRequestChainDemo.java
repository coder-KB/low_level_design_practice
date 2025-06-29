package ChainOfResponsibilityDesignPattern.src.GoodCode;

import ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses.Director;
import ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses.HR;
import ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses.Manager;
import ChainOfResponsibilityDesignPattern.src.GoodCode.ConcreateClasses.Supervisor;

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
