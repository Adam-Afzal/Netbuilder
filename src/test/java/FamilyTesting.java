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




        assertEquals(true,f.add("John"));
        assertEquals(false,f.add("John"));
        assertEquals(true,f.add("John"));


    }
}
