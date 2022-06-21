package Ex2.Commands;

import Ex2.Receiver.TextFile;

public class CloseTextFileCommand implements Command {

    @Override
    public void execute(TextFile textFile) {
        textFile.close();
    }

}
