package com.daaw;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* renamed from: com.daaw.v */
/* loaded from: classes.dex */
public final class C3273v extends ClickableSpan {

    /* renamed from: p */
    public final int f29701p;

    /* renamed from: q */
    public final C3654y f29702q;

    /* renamed from: r */
    public final int f29703r;

    public C3273v(int i, C3654y c3654y, int i2) {
        this.f29701p = i;
        this.f29702q = c3654y;
        this.f29703r = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f29701p);
        this.f29702q.m4347R(this.f29703r, bundle);
    }
}
