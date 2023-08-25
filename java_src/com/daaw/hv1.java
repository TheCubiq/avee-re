package com.daaw;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class hv1 extends ImageButton {
    public int p;

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.p = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.p;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        b(i, true);
    }
}
