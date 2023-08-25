package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.daaw.C2914s6;
import com.daaw.RunnableC1986kv;
import com.daaw.sq1;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
@TargetApi(17)
/* loaded from: classes.dex */
public final class DummySurface extends Surface {

    /* renamed from: s */
    public static int f35987s;

    /* renamed from: t */
    public static boolean f35988t;

    /* renamed from: p */
    public final boolean f35989p;

    /* renamed from: q */
    public final HandlerThreadC3981b f35990q;

    /* renamed from: r */
    public boolean f35991r;

    /* renamed from: com.google.android.exoplayer2.video.DummySurface$b */
    /* loaded from: classes.dex */
    public static class HandlerThreadC3981b extends HandlerThread implements Handler.Callback {
        @MonotonicNonNull

        /* renamed from: p */
        public RunnableC1986kv f35992p;
        @MonotonicNonNull

        /* renamed from: q */
        public Handler f35993q;

        /* renamed from: r */
        public Error f35994r;

        /* renamed from: s */
        public RuntimeException f35995s;

        /* renamed from: t */
        public DummySurface f35996t;

        public HandlerThreadC3981b() {
            super("dummySurface");
        }

        /* renamed from: a */
        public DummySurface m1472a(int i) {
            boolean z;
            start();
            this.f35993q = new Handler(getLooper(), this);
            this.f35992p = new RunnableC1986kv(this.f35993q);
            synchronized (this) {
                z = false;
                this.f35993q.obtainMessage(1, i, 0).sendToTarget();
                while (this.f35996t == null && this.f35995s == null && this.f35994r == null) {
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
            RuntimeException runtimeException = this.f35995s;
            if (runtimeException == null) {
                Error error = this.f35994r;
                if (error == null) {
                    return (DummySurface) C2914s6.m10686e(this.f35996t);
                }
                throw error;
            }
            throw runtimeException;
        }

        /* renamed from: b */
        public final void m1471b(int i) {
            C2914s6.m10686e(this.f35992p);
            this.f35992p.m17420g(i);
            this.f35996t = new DummySurface(this, this.f35992p.m17421f(), i != 0);
        }

        /* renamed from: c */
        public void m1470c() {
            C2914s6.m10686e(this.f35993q);
            this.f35993q.sendEmptyMessage(2);
        }

        /* renamed from: d */
        public final void m1469d() {
            C2914s6.m10686e(this.f35992p);
            this.f35992p.m17419h();
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
                        m1469d();
                    } catch (Throwable unused) {
                    }
                    quit();
                    return true;
                }
                try {
                    m1471b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    this.f35994r = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    this.f35995s = e2;
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

    public DummySurface(HandlerThreadC3981b handlerThreadC3981b, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f35990q = handlerThreadC3981b;
        this.f35989p = z;
    }

    /* renamed from: a */
    public static void m1476a() {
        if (sq1.f26525a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    @TargetApi(24)
    /* renamed from: b */
    public static int m1475b(Context context) {
        String eglQueryString;
        int i = sq1.f26525a;
        if (i >= 26 || !("samsung".equals(sq1.f26527c) || "XT1650".equals(sq1.f26528d))) {
            if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: c */
    public static synchronized boolean m1474c(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            if (!f35988t) {
                f35987s = sq1.f26525a < 24 ? 0 : m1475b(context);
                f35988t = true;
            }
            z = f35987s != 0;
        }
        return z;
    }

    /* renamed from: g */
    public static DummySurface m1473g(Context context, boolean z) {
        m1476a();
        C2914s6.m10685f(!z || m1474c(context));
        return new HandlerThreadC3981b().m1472a(z ? f35987s : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f35990q) {
            if (!this.f35991r) {
                this.f35990q.m1470c();
                this.f35991r = true;
            }
        }
    }
}
