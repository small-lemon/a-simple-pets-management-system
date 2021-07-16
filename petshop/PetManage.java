package com.hopu.day4.petshop;

/**
 * 宠物管理接口
 */
public interface PetManage {

    /**
     * 显示所有宠物的信息
     */
    void showAllPets();

    /**
     * 按宠物的名字查找宠物
     * @param name
     */
    void findPetByName(String name);

    /**
     * 输入宠物信息
     * @return
     */
    Pet inputPetInfo();

    /**
     * 添加宠物
     * @param pet
     */
    void addPet(Pet pet);

    /**
     * 按名字修改宠物
     * @param name
     * @param pet
     */
    void updatePetByName(String name,Pet pet);

    /**
     * 删除宠物
     * @param name
     */
    void removePetByName(String name);

    /**
     * 按年龄排序
     */
    void sortByAge();

    /**
     * 按价格排序
     */
    void sortByPrice();
}
