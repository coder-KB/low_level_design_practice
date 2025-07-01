package GoodCode.ConcreateClasses;

import GoodCode.Patient;
import GoodCode.Visitor;

public class ChildPatient implements Patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
