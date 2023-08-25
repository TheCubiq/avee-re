package com.daaw;

import android.graphics.drawable.Drawable;
import java.util.Objects;
/* renamed from: com.daaw.tu */
/* loaded from: classes.dex */
public abstract class AbstractC3117tu<T extends Drawable> implements z41<T> {

    /* renamed from: a */
    public final T f28066a;

    public AbstractC3117tu(T t) {
        Objects.requireNonNull(t, "Drawable must not be null!");
        this.f28066a = t;
    }

    @Override // com.daaw.z41
    /* renamed from: b */
    public final T get() {
        return (T) this.f28066a.getConstantState().newDrawable();
    }
}
