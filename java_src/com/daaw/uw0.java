package com.daaw;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/* loaded from: classes2.dex */
public final class uw0 extends m {
    @Override // com.daaw.m
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        ug0.e(current, "current()");
        return current;
    }
}
