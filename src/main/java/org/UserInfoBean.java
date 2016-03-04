package org;

/**
 * Created by al on 04.03.2016.
 */
public class UserInfoBean {
    private String userName;
    private Integer age;
    private String hairColor;
    private Integer luckyNumber;
    private String emailAddr;
    private String beanMood = "fine";

    public String getBeanMood() {
        return beanMood;
    }

    public void setBeanMood(String beanMood) {
        this.beanMood = beanMood;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Integer getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(Integer luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }


}
