package com.daaw;

import android.view.View;
import android.view.WindowId;
/* loaded from: classes.dex */
public class nx1 implements ox1 {

    /* renamed from: a */
    public final WindowId f20817a;

    public nx1(View view) {
        this.f20817a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof nx1) && ((nx1) obj).f20817a.equals(this.f20817a);
    }

    public int hashCode() {
        return this.f20817a.hashCode();
    }
}
