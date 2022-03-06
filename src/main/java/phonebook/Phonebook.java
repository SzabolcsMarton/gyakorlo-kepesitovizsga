package phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        ensureParamsNotNull(contacts, output);
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
            writeFromMap(contacts, writer);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not write file: " + output, ioe);
        }
    }

    private void writeFromMap(Map<String, String> contacts, BufferedWriter writer) throws IOException {
        for (Map.Entry<String,String> actual : contacts.entrySet()){
            writer.write(actual.getKey()+ ": " + actual.getValue());
            writer.newLine();
        }
    }

    private void ensureParamsNotNull(Map<String, String> contacts, String output) {
        if (contacts == null ) {
            throw new IllegalArgumentException("Contact is null");
        }
        if (output == null ) {
            throw new IllegalArgumentException("Output is null");
        }
    }


}
