public class StaffMember {
    private static int nextID = 1;

    private final int id;
    private final String name;

    public StaffMember(String name) {
        this.id = generateNextID();
        this.name = name;
    }

    private static int generateNextID() {
        final int generatedID = StaffMember.nextID;
        StaffMember.nextID += 1;
        return generatedID;
    }

    public int getID() {
        return this.id;
    }

    @Override
    public String toString() {
        final String staffMemberString = String.format(
            "%d) %s",
            this.id,
            this.name
        );
        return staffMemberString;
    }
}
