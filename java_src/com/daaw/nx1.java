package com.daaw;

import android.view.View;
import android.view.WindowId;
/* loaded from: classes.dex */
public class nx1 implements ox1 {
    public final WindowId a;

    public nx1(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof nx1) && ((nx1) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
