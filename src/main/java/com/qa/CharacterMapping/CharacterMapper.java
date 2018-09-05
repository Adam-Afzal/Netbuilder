package com.qa.CharacterMapping;

import java.util.HashMap;

public class CharacterMapper {

    private HashMap<String,String> alphabetMap = new HashMap<String, String>();


    public CharacterMapper(){

        this.alphabetMap.put("A","1");
        this.alphabetMap.put("B","2");
        this.alphabetMap.put("C","3");
        this.alphabetMap.put("D","4");
        this.alphabetMap.put("E","5");
       this. alphabetMap.put("F","6");
       this. alphabetMap.put("G","7");
        this.alphabetMap.put("H","8");
        this.alphabetMap.put("I","9");
       this. alphabetMap.put("J","10");
        this.alphabetMap.put("K","11");
        this.alphabetMap.put("L","12");
        this.alphabetMap.put("M","13");
        this.alphabetMap.put("N","14");
        this.alphabetMap.put("O","15");
        this.alphabetMap.put("P","16");
        this.alphabetMap.put("Q","17");
        this.alphabetMap.put("R","18");
        this.alphabetMap.put("S","19");
        this.alphabetMap.put("T","20");
        this.alphabetMap.put("U","21");
        this.alphabetMap.put("V","22");
        this.alphabetMap.put("W","23");
        this.alphabetMap.put("X","24");
        this.alphabetMap.put("Y","25");
        this.alphabetMap.put("Z","26");



    }



    public String mapChars(String sentence){



String newString = "";


for(int i = 0;i<sentence.length();i++){


    if(this.alphabetMap.containsKey(Character.toString(sentence.toUpperCase().charAt(i)))){

        newString+=this.alphabetMap.get(Character.toString(sentence.toUpperCase().charAt(i)));
        newString+=" ";
    }else{
      //  newString+=sentence.charAt(i);
    }
}



        return newString;
    }

}
