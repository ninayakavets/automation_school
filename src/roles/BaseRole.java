package roles;

abstract public class BaseRole implements Role {

    private final int experience;

    public BaseRole(int experience) {
        this.experience = experience;
    }

    public String getSeniority() {
        if (experience < 2) {
            return "Junior";
        } else if ((experience >= 2) && (experience < 4)) {
            return "Middle";
        } else
            return "Senior";
    }
}
