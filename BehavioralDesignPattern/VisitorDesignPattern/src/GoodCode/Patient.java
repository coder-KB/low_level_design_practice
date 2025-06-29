package VisitorDesignPattern.src.GoodCode;

public interface Patient {
    void accept(Visitor visitor);
}
