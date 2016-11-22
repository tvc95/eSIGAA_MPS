package view;

/**
 * Abstraction of the SIGAA User Interface, where we can use the same
 * abstraction for both iOS and Android devices.
 * [BRIDGE PATTERN]
 * @author thiago
 */
public class SIGAA_UI extends AbstractUI {

    public SIGAA_UI(UI_Mobile ui) {
        super(ui);
    }

    @Override
    public void draw() {
        drawUI("Main Menu - eSIGAA");
        drawIcon(0);    //login
        drawIcon(1);    //cancel
    }
    
}
