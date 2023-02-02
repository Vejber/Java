package ООП.L6.task1;

public class NoPasscode extends Unlocker {
    Boolean locked = true;

    public NoPasscode(Boolean locked) {
        this.locked = locked;
    }

    public String isLocked() {
        String result = "Phone unlocked";
        if (locked) {
            locked = false;
            return result;
        }
        return result;
    }
}
