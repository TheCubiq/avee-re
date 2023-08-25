package com.daaw;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
/* loaded from: classes.dex */
public final class w24 extends Thread implements SurfaceTexture.OnFrameAvailableListener, u24 {

    /* renamed from: Q */
    public static final float[] f30820Q = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    public int f30821A;

    /* renamed from: B */
    public int f30822B;

    /* renamed from: C */
    public SurfaceTexture f30823C;

    /* renamed from: D */
    public SurfaceTexture f30824D;

    /* renamed from: E */
    public int f30825E;

    /* renamed from: F */
    public int f30826F;

    /* renamed from: G */
    public int f30827G;

    /* renamed from: H */
    public final FloatBuffer f30828H;

    /* renamed from: I */
    public final CountDownLatch f30829I;

    /* renamed from: J */
    public final Object f30830J;

    /* renamed from: K */
    public EGL10 f30831K;

    /* renamed from: L */
    public EGLDisplay f30832L;

    /* renamed from: M */
    public EGLContext f30833M;

    /* renamed from: N */
    public EGLSurface f30834N;

    /* renamed from: O */
    public volatile boolean f30835O;

    /* renamed from: P */
    public volatile boolean f30836P;

    /* renamed from: p */
    public final v24 f30837p;

    /* renamed from: q */
    public final float[] f30838q;

    /* renamed from: r */
    public final float[] f30839r;

    /* renamed from: s */
    public final float[] f30840s;

    /* renamed from: t */
    public final float[] f30841t;

    /* renamed from: u */
    public final float[] f30842u;

    /* renamed from: v */
    public final float[] f30843v;

    /* renamed from: w */
    public final float[] f30844w;

    /* renamed from: x */
    public float f30845x;

    /* renamed from: y */
    public float f30846y;

    /* renamed from: z */
    public float f30847z;

    public w24(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f30820Q;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f30828H = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f30838q = new float[9];
        this.f30839r = new float[9];
        this.f30840s = new float[9];
        this.f30841t = new float[9];
        this.f30842u = new float[9];
        this.f30843v = new float[9];
        this.f30844w = new float[9];
        this.f30845x = Float.NaN;
        v24 v24Var = new v24(context);
        this.f30837p = v24Var;
        v24Var.m7544a(this);
        this.f30829I = new CountDownLatch(1);
        this.f30830J = new Object();
    }

