package ООП.L6.task1;

public class PinCode extends Unlocker {
    String pin;

    public PinCode(String pin) {
        this.pin = "123";
    }

    public String pinString(String userPin) {
        if (userPin.equals(pin)) {
            return "Phone unlocked";
        } else {
            return "Phone locked, try again";
        }
    }
}
