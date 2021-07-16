package com.hopu.day4.petshop;

/**
 * 宠物
 * 属性：姓名、性别、类型、年龄、价格、重量， 方法：吃、玩
 */
public class Pet {

    private String name;
    private String gender;
    private String type;
    private int age;
    private int price;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Pet(String name, String gender, String type, int age, int price, int weight) {
        this.name = name;
        this.gender = gender;
        this.type = type;
        this.age = age;
        this.price = price;
        this.weight = weight;
    }

    public Pet() {
    }

    public void eat(){
        System.out.printf("宠物%s在吃东西%n",this.name);
    }

    public void play(){
        System.out.printf("宠物%s,性别:%s,类型:%s,年龄:%d,价格:%d,重量:%d斤 在玩%n",
                this.name,this.gender,this.type,this.age,this.price,this.weight);
    }
}
