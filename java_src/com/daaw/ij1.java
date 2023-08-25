package com.daaw;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
/* loaded from: classes.dex */
public class ij1 extends gj1 {
    public WindowInsetsController e;

    public ij1(View view, int i, Window window) {
        super(view, i);
        this.e = window.getInsetsController();
    }

    @Override // com.daaw.gj1
    public void a() {
        this.e.hide(WindowInsets.Type.systemBars());
    }

    @Override // com.daaw.gj1
    public void c() {
    }

    @Override // com.daaw.gj1
    public void d() {
        this.e.show(WindowInsets.Type.systemBars());
    }
}
