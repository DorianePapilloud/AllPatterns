package Ex1;

/**
 * Lab 11
 * @author scz
 */
public interface State {

    void coinInserted();
    void coinReturn();
    void rightAmountEntered();
    void buttonPushed();
    void cupRemoved();
    void problemDetected();
    void resetButton();
}
