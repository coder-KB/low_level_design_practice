package VisitorDesignPattern.src.GoodCode.ConcreateClasses;

import VisitorDesignPattern.src.GoodCode.Patient;
import VisitorDesignPattern.src.GoodCode.Visitor;

public class SeniorPatient implements Patient {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
