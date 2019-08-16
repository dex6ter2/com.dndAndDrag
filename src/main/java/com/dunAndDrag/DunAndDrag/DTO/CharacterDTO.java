package com.dunAndDrag.DunAndDrag.DTO;

import com.dunAndDrag.DunAndDrag.model.Sex;

public class CharacterDTO {
    private String name;
    private Sex sex;
    private float height;
    private float weight;

    public CharacterDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
