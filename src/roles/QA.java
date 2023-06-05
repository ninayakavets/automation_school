package roles;

public class QA extends BaseRole{

    public QA(int experience) {
        super(experience);
    }

    @Override
    public String getRoleInfo() {
        return getSeniority() + " QA";

    }
}
