package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.daaw.kv;
import com.daaw.s6;
import com.daaw.sq1;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
@TargetApi(17)
/* loaded from: classes.dex */
public final class DummySurface extends Surface {
    public static int s;
    public static boolean t;
    public final boolean p;
    public final b q;
    public boolean r;

    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {
        @MonotonicNonNull
        public kv p;
        @MonotonicNonNull
        public Handler q;
        public Error r;
        public RuntimeException s;
        public DummySurface t;

        public b() {
            super("dummySurface");
        }

        public DummySurface a(int i) {
            boolean z;
            start();
            this.q = new Handler(getLooper(), this);
            this.p = new kv(this.q);
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
                    return (DummySurface) s6.e(this.t);
                }
                throw error;
            }
            throw runtimeException;
        }

        public final void b(int i) {
            s6.e(this.p);
            this.p.g(i);
            this.t = new DummySurface(this, this.p.f(), i != 0);
        }

        public void c() {
            s6.e(this.q);
            this.q.sendEmptyMessage(2);
        }

        public final void d() {
            s6.e(this.p);
            this.p.h();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        d();
                    } catch (Throwable unused) {
                    }
                    quit();
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    this.r = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    this.s = e2;
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

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.q = bVar;
        this.p = z;
    }

    public static void a() {
        if (sq1.a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    public static int b(Context context) {
        String eglQueryString;
        int i = sq1.a;
        if (i >= 26 || !("samsung".equals(sq1.c) || "XT1650".equals(sq1.d))) {
            if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            if (!t) {
                s = sq1.a < 24 ? 0 : b(context);
                t = true;
            }
            z = s != 0;
        }
        return z;
    }

    public static DummySurface g(Context context, boolean z) {
        a();
        s6.f(!z || c(context));
        return new b().a(z ? s : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.q) {
            if (!this.r) {
                this.q.c();
                this.r = true;
            }
        }
    }
}
