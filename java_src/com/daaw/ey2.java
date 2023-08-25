package com.daaw;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ey2 extends Thread {
    public final WeakReference<AdvertisingIdClient> p;
    public final long q;
    public final CountDownLatch r = new CountDownLatch(1);
    public boolean s = false;

    public ey2(AdvertisingIdClient advertisingIdClient, long j) {
        this.p = new WeakReference<>(advertisingIdClient);
        this.q = j;
        start();
    }

    public final void a() {
        AdvertisingIdClient advertisingIdClient = this.p.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.s = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.r.await(this.q, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
