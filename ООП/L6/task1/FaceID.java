package ООП.L6.task1;

public class FaceID extends Unlocker {
    String FaceID;

    public FaceID(String faceID) {
        FaceID = faceID;
    }

    public String faceString(String userPin) {
        if (userPin.equals(FaceID)) {
            return "Phone unlocked";
        } else {
            return "Phone locked, try again";
        }
    }
}
