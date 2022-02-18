package com.iisn.withval;

public class ValuePassing {
    private int RegisterNo;
    private String name;

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void printUserData()
    {
        System.out.println("Register Number is "+getRegisterNo()+" Name is "+getName());
    }
}
