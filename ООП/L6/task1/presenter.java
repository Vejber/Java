package ООП.L6.task1;

import java.util.Scanner;

public class presenter {
    public static String action(String result) {
        switch (result) {
            case ("1"):
                NoPasscode noPasscode = new NoPasscode(true);
                String viewResult = noPasscode.isLocked();
                return viewResult;
            case ("2"):
                PinCode pinCode = new PinCode("123");
                Scanner iScanner = new Scanner(System.in);
                System.out.printf("Введите пин-код > ");
                String command = iScanner.nextLine();
                String viewResult2 = pinCode.pinString(command);
                return viewResult2;
            case ("3"):
                FingerPrint finger = new FingerPrint("fingerPrint");
                Scanner fingerScan = new Scanner(System.in);
                System.out.printf("Введите отпечаток > ");
                String commandFinger = fingerScan.nextLine();
                String viewResult3 = finger.fingerPrint(commandFinger);
                return viewResult3;
            case ("4"):
                FaceID face = new FaceID("faceID");
                Scanner faceScan = new Scanner(System.in);
                System.out.printf("Отсканируйте лицо > ");
                String commandFace = faceScan.nextLine();
                faceScan.close();
                String viewResult4 = face.faceString(commandFace);
                return viewResult4;
        }
        return result;
    }
}
