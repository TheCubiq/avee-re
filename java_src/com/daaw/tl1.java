package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class tl1 extends n51 {
    public final WeakReference<Context> b;

    public tl1(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable a = a(i);
        Context context = this.b.get();
        if (a != null && context != null) {
            g51.h().x(context, i, a);
        }
        return a;
    }
}
