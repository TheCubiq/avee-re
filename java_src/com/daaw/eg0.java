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

    /* renamed from: a */
    public EGLDisplay f8455a;

    /* renamed from: b */
    public EGLContext f8456b;

    /* renamed from: c */
    public EGLSurface f8457c;

    /* renamed from: d */
    public Surface f8458d;

    public eg0(Surface surface, EGLContext eGLContext) {
        Objects.requireNonNull(surface);
        this.f8458d = surface;
        m23481b(eGLContext);
    }

    /* renamed from: a */
    public final void m23482a(String str) {
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

    /* renamed from: b */
    public final void m23481b(EGLContext eGLContext) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f8455a = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            this.f8455a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f8455a, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        this.f8456b = EGL14.eglCreateContext(this.f8455a, eGLConfigArr[0], eGLContext, new int[]{12440, 2, 12344}, 0);
        m23482a("eglCreateContext");
        if (this.f8456b == null) {
            throw new RuntimeException("null context");
        }
        this.f8457c = EGL14.eglCreateWindowSurface(this.f8455a, eGLConfigArr[0], this.f8458d, new int[]{12344}, 0);
        m23482a("eglCreateWindowSurface");
        if (this.f8457c == null) {
            throw new RuntimeException("surface was null");
        }
    }

    /* renamed from: c */
    public void m23480c() {
        EGLDisplay eGLDisplay = this.f8455a;
        EGLSurface eGLSurface = this.f8457c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f8456b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* renamed from: d */
    public void m23479d() {
        if (EGL14.eglGetCurrentContext().equals(this.f8456b)) {
            EGLDisplay eGLDisplay = this.f8455a;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
        EGL14.eglDestroySurface(this.f8455a, this.f8457c);
        EGL14.eglDestroyContext(this.f8455a, this.f8456b);
        this.f8458d.release();
        this.f8455a = null;
        this.f8456b = null;
        this.f8457c = null;
        this.f8458d = null;
    }

    /* renamed from: e */
    public void m23478e(long j) {
        EGLExt.eglPresentationTimeANDROID(this.f8455a, this.f8457c, j);
    }

    /* renamed from: f */
    public boolean m23477f() {
        return EGL14.eglSwapBuffers(this.f8455a, this.f8457c);
    }
}
