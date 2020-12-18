public class Main {
    public static void main(final String[] args) throws Throwable {
        try {
            LeetCodeSourceData File = new LeetCodeSourceData(args[0]);
            File.writeToMDFile(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(String.format("Invalid number of parameters\n%d of 2 arguments received", args.length));
        }
    }
}