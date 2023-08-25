package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class e54 implements Runnable {
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ j54 s;

    public e54(j54 j54Var, String str, String str2, long j) {
        this.s = j54Var;
        this.p = str;
        this.q = str2;
        this.r = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.p);
        hashMap.put("cachedSrc", this.q);
        hashMap.put("totalDuration", Long.toString(this.r));
        j54.b(this.s, "onPrecacheEvent", hashMap);
    }
}
