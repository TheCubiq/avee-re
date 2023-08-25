package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* loaded from: classes.dex */
public class qt1 implements rt1 {
    public final ViewOverlay a;

    public qt1(View view) {
        this.a = view.getOverlay();
    }

    @Override // com.daaw.rt1
    public void a(Drawable drawable) {
        this.a.add(drawable);
    }

    @Override // com.daaw.rt1
    public void b(Drawable drawable) {
        this.a.remove(drawable);
    }
}
