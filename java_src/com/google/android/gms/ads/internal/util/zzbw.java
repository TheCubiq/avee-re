package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class zzbw {

    /* renamed from: a */
    public final Map f36282a = new ConcurrentHashMap();

    /* renamed from: b */
    public final AtomicInteger f36283b = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.f36282a.get(num);
    }
}
