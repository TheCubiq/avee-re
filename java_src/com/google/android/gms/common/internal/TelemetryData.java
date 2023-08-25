package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.pz1;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new pz1();

    /* renamed from: p */
    public final int f36650p;
    @Nullable

    /* renamed from: q */
    public List<MethodInvocation> f36651q;

    public TelemetryData(int i, @Nullable List<MethodInvocation> list) {
        this.f36650p = i;
        this.f36651q = list;
    }

    /* renamed from: h */
    public final int m1160h() {
        return this.f36650p;
    }

    /* renamed from: q */
    public final List<MethodInvocation> m1159q() {
        return this.f36651q;
    }

    /* renamed from: s */
    public final void m1158s(MethodInvocation methodInvocation) {
        if (this.f36651q == null) {
            this.f36651q = new ArrayList();
        }
        this.f36651q.add(methodInvocation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.f36650p);
        z71.m2713u(parcel, 2, this.f36651q, false);
        z71.m2732b(parcel, m2733a);
    }
}
