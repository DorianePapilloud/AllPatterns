package Ex2.Commands;

import Ex2.Receiver.TextFile;

public class SaveTextFileCommand implements Command {

    @Override
    public void execute(TextFile textFile) {
        textFile.save();
    }

}
