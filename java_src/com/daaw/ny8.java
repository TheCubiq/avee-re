package com.daaw;

import android.util.SparseBooleanArray;
/* loaded from: classes.dex */
public final class ny8 {

    /* renamed from: a */
    public final SparseBooleanArray f20861a = new SparseBooleanArray();

    /* renamed from: b */
    public boolean f20862b;

    /* renamed from: a */
    public final ny8 m14715a(int i) {
        uo4.m7872f(!this.f20862b);
        this.f20861a.append(i, true);
        return this;
    }

    /* renamed from: b */
    public final r32 m14714b() {
        uo4.m7872f(!this.f20862b);
        this.f20862b = true;
        return new r32(this.f20861a, null);
    }
}
