package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class ku6 {

    /* renamed from: a */
    public final nu6 f16753a;

    /* renamed from: b */
    public final boolean f16754b;

    public ku6(nu6 nu6Var) {
        this.f16753a = nu6Var;
        this.f16754b = nu6Var != null;
    }

    /* renamed from: b */
    public static ku6 m17428b(Context context, String str, String str2) {
        nu6 lu6Var;
        try {
            try {
                try {
                    IBinder m1146d = DynamiteModule.m1145e(context, DynamiteModule.f36678b, ModuleDescriptor.MODULE_ID).m1146d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (m1146d == null) {
                        lu6Var = null;
                    } else {
                        IInterface queryLocalInterface = m1146d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        lu6Var = queryLocalInterface instanceof nu6 ? (nu6) queryLocalInterface : new lu6(m1146d);
                    }
                    lu6Var.mo13925p2(nt0.m14830g3(context), str, null);
                    return new ku6(lu6Var);
                } catch (Exception e) {
                    throw new ot6(e);
                }
            } catch (Exception e2) {
                throw new ot6(e2);
            }
        } catch (RemoteException | ot6 | NullPointerException | SecurityException unused) {
            return new ku6(new ou6());
        }
    }

    /* renamed from: c */
    public static ku6 m17427c() {
        return new ku6(new ou6());
    }

    /* renamed from: a */
    public final ju6 m17429a(byte[] bArr) {
        return new ju6(this, bArr, null);
    }
}
