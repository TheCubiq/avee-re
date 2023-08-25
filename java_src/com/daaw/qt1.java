package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
/* loaded from: classes.dex */
public class qt1 implements rt1 {

    /* renamed from: a */
    public final ViewOverlay f24315a;

    public qt1(View view) {
        this.f24315a = view.getOverlay();
    }

    @Override // com.daaw.rt1
    /* renamed from: a */
    public void mo10959a(Drawable drawable) {
        this.f24315a.add(drawable);
    }

    @Override // com.daaw.rt1
    /* renamed from: b */
    public void mo10958b(Drawable drawable) {
        this.f24315a.remove(drawable);
    }
}
