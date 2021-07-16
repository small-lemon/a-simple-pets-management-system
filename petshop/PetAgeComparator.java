package com.hopu.day4.petshop;

import java.util.Comparator;

/**
 * 宠物年龄比较器
 */
public class PetAgeComparator implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.getAge() - o2.getAge();
    }
}

