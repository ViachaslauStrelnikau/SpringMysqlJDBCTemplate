import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class App {
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        GoodsDAO goodsDAO = (GoodsDAO) context.getBean("goodsDAO");
        ArrayList<goods> res;
        res=goodsDAO.selectall();
        for (goods g:res ) {
            System.out.println(g.toString());

        }
    }
}
