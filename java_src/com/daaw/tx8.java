package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.gms.internal.ads.zzxk;
import java.util.Objects;
/* loaded from: classes.dex */
public final class tx8 extends HandlerThread implements Handler.Callback {
    public mv4 p;
    public Handler q;
    public Error r;
    public RuntimeException s;
    public zzxk t;

    public tx8() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final zzxk a(int i) {
        boolean z;
        start();
        this.q = new Handler(getLooper(), this);
        this.p = new mv4(this.q, null);
        synchronized (this) {
            z = false;
            this.q.obtainMessage(1, i, 0).sendToTarget();
            while (this.t == null && this.s == null && this.r == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.s;
        if (runtimeException == null) {
            Error error = this.r;
            if (error == null) {
                zzxk zzxkVar = this.t;
                Objects.requireNonNull(zzxkVar);
                return zzxkVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void b() {
        Handler handler = this.q;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    mv4 mv4Var = this.p;
                    Objects.requireNonNull(mv4Var);
                    mv4Var.c();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i2 = message.arg1;
                mv4 mv4Var2 = this.p;
                Objects.requireNonNull(mv4Var2);
                mv4Var2.b(i2);
                this.t = new zzxk(this, this.p.a(), i2 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (ow4 e) {
                s95.c("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.s = new IllegalStateException(e);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                s95.c("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.r = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                s95.c("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.s = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
