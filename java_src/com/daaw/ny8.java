package com.daaw;

import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class ny8 {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final ny8 a(int i) {
        uo4.f(!this.b);
        this.a.append(i, true);
        return this;
    }

    public final r32 b() {
        uo4.f(!this.b);
        this.b = true;
        return new r32(this.a, null);
    }
}
