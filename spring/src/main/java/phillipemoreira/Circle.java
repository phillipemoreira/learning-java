package phillipemoreira;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements IShape {

    private Point center;

    public Point getCenter() {
        return center;
    }

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
        System.out.println("The circle center is at " + center.getX() + "," + center.getY());
    }
}
