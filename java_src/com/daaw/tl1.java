package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class tl1 extends n51 {

    /* renamed from: b */
    public final WeakReference<Context> f27845b;

    public tl1(Context context, Resources resources) {
        super(resources);
        this.f27845b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable m15521a = m15521a(i);
        Context context = this.f27845b.get();
        if (m15521a != null && context != null) {
            g51.m21936h().m21920x(context, i, m15521a);
        }
        return m15521a;
    }
}
