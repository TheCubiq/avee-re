package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.daaw.C1914k7;
import java.io.File;
import java.io.OutputStream;
@TargetApi(17)
/* renamed from: com.daaw.s7 */
/* loaded from: classes.dex */
public class C2916s7 {

    /* renamed from: b */
    public File f25936b;

    /* renamed from: c */
    public RunnableC2015l7 f25937c;

    /* renamed from: d */
    public wk1 f25938d;

    /* renamed from: f */
    public po0 f25940f;

    /* renamed from: g */
    public C1914k7 f25941g;

    /* renamed from: h */
    public os1 f25942h;

    /* renamed from: i */
    public q40 f25943i;

    /* renamed from: j */
    public int f25944j;

    /* renamed from: k */
    public int f25945k;

    /* renamed from: m */
    public eg0 f25947m;

    /* renamed from: a */
    public ug1 f25935a = null;

    /* renamed from: l */
    public int f25946l = 30;

    /* renamed from: n */
    public nc1 f25948n = new nc1(3);

    /* renamed from: e */
    public Rect f25939e = new Rect();

    /* renamed from: c */
    public static long m10622c(long j, int i) {
        return (j * 1000000) / i;
    }

    /* renamed from: d */
    public static int m10621d(long j, long j2) {
        return (int) ((j * j2) / 1000000);
    }

    /* renamed from: h */
    public static int m10617h(int i) {
        return m10611n(i);
    }

    /* renamed from: i */
    public static int m10616i(int i) {
        return m10611n(i);
    }

    /* renamed from: j */
    public static String m10615j() {
        return ".mp4";
    }

    /* renamed from: k */
    public static String m10614k() {
        return "video/mp4";
    }

    /* renamed from: n */
    public static int m10611n(int i) {
        int i2 = i % 16;
        return i2 == 0 ? i : (16 - i2) + i;
    }

