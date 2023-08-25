package com.daaw;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;
/* loaded from: classes.dex */
public class cw0<T> extends Property<T, Float> {

    /* renamed from: a */
    public final Property<T, PointF> f6212a;

    /* renamed from: b */
    public final PathMeasure f6213b;

    /* renamed from: c */
    public final float f6214c;

    /* renamed from: d */
    public final float[] f6215d;

    /* renamed from: e */
    public final PointF f6216e;

    /* renamed from: f */
    public float f6217f;

    public cw0(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f6215d = new float[2];
        this.f6216e = new PointF();
        this.f6212a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f6213b = pathMeasure;
        this.f6214c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f6217f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(T t, Float f) {
        this.f6217f = f.floatValue();
        this.f6213b.getPosTan(this.f6214c * f.floatValue(), this.f6215d, null);
        PointF pointF = this.f6216e;
        float[] fArr = this.f6215d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f6212a.set(t, pointF);
    }
}
