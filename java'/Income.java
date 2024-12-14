package com.example.gozyaan;

public class Income {
    public String month, income ;

    public Income(String month, String income) {
        this.month = month;
        this.income = income;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }
}
