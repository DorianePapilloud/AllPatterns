package Ex2.States;

public interface State {
	State leave();
	State enter();
	State ask();
	State over();
	State handover();
}
