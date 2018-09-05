package com.qa.FamilyTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FamilyMember {

    private String name;
    private String gender;
    private FamilyMember[] parents;
    private ArrayList<FamilyMember> children;
    private boolean genderSet;


    public FamilyMember(String name){
        this.parents = new FamilyMember[2];
        this.name = name;
        this.children = new ArrayList<FamilyMember>();
        this.genderSet = false;



    }
    public FamilyMember(String name, String gender ){
        this.parents = new FamilyMember[2];
this.name = name;
this.gender = gender;
        this.children = new ArrayList<FamilyMember>();
        this.genderSet = true;

    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        this.genderSet = true;
    }

    public void setChildren(FamilyMember child) {
        this.children.add(child);
    }

    public ArrayList<FamilyMember> getChildren(){

        return this.children;
    }


    public void setParent(FamilyMember parent, int position){

        this.parents[position] = parent;


        }

        public FamilyMember[] getParents(){

        return this.parents;
        }

    public String getName() {
        return name;
    }

    public boolean isGenderSet() {
        return genderSet;
    }


}

