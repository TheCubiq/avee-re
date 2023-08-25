package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class y83 {

    /* renamed from: a */
    public final int f33423a;

    /* renamed from: b */
    public final String f33424b;

    /* renamed from: c */
    public final Object f33425c;

    public /* synthetic */ y83(int i, String str, Object obj, x83 x83Var) {
        this.f33423a = i;
        this.f33424b = str;
        this.f33425c = obj;
        zzba.zza().m2625d(this);
    }

    /* renamed from: f */
    public static y83 m4010f(int i, String str, float f) {
        return new r83(1, str, Float.valueOf(f));
    }

    /* renamed from: g */
    public static y83 m4009g(int i, String str, int i2) {
        return new p83(1, str, Integer.valueOf(i2));
    }

    /* renamed from: h */
    public static y83 m4008h(int i, String str, long j) {
        return new q83(1, str, Long.valueOf(j));
    }

    /* renamed from: i */
    public static y83 m4007i(int i, String str, Boolean bool) {
        return new o83(i, str, bool);
    }

    /* renamed from: j */
    public static y83 m4006j(int i, String str, String str2) {
        return new s83(1, str, str2);
    }

    /* renamed from: k */
    public static y83 m4005k(int i, String str) {
        y83 m4006j = m4006j(1, "gads:sdk_core_constants:experiment_id", null);
        zzba.zza().m2626c(m4006j);
        return m4006j;
    }

    /* renamed from: a */
    public abstract Object mo4015a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract Object mo4014b(Bundle bundle);

    /* renamed from: c */
    public abstract Object mo4013c(SharedPreferences sharedPreferences);

    /* renamed from: d */
    public abstract void mo4012d(SharedPreferences.Editor editor, Object obj);

    /* renamed from: e */
    public final int m4011e() {
        return this.f33423a;
    }

    /* renamed from: l */
    public final Object m4004l() {
        return zzba.zzc().m23658b(this);
    }

    /* renamed from: m */
    public final Object m4003m() {
        return this.f33425c;
    }

    /* renamed from: n */
    public final String m4002n() {
        return this.f33424b;
    }
}
