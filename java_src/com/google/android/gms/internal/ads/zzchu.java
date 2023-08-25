package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.c80;
import com.daaw.q04;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzchu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzchu> CREATOR = new q04();

    /* renamed from: p */
    public String f36993p;

    /* renamed from: q */
    public int f36994q;

    /* renamed from: r */
    public int f36995r;

    /* renamed from: s */
    public boolean f36996s;

    /* renamed from: t */
    public boolean f36997t;

    public zzchu(int i, int i2, boolean z, boolean z2) {
        this(224400000, i2, true, false, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzchu(int i, int i2, boolean z, boolean z2, boolean z3) {
        this("afma-sdk-a-v" + i + "." + i2 + "." + r12, i, i2, z, z3);
        String str = z ? "0" : "1";
    }

    public zzchu(String str, int i, int i2, boolean z, boolean z2) {
        this.f36993p = str;
        this.f36994q = i;
        this.f36995r = i2;
        this.f36996s = z;
        this.f36997t = z2;
    }

    /* renamed from: h */
    public static zzchu m1093h() {
        return new zzchu((int) c80.f5613a, (int) c80.f5613a, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 2, this.f36993p, false);
        z71.m2723k(parcel, 3, this.f36994q);
        z71.m2723k(parcel, 4, this.f36995r);
        z71.m2731c(parcel, 5, this.f36996s);
        z71.m2731c(parcel, 6, this.f36997t);
        z71.m2732b(parcel, m2733a);
    }
}
