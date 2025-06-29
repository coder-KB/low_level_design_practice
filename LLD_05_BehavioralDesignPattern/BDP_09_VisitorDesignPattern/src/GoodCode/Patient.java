package BDP_09_VisitorDesignPattern.src.GoodCode;

public interface Patient {
    void accept(Visitor visitor);
}
