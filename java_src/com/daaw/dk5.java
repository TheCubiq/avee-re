package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class dk5 extends xj5 {

    /* renamed from: g */
    public String f7217g;

    /* renamed from: h */
    public int f7218h = 1;

    public dk5(Context context) {
        this.f32772f = new pt3(context, zzt.zzt().zzb(), this, this);
    }

    @Override // com.daaw.xj5, com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        k04.zze("Cannot connect to remote service, fallback to local instance.");
        this.f32767a.m23796c(new pk5(1));
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        e14 e14Var;
        pk5 pk5Var;
        synchronized (this.f32768b) {
            if (!this.f32770d) {
                this.f32770d = true;
                try {
                    int i = this.f7218h;
                    if (i == 2) {
                        this.f32772f.m13149J().mo4523b2(this.f32771e, new wj5(this));
                    } else if (i == 3) {
                        this.f32772f.m13149J().mo4522j1(this.f7217g, new wj5(this));
                    } else {
                        this.f32767a.m23796c(new pk5(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    e14Var = this.f32767a;
                    pk5Var = new pk5(1);
                    e14Var.m23796c(pk5Var);
                } catch (Throwable th) {
                    zzt.zzo().m11902u(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    e14Var = this.f32767a;
                    pk5Var = new pk5(1);
                    e14Var.m23796c(pk5Var);
                }
            }
        }
    }

    /* renamed from: b */
    public final f77 m24298b(zzccb zzccbVar) {
        synchronized (this.f32768b) {
            int i = this.f7218h;
            if (i != 1 && i != 2) {
                return s67.m10635h(new pk5(2));
            } else if (this.f32769c) {
                return this.f32767a;
            } else {
                this.f7218h = 2;
                this.f32769c = true;
                this.f32771e = zzccbVar;
                this.f32772f.checkAvailabilityAndConnect();
                this.f32767a.mo6515f(new Runnable() { // from class: com.daaw.ck5
                    @Override // java.lang.Runnable
                    public final void run() {
                        dk5.this.m5043a();
                    }
                }, z04.f34310f);
                return this.f32767a;
            }
        }
    }

    /* renamed from: c */
    public final f77 m24297c(String str) {
        synchronized (this.f32768b) {
            int i = this.f7218h;
            if (i != 1 && i != 3) {
                return s67.m10635h(new pk5(2));
            } else if (this.f32769c) {
                return this.f32767a;
            } else {
                this.f7218h = 3;
                this.f32769c = true;
                this.f7217g = str;
                this.f32772f.checkAvailabilityAndConnect();
                this.f32767a.mo6515f(new Runnable() { // from class: com.daaw.bk5
                    @Override // java.lang.Runnable
                    public final void run() {
                        dk5.this.m5043a();
                    }
                }, z04.f34310f);
                return this.f32767a;
            }
        }
    }
}
