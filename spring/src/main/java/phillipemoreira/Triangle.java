package phillipemoreira;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.awt.*;
import java.util.List;

public class Triangle implements ApplicationContextAware, BeanNameAware, IShape {

    private ApplicationContext context = null;

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a triangle");
        System.out.println( pointA.getX() + ", " + pointA.getY());
        System.out.println( pointB.getX() + ", " + pointB.getY());
        System.out.println( pointC.getX() + ", " + pointC.getY());
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name is " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}
