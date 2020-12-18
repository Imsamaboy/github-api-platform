import java.io.FileNotFoundException;
import java.io.IOException;

import java.nio.file.*;

import java.util.List;

public class ReadWriteUtils {
    public static List<String> read(String readPath) throws IOException {
        Path path = Path.of(readPath);

        if (Files.exists(path)) {
            return Files.readAllLines(path);
        } else {
            throw new FileNotFoundException();
        }
    }

    public static void write(String writePath, String data) throws IOException {
        Files.writeString(Path.of(writePath), data);
    }
}
