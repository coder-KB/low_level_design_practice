package GoodCode;

import GoodCode.ConcreateClasses.AdultPatient;
import GoodCode.ConcreateClasses.ChildPatient;
import GoodCode.ConcreateClasses.SeniorPatient;

public interface Visitor {
    void visit(SeniorPatient seniorPatient);
    void visit(AdultPatient seniorPatient);
    void visit(ChildPatient seniorPatient);
}
