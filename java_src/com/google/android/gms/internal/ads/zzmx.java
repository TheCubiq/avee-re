package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
final class zzmx implements Callable<Boolean> {
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
