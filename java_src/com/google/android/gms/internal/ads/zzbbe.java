package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.daaw.az2;
import com.daaw.pz2;
import com.daaw.wz2;
import com.daaw.xz2;
@TargetApi(17)
/* loaded from: classes.dex */
public final class zzbbe extends Surface {
    public static boolean r;
    public static boolean s;
    public final wz2 p;
    public boolean q;

    public /* synthetic */ zzbbe(wz2 wz2Var, SurfaceTexture surfaceTexture, boolean z, xz2 xz2Var) {
        super(surfaceTexture);
        this.p = wz2Var;
    }

    public static zzbbe a(Context context, boolean z) {
        if (pz2.a >= 17) {
            boolean z2 = true;
            if (z && !b(context)) {
                z2 = false;
            }
            az2.e(z2);
            return new wz2().a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (zzbbe.class) {
            if (!s) {
                int i = pz2.a;
                if (i >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i == 24) {
                            String str = pz2.d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z2 = true;
                    }
                    r = z2;
                }
                s = true;
            }
            z = r;
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.p) {
            if (!this.q) {
                this.p.b();
                this.q = true;
            }
        }
    }
}
