public class StaffAnalyzer {
    public static final String HELP_TEXT = String.join(
        System.getProperty("line.separator"),
        "A program to analyze staff members in the company",
        "Arguments:",
        "  staff <ID> - Show information about a staff member. If no ID is provided, show all staff."
    );

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(StaffAnalyzer.HELP_TEXT);
            return;
        }
        final String command = args[0];
        switch (command) {
            case "staff":
                System.out.println("Staff List:\n");
                break;
            default:
                System.out.printf("Unknown command: %s\nAborting!\n", command);
                return;
        }
    }
}
