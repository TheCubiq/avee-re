package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class sn5 {

    /* renamed from: a */
    public final String f26430a;

    /* renamed from: b */
    public final String f26431b;

    /* renamed from: c */
    public final long f26432c;

    /* renamed from: d */
    public final Bundle f26433d;

    public sn5(String str, String str2, Bundle bundle, long j) {
        this.f26430a = str;
        this.f26431b = str2;
        this.f26433d = bundle;
        this.f26432c = j;
    }

    /* renamed from: b */
    public static sn5 m10141b(zzaw zzawVar) {
        return new sn5(zzawVar.f37068p, zzawVar.f37070r, zzawVar.f37069q.m1078q(), zzawVar.f37071s);
    }

    /* renamed from: a */
    public final zzaw m10142a() {
        return new zzaw(this.f26430a, new zzau(new Bundle(this.f26433d)), this.f26431b, this.f26432c);
    }

    public final String toString() {
        String str = this.f26431b;
        String str2 = this.f26430a;
        String obj = this.f26433d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
