package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class a54 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f2898p;

    /* renamed from: q */
    public final /* synthetic */ String f2899q;

    /* renamed from: r */
    public final /* synthetic */ int f2900r;

    /* renamed from: s */
    public final /* synthetic */ int f2901s;

    /* renamed from: t */
    public final /* synthetic */ j54 f2902t;

    public a54(j54 j54Var, String str, String str2, int i, int i2, boolean z) {
        this.f2902t = j54Var;
        this.f2898p = str;
        this.f2899q = str2;
        this.f2900r = i;
        this.f2901s = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f2898p);
        hashMap.put("cachedSrc", this.f2899q);
        hashMap.put("bytesLoaded", Integer.toString(this.f2900r));
        hashMap.put("totalBytes", Integer.toString(this.f2901s));
        hashMap.put("cacheReady", "0");
        j54.m18857b(this.f2902t, "onPrecacheEvent", hashMap);
    }
}
