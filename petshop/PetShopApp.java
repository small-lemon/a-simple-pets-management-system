package com.hopu.day4.petshop;

import javafx.animation.ScaleTransition;

import java.util.Scanner;

public class PetShopApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //创建宠物商店
        com.hopu.day4.petshop.PetShop petShop = new PetShop();
        for(;;){
            System.out.println("--------------------欢迎使用宠物管理系统--------------------");
            System.out.println("请选择执行的操作： 1.查看所有宠物 2.添加宠物 3.修改宠物 4.查找宠物 " +
                    "5.删除宠物 6.按年龄排序 7.按价格排序 其他：退出");
            int op = scanner.nextInt();
            switch(op){
                case 1:
                    petShop.showAllPets();
                    break;
                case 2:
                    Pet pet = petShop.inputPetInfo();
                    petShop.addPet(pet);
                    break;
                case 3:
                    Pet pet1 = petShop.inputPetInfo();
                    petShop.updatePetByName("",pet1);
                    break;
                case 4:
                    petShop.findPetByName("");
                    break;
                case 5:
                    petShop.removePetByName("");

                    break;
                case 6:
                    petShop.sortByAge();
                    break;
                case 7:
                    petShop.sortByPrice();
                    break;
                default: return;
            }
        }
    }
}
