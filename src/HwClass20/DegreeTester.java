package HwClass20;

public class DegreeTester {
    public static void main(String[] args) {
        Degree degree=new Degree();
        degree.getPrerequisite();

        Bachelors bachelor=new Bachelors();
        bachelor.getPrerequisite();

        Masters master=new Masters();
        master.getPrerequisite();
    }
}
