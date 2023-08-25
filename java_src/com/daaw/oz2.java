package com.daaw;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class oz2 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f22160a = "Loader:ExtractorMediaPeriod";

    public oz2(String str) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f22160a);
    }
}
