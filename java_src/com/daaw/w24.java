package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* loaded from: classes.dex */
public final class w24 extends Thread implements SurfaceTexture.OnFrameAvailableListener, u24 {
    public static final float[] Q = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public int A;
    public int B;
    public SurfaceTexture C;
    public SurfaceTexture D;
    public int E;
    public int F;
    public int G;
    public final FloatBuffer H;
    public final CountDownLatch I;
    public final Object J;
    public EGL10 K;
    public EGLDisplay L;
    public EGLContext M;
    public EGLSurface N;
    public volatile boolean O;
    public volatile boolean P;
    public final v24 p;
    public final float[] q;
    public final float[] r;
    public final float[] s;
    public final float[] t;
    public final float[] u;
    public final float[] v;
    public final float[] w;
    public float x;
    public float y;
    public float z;

    public w24(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = Q;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.H = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.q = new float[9];
        this.r = new float[9];
        this.s = new float[9];
        this.t = new float[9];
        this.u = new float[9];
        this.v = new float[9];
        this.w = new float[9];
        this.x = Float.NaN;
        v24 v24Var = new v24(context);
        this.p = v24Var;
        v24Var.a(this);
        this.I = new CountDownLatch(1);
        this.J = new Object();
    }

    public static final void g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
        }
    }

    public static final void h(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    public static final void i(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    public static final void j(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int k(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final SurfaceTexture a() {
        if (this.D == null) {
            return null;
        }
        try {
            this.I.await();
        } catch (InterruptedException unused) {
        }
        return this.C;
    }

    public final void b(int i, int i2) {
        synchronized (this.J) {
            this.B = i;
            this.A = i2;
            this.O = true;
            this.J.notifyAll();
        }
    }

    public final void c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.B = i;
        this.A = i2;
        this.D = surfaceTexture;
    }

    public final void d() {
        synchronized (this.J) {
            this.P = true;
            this.D = null;
            this.J.notifyAll();
        }
    }

    public final void e(float f, float f2) {
        int i = this.B;
        int i2 = this.A;
        float f3 = i > i2 ? i : i2;
        this.y -= (f * 1.7453293f) / f3;
        float f4 = this.z - ((f2 * 1.7453293f) / f3);
        this.z = f4;
        if (f4 < -1.5707964f) {
            this.z = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.z = 1.5707964f;
        }
    }

    public final boolean f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.N;
        boolean z = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z = this.K.eglDestroySurface(this.L, this.N) | this.K.eglMakeCurrent(this.L, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.N = null;
        }
        EGLContext eGLContext = this.M;
        if (eGLContext != null) {
            z |= this.K.eglDestroyContext(this.L, eGLContext);
            this.M = null;
        }
        EGLDisplay eGLDisplay = this.L;
        if (eGLDisplay != null) {
            boolean eglTerminate = this.K.eglTerminate(eGLDisplay);
            this.L = null;
            return eglTerminate | z;
        }
        return z;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.G++;
        synchronized (this.J) {
            this.J.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.SurfaceTexture, android.graphics.SurfaceTexture$OnFrameAvailableListener] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.w24.run():void");
    }

    @Override // com.daaw.u24
    public final void zza() {
        synchronized (this.J) {
            this.J.notifyAll();
        }
    }
}
