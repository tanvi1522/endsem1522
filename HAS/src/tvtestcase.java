import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class tvtestcase {

    Tv tv1;
   @Before
   public void setUp() throws Exception {
           tv1=new Tv(true,102,20);
   }

   @Test
   public void testchennelup () {
           //fail("Not yet implemented");

           tv1.chennelup();
           assertEquals(103,tv1.getchan());
   }

   @Test
   public void testchenneldown() {
           //fail("Not yet implemented");

           tv1.chenneldown();
           assertEquals(101,tv1.getchan());
   }

   

}
