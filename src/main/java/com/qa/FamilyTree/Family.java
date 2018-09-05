package com.qa.FamilyTree;

import com.sun.org.apache.xpath.internal.functions.FuncQname;

import java.util.HashMap;

public class Family {

    private HashMap<String,FamilyMember> family;



    public Family(){

        this.family = new HashMap<String, FamilyMember>();




    }




public boolean add(String name){

        if(!family.containsKey(name)){
            FamilyMember familyMember = new FamilyMember(name);

            family.put(name,familyMember);
            return true;
        }

        return false;


}
    public boolean add(String name, String gender){

if(family.containsKey(name)) {
    if(family.get(name).isGenderSet()==false){


        family.get(name).setGender(gender);
        return true;
    }else{

        return false;
    }

}else if(!family.containsKey(name)){

    FamilyMember familyMember = new FamilyMember(name,gender);

    family.put(name,familyMember);

    return true;
}
       return false;
    }
public boolean isGender(String name,String gender){

        if(family.get(name)!=null){

            if(family.get(name).getGender().equals(gender)){
                return true;
            } else{

                return false;
            }
        } else{

            return false;
        }
}

public boolean male(String name){
        return add(name, "male");


}


public boolean female(String name){
    return add(name, "female");

}

public boolean setParent(String childName, String parentName){


        FamilyMember child = getMember(childName);
    FamilyMember parent = getMember(parentName);
    FamilyMember[] parents = child.getParents();
    if((parent.getGender()=="male") && (parents[0]==null)){



        child.setParent(parent,0);

        if(parents[1]!=null){

            if(parents[1].isGenderSet()==false){

                parents[1].setGender("female");
            }

        }
        return true;
    } else if((parent.getGender()=="female") && (parents[1]==null)){

        child.setParent(parent,1);

        if(parents[0]!=null){

            if(parents[0].isGenderSet()==false){

                parents[0].setGender("male");
            }

        }

        return true;
    }
return false;

}
public String[] getParents(String name){
        FamilyMember f = getMember(name);
        String[] parentNames = new String[2];
        FamilyMember[] parents = f.getParents();



        for(int i=0;i<2;i++){

            parentNames[i] = parents[i].getName();
        }

        return parentNames;
}
public FamilyMember getMember(String name){

        FamilyMember familyMember = null;

        if(family.get(name)!=null){

            familyMember = family.get(name);
            return familyMember;
        }

        return familyMember;
}


}
