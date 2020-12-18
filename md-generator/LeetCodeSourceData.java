import java.io.FileNotFoundException;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeSourceData {
    private final String title;
    private final String leetcodeLink;
    private final String solution;

    public LeetCodeSourceData(String txtFilePath) throws Throwable {
        List<String> data = ReadWriteUtils.read(txtFilePath);

        if (data.isEmpty()) {
            throw new FileNotFoundException("Txt file is Empty");
        } else {
            this.title = data.get(0).replaceFirst("[0-9]*. ", "");
            this.leetcodeLink = data.get(1);
            this.solution = data.stream()
                    .skip(2)
                    .map(x -> x.replaceFirst(" {4}", "") + "\n")
                    .collect(Collectors.joining());
        }
    }

    private static String firstCharUpper(String s) {
        StringBuilder str = new StringBuilder(s);

        str.setCharAt(0, s.charAt(0));

        return str.toString();
    }

    public void writeToMDFile(String mdFilePath) throws IOException {
        String commentMDLink = "[MDLink]: <>";
        String commentSolution = "[Solution]: <>";
        StringBuilder finalResult = new StringBuilder();
        if (!Files.exists(Path.of(mdFilePath)) || (Files.size(Path.of(mdFilePath)) == 0)) {
            finalResult.append("# ")
                    .append(firstCharUpper(mdFilePath.replace(".md", "")))
                    .append("\n\n")
                    .append(getMDSolutionLink())
                    .append("\n\n")
                    .append(commentMDLink)
                    .append("\n\n## ")
                    .append(title)
                    .append("\n\n")
                    .append(leetcodeLink)
                    .append("\n\n```java\n")
                    .append(solution)
                    .append("```\n\n")
                    .append(commentSolution);
            ReadWriteUtils.write(mdFilePath, finalResult.toString());
        } else {
            List<String> MDFile = ReadWriteUtils.read(mdFilePath);

            for (String line : MDFile) {
                if (line.equals(commentMDLink)) {
                    finalResult.append(getMDSolutionLink()).append("\n\n").append(commentMDLink).append("\n");
                } else if (line.equals(commentSolution)) {
                    finalResult.append("## ")
                            .append(title)
                            .append("\n\n")
                            .append(leetcodeLink)
                            .append("\n\n")
                            .append("```java\n")
                            .append(solution)
                            .append("```")
                            .append("\n\n")
                            .append(commentSolution);
                } else {
                    finalResult.append(line).append("\n");
                }
            }

            ReadWriteUtils.write(mdFilePath, finalResult.toString());
        }
    }

    private String getMDSolutionLink() {
        return String.format("+ [%s](#%s)", title, title.toLowerCase().replace(' ', '-'));
    }
}