package com.daaw;

import android.graphics.drawable.Drawable;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class tu<T extends Drawable> implements z41<T> {
    public final T a;

    public tu(T t) {
        Objects.requireNonNull(t, "Drawable must not be null!");
        this.a = t;
    }

    @Override // com.daaw.z41
    /* renamed from: b */
    public final T get() {
        return (T) this.a.getConstantState().newDrawable();
    }
}
