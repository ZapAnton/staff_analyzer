public class StaffAnalyzer {
    public static final String HELP_TEXT = String.join(
        System.getProperty("line.separator"),
        "A program to analyze staff members in the company",
        "Arguments:",
        "  staff <ID> - Show information about a staff member. If no ID is provided, show all staff."
    );

    static StaffStorage staffStorage = new StaffStorage();

    static void showStaff() {
        staffStorage
            .getStaffList()
            .stream()
            .forEach(System.out::println);
    }

    static void parseArguments(String[] args) {
        final String command = args[0];
        switch (command) {
            case "staff":
                StaffAnalyzer.showStaff();
                break;
            default:
                System.out.printf("Unknown command: %s\nAborting!\n", command);
                return;
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(StaffAnalyzer.HELP_TEXT);
            return;
        }
        StaffAnalyzer.parseArguments(args);
    }
}
