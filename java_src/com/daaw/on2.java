package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class on2 {

    /* renamed from: a */
    public final String f21678a;

    /* renamed from: b */
    public final String f21679b;

    /* renamed from: c */
    public final String f21680c;

    /* renamed from: d */
    public final long f21681d;

    /* renamed from: e */
    public final long f21682e;

    /* renamed from: f */
    public final zzau f21683f;

    public on2(dr6 dr6Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzauVar;
        ry0.m10834f(str2);
        ry0.m10834f(str3);
        this.f21678a = str2;
        this.f21679b = str3;
        this.f21680c = true == TextUtils.isEmpty(str) ? null : str;
        this.f21681d = j;
        this.f21682e = j2;
        if (j2 != 0 && j2 > j) {
            dr6Var.mo3895i().m14155w().m20652b("Event created with reverse previous/current timestamps. appId", om5.m14152z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzauVar = new zzau(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    dr6Var.mo3895i().m14160q().m20653a("Param name can't be null");
                } else {
                    Object m24475n = dr6Var.m24045N().m24475n(next, bundle2.get(next));
                    if (m24475n == null) {
                        dr6Var.mo3895i().m14155w().m20652b("Param value can't be null", dr6Var.m24055D().m5132e(next));
                    } else {
                        dr6Var.m24045N().m24512C(bundle2, next, m24475n);
                    }
                }
                it.remove();
            }
            zzauVar = new zzau(bundle2);
        }
        this.f21683f = zzauVar;
    }

    public on2(dr6 dr6Var, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        ry0.m10834f(str2);
        ry0.m10834f(str3);
        ry0.m10830j(zzauVar);
        this.f21678a = str2;
        this.f21679b = str3;
        this.f21680c = true == TextUtils.isEmpty(str) ? null : str;
        this.f21681d = j;
        this.f21682e = j2;
        if (j2 != 0 && j2 > j) {
            dr6Var.mo3895i().m14155w().m20651c("Event created with reverse previous/current timestamps. appId, name", om5.m14152z(str2), om5.m14152z(str3));
        }
        this.f21683f = zzauVar;
    }

    /* renamed from: a */
    public final on2 m14139a(dr6 dr6Var, long j) {
        return new on2(dr6Var, this.f21680c, this.f21678a, this.f21679b, this.f21681d, j, this.f21683f);
    }

    public final String toString() {
        String str = this.f21678a;
        String str2 = this.f21679b;
        String obj = this.f21683f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }
}
