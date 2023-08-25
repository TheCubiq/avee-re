package com.daaw;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.gms.internal.ads.zzbbe;
/* loaded from: classes.dex */
public final class wz2 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: p */
    public final int[] f31685p;

    /* renamed from: q */
    public Handler f31686q;

    /* renamed from: r */
    public SurfaceTexture f31687r;

    /* renamed from: s */
    public Error f31688s;

    /* renamed from: t */
    public RuntimeException f31689t;

    /* renamed from: u */
    public zzbbe f31690u;

    public wz2() {
        super("dummySurface");
        this.f31685p = new int[1];
    }

    /* renamed from: a */
    public final zzbbe m5679a(boolean z) {
        boolean z2;
        start();
        this.f31686q = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.f31686q.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.f31690u == null && this.f31689t == null && this.f31688s == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f31689t;
        if (runtimeException == null) {
            Error error = this.f31688s;
            if (error == null) {
                return this.f31690u;
            }
            throw error;
        }
        throw runtimeException;
    }

    /* renamed from: b */
    public final void m5678b() {
        this.f31686q.sendEmptyMessage(3);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    this.f31687r.updateTexImage();
                    return true;
                } else if (i != 3) {
                    return true;
                } else {
                    try {
                        this.f31687r.release();
                        this.f31690u = null;
                        this.f31687r = null;
                        GLES20.glDeleteTextures(1, this.f31685p, 0);
                    } catch (Throwable unused) {
                    }
                    quit();
                    return true;
                }
            }
            try {
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    az2.m26582f(eglGetDisplay != null, "eglGetDisplay failed");
                    int[] iArr = new int[2];
                    az2.m26582f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    az2.m26582f(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                    az2.m26582f(eglCreateContext != null, "eglCreateContext failed");
                    EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    az2.m26582f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    az2.m26582f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.f31685p, 0);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.f31685p[0]);
                    this.f31687r = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.f31690u = new zzbbe(this, this.f31687r, z, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    this.f31689t = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (Error e2) {
                this.f31688s = e2;
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

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f31686q.sendEmptyMessage(2);
    }
}
