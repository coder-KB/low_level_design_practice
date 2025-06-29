package BDP_09_VisitorDesignPattern.src.GoodCode.ConcreateClasses;

import BDP_09_VisitorDesignPattern.src.GoodCode.Patient;
import BDP_09_VisitorDesignPattern.src.GoodCode.Visitor;

public class SeniorPatient implements Patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
