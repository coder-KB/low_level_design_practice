package BDP_09_VisitorDesignPattern.src.GoodCode;

import BDP_09_VisitorDesignPattern.src.GoodCode.ConcreateClasses.*;

public class HospitalVisitorDemo {
    public static void main(String[] args) {
        Patient[] patients = {new ChildPatient(), new SeniorPatient(), new AdultPatient()};

        Visitor diagnosisVisitor = new DiagnosisVisitor();
        Visitor billingVisitor = new BillingVisitor();

        for(Patient patient: patients) {
            patient.accept(diagnosisVisitor);
            patient.accept(billingVisitor);
        }
    }
}
