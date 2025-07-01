package GoodCode;

public abstract class Approver {
    protected Approver nextApprover;

    // Set the next approver
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    // Abstract method to process the request
    public abstract void processLeaveRequest(int leaveDays);
}
