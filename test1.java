package Triangle1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1{

	@Test
    public void testlsTringle1(){
        Triangle1 t=new Triangle1(0,2,0);
        assertFalse(t.isTriangle1(t));
    } 
	 
	 @Test
    public void testlsTringle2(){
        Triangle1 t=new Triangle1(2,3,5);
        assertFalse(t.isTriangle1(t));
    }
    

    @Test
    public void testlsTringle3(){
        Triangle1 t=new Triangle1(-1,-3,-3);
        assertFalse(t.isTriangle1(t));
    }
   
    @Test
    public void testlsTringle4(){
        Triangle1 t=new Triangle1(7,7,9);
        assertFalse(t.isTriangle1(t));
    }
    @Test
    public void testlsTringle5(){
        Triangle1 t=new Triangle1(3,7,8);
        assertFalse(t.isTriangle1(t));
    }
   @Test
    public void testlsTringle6(){
        Triangle1 t=new Triangle1(3,3,3);
        assertFalse(t.isTriangle1(t));
    }
   
   

     
}