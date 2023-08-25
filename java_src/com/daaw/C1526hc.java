package com.daaw;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* renamed from: com.daaw.hc */
/* loaded from: classes2.dex */
public class C1526hc implements InterfaceC3394w2, InterfaceC3277v2 {

    /* renamed from: a */
    public final C1844jm f12368a;

    /* renamed from: b */
    public final int f12369b;

    /* renamed from: c */
    public final TimeUnit f12370c;

    /* renamed from: e */
    public CountDownLatch f12372e;

    /* renamed from: d */
    public final Object f12371d = new Object();

    /* renamed from: f */
    public boolean f12373f = false;

    public C1526hc(C1844jm c1844jm, int i, TimeUnit timeUnit) {
        this.f12368a = c1844jm;
        this.f12369b = i;
        this.f12370c = timeUnit;
    }

    @Override // com.daaw.InterfaceC3394w2
    /* renamed from: L */
    public void mo6589L(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f12372e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // com.daaw.InterfaceC3277v2
    /* renamed from: a */
    public void mo7545a(String str, Bundle bundle) {
        synchronized (this.f12371d) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15973i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f12372e = new CountDownLatch(1);
            this.f12373f = false;
            this.f12368a.mo7545a(str, bundle);
            ml0.m15976f().m15973i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f12372e.await(this.f12369b, this.f12370c)) {
                    this.f12373f = true;
                    ml0.m15976f().m15973i("App exception callback received from Analytics listener.");
                } else {
                    ml0.m15976f().m15971k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                ml0.m15976f().m15978d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f12372e = null;
        }
    }
}
