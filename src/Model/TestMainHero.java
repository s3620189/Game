package Model;

import Model.API.*;
import Model.API.Character;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestMainHero {



    //普通属性
    private long evolutionLevel;//生命的进化等级
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

    //普通属性
    private long originalEvolutionLevel;//生命的进化等级
    private long originalHP;//生命上限
    private long originalMP;//魔法上限

    //隐藏属性
    private long originalMagicAffinity;//魔法亲和，与施法速度，法术强度相关

    //基础属性
    private long originalStamina;//体力
    private long originalAgile;//敏捷
    private long originalStrength;//力量
    private long originalIntelligence;//智力

    //二阶属性
    private long originalDefense;//防御
    private long originalAttack;//攻击
    private long originalAbility;//法强
    private long originalMoveSpeed;//移动速度
    private long originalAttackSpeed;//攻击速度
    private long originalCastSpeed;//施法速度


    //其他
    private ArrayList<Knowledge> knowledge;//知识
    private ArrayList<Skill> skills;//技能
    private ArrayList<Role> roles;//职业
    private ArrayList<Title> titles;//称号
    String[] names1={"evolutionLevel","HP","MP","currentHP","currentMP","shield","armor"};
    String[] names2={"magicAffinity"};

    String[] names3={"stamina","agile","strength","intelligence"};
    String[] names4={"defense","attack","ability","moveSpeed","attackSpeed","castSpeed"};
    String[] originalNames1={"originalEvolutionLevel","originalHP","originalMP"};
    String[] originalNames2={"originalMagicAffinity"};

    String[] originalNames3={"originalStamina","originalAgile","originalStrength","originalIntelligence"};

    String[] originalNames4={"originalDefense","originalAttack","originalAbility","originalMoveSpeed","originalAttackSpeed","originalCastSpeed"};
    Character c=new Character();

    public Character getC() {
        return c;
    }

    public void setC(Character c) {
        this.c = c;
    }

    public TestMainHero()
{
    long[] values1=new long[names1.length];
    long[] values2=new long[names2.length];
    long[] values3=new long[names3.length];
    long[] values4=new long[names4.length];
    long[] originalValues1=new long[originalNames1.length];
    long[] originalValues2=new long[originalNames2.length];
    long[] originalValues3=new long[originalNames3.length];
    long[] originalValues4=new long[originalNames4.length];

    this.c.setLevel_1_attributes(setAttributes(names1,values1));
    this.c.setLevel_2_attributes(setAttributes(names2,values2));
    this.c.setLevel_3_attributes(setAttributes(names3,values3));
    this.c.setLevel_4_attributes(setAttributes(names4,values4));
    this.c.setOriginal_level_1_attributes(setAttributes(originalNames1,originalValues1));
    this.c.setOriginal_level_2_attributes(setAttributes(originalNames2,originalValues2));
    this.c.setOriginal_level_3_attributes(setAttributes(originalNames3,originalValues3));
    this.c.setOriginal_level_4_attributes(setAttributes(originalNames4,originalValues4));
}
public Map<String,Long> setAttributes( String[] names, long[] values)
{
    Map<String,Long> temp=new HashMap<String,Long>();
    for(int i=0;i<names.length;i++)
    {
        temp.put(names[i],values[i]);
    }
    return temp;
}

}
