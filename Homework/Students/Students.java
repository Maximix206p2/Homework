package Students;

import org.w3c.dom.ls.LSOutput;

public class Students {
    private long id;
    private String fstName, sndName, trdName;
    private String date;
    private String address;
    private String telNumber;
    private String faculty;
    private int course, group;

    public Students(int id, String fstName, String sndName, String trdName, String date, String address, String telNumber, String faculty, int course, int group) {
        this.id = id;
        this.fstName = fstName;
        this.sndName = sndName;
        this.trdName = trdName;
        this.date = date;
        this.address = address;
        this.telNumber = telNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFstName() {
        return fstName;
    }

    public void setFstName(String fstName) {
        this.fstName = fstName;
    }

    public String getSndName() {
        return sndName;
    }

    public void setSndName(String sndName) {
        this.sndName = sndName;
    }

    public String getTrdName() {
        return trdName;
    }

    public void setTrdName(String trdName) {
        this.trdName = trdName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String toString() {
        return "Student: " + id + ". " + fstName + " " + trdName + " " + sndName + "\nDate: " + date + "\nAddress: " + address +
                "\nTelephone number: " + telNumber + "\nFaculty: " + faculty + "\nCourse: " + course + "\nGroup: " + group;
    }
}