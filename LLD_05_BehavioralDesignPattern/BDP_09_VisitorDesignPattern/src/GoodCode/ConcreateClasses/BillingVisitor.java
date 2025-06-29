package BDP_09_VisitorDesignPattern.src.GoodCode.ConcreateClasses;

import BDP_09_VisitorDesignPattern.src.GoodCode.Visitor;

public class BillingVisitor implements Visitor {
    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("SeniorPatient -> BillingVisitor");
    }

    @Override
    public void visit(AdultPatient seniorPatient) {
        System.out.println("AdultPatient -> BillingVisitor");
    }

    @Override
    public void visit(ChildPatient seniorPatient) {
        System.out.println("ChildPatient -> BillingVisitor");
    }
}
