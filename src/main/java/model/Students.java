package model;

public class Students implements Comparable<Students> {
    private String id;
    private String full_name;
    private int gender;
    private String ngay_sinh;
    private String dia_chi;
    private int phone_number;
    private String email;
    private float gpa;
    public Students(){

    }

    public Students(String id, String full_name, int gender, String ngay_sinh, String dia_chi, int phone_number, String email, float gpa) {
        this.id = id;
        this.full_name = full_name;
        this.gender = gender;
        this.ngay_sinh = ngay_sinh;
        this.dia_chi = dia_chi;
        this.phone_number = phone_number;
        this.email = email;
        this.gpa = gpa;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getGender() {
        return gender;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id='" + id + '\'' +
                ", full_name='" + full_name + '\'' +
                ", gender='" + gender + '\'' +
                ", ngay_sinh='" + ngay_sinh + '\'' +
                ", dia_chi='" + dia_chi + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Students o) {
       if(this.gpa > o.getGpa()){
           return 1;
       } else if (this.gpa < o.getGpa()) {
           return -1;
       }else {
           return  0;
       }
    }
}
