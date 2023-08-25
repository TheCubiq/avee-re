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

    /* renamed from: r */
    public static boolean f36824r;

    /* renamed from: s */
    public static boolean f36825s;

    /* renamed from: p */
    public final wz2 f36826p;

    /* renamed from: q */
    public boolean f36827q;

    public /* synthetic */ zzbbe(wz2 wz2Var, SurfaceTexture surfaceTexture, boolean z, xz2 xz2Var) {
        super(surfaceTexture);
        this.f36826p = wz2Var;
    }

    /* renamed from: a */
    public static zzbbe m1115a(Context context, boolean z) {
        if (pz2.f23547a >= 17) {
            boolean z2 = true;
            if (z && !m1114b(context)) {
                z2 = false;
            }
            az2.m26583e(z2);
            return new wz2().m5679a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    /* renamed from: b */
    public static synchronized boolean m1114b(Context context) {
        boolean z;
        synchronized (zzbbe.class) {
            if (!f36825s) {
                int i = pz2.f23547a;
                if (i >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i == 24) {
                            String str = pz2.f23550d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z2 = true;
                    }
                    f36824r = z2;
                }
                f36825s = true;
            }
            z = f36824r;
        }
        return z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f36826p) {
            if (!this.f36827q) {
                this.f36826p.m5678b();
                this.f36827q = true;
            }
        }
    }
}
