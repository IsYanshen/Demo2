package com.pojo;


public class Student {

  private long stuId;
  private String stuName;


  public long getStuId() {
    return stuId;
  }

  public void setStuId(long stuId) {
    this.stuId = stuId;
  }


  public String getStuName() {
    return stuName;
  }

  public void setStuName(String stuName) {
    this.stuName = stuName;
  }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                '}';
    }
}