    /* renamed from: g */
    public static final void m6573g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
        }
    }

    /* renamed from: h */
    public static final void m6572h(float[] fArr, float[] fArr2, float[] fArr3) {
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

    /* renamed from: i */
    public static final void m6571i(float[] fArr, float f) {
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

    /* renamed from: j */
    public static final void m6570j(float[] fArr, float f) {
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

    /* renamed from: k */
    public static final int m6569k(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m6573g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            m6573g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            m6573g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            m6573g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                m6573g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    /* renamed from: a */
    public final SurfaceTexture m6579a() {
        if (this.f30824D == null) {
            return null;
        }
        try {
            this.f30829I.await();
        } catch (InterruptedException unused) {
        }
        return this.f30823C;
    }

    /* renamed from: b */
    public final void m6578b(int i, int i2) {
        synchronized (this.f30830J) {
            this.f30822B = i;
            this.f30821A = i2;
            this.f30835O = true;
            this.f30830J.notifyAll();
        }
    }

    /* renamed from: c */
    public final void m6577c(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f30822B = i;
        this.f30821A = i2;
        this.f30824D = surfaceTexture;
    }

    /* renamed from: d */
    public final void m6576d() {
        synchronized (this.f30830J) {
            this.f30836P = true;
            this.f30824D = null;
            this.f30830J.notifyAll();
        }
    }

    /* renamed from: e */
    public final void m6575e(float f, float f2) {
        int i = this.f30822B;
        int i2 = this.f30821A;
        float f3 = i > i2 ? i : i2;
        this.f30846y -= (f * 1.7453293f) / f3;
        float f4 = this.f30847z - ((f2 * 1.7453293f) / f3);
        this.f30847z = f4;
        if (f4 < -1.5707964f) {
            this.f30847z = -1.5707964f;
            f4 = -1.5707964f;
        }
        if (f4 > 1.5707964f) {
            this.f30847z = 1.5707964f;
        }
    }

    /* renamed from: f */
    public final boolean m6574f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f30834N;
        boolean z = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z = this.f30831K.eglDestroySurface(this.f30832L, this.f30834N) | this.f30831K.eglMakeCurrent(this.f30832L, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f30834N = null;
        }
        EGLContext eGLContext = this.f30833M;
        if (eGLContext != null) {
            z |= this.f30831K.eglDestroyContext(this.f30832L, eGLContext);
            this.f30833M = null;
        }
        EGLDisplay eGLDisplay = this.f30832L;
        if (eGLDisplay != null) {
            boolean eglTerminate = this.f30831K.eglTerminate(eGLDisplay);
            this.f30832L = null;
            return eglTerminate | z;
        }
        return z;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f30827G++;
        synchronized (this.f30830J) {
            this.f30830J.notifyAll();
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
    */
    public final void run() {
        boolean z;
        int m6569k;
        int glCreateProgram;
        if (this.f30824D == null) {
            k04.zzg("SphericalVideoProcessor started with no output texture.");
            this.f30829I.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f30831K = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f30832L = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY && this.f30831K.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.f30831K.eglChooseConfig(this.f30832L, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig != null) {
                EGLContext eglCreateContext = this.f30831K.eglCreateContext(this.f30832L, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f30833M = eglCreateContext;
                if (eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                    EGLSurface eglCreateWindowSurface = this.f30831K.eglCreateWindowSurface(this.f30832L, eGLConfig, this.f30824D, null);
                    this.f30834N = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.f30831K.eglMakeCurrent(this.f30832L, eglCreateWindowSurface, eglCreateWindowSurface, this.f30833M)) {
                        z = true;
                        y83 y83Var = g93.f10645c1;
                        m6569k = m6569k(35633, ((String) zzba.zzc().m23658b(y83Var)).equals(y83Var.m4003m()) ? (String) zzba.zzc().m23658b(y83Var) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                        if (m6569k != 0) {
                            y83 y83Var2 = g93.f10656d1;
                            int m6569k2 = m6569k(35632, !((String) zzba.zzc().m23658b(y83Var2)).equals(y83Var2.m4003m()) ? (String) zzba.zzc().m23658b(y83Var2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                            if (m6569k2 != 0) {
                                glCreateProgram = GLES20.glCreateProgram();
                                m6573g("createProgram");
                                if (glCreateProgram != 0) {
                                    GLES20.glAttachShader(glCreateProgram, m6569k);
                                    m6573g("attachShader");
                                    GLES20.glAttachShader(glCreateProgram, m6569k2);
                                    m6573g("attachShader");
                                    GLES20.glLinkProgram(glCreateProgram);
                                    m6573g("linkProgram");
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                    m6573g("getProgramiv");
                                    if (iArr2[0] != 1) {
                                        GLES20.glGetProgramInfoLog(glCreateProgram);
                                        GLES20.glDeleteProgram(glCreateProgram);
                                        m6573g("deleteProgram");
                                    } else {
                                        GLES20.glValidateProgram(glCreateProgram);
                                        m6573g("validateProgram");
                                    }
                                }
                                this.f30825E = glCreateProgram;
                                GLES20.glUseProgram(glCreateProgram);
                                m6573g("useProgram");
                                int glGetAttribLocation = GLES20.glGetAttribLocation(this.f30825E, "aPosition");
                                GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f30828H);
                                m6573g("vertexAttribPointer");
                                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                m6573g("enableVertexAttribArray");
                                int[] iArr3 = new int[1];
                                GLES20.glGenTextures(1, iArr3, 0);
                                m6573g("genTextures");
                                int i = iArr3[0];
                                GLES20.glBindTexture(36197, i);
                                m6573g("bindTextures");
                                GLES20.glTexParameteri(36197, 10240, 9729);
                                m6573g("texParameteri");
                                GLES20.glTexParameteri(36197, 10241, 9729);
                                m6573g("texParameteri");
                                GLES20.glTexParameteri(36197, 10242, 33071);
                                m6573g("texParameteri");
                                GLES20.glTexParameteri(36197, 10243, 33071);
                                m6573g("texParameteri");
                                int glGetUniformLocation = GLES20.glGetUniformLocation(this.f30825E, "uVMat");
                                this.f30826F = glGetUniformLocation;
                                GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                int i2 = this.f30825E;
                                if (z || i2 == 0) {
                                    String concat = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f30831K.eglGetError())));
                                    k04.zzg(concat);
                                    zzt.zzo().m11902u(new Throwable(concat), "SphericalVideoProcessor.run.1");
                                    m6574f();
                                    this.f30829I.countDown();
                                }
                                SurfaceTexture surfaceTexture = new SurfaceTexture(i);
                                this.f30823C = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                this.f30829I.countDown();
                                this.f30837p.m7543b();
                                try {
                                    try {
                                        this.f30835O = true;
                                        while (!this.f30836P) {
                                            while (this.f30827G > 0) {
                                                this.f30823C.updateTexImage();
                                                this.f30827G--;
                                            }
                                            if (this.f30837p.m7541d(this.f30838q)) {
                                                if (Float.isNaN(this.f30845x)) {
                                                    float[] fArr = this.f30838q;
                                                    float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                                    float f = fArr[0];
                                                    float f2 = fArr2[0];
                                                    float f3 = fArr[1];
                                                    float f4 = fArr2[1];
                                                    float f5 = (f * f2) + (f3 * f4);
                                                    float f6 = fArr[2];
                                                    float f7 = fArr2[2];
                                                    float[] fArr3 = {f5 + (f6 * f7), (fArr[3] * f2) + (fArr[4] * f4) + (fArr[5] * f7), (fArr[6] * f2) + (fArr[7] * f4) + (fArr[8] * f7)};
                                                    this.f30845x = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                }
                                                m6570j(this.f30843v, this.f30845x + this.f30846y);
                                            } else {
                                                m6571i(this.f30838q, -1.5707964f);
                                                m6570j(this.f30843v, this.f30846y);
                                            }
                                            m6571i(this.f30839r, 1.5707964f);
                                            m6572h(this.f30840s, this.f30843v, this.f30839r);
                                            m6572h(this.f30841t, this.f30838q, this.f30840s);
                                            m6571i(this.f30842u, this.f30847z);
                                            m6572h(this.f30844w, this.f30842u, this.f30841t);
                                            GLES20.glUniformMatrix3fv(this.f30826F, 1, false, this.f30844w, 0);
                                            GLES20.glDrawArrays(5, 0, 4);
                                            m6573g("drawArrays");
                                            GLES20.glFinish();
                                            this.f30831K.eglSwapBuffers(this.f30832L, this.f30834N);
                                            if (this.f30835O) {
                                                GLES20.glViewport(0, 0, this.f30822B, this.f30821A);
                                                m6573g("viewport");
                                                int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f30825E, "uFOVx");
                                                int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f30825E, "uFOVy");
                                                int i3 = this.f30822B;
                                                int i4 = this.f30821A;
                                                if (i3 > i4) {
                                                    GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                    GLES20.glUniform1f(glGetUniformLocation3, (this.f30821A * 0.87266463f) / this.f30822B);
                                                } else {
                                                    GLES20.glUniform1f(glGetUniformLocation2, (i3 * 0.87266463f) / i4);
                                                    GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                }
                                                this.f30835O = false;
                                            }
                                            try {
                                                synchronized (this.f30830J) {
                                                    if (!this.f30836P && !this.f30835O && this.f30827G == 0) {
                                                        this.f30830J.wait();
                                                    }
                                                }
                                            } catch (InterruptedException unused) {
                                            }
                                        }
                                        return;
                                    } finally {
                                        this.f30837p.m7542c();
                                        this.f30823C.setOnFrameAvailableListener(null);
                                        this.f30823C = null;
                                        m6574f();
                                    }
                                } catch (IllegalStateException unused2) {
                                    k04.zzj("SphericalVideoProcessor halted unexpectedly.");
                                    return;
                                } catch (Throwable th) {
                                    k04.zzh("SphericalVideoProcessor died.", th);
                                    zzt.zzo().m11902u(th, "SphericalVideoProcessor.run.2");
                                    return;
                                }
                            }
                        }
                        glCreateProgram = 0;
                        this.f30825E = glCreateProgram;
                        GLES20.glUseProgram(glCreateProgram);
                        m6573g("useProgram");
                        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f30825E, "aPosition");
                        GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.f30828H);
                        m6573g("vertexAttribPointer");
                        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                        m6573g("enableVertexAttribArray");
                        int[] iArr32 = new int[1];
                        GLES20.glGenTextures(1, iArr32, 0);
                        m6573g("genTextures");
                        int i5 = iArr32[0];
                        GLES20.glBindTexture(36197, i5);
                        m6573g("bindTextures");
                        GLES20.glTexParameteri(36197, 10240, 9729);
                        m6573g("texParameteri");
                        GLES20.glTexParameteri(36197, 10241, 9729);
                        m6573g("texParameteri");
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        m6573g("texParameteri");
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        m6573g("texParameteri");
                        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f30825E, "uVMat");
                        this.f30826F = glGetUniformLocation4;
                        GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                        int i22 = this.f30825E;
                        if (z) {
                        }
                        String concat2 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f30831K.eglGetError())));
                        k04.zzg(concat2);
                        zzt.zzo().m11902u(new Throwable(concat2), "SphericalVideoProcessor.run.1");
                        m6574f();
                        this.f30829I.countDown();
                    }
                }
            }
        }
        z = false;
        y83 y83Var3 = g93.f10645c1;
        m6569k = m6569k(35633, ((String) zzba.zzc().m23658b(y83Var3)).equals(y83Var3.m4003m()) ? (String) zzba.zzc().m23658b(y83Var3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (m6569k != 0) {
        }
        glCreateProgram = 0;
        this.f30825E = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        m6573g("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.f30825E, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.f30828H);
        m6573g("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        m6573g("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        m6573g("genTextures");
        int i52 = iArr322[0];
        GLES20.glBindTexture(36197, i52);
        m6573g("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        m6573g("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        m6573g("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        m6573g("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        m6573g("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.f30825E, "uVMat");
        this.f30826F = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i222 = this.f30825E;
        if (z) {
        }
        String concat22 = "EGL initialization failed: ".concat(String.valueOf(GLUtils.getEGLErrorString(this.f30831K.eglGetError())));
        k04.zzg(concat22);
        zzt.zzo().m11902u(new Throwable(concat22), "SphericalVideoProcessor.run.1");
        m6574f();
        this.f30829I.countDown();
    }

    @Override // com.daaw.u24
    public final void zza() {
        synchronized (this.f30830J) {
            this.f30830J.notifyAll();
        }
    }
}
