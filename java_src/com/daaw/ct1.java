package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
/* loaded from: classes.dex */
public class ct1 implements dt1 {

    /* renamed from: a */
    public final ViewGroupOverlay f6175a;

    public ct1(ViewGroup viewGroup) {
        this.f6175a = viewGroup.getOverlay();
    }

    @Override // com.daaw.rt1
    /* renamed from: a */
    public void mo10959a(Drawable drawable) {
        this.f6175a.add(drawable);
    }

    @Override // com.daaw.rt1
    /* renamed from: b */
    public void mo10958b(Drawable drawable) {
        this.f6175a.remove(drawable);
    }

    @Override // com.daaw.dt1
    /* renamed from: c */
    public void mo23953c(View view) {
        this.f6175a.add(view);
    }

    @Override // com.daaw.dt1
    /* renamed from: d */
    public void mo23952d(View view) {
        this.f6175a.remove(view);
    }
}
