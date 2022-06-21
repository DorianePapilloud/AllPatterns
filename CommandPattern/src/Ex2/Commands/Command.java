package Ex2.Commands;

import Ex2.Receiver.TextFile;

public interface Command {

    void execute(TextFile text);

}
