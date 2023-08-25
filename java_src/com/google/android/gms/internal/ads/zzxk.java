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
    public static int s;
    public static boolean t;
    public final boolean p;
    public final tx8 q;
    public boolean r;

    public /* synthetic */ zzxk(tx8 tx8Var, SurfaceTexture surfaceTexture, boolean z, ux8 ux8Var) {
        super(surfaceTexture);
        this.q = tx8Var;
        this.p = z;
    }

    public static zzxk a(Context context, boolean z) {
        boolean z2 = true;
        if (z && !b(context)) {
            z2 = false;
        }
        uo4.f(z2);
        return new tx8().a(z ? s : 0);
    }

    public static synchronized boolean b(Context context) {
        int i;
        String eglQueryString;
        synchronized (zzxk.class) {
            if (!t) {
                int i2 = it5.a;
                int i3 = 2;
                if (i2 >= 24 && ((i2 >= 26 || (!"samsung".equals(it5.c) && !"XT1650".equals(it5.d))) && ((i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i3 = 1;
                    }
                    s = i3;
                    t = true;
                }
                i3 = 0;
                s = i3;
                t = true;
            }
            i = s;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.q) {
            if (!this.r) {
                this.q.b();
                this.r = true;
            }
        }
    }
}
