package roles;

public class Dev extends BaseRole {

    public Dev(int experience) {
        super(experience);
    }

    @Override
    public String getRoleInfo() {
        return getSeniority() + " Dev";
    }

}
