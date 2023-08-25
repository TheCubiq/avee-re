package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class on2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final zzau f;

    public on2(dr6 dr6Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzauVar;
        ry0.f(str2);
        ry0.f(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            dr6Var.i().w().b("Event created with reverse previous/current timestamps. appId", om5.z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    dr6Var.i().q().a("Param name can't be null");
                } else {
                    Object n = dr6Var.N().n(next, bundle2.get(next));
                    if (n == null) {
                        dr6Var.i().w().b("Param value can't be null", dr6Var.D().e(next));
                    } else {
                        dr6Var.N().C(bundle2, next, n);
                    }
                }
                it.remove();
            }
            zzauVar = new zzau(bundle2);
        }
        this.f = zzauVar;
    }

    public on2(dr6 dr6Var, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        ry0.f(str2);
        ry0.f(str3);
        ry0.j(zzauVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        if (j2 != 0 && j2 > j) {
            dr6Var.i().w().c("Event created with reverse previous/current timestamps. appId, name", om5.z(str2), om5.z(str3));
        }
        this.f = zzauVar;
    }

    public final on2 a(dr6 dr6Var, long j) {
        return new on2(dr6Var, this.c, this.a, this.b, this.d, j, this.f);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String obj = this.f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }
}
