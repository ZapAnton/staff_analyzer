import java.util.ArrayList;


class StaffStorage {
    private ArrayList<StaffMember> staffMembers;

    public StaffStorage() {
        this.staffMembers = new ArrayList<StaffMember>();
        staffMembers.add(new StaffMember("Test 1"));
        staffMembers.add(new StaffMember("Test 2"));
        staffMembers.add(new StaffMember("Test 3"));
        staffMembers.add(new StaffMember("Test 4"));
    }

    public ArrayList<StaffMember> getStaffList() {
        return this.staffMembers;
    }
}
