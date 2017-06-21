package com.example.android.reportcard;

/**
 * Created by pollyslchan on 21/6/2017.
 */

public class GradeCard {

    private String studentName;
    private char chineseGrade;
    private char englishGrade;
    private char mathGrade;

    public GradeCard(String studentName, char chineseGrade, char englishGrade, char mathGrade) {
        this.studentName = studentName;
        this.chineseGrade = chineseGrade;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getChineseGrade() {
        return chineseGrade;
    }

    public void setChineseGrade(char chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public char getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(char englishGrade) {
        this.englishGrade = englishGrade;
    }

    public char getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(char mathGrade) {
        this.mathGrade = mathGrade;
    }

    @Override
    public String toString() {
        return "Report{" +
                "studentName='" + studentName + '\'' +
                ", chineseGrade=" + chineseGrade +
                ", englishGrade=" + englishGrade +
                ", mathGrade=" + mathGrade +
                '}';
    }
}
