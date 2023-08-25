package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.daaw.it5;
import com.daaw.tx8;
import com.daaw.uo4;
import com.daaw.ux8;
/* loaded from: classes.dex */
public final class zzxk extends Surface {

    /* renamed from: s */
    public static int f37036s;

    /* renamed from: t */
    public static boolean f37037t;

    /* renamed from: p */
    public final boolean f37038p;

    /* renamed from: q */
    public final tx8 f37039q;

    /* renamed from: r */
    public boolean f37040r;

    public /* synthetic */ zzxk(tx8 tx8Var, SurfaceTexture surfaceTexture, boolean z, ux8 ux8Var) {
        super(surfaceTexture);
        this.f37039q = tx8Var;
        this.f37038p = z;
    }

    /* renamed from: a */
    public static zzxk m1088a(Context context, boolean z) {
        boolean z2 = true;
        if (z && !m1087b(context)) {
            z2 = false;
        }
        uo4.m7872f(z2);
        return new tx8().m8706a(z ? f37036s : 0);
    }

    /* renamed from: b */
    public static synchronized boolean m1087b(Context context) {
        int i;
        String eglQueryString;
        synchronized (zzxk.class) {
            if (!f37037t) {
                int i2 = it5.f13991a;
                int i3 = 2;
                if (i2 >= 24 && ((i2 >= 26 || (!"samsung".equals(it5.f13993c) && !"XT1650".equals(it5.f13994d))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i3 = 1;
                    }
                    f37036s = i3;
                    f37037t = true;
                }
                i3 = 0;
                f37036s = i3;
                f37037t = true;
            }
            i = f37036s;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f37039q) {
            if (!this.f37040r) {
                this.f37039q.m8705b();
                this.f37040r = true;
            }
        }
    }
}
