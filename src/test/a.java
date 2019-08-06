import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.security.krb5.internal.PAData;
import yinggang.com.service.Impl.PaperServiceImpl;
import yinggang.com.service.PaperService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring/spring-service.xml"})
public class a {



    private PaperServiceImpl paperService;

    @Test
    public void testService(){
        paperService = new PaperServiceImpl();
        if(paperService.getPaperDao() == null)
            System.out.println("null");

    }



}
