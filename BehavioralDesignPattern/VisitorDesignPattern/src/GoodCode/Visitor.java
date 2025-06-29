package VisitorDesignPattern.src.GoodCode;

import VisitorDesignPattern.src.GoodCode.ConcreateClasses.AdultPatient;
import VisitorDesignPattern.src.GoodCode.ConcreateClasses.ChildPatient;
import VisitorDesignPattern.src.GoodCode.ConcreateClasses.SeniorPatient;

public interface Visitor {
    void visit(SeniorPatient seniorPatient);
    void visit(AdultPatient seniorPatient);
    void visit(ChildPatient seniorPatient);
}
