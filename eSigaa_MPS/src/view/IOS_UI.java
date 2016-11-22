package view;

/**
 * eSIGAA User Interface for iOS devices.
 * [BRIDGE PATTERN]
 * @author thiago
 */
public class IOS_UI implements UI_Mobile{

    @Override
    public void drawUI(String title) {
        System.out.println("iOS UI " + title + " drawn.");

    }

    @Override
    public void drawIcon(int iconCode) {
        System.out.println(iconCode + " successfully drawn at the UI.");
    }
    
}
