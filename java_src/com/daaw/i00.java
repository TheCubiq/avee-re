package com.daaw;

import java.util.Random;
/* loaded from: classes2.dex */
public final class i00 extends m {
    public final a r = new a();

    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // com.daaw.m
    public Random c() {
        Random random = this.r.get();
        ug0.e(random, "implStorage.get()");
        return random;
    }
}
