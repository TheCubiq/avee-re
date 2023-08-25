package com.daaw;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
@TargetApi(17)
/* renamed from: com.daaw.kv */
/* loaded from: classes.dex */
public final class RunnableC1986kv implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: v */
    public static final int[] f16756v = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: p */
    public final Handler f16757p;

    /* renamed from: q */
    public final int[] f16758q = new int[1];

    /* renamed from: r */
    public EGLDisplay f16759r;

    /* renamed from: s */
    public EGLContext f16760s;

    /* renamed from: t */
    public EGLSurface f16761t;

    /* renamed from: u */
    public SurfaceTexture f16762u;

    /* renamed from: com.daaw.kv$b */
    /* loaded from: classes.dex */
    public static final class C1988b extends RuntimeException {
        public C1988b(String str) {
            super(str);
        }
    }

    public RunnableC1986kv(Handler handler) {
        this.f16757p = handler;
    }

    /* renamed from: a */
    public static EGLConfig m17426a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f16756v, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new C1988b(sq1.m10001o("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    /* renamed from: b */
    public static EGLContext m17425b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C1988b("eglCreateContext failed");
    }

    /* renamed from: c */
    public static EGLSurface m17424c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new C1988b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new C1988b("eglMakeCurrent failed");
    }

    /* renamed from: d */
    public static void m17423d(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new C1988b("glGenTextures failed. Error: " + Integer.toHexString(glGetError));
    }

    /* renamed from: e */
    public static EGLDisplay m17422e() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C1988b("eglInitialize failed");
        }
        throw new C1988b("eglGetDisplay failed");
    }

    /* renamed from: f */
    public SurfaceTexture m17421f() {
        return (SurfaceTexture) C2914s6.m10686e(this.f16762u);
    }

    /* renamed from: g */
    public void m17420g(int i) {
        EGLDisplay m17422e = m17422e();
        this.f16759r = m17422e;
        EGLConfig m17426a = m17426a(m17422e);
        EGLContext m17425b = m17425b(this.f16759r, m17426a, i);
        this.f16760s = m17425b;
        this.f16761t = m17424c(this.f16759r, m17426a, m17425b, i);
        m17423d(this.f16758q);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f16758q[0]);
        this.f16762u = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    /* renamed from: h */
    public void m17419h() {
        this.f16757p.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f16762u;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f16758q, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f16759r;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f16759r;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f16761t;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f16759r, this.f16761t);
            }
            EGLContext eGLContext = this.f16760s;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f16759r, eGLContext);
            }
            if (sq1.f26525a >= 19) {
                EGL14.eglReleaseThread();
            }
            this.f16759r = null;
            this.f16760s = null;
            this.f16761t = null;
            this.f16762u = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16757p.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceTexture surfaceTexture = this.f16762u;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }
}
