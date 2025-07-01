package GoodCode;

import GoodCode.ConcreateClasses.Director;
import GoodCode.ConcreateClasses.HR;
import GoodCode.ConcreateClasses.Manager;
import GoodCode.ConcreateClasses.Supervisor;

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
