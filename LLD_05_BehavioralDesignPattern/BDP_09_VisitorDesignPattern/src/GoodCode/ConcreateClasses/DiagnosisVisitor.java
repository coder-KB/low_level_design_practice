package BDP_09_VisitorDesignPattern.src.GoodCode.ConcreateClasses;

import BDP_09_VisitorDesignPattern.src.GoodCode.Visitor;

public class DiagnosisVisitor implements Visitor {
    @Override
    public void visit(SeniorPatient seniorPatient) {
        System.out.println("SeniorPatient -> DiagnosisVisitor");
    }

    @Override
    public void visit(AdultPatient seniorPatient) {
        System.out.println("AdultPatient -> DiagnosisVisitor");
    }

    @Override
    public void visit(ChildPatient seniorPatient) {
        System.out.println("ChildPatient -> DiagnosisVisitor");
    }
}
