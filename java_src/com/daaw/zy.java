package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public abstract class zy {
    public static Executor a() {
        return new x71(Executors.newSingleThreadExecutor());
    }
}
