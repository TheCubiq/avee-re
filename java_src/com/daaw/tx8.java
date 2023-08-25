package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.gms.internal.ads.zzxk;
import java.util.Objects;
/* loaded from: classes.dex */
public final class tx8 extends HandlerThread implements Handler.Callback {

    /* renamed from: p */
    public mv4 f28240p;

    /* renamed from: q */
    public Handler f28241q;

    /* renamed from: r */
    public Error f28242r;

    /* renamed from: s */
    public RuntimeException f28243s;

    /* renamed from: t */
    public zzxk f28244t;

    public tx8() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* renamed from: a */
    public final zzxk m8706a(int i) {
        boolean z;
        start();
        this.f28241q = new Handler(getLooper(), this);
        this.f28240p = new mv4(this.f28241q, null);
        synchronized (this) {
            z = false;
            this.f28241q.obtainMessage(1, i, 0).sendToTarget();
            while (this.f28244t == null && this.f28243s == null && this.f28242r == null) {
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
        RuntimeException runtimeException = this.f28243s;
        if (runtimeException == null) {
            Error error = this.f28242r;
            if (error == null) {
                zzxk zzxkVar = this.f28244t;
                Objects.requireNonNull(zzxkVar);
                return zzxkVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void m8705b() {
        Handler handler = this.f28241q;
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
                    mv4 mv4Var = this.f28240p;
                    Objects.requireNonNull(mv4Var);
                    mv4Var.m15753c();
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
                mv4 mv4Var2 = this.f28240p;
                Objects.requireNonNull(mv4Var2);
                mv4Var2.m15754b(i2);
                this.f28244t = new zzxk(this, this.f28240p.m15755a(), i2 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (ow4 e) {
                s95.m10495c("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.f28243s = new IllegalStateException(e);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                s95.m10495c("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.f28242r = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                s95.m10495c("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.f28243s = e3;
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
