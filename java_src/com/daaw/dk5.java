package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class dk5 extends xj5 {
    public String g;
    public int h = 1;

    public dk5(Context context) {
        this.f = new pt3(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.daaw.xj5, com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        k04.zze("Cannot connect to remote service, fallback to local instance.");
        this.a.c(new pk5(1));
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        e14 e14Var;
        pk5 pk5Var;
        synchronized (this.b) {
            if (!this.d) {
                this.d = true;
                try {
                    int i = this.h;
                    if (i == 2) {
                        this.f.J().b2(this.e, new wj5(this));
                    } else if (i == 3) {
                        this.f.J().j1(this.g, new wj5(this));
                    } else {
                        this.a.c(new pk5(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    e14Var = this.a;
                    pk5Var = new pk5(1);
                    e14Var.c(pk5Var);
                } catch (Throwable th) {
                    zzt.zzo().u(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    e14Var = this.a;
                    pk5Var = new pk5(1);
                    e14Var.c(pk5Var);
                }
            }
        }
    }

    public final f77 b(zzccb zzccbVar) {
        synchronized (this.b) {
            int i = this.h;
            if (i != 1 && i != 2) {
                return s67.h(new pk5(2));
            } else if (this.c) {
                return this.a;
            } else {
                this.h = 2;
                this.c = true;
                this.e = zzccbVar;
                this.f.checkAvailabilityAndConnect();
                this.a.f(new Runnable() { // from class: com.daaw.ck5
                    @Override // java.lang.Runnable
                    public final void run() {
                        dk5.this.a();
                    }
                }, z04.f);
                return this.a;
            }
        }
    }

    public final f77 c(String str) {
        synchronized (this.b) {
            int i = this.h;
            if (i != 1 && i != 3) {
                return s67.h(new pk5(2));
            } else if (this.c) {
                return this.a;
            } else {
                this.h = 3;
                this.c = true;
                this.g = str;
                this.f.checkAvailabilityAndConnect();
                this.a.f(new Runnable() { // from class: com.daaw.bk5
                    @Override // java.lang.Runnable
                    public final void run() {
                        dk5.this.a();
                    }
                }, z04.f);
                return this.a;
            }
        }
    }
}
