package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ut6 implements ks6 {
    public final Object a;
    public final vt6 b;
    public final eu6 c;
    public final es6 d;

    public ut6(Object obj, vt6 vt6Var, eu6 eu6Var, es6 es6Var) {
        this.a = obj;
        this.b = vt6Var;
        this.c = eu6Var;
        this.d = es6Var;
    }

    public static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        rj2 L = sj2.L();
        L.u(5);
        L.s(yq7.F(bArr));
        return Base64.encodeToString(((sj2) L.n()).a(), 11);
    }

    @Override // com.daaw.ks6
    public final synchronized String a(Context context, String str) {
        Map zzb;
        zzb = this.c.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return i(j(null, zzb));
    }

    @Override // com.daaw.ks6
    public final synchronized void b(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.a.getClass().getDeclaredMethod("he", Map.class).invoke(this.a, hashMap);
            this.d.d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new cu6(2005, e);
        }
    }

    @Override // com.daaw.ks6
    public final synchronized String c(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.c.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return i(j(null, zza));
    }

    @Override // com.daaw.ks6
    public final synchronized String d(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.c.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return i(j(null, zzc));
    }

    public final synchronized int e() {
        try {
        } catch (Exception e) {
            throw new cu6(2006, e);
        }
        return ((Integer) this.a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.a, new Object[0])).intValue();
    }

    public final vt6 f() {
        return this.b;
    }

    public final synchronized void g() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.a, new Object[0]);
            this.d.d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new cu6(2003, e);
        }
    }

    public final synchronized boolean h() {
        try {
        } catch (Exception e) {
            throw new cu6(2001, e);
        }
        return ((Boolean) this.a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.a, new Object[0])).booleanValue();
    }

    public final synchronized byte[] j(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.d.c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.a, null, map2);
    }
}
