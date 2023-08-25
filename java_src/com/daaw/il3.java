package com.daaw;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class il3 extends l14 {
    public final zzbb d;
    public final Object c = new Object();
    public boolean e = false;
    public int f = 0;

    public il3(zzbb zzbbVar) {
        this.d = zzbbVar;
    }

    public final al3 f() {
        al3 al3Var = new al3(this);
        synchronized (this.c) {
            e(new el3(this, al3Var), new fl3(this, al3Var));
            ry0.m(this.f >= 0);
            this.f++;
        }
        return al3Var;
    }

    public final void g() {
        synchronized (this.c) {
            ry0.m(this.f >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            h();
        }
    }

    public final void h() {
        synchronized (this.c) {
            ry0.m(this.f >= 0);
            if (this.e && this.f == 0) {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                e(new hl3(this), new h14());
            } else {
                zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }

    public final void i() {
        synchronized (this.c) {
            ry0.m(this.f > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            this.f--;
            h();
        }
    }
}
