package com.daaw;

import java.util.HashMap;
/* loaded from: classes.dex */
public final class d54 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f6531p;

    /* renamed from: q */
    public final /* synthetic */ String f6532q;

    /* renamed from: r */
    public final /* synthetic */ int f6533r;

    /* renamed from: s */
    public final /* synthetic */ j54 f6534s;

    public d54(j54 j54Var, String str, String str2, int i) {
        this.f6534s = j54Var;
        this.f6531p = str;
        this.f6532q = str2;
        this.f6533r = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f6531p);
        hashMap.put("cachedSrc", this.f6532q);
        hashMap.put("totalBytes", Integer.toString(this.f6533r));
        j54.m18857b(this.f6534s, "onPrecacheEvent", hashMap);
    }
}
