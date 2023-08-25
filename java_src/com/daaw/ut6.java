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

    /* renamed from: a */
    public final Object f29533a;

    /* renamed from: b */
    public final vt6 f29534b;

    /* renamed from: c */
    public final eu6 f29535c;

    /* renamed from: d */
    public final es6 f29536d;

    public ut6(Object obj, vt6 vt6Var, eu6 eu6Var, es6 es6Var) {
        this.f29533a = obj;
        this.f29534b = vt6Var;
        this.f29535c = eu6Var;
        this.f29536d = es6Var;
    }

    /* renamed from: i */
    public static String m7707i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        rj2 m10293L = sj2.m10293L();
        m10293L.m11231u(5);
        m10293L.m11233s(yq7.m3424F(bArr));
        return Base64.encodeToString(((sj2) m10293L.m22315n()).mo4516a(), 11);
    }

    @Override // com.daaw.ks6
    /* renamed from: a */
    public final synchronized String mo7715a(Context context, String str) {
        Map zzb;
        zzb = this.f29535c.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return m7707i(m7706j(null, zzb));
    }

    @Override // com.daaw.ks6
    /* renamed from: b */
    public final synchronized void mo7714b(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f29533a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f29533a, hashMap);
            this.f29536d.m23228d(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new cu6(2005, e);
        }
    }

    @Override // com.daaw.ks6
    /* renamed from: c */
    public final synchronized String mo7713c(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.f29535c.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return m7707i(m7706j(null, zza));
    }

    @Override // com.daaw.ks6
    /* renamed from: d */
    public final synchronized String mo7712d(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.f29535c.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return m7707i(m7706j(null, zzc));
    }

    /* renamed from: e */
    public final synchronized int m7711e() {
        try {
        } catch (Exception e) {
            throw new cu6(2006, e);
        }
        return ((Integer) this.f29533a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f29533a, new Object[0])).intValue();
    }

    /* renamed from: f */
    public final vt6 m7710f() {
        return this.f29534b;
    }

    /* renamed from: g */
    public final synchronized void m7709g() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f29533a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f29533a, new Object[0]);
            this.f29536d.m23228d(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new cu6(2003, e);
        }
    }

    /* renamed from: h */
    public final synchronized boolean m7708h() {
        try {
        } catch (Exception e) {
            throw new cu6(2001, e);
        }
        return ((Boolean) this.f29533a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f29533a, new Object[0])).booleanValue();
    }

    /* renamed from: j */
    public final synchronized byte[] m7706j(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.f29536d.m23229c(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f29533a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f29533a, null, map2);
    }
}
