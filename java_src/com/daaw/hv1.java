package com.daaw;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class hv1 extends ImageButton {

    /* renamed from: p */
    public int f13015p;

    /* renamed from: b */
    public final void m20389b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f13015p = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f13015p;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        m20389b(i, true);
    }
}
