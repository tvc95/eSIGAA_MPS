package view;

/**
 * eSIGAA User Interface for Android smartphones
 * [BRIDGE PATTERN]
 * @author thiago
 */
public class AndroidUI implements UI_Mobile{

    @Override
    public void drawUI(String title) {
        System.out.println("Android UI " + title + " drawn.");
    }

    @Override
    public void drawIcon(int iconCode) {
        System.out.println(iconCode + " successfully drawn at the UI.");
    }
    
}
