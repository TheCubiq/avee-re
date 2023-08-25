package com.daaw;

import android.os.CancellationSignal;
/* loaded from: classes.dex */
public final class wd {
    public boolean a;
    public b b;
    public Object c;
    public boolean d;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            b bVar = this.b;
            Object obj = this.c;
            if (bVar != null) {
                try {
                    bVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.d = false;
                notifyAll();
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void c(b bVar) {
        synchronized (this) {
            d();
            if (this.b == bVar) {
                return;
            }
            this.b = bVar;
            if (this.a && bVar != null) {
                bVar.a();
            }
        }
    }

    public final void d() {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
