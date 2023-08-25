package com.daaw;

import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
/* loaded from: classes.dex */
public final class il3 extends l14 {

    /* renamed from: d */
    public final zzbb f13771d;

    /* renamed from: c */
    public final Object f13770c = new Object();

    /* renamed from: e */
    public boolean f13772e = false;

    /* renamed from: f */
    public int f13773f = 0;

    public il3(zzbb zzbbVar) {
        this.f13771d = zzbbVar;
    }

    /* renamed from: f */
    public final al3 m19661f() {
        al3 al3Var = new al3(this);
        synchronized (this.f13770c) {
            m17206e(new el3(this, al3Var), new fl3(this, al3Var));
            ry0.m10827m(this.f13773f >= 0);
            this.f13773f++;
        }
        return al3Var;
    }

    /* renamed from: g */
    public final void m19660g() {
        synchronized (this.f13770c) {
            ry0.m10827m(this.f13773f >= 0);
            zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f13772e = true;
            m19659h();
        }
    }

    /* renamed from: h */
    public final void m19659h() {
        synchronized (this.f13770c) {
            ry0.m10827m(this.f13773f >= 0);
            if (this.f13772e && this.f13773f == 0) {
                zze.zza("No reference is left (including root). Cleaning up engine.");
                m17206e(new hl3(this), new h14());
            } else {
                zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }

    /* renamed from: i */
    public final void m19658i() {
        synchronized (this.f13770c) {
            ry0.m10827m(this.f13773f > 0);
            zze.zza("Releasing 1 reference for JS Engine");
            this.f13773f--;
            m19659h();
        }
    }
}
