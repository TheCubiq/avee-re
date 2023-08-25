package com.daaw;

import java.util.Random;
/* loaded from: classes2.dex */
public final class i00 extends AbstractC2139m {

    /* renamed from: r */
    public final C1647a f13120r = new C1647a();

    /* renamed from: com.daaw.i00$a */
    /* loaded from: classes2.dex */
    public static final class C1647a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // com.daaw.AbstractC2139m
    /* renamed from: c */
    public Random mo7668c() {
        Random random = this.f13120r.get();
        ug0.m8269e(random, "implStorage.get()");
        return random;
    }
}
