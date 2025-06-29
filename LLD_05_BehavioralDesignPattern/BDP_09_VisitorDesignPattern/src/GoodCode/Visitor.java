package BDP_09_VisitorDesignPattern.src.GoodCode;

import BDP_09_VisitorDesignPattern.src.GoodCode.ConcreateClasses.AdultPatient;
import BDP_09_VisitorDesignPattern.src.GoodCode.ConcreateClasses.ChildPatient;
import BDP_09_VisitorDesignPattern.src.GoodCode.ConcreateClasses.SeniorPatient;

public interface Visitor {
    void visit(SeniorPatient seniorPatient);
    void visit(AdultPatient seniorPatient);
    void visit(ChildPatient seniorPatient);
}
