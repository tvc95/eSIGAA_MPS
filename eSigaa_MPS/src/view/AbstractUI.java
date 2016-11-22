package view;

/**
 * This class offers an accessible interface for each mobile UI abstraction
 * [BRIDGE PATTERN]
 * @author thiago
 */
public abstract class AbstractUI {
    
    protected UI_Mobile ui;
    
    /**
     * Abstract class constructor
     * @param ui 
     */
    public AbstractUI(UI_Mobile ui) {
        this.ui = ui;
    }
    
    public void drawUI(String title){
        ui.drawUI(title);
    }
    
    public void drawIcon(int iconCode){
        ui.drawIcon(iconCode);
    }
    
    public abstract void draw();
    
}
