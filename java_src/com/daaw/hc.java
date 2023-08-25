package com.daaw;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class hc implements w2, v2 {
    public final jm a;
    public final int b;
    public final TimeUnit c;
    public CountDownLatch e;
    public final Object d = new Object();
    public boolean f = false;

    public hc(jm jmVar, int i, TimeUnit timeUnit) {
        this.a = jmVar;
        this.b = i;
        this.c = timeUnit;
    }

    @Override // com.daaw.w2
    public void L(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // com.daaw.v2
    public void a(String str, Bundle bundle) {
        synchronized (this.d) {
            ml0 f = ml0.f();
            f.i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.e = new CountDownLatch(1);
            this.f = false;
            this.a.a(str, bundle);
            ml0.f().i("Awaiting app exception callback from Analytics...");
            try {
                if (this.e.await(this.b, this.c)) {
                    this.f = true;
                    ml0.f().i("App exception callback received from Analytics listener.");
                } else {
                    ml0.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                ml0.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.e = null;
        }
    }
}
