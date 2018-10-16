import javon.Instructor;
import org.junit.Assert;

public class Teacher extends {
//    public void setnametest() {
//
////    given
//        javon.Instructor.Person javon = new javon.Instructor.Person("Zack", "Brown", "Darius", 2, "pants");
//        javon.setName("destiny");
//
//       String expected
//
//
//        //when
//        String actual = person.getName();
//
//        //Then
//        Assert.assertEquals(expected, actual);
//    }

    @org.junit.Test
    public void setname(){
        Instructor.Person person = new Instructor.Person(" derrick","Robinson","wade",4,"coat");

        String  expected = " derrick";

        person.setLastname("Robinson");

        String actual = person.getName();

        Assert.assertEquals(expected,actual);




    }
    public void setmiddlename() {
        Instructor.Person person = new Instructor.Person(" derrick", "Robinson", "wade", 4, "coat");

        String expected = " wade";

        person.setLastname("Robinson");

        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }
