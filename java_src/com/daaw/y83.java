package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class y83 {
    public final int a;
    public final String b;
    public final Object c;

    public /* synthetic */ y83(int i, String str, Object obj, x83 x83Var) {
        this.a = i;
        this.b = str;
        this.c = obj;
        zzba.zza().d(this);
    }

    public static y83 f(int i, String str, float f) {
        return new r83(1, str, Float.valueOf(f));
    }

    public static y83 g(int i, String str, int i2) {
        return new p83(1, str, Integer.valueOf(i2));
    }

    public static y83 h(int i, String str, long j) {
        return new q83(1, str, Long.valueOf(j));
    }

    public static y83 i(int i, String str, Boolean bool) {
        return new o83(i, str, bool);
    }

    public static y83 j(int i, String str, String str2) {
        return new s83(1, str, str2);
    }

    public static y83 k(int i, String str) {
        y83 j = j(1, "gads:sdk_core_constants:experiment_id", null);
        zzba.zza().c(j);
        return j;
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    public abstract Object c(SharedPreferences sharedPreferences);

    public abstract void d(SharedPreferences.Editor editor, Object obj);

    public final int e() {
        return this.a;
    }

    public final Object l() {
        return zzba.zzc().b(this);
    }

    public final Object m() {
        return this.c;
    }

    public final String n() {
        return this.b;
    }
}
