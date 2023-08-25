package com.google.android.gms.internal.ads;

import com.daaw.x93;
/* loaded from: classes.dex */
public abstract class zzade implements zzbp {
    public final String p;

    public zzade(String str) {
        this.p = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public /* synthetic */ void f(x93 x93Var) {
    }

    public String toString() {
        return this.p;
    }
}
