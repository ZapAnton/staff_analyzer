import java.util.ArrayList;
import java.util.Optional;


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

    public Optional<StaffMember> getMemberById(Integer memberID) {
        final Optional<StaffMember> staffMember = this.staffMembers
            .stream()
            .filter(member -> member.getID() == memberID)
            .findFirst();
        return staffMember;
    }
}
