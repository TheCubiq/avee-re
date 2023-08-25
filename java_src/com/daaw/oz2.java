package com.daaw;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class oz2 implements ThreadFactory {
    public final /* synthetic */ String a = "Loader:ExtractorMediaPeriod";

    public oz2(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}
