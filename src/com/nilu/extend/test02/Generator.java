package com.nilu.extend.test02;

public class Generator extends Emp{
    private String bumen;
    private double money;

    public Generator(String name, int age, char sex, String bumen, double money) {
        super(name, age, sex);
        this.bumen = bumen;
        this.money = money;
    }

    public Generator(String bumen, double money) {
        this.bumen = bumen;
        this.money = money;
    }

    public Generator() {
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Generator{" +
                "bumen='" + bumen + '\'' +
                ", money=" + money +
                '}'+super.toString();
    }
}
