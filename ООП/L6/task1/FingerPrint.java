package ООП.L6.task1;

public class FingerPrint extends Unlocker {
    String fingerPrint;

    public FingerPrint(String fingerPrint) {
        this.fingerPrint = "fingerPrint";
    }

    public String fingerPrint(String userPin) {
        if (userPin.equals(fingerPrint)) {
            return "Phone unlocked";
        } else {
            return "Phone locked, try again";
        }
    }
}
