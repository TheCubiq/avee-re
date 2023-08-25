package com.daaw;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Objects;
/* loaded from: classes.dex */
public final class mv4 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] v = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    public final Handler p;
    public final int[] q = new int[1];
    public EGLDisplay r;
    public EGLContext s;
    public EGLSurface t;
    public SurfaceTexture u;

    public mv4(Handler handler, ju4 ju4Var) {
        this.p = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.u;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    public final void b(int i) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        qx4.a(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        qx4.a(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.r = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, v, 0, eGLConfigArr, 0, 1, iArr2, 0);
        qx4.a(eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, it5.i("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.r, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        qx4.a(eglCreateContext != null, "eglCreateContext failed");
        this.s = eglCreateContext;
        EGLDisplay eGLDisplay = this.r;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            qx4.a(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        qx4.a(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
        this.t = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.q, 0);
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (z) {
            throw new ow4(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.q[0]);
        this.u = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void c() {
        this.p.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.u;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.q, 0);
            }
            EGLDisplay eGLDisplay = this.r;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.r;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.t;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.r, this.t);
            }
            EGLContext eGLContext = this.s;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.r, eGLContext);
            }
            int i = it5.a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.r;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.r);
            }
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.r;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.r;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.t;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.r, this.t);
            }
            EGLContext eGLContext2 = this.s;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.r, eGLContext2);
            }
            int i2 = it5.a;
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.r;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.r);
            }
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.p.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.u;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
