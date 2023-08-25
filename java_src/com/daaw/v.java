package com.daaw;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class v extends ClickableSpan {
    public final int p;
    public final y q;
    public final int r;

    public v(int i, y yVar, int i2) {
        this.p = i;
        this.q = yVar;
        this.r = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.p);
        this.q.R(this.r, bundle);
    }
}
