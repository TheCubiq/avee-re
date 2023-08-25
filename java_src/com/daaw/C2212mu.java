package com.daaw;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;
/* renamed from: com.daaw.mu */
/* loaded from: classes2.dex */
public class C2212mu extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f19151b = new C2212mu();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f19152a;

    public C2212mu() {
        super(Integer.class, "drawableAlphaCompat");
        this.f19152a = new WeakHashMap<>();
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
