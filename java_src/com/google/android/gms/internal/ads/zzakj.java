package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
final class zzakj implements ThreadFactory {
    private final AtomicInteger zzcnz = new AtomicInteger(1);
    private final /* synthetic */ String zzcrl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakj(String str) {
        this.zzcrl = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.zzcrl;
        int andIncrement = this.zzcnz.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
