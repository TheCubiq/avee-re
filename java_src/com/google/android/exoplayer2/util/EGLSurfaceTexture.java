package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] EGL_CONFIG_ATTRIBUTES = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private static final int EGL_PROTECTED_CONTENT_EXT = 12992;
    public static final int SECURE_MODE_NONE = 0;
    public static final int SECURE_MODE_PROTECTED_PBUFFER = 2;
    public static final int SECURE_MODE_SURFACELESS_CONTEXT = 1;
    private EGLContext context;
    private EGLDisplay display;
    private final Handler handler;
    private EGLSurface surface;
    private SurfaceTexture texture;
    private final int[] textureIdHolder = new int[1];

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface SecureMode {
    }

    /* loaded from: classes.dex */
    public static final class GlException extends RuntimeException {
        private GlException(String str) {
            super(str);
        }
    }

    public EGLSurfaceTexture(Handler handler) {
        this.handler = handler;
    }

    public void init(int i) {
        EGLDisplay defaultDisplay = getDefaultDisplay();
        this.display = defaultDisplay;
        EGLConfig chooseEGLConfig = chooseEGLConfig(defaultDisplay);
        EGLContext createEGLContext = createEGLContext(this.display, chooseEGLConfig, i);
        this.context = createEGLContext;
        this.surface = createEGLSurface(this.display, chooseEGLConfig, createEGLContext, i);
        generateTextureIds(this.textureIdHolder);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textureIdHolder[0]);
        this.texture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.opengl.EGLContext, android.graphics.SurfaceTexture, android.opengl.EGLSurface, android.opengl.EGLDisplay] */
    public void release() {
        this.handler.removeCallbacks(this);
        try {
            if (this.texture != null) {
                this.texture.release();
                GLES20.glDeleteTextures(1, this.textureIdHolder, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.display;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.display, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.surface;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.display, this.surface);
            }
            EGLContext eGLContext = this.context;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.display, eGLContext);
            }
            if (Util.SDK_INT >= 19) {
                EGL14.eglReleaseThread();
            }
            this.display = null;
            this.context = null;
            this.surface = null;
            this.texture = null;
        }
    }

    public SurfaceTexture getSurfaceTexture() {
        return (SurfaceTexture) Assertions.checkNotNull(this.texture);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.handler.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        SurfaceTexture surfaceTexture = this.texture;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    private static EGLDisplay getDefaultDisplay() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new GlException("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new GlException("eglInitialize failed");
    }

    private static EGLConfig chooseEGLConfig(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, EGL_CONFIG_ATTRIBUTES, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new GlException(Util.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    private static EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, EGL_PROTECTED_CONTENT_EXT, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new GlException("eglCreateContext failed");
    }

    private static EGLSurface createEGLSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, EGL_PROTECTED_CONTENT_EXT, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new GlException("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new GlException("eglMakeCurrent failed");
    }

    private static void generateTextureIds(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new GlException("glGenTextures failed. Error: " + Integer.toHexString(glGetError));
    }
}
