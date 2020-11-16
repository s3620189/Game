package Model.API;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public abstract class Character {

    private String name;//角色名字
    private long HP;//生命上限
    private long MP;//魔法上限
    private long currentHP;//当前生命值
    private long currentMP;//当前魔法值
    private long shield;//护盾
    private long armor;//额外装甲

    //隐藏属性
    private long magicAffinity;//魔法亲和，与施法速度，法术强度相关

    //基础属性
    private long stamina;//体力
    private long agile;//敏捷
    private long strength;//力量
    private long intelligence;//智力

    //二阶属性
    private long defense;//防御
    private long attack;//攻击
    private long ability;//法强
    private long moveSpeed;//移动速度
    private long attackSpeed;//攻击速度
    private long castSpeed;//施法速度

    //其他
    private ArrayList<Knowledge> knowledge;//知识
    private ArrayList<Skill> skills;//技能
    private ArrayList<Role> roles;//职业
    private ArrayList<Title> titles;//称号

    public ArrayList<Knowledge> getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(ArrayList<Knowledge> knowledge) {
        this.knowledge = knowledge;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public ArrayList<Title> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<Title> titles) {
        this.titles = titles;
    }

    public long getShield() {
        return shield;
    }

    public void setShield(long shield) {
        this.shield = shield;
    }

    public long getArmor() {
        return armor;
    }

    public void setArmor(long armor) {
        this.armor = armor;
    }

    public long getMagicAffinity() {
        return magicAffinity;
    }

    public void setMagicAffinity(long magicAffinity) {
        this.magicAffinity = magicAffinity;
    }

    public long getAbility() {
        return ability;
    }

    public void setAbility(long ability) {
        this.ability = ability;
    }

    public long getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(long moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public long getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(long attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public long getCastSpeed() {
        return castSpeed;
    }

    public void setCastSpeed(long castSpeed) {
        this.castSpeed = castSpeed;
    }

    public long getStrength() {
        return strength;
    }

    public void setStrength(long strength) {
        this.strength = strength;
    }

    public long getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(long intelligence) {
        this.intelligence = intelligence;
    }


    public long getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(long currentHP) {
        this.currentHP = currentHP;
    }

    public long getCurrentMP() {
        return currentMP;
    }

    public void setCurrentMP(long currentMP) {
        this.currentMP = currentMP;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAgile() {
        return agile;
    }

    public void setAgile(long agile) {
        this.agile = agile;
    }

    public long getDefense() {
        return defense;
    }

    public void setDefense(long defense) {
        this.defense = defense;
    }

    public long getHP()
    {
        return HP;
    }
    public void setHP(long HP)
    {
        this.HP=HP;
    }
    public long getMP()
    {
        return MP;
    }
    public void setMP(long MP)
    {
        this.MP=MP;
    }
    public long getStamina()
    {
        return stamina;
    }
    public void setStamina(long stamina)
    {
        this.stamina=stamina;
    }
    public long getAttack() {
        return attack;
    }

    public void setAttack(long attack) {
        this.attack = attack;
    }

}
