package com.daaw;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class mu extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> b = new mu();
    public final WeakHashMap<Drawable, Integer> a;

    public mu() {
        super(Integer.class, "drawableAlphaCompat");
        this.a = new WeakHashMap<>();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
