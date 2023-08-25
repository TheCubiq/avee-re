package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class e54 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f8124p;

    /* renamed from: q */
    public final /* synthetic */ String f8125q;

    /* renamed from: r */
    public final /* synthetic */ long f8126r;

    /* renamed from: s */
    public final /* synthetic */ j54 f8127s;

    public e54(j54 j54Var, String str, String str2, long j) {
        this.f8127s = j54Var;
        this.f8124p = str;
        this.f8125q = str2;
        this.f8126r = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f8124p);
        hashMap.put("cachedSrc", this.f8125q);
        hashMap.put("totalDuration", Long.toString(this.f8126r));
        j54.m18857b(this.f8127s, "onPrecacheEvent", hashMap);
    }
}
