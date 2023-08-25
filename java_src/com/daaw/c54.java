package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class c54 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f5494p;

    /* renamed from: q */
    public final /* synthetic */ String f5495q;

    /* renamed from: r */
    public final /* synthetic */ int f5496r;

    /* renamed from: s */
    public final /* synthetic */ int f5497s;

    /* renamed from: t */
    public final /* synthetic */ long f5498t;

    /* renamed from: u */
    public final /* synthetic */ long f5499u;

    /* renamed from: v */
    public final /* synthetic */ boolean f5500v;

    /* renamed from: w */
    public final /* synthetic */ int f5501w;

    /* renamed from: x */
    public final /* synthetic */ int f5502x;

    /* renamed from: y */
    public final /* synthetic */ j54 f5503y;

    public c54(j54 j54Var, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f5503y = j54Var;
        this.f5494p = str;
        this.f5495q = str2;
        this.f5496r = i;
        this.f5497s = i2;
        this.f5498t = j;
        this.f5499u = j2;
        this.f5500v = z;
        this.f5501w = i3;
        this.f5502x = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f5494p);
        hashMap.put("cachedSrc", this.f5495q);
        hashMap.put("bytesLoaded", Integer.toString(this.f5496r));
        hashMap.put("totalBytes", Integer.toString(this.f5497s));
        hashMap.put("bufferedDuration", Long.toString(this.f5498t));
        hashMap.put("totalDuration", Long.toString(this.f5499u));
        hashMap.put("cacheReady", true != this.f5500v ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f5501w));
        hashMap.put("playerPreparedCount", Integer.toString(this.f5502x));
        j54.m18857b(this.f5503y, "onPrecacheEvent", hashMap);
    }
}
