package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* loaded from: classes.dex */
public class ct1 implements dt1 {
    public final ViewGroupOverlay a;

    public ct1(ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    @Override // com.daaw.rt1
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.daaw.rt1
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }

    @Override // com.daaw.dt1
    public void c(View view) {
        this.a.add(view);
    }

    @Override // com.daaw.dt1
    public void d(View view) {
        this.a.remove(view);
    }
}
