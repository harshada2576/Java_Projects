package p3;

public class LabCourse extends Course {
    private double labFee;

    public LabCourse(String courseCode, String courseName, double labFee) {
        super(courseCode, courseName);
        this.labFee = labFee;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Lab Fee: " + labFee);
    }
}
