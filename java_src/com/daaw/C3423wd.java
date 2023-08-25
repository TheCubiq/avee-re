package com.daaw;

import android.os.CancellationSignal;
/* renamed from: com.daaw.wd */
/* loaded from: classes.dex */
public final class C3423wd {

    /* renamed from: a */
    public boolean f31173a;

    /* renamed from: b */
    public InterfaceC3425b f31174b;

    /* renamed from: c */
    public Object f31175c;

    /* renamed from: d */
    public boolean f31176d;

    /* renamed from: com.daaw.wd$a */
    /* loaded from: classes.dex */
    public static class C3424a {
        /* renamed from: a */
        public static void m6169a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        public static CancellationSignal m6168b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: com.daaw.wd$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3425b {
        /* renamed from: a */
        void mo6167a();
    }

    /* renamed from: a */
    public void m6173a() {
        synchronized (this) {
            if (this.f31173a) {
                return;
            }
            this.f31173a = true;
            this.f31176d = true;
            InterfaceC3425b interfaceC3425b = this.f31174b;
            Object obj = this.f31175c;
            if (interfaceC3425b != null) {
                try {
                    interfaceC3425b.mo6167a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f31176d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                C3424a.m6169a(obj);
            }
            synchronized (this) {
                this.f31176d = false;
                notifyAll();
            }
        }
    }

    /* renamed from: b */
    public boolean m6172b() {
        boolean z;
        synchronized (this) {
            z = this.f31173a;
        }
        return z;
    }

    /* renamed from: c */
    public void m6171c(InterfaceC3425b interfaceC3425b) {
        synchronized (this) {
            m6170d();
            if (this.f31174b == interfaceC3425b) {
                return;
            }
            this.f31174b = interfaceC3425b;
            if (this.f31173a && interfaceC3425b != null) {
                interfaceC3425b.mo6167a();
            }
        }
    }

    /* renamed from: d */
    public final void m6170d() {
        while (this.f31176d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
