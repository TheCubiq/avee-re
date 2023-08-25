package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.bl4;
import com.daaw.ly8;
import com.daaw.up8;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new up8();

    /* renamed from: p */
    public final boolean f36670p;
    @Nullable

    /* renamed from: q */
    public final String f36671q;

    /* renamed from: r */
    public final int f36672r;

    /* renamed from: s */
    public final int f36673s;

    public zzq(boolean z, String str, int i, int i2) {
        this.f36670p = z;
        this.f36671q = str;
        this.f36672r = ly8.m16366a(i) - 1;
        this.f36673s = bl4.m26067a(i2) - 1;
    }

    @Nullable
    /* renamed from: h */
    public final String m1153h() {
        return this.f36671q;
    }

    /* renamed from: q */
    public final boolean m1152q() {
        return this.f36670p;
    }

    /* renamed from: s */
    public final int m1151s() {
        return bl4.m26067a(this.f36673s);
    }

    /* renamed from: t */
    public final int m1150t() {
        return ly8.m16366a(this.f36672r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2731c(parcel, 1, this.f36670p);
        z71.m2717q(parcel, 2, this.f36671q, false);
        z71.m2723k(parcel, 3, this.f36672r);
        z71.m2723k(parcel, 4, this.f36673s);
        z71.m2732b(parcel, m2733a);
    }
}
