package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.g93;
import com.daaw.jk6;
import com.daaw.kk6;
import com.daaw.lk6;
import com.daaw.pk6;
import com.daaw.z71;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzfkz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfkz> CREATOR = new pk6();
    public final int[] A;
    public final int B;
    public final jk6[] p;
    @Nullable
    public final Context q;
    public final int r;
    public final jk6 s;
    public final int t;
    public final int u;
    public final int v;
    public final String w;
    public final int x;
    public final int y;
    public final int[] z;

    public zzfkz(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        jk6[] values = jk6.values();
        this.p = values;
        int[] a = kk6.a();
        this.z = a;
        int[] a2 = lk6.a();
        this.A = a2;
        this.q = null;
        this.r = i;
        this.s = values[i];
        this.t = i2;
        this.u = i3;
        this.v = i4;
        this.w = str;
        this.x = i5;
        this.B = a[i5];
        this.y = i6;
        int i7 = a2[i6];
    }

    public zzfkz(@Nullable Context context, jk6 jk6Var, int i, int i2, int i3, String str, String str2, String str3) {
        this.p = jk6.values();
        this.z = kk6.a();
        this.A = lk6.a();
        this.q = context;
        this.r = jk6Var.ordinal();
        this.s = jk6Var;
        this.t = i;
        this.u = i2;
        this.v = i3;
        this.w = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.B = i4;
        this.x = i4 - 1;
        "onAdClosed".equals(str3);
        this.y = 0;
    }

    @Nullable
    public static zzfkz h(jk6 jk6Var, Context context) {
        if (jk6Var == jk6.Rewarded) {
            return new zzfkz(context, jk6Var, ((Integer) zzba.zzc().b(g93.O5)).intValue(), ((Integer) zzba.zzc().b(g93.U5)).intValue(), ((Integer) zzba.zzc().b(g93.W5)).intValue(), (String) zzba.zzc().b(g93.Y5), (String) zzba.zzc().b(g93.Q5), (String) zzba.zzc().b(g93.S5));
        } else if (jk6Var == jk6.Interstitial) {
            return new zzfkz(context, jk6Var, ((Integer) zzba.zzc().b(g93.P5)).intValue(), ((Integer) zzba.zzc().b(g93.V5)).intValue(), ((Integer) zzba.zzc().b(g93.X5)).intValue(), (String) zzba.zzc().b(g93.Z5), (String) zzba.zzc().b(g93.R5), (String) zzba.zzc().b(g93.T5));
        } else if (jk6Var == jk6.AppOpen) {
            return new zzfkz(context, jk6Var, ((Integer) zzba.zzc().b(g93.c6)).intValue(), ((Integer) zzba.zzc().b(g93.e6)).intValue(), ((Integer) zzba.zzc().b(g93.f6)).intValue(), (String) zzba.zzc().b(g93.a6), (String) zzba.zzc().b(g93.b6), (String) zzba.zzc().b(g93.d6));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.k(parcel, 1, this.r);
        z71.k(parcel, 2, this.t);
        z71.k(parcel, 3, this.u);
        z71.k(parcel, 4, this.v);
        z71.q(parcel, 5, this.w, false);
        z71.k(parcel, 6, this.x);
        z71.k(parcel, 7, this.y);
        z71.b(parcel, a);
    }
}
