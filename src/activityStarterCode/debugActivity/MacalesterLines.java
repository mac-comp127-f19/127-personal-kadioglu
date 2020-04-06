package activityStarterCode.debugActivity;

import comp127graphics.*;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkluver on 2017-11-17. Updated by pcantrell 2019-11-5.
 */
public class MacalesterLines extends GraphicsGroup {
    public void draw() {
        List<Line> lines = new ArrayList<>();
        Line line = new Line(0, 0, 0, 0);

        line.setStartPosition(-40, 0);
        line.setEndPosition(360, 400);
        line.setStrokeColor(new Color(0xA571C5E8, true));
        line.setStrokeWidth(60);
        lines.add(line);

        Line line2 = new Line(0, 0, 0, 0);
        line2.setStartPosition(100, 40);
        line2.setEndPosition(460, 400);
        line2.setStrokeColor(new Color(0xA5002033, true));
        line2.setStrokeWidth(30);
        lines.add(line2);

        Line line3 = new Line(0, 0, 0, 0);
        line3.setStartPosition(100, 430);
        line3.setEndPosition(460, 70);
        line3.setStrokeColor(new Color(0xA5002033, true));
        line3.setStrokeWidth(30);
        lines.add(line3);

        Line line4 = new Line(0, 0, 0, 0);
        line4.setStartPosition(110, 369);
        line4.setEndPosition(470, 9);
        line4.setStrokeColor(new Color(0xA55B6770, true));
        line4.setStrokeWidth(10);
        lines.add(line4);

        Line line5 = new Line(0, 0, 0, 0);
        line5.setStartPosition(0, 430);
        line5.setEndPosition(360, 70);
        line5.setStrokeColor(new Color(0xA5EF4F26, true));
        line5.setStrokeWidth(30);
        lines.add(line5);

        lines.forEach(this::add);
    }

    public static void main(String[] args) {
        CanvasWindow window = new CanvasWindow("Macalester lines", 400, 400);
        MacalesterLines fl = new MacalesterLines();
        fl.draw();
        window.add(fl);
    }
}
