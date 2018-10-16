import org.junit.Test;

public class TestInstructor implements Test{
    @Test
    public void instructorinstanceofteachertest{
        TestInstructor Swag= new TestInstructor();
        System.out.println(Swag instanceof Test);
    }

}