    /* renamed from: a */
    public boolean m10624a(vk1 vk1Var, long j, int i) {
        String str;
        if (this.f25942h != null && this.f25938d != null) {
            EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
            EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
            EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
            EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (eglGetCurrentContext == null) {
                str = "oldEGLContext is null";
            } else {
                if (this.f25947m == null) {
                    try {
                        this.f25947m = new eg0(this.f25942h.m14016b(), eglGetCurrentContext);
                    } catch (Exception unused) {
                        return false;
                    }
                }
                if (!vk1Var.m7086k()) {
                    return false;
                }
                try {
                    this.f25947m.m23480c();
                    this.f25947m.m23478e(j * 1000);
                    if (this.f25943i == null) {
                        this.f25943i = new q40();
                    }
                    GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
                    GLES20.glClear(16640);
                    this.f25939e.set(0, 0, vk1Var.getWidth(), vk1Var.getHeight());
                    Rect rect = this.f25939e;
                    GLES20.glViewport(rect.left, rect.top, rect.width(), this.f25939e.height());
                    vk1Var.m7094c();
                    this.f25943i.m12780d();
                    this.f25947m.m23477f();
                    if (EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface2, eglGetCurrentSurface, eglGetCurrentContext)) {
                        return true;
                    }
                    str = "EGL14.eglMakeCurrent failed";
                } catch (Exception unused2) {
                }
            }
            lz1.m16363c(str);
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m10623b(ke0 ke0Var, long j) {
        if (ke0Var.size() <= 0 || this.f25937c == null || this.f25941g == null) {
            return;
        }
        C1914k7.C1915a c1915a = new C1914k7.C1915a();
        c1915a.f15725a = this.f25948n.m15246a(ke0Var.size(), 10L);
        int i = 0;
        while (true) {
            short[] sArr = c1915a.f15725a.f20017a;
            if (i >= sArr.length) {
                c1915a.f15726b = sArr.length;
                c1915a.f15727c = j;
                this.f25937c.m17116d(c1915a);
                return;
            }
            sArr[i] = ke0Var.get(i);
            i++;
        }
    }

    /* renamed from: e */
    public boolean m10620e(wf1 wf1Var) {
        lz1.m16363c("### finish");
        this.f25938d = null;
        eg0 eg0Var = this.f25947m;
        if (eg0Var != null) {
            eg0Var.m23479d();
            this.f25947m = null;
        }
        ug1 ug1Var = this.f25935a;
        boolean m8254a = ug1Var != null ? ug1Var.m8254a(wf1Var) : true;
        this.f25935a = null;
        return m8254a;
    }

    /* renamed from: f */
    public void m10619f() {
        wk1 wk1Var = this.f25938d;
        if (wk1Var != null) {
            wk1Var.m6035c();
        }
    }

    /* renamed from: g */
    public int m10618g() {
        C1914k7 c1914k7 = this.f25941g;
        if (c1914k7 == null) {
            return 2;
        }
        return c1914k7.m18012c();
    }

    /* renamed from: l */
    public String m10613l(File file, OutputStream outputStream, int i, int i2, int i3, float f, boolean z, float f2, int i4, int i5, String str, String str2, int i6) {
        if (outputStream != null) {
            this.f25935a = new ug1(file, outputStream);
        }
        this.f25936b = file;
        return m10610o(z, i2, i3, Math.min(90.0f, Math.max(0.1f, f)), i, 5, f2, i4, i5, str, str2, i6);
    }

    /* renamed from: m */
    public void m10612m() {
        q40 q40Var = this.f25943i;
        if (q40Var != null) {
            q40Var.m12782b();
        }
        this.f25943i = null;
    }

    /* renamed from: o */
    public final String m10610o(boolean z, int i, int i2, float f, int i3, int i4, float f2, int i5, int i6, String str, String str2, int i7) {
        StringBuilder sb;
        String str3;
        os1 os1Var;
        float f3 = f < 0.0f ? 4.0f : f;
        int i8 = i3 < 0 ? 30 : i3;
        int i9 = i4 < 0 ? 5 : i4;
        this.f25946l = i8;
        this.f25945k = i;
        this.f25944j = i2;
        lz1.m16365a("starting to record " + this.f25945k + "x" + this.f25944j);
        int i10 = (int) (f3 * 1000000.0f);
        int i11 = (int) (1000.0f * f2);
        try {
            this.f25940f = new po0(this.f25936b, z ? 2 : 1);
            double d = i8;
            Double.isNaN(d);
            long ceil = (long) Math.ceil(1000000.0d / d);
            if (z) {
                try {
                    this.f25941g = new C1914k7(this.f25940f, i6, i5, i11, m10621d(ceil, i6) + 8);
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
                    this.f25937c = new RunnableC2015l7(this.f25941g);
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
                os1Var = new os1(this.f25940f, this.f25945k, this.f25944j, i10, i8, i9, str, str2, i7);
                this.f25942h = os1Var;
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
            this.f25938d = new wk1(os1Var);
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

    /* renamed from: p */
    public boolean m10609p(wf1 wf1Var) {
        wk1 wk1Var;
        if (this.f25938d != null) {
            lz1.m16365a("stopping video recorder, videoEncoder=" + this.f25938d);
            if (this.f25938d.m6032f()) {
                this.f25938d.m6031g();
            }
        }
        if (this.f25937c != null) {
            lz1.m16365a("stopping audio recorder, videoEncoder=" + this.f25938d);
            if (this.f25937c.m17113g()) {
                this.f25937c.m17111i();
            }
        }
        int i = 0;
        while (true) {
            RunnableC2015l7 runnableC2015l7 = this.f25937c;
            if ((runnableC2015l7 == null || !runnableC2015l7.m17113g()) && ((wk1Var = this.f25938d) == null || !wk1Var.m6032f())) {
                break;
            }
            i++;
            if (i % 1000 == 0) {
                lz1.m16364b(new RuntimeException("Waiting on .isRecording for " + (i / 100) + " seconds already"), "");
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                lz1.m16364b(e, null);
            }
        }
        po0 po0Var = this.f25940f;
        if (po0Var != null) {
            po0Var.m13260c();
        }
        RunnableC2015l7 runnableC2015l72 = this.f25937c;
        if (runnableC2015l72 != null) {
            runnableC2015l72.m17112h(wf1Var);
        }
        return true;
    }
}
