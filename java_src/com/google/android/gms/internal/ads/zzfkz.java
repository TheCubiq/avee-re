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

    /* renamed from: A */
    public final int[] f36998A;

    /* renamed from: B */
    public final int f36999B;

    /* renamed from: p */
    public final jk6[] f37000p;
    @Nullable

    /* renamed from: q */
    public final Context f37001q;

    /* renamed from: r */
    public final int f37002r;

    /* renamed from: s */
    public final jk6 f37003s;

    /* renamed from: t */
    public final int f37004t;

    /* renamed from: u */
    public final int f37005u;

    /* renamed from: v */
    public final int f37006v;

    /* renamed from: w */
    public final String f37007w;

    /* renamed from: x */
    public final int f37008x;

    /* renamed from: y */
    public final int f37009y;

    /* renamed from: z */
    public final int[] f37010z;

    public zzfkz(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        jk6[] values = jk6.values();
        this.f37000p = values;
        int[] m17681a = kk6.m17681a();
        this.f37010z = m17681a;
        int[] m16892a = lk6.m16892a();
        this.f36998A = m16892a;
        this.f37001q = null;
        this.f37002r = i;
        this.f37003s = values[i];
        this.f37004t = i2;
        this.f37005u = i3;
        this.f37006v = i4;
        this.f37007w = str;
        this.f37008x = i5;
        this.f36999B = m17681a[i5];
        this.f37009y = i6;
        int i7 = m16892a[i6];
    }

    public zzfkz(@Nullable Context context, jk6 jk6Var, int i, int i2, int i3, String str, String str2, String str3) {
        this.f37000p = jk6.values();
        this.f37010z = kk6.m17681a();
        this.f36998A = lk6.m16892a();
        this.f37001q = context;
        this.f37002r = jk6Var.ordinal();
        this.f37003s = jk6Var;
        this.f37004t = i;
        this.f37005u = i2;
        this.f37006v = i3;
        this.f37007w = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.f36999B = i4;
        this.f37008x = i4 - 1;
        "onAdClosed".equals(str3);
        this.f37009y = 0;
    }

    @Nullable
    /* renamed from: h */
    public static zzfkz m1092h(jk6 jk6Var, Context context) {
        if (jk6Var == jk6.Rewarded) {
            return new zzfkz(context, jk6Var, ((Integer) zzba.zzc().m23658b(g93.f10507O5)).intValue(), ((Integer) zzba.zzc().m23658b(g93.f10567U5)).intValue(), ((Integer) zzba.zzc().m23658b(g93.f10587W5)).intValue(), (String) zzba.zzc().m23658b(g93.f10607Y5), (String) zzba.zzc().m23658b(g93.f10527Q5), (String) zzba.zzc().m23658b(g93.f10547S5));
        } else if (jk6Var == jk6.Interstitial) {
            return new zzfkz(context, jk6Var, ((Integer) zzba.zzc().m23658b(g93.f10517P5)).intValue(), ((Integer) zzba.zzc().m23658b(g93.f10577V5)).intValue(), ((Integer) zzba.zzc().m23658b(g93.f10597X5)).intValue(), (String) zzba.zzc().m23658b(g93.f10617Z5), (String) zzba.zzc().m23658b(g93.f10537R5), (String) zzba.zzc().m23658b(g93.f10557T5));
        } else if (jk6Var == jk6.AppOpen) {
            return new zzfkz(context, jk6Var, ((Integer) zzba.zzc().m23658b(g93.f10650c6)).intValue(), ((Integer) zzba.zzc().m23658b(g93.f10672e6)).intValue(), ((Integer) zzba.zzc().m23658b(g93.f10683f6)).intValue(), (String) zzba.zzc().m23658b(g93.f10628a6), (String) zzba.zzc().m23658b(g93.f10639b6), (String) zzba.zzc().m23658b(g93.f10661d6));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f37002r);
        z71.m2723k(parcel, 2, this.f37004t);
        z71.m2723k(parcel, 3, this.f37005u);
        z71.m2723k(parcel, 4, this.f37006v);
        z71.m2717q(parcel, 5, this.f37007w, false);
        z71.m2723k(parcel, 6, this.f37008x);
        z71.m2723k(parcel, 7, this.f37009y);
        z71.m2732b(parcel, m2733a);
    }
}
