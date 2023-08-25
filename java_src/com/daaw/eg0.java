package com.daaw;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.Objects;
@TargetApi(18)
/* loaded from: classes.dex */
public class eg0 {
    public EGLDisplay a;
    public EGLContext b;
    public EGLSurface c;
    public Surface d;

    public eg0(Surface surface, EGLContext eGLContext) {
        Objects.requireNonNull(surface);
        this.d = surface;
        b(eGLContext);
    }

    public final void a(String str) {
        boolean z = false;
        while (true) {
            int eglGetError = EGL14.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": EGL error: 0x");
            sb.append(Integer.toHexString(eglGetError));
            z = true;
        }
        if (z) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    public final void b(EGLContext eGLContext) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.b = EGL14.eglCreateContext(this.a, eGLConfigArr[0], eGLContext, new int[]{12440, 2, 12344}, 0);
        a("eglCreateContext");
        if (this.b == null) {
            throw new RuntimeException("null context");
        }
        this.c = EGL14.eglCreateWindowSurface(this.a, eGLConfigArr[0], this.d, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
        if (this.c == null) {
            throw new RuntimeException("surface was null");
        }
    }

    public void c() {
        EGLDisplay eGLDisplay = this.a;
        EGLSurface eGLSurface = this.c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void d() {
        if (EGL14.eglGetCurrentContext().equals(this.b)) {
            EGLDisplay eGLDisplay = this.a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.a, this.c);
        EGL14.eglDestroyContext(this.a, this.b);
        this.d.release();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public void e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.a, this.c, j);
    }

    public boolean f() {
        return EGL14.eglSwapBuffers(this.a, this.c);
    }
}
