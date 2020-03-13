package com.example.poao;

public class Boss extends npc{

    private String[] Skills;

    public Boss(String name, int health, int attack, int defense, String[] sklls) {
        super(name, health, attack, defense);
        this.Skills = sklls;
    }

    public String[] getSkills() {
        return Skills;
    }

    public void setSkills(String[] skills) {
        Skills = skills;
    }
}
