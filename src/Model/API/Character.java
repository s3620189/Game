package Model.API;

import java.util.ArrayList;
import java.util.Map;

public class Character {
//    //普通属性
//    private long HP;//生命上限
//    private long MP;//魔法上限
//    private long currentHP;//当前生命值
//    private long currentMP;//当前魔法值
//    private long shield;//护盾
//    private long armor;//额外装甲
//
//    //隐藏属性
//    private long magicAffinity;//魔法亲和，与施法速度，法术强度相关
//
//    //基础属性
//    private long stamina;//体力
//    private long agile;//敏捷
//    private long strength;//力量
//    private long intelligence;//智力
//
//    //二阶属性
//    private long defense;//防御
//    private long attack;//攻击
//    private long ability;//法强
//    private long moveSpeed;//移动速度
//    private long attackSpeed;//攻击速度
//    private long castSpeed;//施法速度



    private String name;//角色名字
    private int level;
    private long exp;
    //普通属性
    private Map<String,Long> level_1_attributes;
    private Map<String,Long> original_level_1_attributes;
    //隐藏属性
    private Map<String,Long> level_2_attributes;
    private Map<String,Long> original_level_2_attributes;
    //基础属性
    private Map<String,Long> level_3_attributes;
    private Map<String,Long> original_level_3_attributes;
    //高阶属性
    private Map<String,Long> level_4_attributes;
    private Map<String,Long> original_level_4_attributes;

    //其他

    private ArrayList<Knowledge> knowledge;//知识
    private ArrayList<Skill> skills;//技能
    private ArrayList<Role> roles;//职业
    private ArrayList<Title> titles;//称号

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    public Map<String, Long> getLevel_1_attributes() {
        return level_1_attributes;
    }

    public void setLevel_1_attributes(Map<String, Long> level_1_attributes) {
        this.level_1_attributes = level_1_attributes;
    }

    public Map<String, Long> getOriginal_level_1_attributes() {
        return original_level_1_attributes;
    }

    public void setOriginal_level_1_attributes(Map<String, Long> original_level_1_attributes) {
        this.original_level_1_attributes = original_level_1_attributes;
    }

    public Map<String, Long> getLevel_2_attributes() {
        return level_2_attributes;
    }

    public void setLevel_2_attributes(Map<String, Long> level_2_attributes) {
        this.level_2_attributes = level_2_attributes;
    }

    public Map<String, Long> getOriginal_level_2_attributes() {
        return original_level_2_attributes;
    }

    public void setOriginal_level_2_attributes(Map<String, Long> original_level_2_attributes) {
        this.original_level_2_attributes = original_level_2_attributes;
    }

    public Map<String, Long> getLevel_3_attributes() {
        return level_3_attributes;
    }

    public void setLevel_3_attributes(Map<String, Long> level_3_attributes) {
        this.level_3_attributes = level_3_attributes;
    }

    public Map<String, Long> getOriginal_level_3_attributes() {
        return original_level_3_attributes;
    }

    public void setOriginal_level_3_attributes(Map<String, Long> original_level_3_attributes) {
        this.original_level_3_attributes = original_level_3_attributes;
    }

    public Map<String, Long> getLevel_4_attributes() {
        return level_4_attributes;
    }

    public void setLevel_4_attributes(Map<String, Long> level_4_attributes) {
        this.level_4_attributes = level_4_attributes;
    }

    public Map<String, Long> getOriginal_level_4_attributes() {
        return original_level_4_attributes;
    }

    public void setOriginal_level_4_attributes(Map<String, Long> original_level_4_attributes) {
        this.original_level_4_attributes = original_level_4_attributes;
    }


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
