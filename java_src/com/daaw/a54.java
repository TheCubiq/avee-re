package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class a54 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ j54 t;

    public a54(j54 j54Var, String str, String str2, int i, int i2, boolean z) {
        this.t = j54Var;
        this.p = str;
        this.q = str2;
        this.r = i;
        this.s = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.p);
        hashMap.put("cachedSrc", this.q);
        hashMap.put("bytesLoaded", Integer.toString(this.r));
        hashMap.put("totalBytes", Integer.toString(this.s));
        hashMap.put("cacheReady", "0");
        j54.b(this.t, "onPrecacheEvent", hashMap);
    }
}
