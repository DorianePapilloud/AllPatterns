package Ex1.States;

public interface State {

    void coinInserted();
    void coinReturn();
    void rightAmountEntered();
    void buttonPushed();
    void cupRemoved();
    void problemDetected();
    void resetButton();
}
