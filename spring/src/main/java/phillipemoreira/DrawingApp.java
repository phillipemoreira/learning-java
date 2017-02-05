package phillipemoreira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class DrawingApp {

    /**
     *
     * @param args arguments
     */
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/spring.xml");

        List<String> shapes = new ArrayList<>();
        shapes.add("triangle");
        shapes.add("circle");

        for (String s: shapes) {
            IShape shape = (IShape) context.getBean(s);
            shape.draw();
        }
    }
}