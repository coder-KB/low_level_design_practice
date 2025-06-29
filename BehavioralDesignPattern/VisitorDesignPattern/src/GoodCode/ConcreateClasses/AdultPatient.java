package VisitorDesignPattern.src.GoodCode.ConcreateClasses;

import VisitorDesignPattern.src.GoodCode.Patient;
import VisitorDesignPattern.src.GoodCode.Visitor;

public class AdultPatient implements Patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
