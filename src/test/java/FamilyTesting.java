import com.qa.FamilyTree.Family;
import com.qa.FamilyTree.FamilyMember;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class FamilyTesting {

    Family f;

    @Before
    public void setup(){


         f=  new Family();
    }


    @Test
    public void addNoGender(){




        assertEquals(true,f.add("John",""));
        assertEquals(false,f.add("John",""));



    }

    @Test
    public void addMale(){

        assertEquals(true,f.male("John"));
        assertEquals(false,f.male("John"));
        assertEquals(false,f.female("John"));
        assertEquals(true,f.isGender("John","male"));

    }

    @Test
    public void addFemale(){

        assertEquals(true,f.female("John"));
        assertEquals(false,f.male("John"));
        assertEquals(false,f.female("John"));
        assertEquals(false,f.isGender("John","male"));

    }

    @Test
    public void setGender(){


        assertEquals(true,f.add("John"));
        assertEquals(true,f.male("John"));



    }

    @Test
    public void setParent(){

        assertEquals(true,f.male("John"));
        assertEquals(true,f.female("Sally"));

        assertEquals(true,f.male("Bob"));


assertEquals(true,f.setParent("Bob","John"));
assertEquals(true,f.setParent("Bob","Sally"));

String[] test = {"John","Sally"};
assertEquals(test,f.getParents("Bob"));


    }
}
