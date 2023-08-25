package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class b54 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ long v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ j54 z;

    public b54(j54 j54Var, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.z = j54Var;
        this.p = str;
        this.q = str2;
        this.r = j;
        this.s = j2;
        this.t = j3;
        this.u = j4;
        this.v = j5;
        this.w = z;
        this.x = i;
        this.y = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.p);
        hashMap.put("cachedSrc", this.q);
        hashMap.put("bufferedDuration", Long.toString(this.r));
        hashMap.put("totalDuration", Long.toString(this.s));
        if (((Boolean) zzba.zzc().b(g93.F1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.t));
            hashMap.put("qoeCachedBytes", Long.toString(this.u));
            hashMap.put("totalBytes", Long.toString(this.v));
            hashMap.put("reportTime", Long.toString(zzt.zzB().a()));
        }
        hashMap.put("cacheReady", true != this.w ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.x));
        hashMap.put("playerPreparedCount", Integer.toString(this.y));
        j54.b(this.z, "onPrecacheEvent", hashMap);
    }
}
