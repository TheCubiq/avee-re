package com.daaw;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ey2 extends Thread {

    /* renamed from: p */
    public final WeakReference<AdvertisingIdClient> f8948p;

    /* renamed from: q */
    public final long f8949q;

    /* renamed from: r */
    public final CountDownLatch f8950r = new CountDownLatch(1);

    /* renamed from: s */
    public boolean f8951s = false;

    public ey2(AdvertisingIdClient advertisingIdClient, long j) {
        this.f8948p = new WeakReference<>(advertisingIdClient);
        this.f8949q = j;
        start();
    }

    /* renamed from: a */
    public final void m22990a() {
        AdvertisingIdClient advertisingIdClient = this.f8948p.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.f8951s = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f8950r.await(this.f8949q, TimeUnit.MILLISECONDS)) {
                return;
            }
            m22990a();
        } catch (InterruptedException unused) {
            m22990a();
        }
    }
}
