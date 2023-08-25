package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
/* loaded from: classes2.dex */
public final class sn5 {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;

    public sn5(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static sn5 b(zzaw zzawVar) {
        return new sn5(zzawVar.p, zzawVar.r, zzawVar.q.q(), zzawVar.s);
    }

    public final zzaw a() {
        return new zzaw(this.a, new zzau(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String obj = this.d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
