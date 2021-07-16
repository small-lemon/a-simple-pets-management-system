package com.hopu.day4.petshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 宠物商店
 */
public class PetShop implements PetManage {

    //宠物的集合
    private ArrayList<Pet> pets = new ArrayList<>();

    @Override
    public void showAllPets() {
        for (Pet pet : pets) {
            pet.play();
        }
    }

    @Override
    public Pet inputPetInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入宠物的名字");
        String name = scanner.next();
        System.out.println("输入宠物的性别");
        String gender = scanner.next();
        System.out.println("输入宠物的类型");
        String type = scanner.next();
        System.out.println("输入宠物的年龄");
        int age = scanner.nextInt();
        System.out.println("输入宠物的价格");
        int price = scanner.nextInt();
        System.out.println("输入宠物的重量");
        int weight = scanner.nextInt();
        return new Pet(name, gender, type, age, price, weight);
    }

    @Override
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    @Override
    public void updatePetByName(String name, Pet pet) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的宠物：");
        String userInput2 = sc.next();

        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getName().equals(userInput2)) {
                pets.set(i,pet);
                System.out.println("修改后的宠物：" + pets.get(i).getName());

            }
        }
    }



    @Override
    public void removePetByName(String name) {
        Scanner ptNm = new Scanner(System.in);  // 创建输入功能
        System.out.println("输入宠物名称来删除：");
        String userInput1 = ptNm.nextLine();  //读取用户输入
        for (int i = 0; i <pets.size() ; i++) {
            if (pets.get(i).getName().equals(userInput1)) {
                System.out.println("已删除宠物:"+pets.get(i).getName());
                pets.remove(i);

        }
    }
 }

    @Override
    public void sortByAge() {
        //使用年龄比较器
//        Collections.sort(pets,new com.hopu.day4.petshop.PetAgeComparator());
        Collections.sort(pets, (o1, o2) -> o1.getAge() - o2.getAge());

    }

    @Override
    public void sortByPrice() {
        Collections.sort(pets, (o1, o2) -> o1.getPrice() - o2.getPrice());

    }

    @Override
    public void findPetByName(String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入宠物的名字：");
        String userInput = input.nextLine();
        System.out.println(userInput);

        for (int i = 0; i < pets.size(); i++) {
            if (pets.get(i).getName().equals(userInput)) {
                System.out.println("名称：" + pets.get(i).getName() + "性别：" + pets.get(i).getGender() + "种类："
                        + pets.get(i).getType() + "年龄：" + pets.get(i).getAge() + "价格：" + pets.get(i).getPrice() +
                        "重量：" + pets.get(i).getWeight());  // 输出动物信息

            }
        }


    }
}
