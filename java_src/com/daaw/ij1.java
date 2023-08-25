package com.daaw;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public class ij1 extends gj1 {

    /* renamed from: e */
    public WindowInsetsController f13682e;

    public ij1(View view, int i, Window window) {
        super(view, i);
        this.f13682e = window.getInsetsController();
    }

    @Override // com.daaw.gj1
    /* renamed from: a */
    public void mo19755a() {
        this.f13682e.hide(WindowInsets.Type.systemBars());
    }

    @Override // com.daaw.gj1
    /* renamed from: c */
    public void mo19754c() {
    }

    @Override // com.daaw.gj1
    /* renamed from: d */
    public void mo19753d() {
        this.f13682e.show(WindowInsets.Type.systemBars());
    }
}
