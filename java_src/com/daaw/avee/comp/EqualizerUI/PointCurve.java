package com.daaw.avee.comp.EqualizerUI;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class PointCurve {
    private List<Point> points = new ArrayList();

    /* loaded from: classes.dex */
    public class Point {
        public float x;
        public float y;

        public Point(float f, float f2) {
            this.x = f;
            this.y = f2;
        }
    }

    public void clear() {
        this.points.clear();
    }

    public void insert(float f, float f2) {
        for (int i = 0; i < this.points.size(); i++) {
            if (this.points.get(i).x == f) {
                return;
            }
            if (this.points.get(i).x > f) {
                this.points.add(i, new Point(f, f2));
                return;
            }
        }
        List<Point> list = this.points;
        list.add(list.size(), new Point(f, f2));
    }

    public float getValue(float f) {
        int i = -1;
        for (int i2 = 0; i2 < this.points.size(); i2++) {
            if (this.points.get(i2).x == f) {
                return this.points.get(i2).y;
            }
            if (this.points.get(i2).x > f) {
                return getValue(i, i2, f);
            }
            i = i2;
        }
        return getValue(i, this.points.size(), f);
    }

    public float getValue(int i, int i2, float f) {
        if (this.points.size() == 0) {
            return 0.0f;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= this.points.size()) {
            i2 = this.points.size() - 1;
        }
        if (i == i2) {
            return this.points.get(i2).y;
        }
        float f2 = (f - this.points.get(i).x) / (this.points.get(i2).x - this.points.get(i).x);
        return (this.points.get(i).y * (1.0f - f2)) + (this.points.get(i2).y * f2);
    }
}
