package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.daaw.k7;
import java.io.File;
import java.io.OutputStream;
@TargetApi(17)
/* loaded from: classes.dex */
public class s7 {
    public File b;
    public l7 c;
    public wk1 d;
    public po0 f;
    public k7 g;
    public os1 h;
    public q40 i;
    public int j;
    public int k;
    public eg0 m;
    public ug1 a = null;
    public int l = 30;
    public nc1 n = new nc1(3);
    public Rect e = new Rect();

    public static long c(long j, int i) {
        return (j * 1000000) / i;
    }

    public static int d(long j, long j2) {
        return (int) ((j * j2) / 1000000);
    }

    public static int h(int i) {
        return n(i);
    }

    public static int i(int i) {
        return n(i);
    }

    public static String j() {
        return ".mp4";
    }

    public static String k() {
        return "video/mp4";
    }

    public static int n(int i) {
        int i2 = i % 16;
        return i2 == 0 ? i : (16 - i2) + i;
    }

    public boolean a(vk1 vk1Var, long j, int i) {
        String str;
        if (this.h != null && this.d != null) {
            EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
            EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
            EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
            EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (eglGetCurrentContext == null) {
                str = "oldEGLContext is null";
            } else {
                if (this.m == null) {
                    try {
                        this.m = new eg0(this.h.b(), eglGetCurrentContext);
                    } catch (Exception unused) {
                        return false;
                    }
                }
                if (!vk1Var.k()) {
                    return false;
                }
                try {
                    this.m.c();
                    this.m.e(j * 1000);
                    if (this.i == null) {
                        this.i = new q40();
                    }
                    GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
                    GLES20.glClear(16640);
                    this.e.set(0, 0, vk1Var.getWidth(), vk1Var.getHeight());
                    Rect rect = this.e;
                    GLES20.glViewport(rect.left, rect.top, rect.width(), this.e.height());
                    vk1Var.c();
                    this.i.d();
                    this.m.f();
                    if (EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface2, eglGetCurrentSurface, eglGetCurrentContext)) {
                        return true;
                    }
                    str = "EGL14.eglMakeCurrent failed";
                } catch (Exception unused2) {
                }
            }
            lz1.c(str);
            return false;
        }
        return false;
    }

    public void b(ke0 ke0Var, long j) {
        if (ke0Var.size() <= 0 || this.c == null || this.g == null) {
            return;
        }
        k7.a aVar = new k7.a();
        aVar.a = this.n.a(ke0Var.size(), 10L);
        int i = 0;
        while (true) {
            short[] sArr = aVar.a.a;
            if (i >= sArr.length) {
                aVar.b = sArr.length;
                aVar.c = j;
                this.c.d(aVar);
                return;
            }
            sArr[i] = ke0Var.get(i);
            i++;
        }
    }

    public boolean e(wf1 wf1Var) {
        lz1.c("### finish");
        this.d = null;
        eg0 eg0Var = this.m;
        if (eg0Var != null) {
            eg0Var.d();
            this.m = null;
        }
        ug1 ug1Var = this.a;
        boolean a = ug1Var != null ? ug1Var.a(wf1Var) : true;
        this.a = null;
        return a;
    }

    public void f() {
        wk1 wk1Var = this.d;
        if (wk1Var != null) {
            wk1Var.c();
        }
    }

    public int g() {
        k7 k7Var = this.g;
        if (k7Var == null) {
            return 2;
        }
        return k7Var.c();
    }

    public String l(File file, OutputStream outputStream, int i, int i2, int i3, float f, boolean z, float f2, int i4, int i5, String str, String str2, int i6) {
        if (outputStream != null) {
            this.a = new ug1(file, outputStream);
        }
        this.b = file;
        return o(z, i2, i3, Math.min(90.0f, Math.max(0.1f, f)), i, 5, f2, i4, i5, str, str2, i6);
    }

    public void m() {
        q40 q40Var = this.i;
        if (q40Var != null) {
            q40Var.b();
        }
        this.i = null;
    }

    public final String o(boolean z, int i, int i2, float f, int i3, int i4, float f2, int i5, int i6, String str, String str2, int i7) {
        StringBuilder sb;
        String str3;
        os1 os1Var;
        float f3 = f < 0.0f ? 4.0f : f;
        int i8 = i3 < 0 ? 30 : i3;
        int i9 = i4 < 0 ? 5 : i4;
        this.l = i8;
        this.k = i;
        this.j = i2;
        lz1.a("starting to record " + this.k + "x" + this.j);
        int i10 = (int) (f3 * 1000000.0f);
        int i11 = (int) (1000.0f * f2);
        try {
            this.f = new po0(this.b, z ? 2 : 1);
            double d = i8;
            Double.isNaN(d);
            long ceil = (long) Math.ceil(1000000.0d / d);
            if (z) {
                try {
                    this.g = new k7(this.f, i6, i5, i11, d(ceil, i6) + 8);
                } catch (Exception e) {
                    e = e;
                    sb = new StringBuilder();
                    str3 = "AudioEncoder: ";
                    sb.append(str3);
                    sb.append(e.toString());
                    return sb.toString();
                }
            }
            if (z) {
                try {
                    this.c = new l7(this.g);
                } catch (Exception e2) {
                    e = e2;
                    sb = new StringBuilder();
                    str3 = "AudioEncoderManager: ";
                    sb.append(str3);
                    sb.append(e.toString());
                    return sb.toString();
                }
            }
            try {
                os1Var = new os1(this.f, this.k, this.j, i10, i8, i9, str, str2, i7);
                this.h = os1Var;
            } catch (Exception e3) {
                e = e3;
                sb = new StringBuilder();
                str3 = "VideoEncoder: ";
            }
        } catch (Exception e4) {
            e = e4;
            sb = new StringBuilder();
            str3 = "MediaMuxer: ";
        }
        try {
            this.d = new wk1(os1Var);
            return null;
        } catch (Exception e5) {
            e = e5;
            sb = new StringBuilder();
            str3 = "TextureEncoder: ";
            sb.append(str3);
            sb.append(e.toString());
            return sb.toString();
        }
    }

    public boolean p(wf1 wf1Var) {
        wk1 wk1Var;
        if (this.d != null) {
            lz1.a("stopping video recorder, videoEncoder=" + this.d);
            if (this.d.f()) {
                this.d.g();
            }
        }
        if (this.c != null) {
            lz1.a("stopping audio recorder, videoEncoder=" + this.d);
            if (this.c.g()) {
                this.c.i();
            }
        }
        int i = 0;
        while (true) {
            l7 l7Var = this.c;
            if ((l7Var == null || !l7Var.g()) && ((wk1Var = this.d) == null || !wk1Var.f())) {
                break;
            }
            i++;
            if (i % 1000 == 0) {
                lz1.b(new RuntimeException("Waiting on .isRecording for " + (i / 100) + " seconds already"), "");
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                lz1.b(e, null);
            }
        }
        po0 po0Var = this.f;
        if (po0Var != null) {
            po0Var.c();
        }
        l7 l7Var2 = this.c;
        if (l7Var2 != null) {
            l7Var2.h(wf1Var);
        }
        return true;
    }
}
