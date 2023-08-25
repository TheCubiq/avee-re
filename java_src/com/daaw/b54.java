package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class b54 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f4305p;

    /* renamed from: q */
    public final /* synthetic */ String f4306q;

    /* renamed from: r */
    public final /* synthetic */ long f4307r;

    /* renamed from: s */
    public final /* synthetic */ long f4308s;

    /* renamed from: t */
    public final /* synthetic */ long f4309t;

    /* renamed from: u */
    public final /* synthetic */ long f4310u;

    /* renamed from: v */
    public final /* synthetic */ long f4311v;

    /* renamed from: w */
    public final /* synthetic */ boolean f4312w;

    /* renamed from: x */
    public final /* synthetic */ int f4313x;

    /* renamed from: y */
    public final /* synthetic */ int f4314y;

    /* renamed from: z */
    public final /* synthetic */ j54 f4315z;

    public b54(j54 j54Var, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f4315z = j54Var;
        this.f4305p = str;
        this.f4306q = str2;
        this.f4307r = j;
        this.f4308s = j2;
        this.f4309t = j3;
        this.f4310u = j4;
        this.f4311v = j5;
        this.f4312w = z;
        this.f4313x = i;
        this.f4314y = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f4305p);
        hashMap.put("cachedSrc", this.f4306q);
        hashMap.put("bufferedDuration", Long.toString(this.f4307r));
        hashMap.put("totalDuration", Long.toString(this.f4308s));
        if (((Boolean) zzba.zzc().m23658b(g93.f10413F1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f4309t));
            hashMap.put("qoeCachedBytes", Long.toString(this.f4310u));
            hashMap.put("totalBytes", Long.toString(this.f4311v));
            hashMap.put("reportTime", Long.toString(zzt.zzB().mo15860a()));
        }
        hashMap.put("cacheReady", true != this.f4312w ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f4313x));
        hashMap.put("playerPreparedCount", Integer.toString(this.f4314y));
        j54.m18857b(this.f4315z, "onPrecacheEvent", hashMap);
    }
}
