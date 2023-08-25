package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class c54 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ long t;
    public final /* synthetic */ long u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ j54 y;

    public c54(j54 j54Var, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.y = j54Var;
        this.p = str;
        this.q = str2;
        this.r = i;
        this.s = i2;
        this.t = j;
        this.u = j2;
        this.v = z;
        this.w = i3;
        this.x = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.p);
        hashMap.put("cachedSrc", this.q);
        hashMap.put("bytesLoaded", Integer.toString(this.r));
        hashMap.put("totalBytes", Integer.toString(this.s));
        hashMap.put("bufferedDuration", Long.toString(this.t));
        hashMap.put("totalDuration", Long.toString(this.u));
        hashMap.put("cacheReady", true != this.v ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.w));
        hashMap.put("playerPreparedCount", Integer.toString(this.x));
        j54.b(this.y, "onPrecacheEvent", hashMap);
    }
}
