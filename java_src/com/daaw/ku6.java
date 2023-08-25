package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class ku6 {
    public final nu6 a;
    public final boolean b;

    public ku6(nu6 nu6Var) {
        this.a = nu6Var;
        this.b = nu6Var != null;
    }

    public static ku6 b(Context context, String str, String str2) {
        nu6 lu6Var;
        try {
            try {
                try {
                    IBinder d = DynamiteModule.e(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d == null) {
                        lu6Var = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        lu6Var = queryLocalInterface instanceof nu6 ? (nu6) queryLocalInterface : new lu6(d);
                    }
                    lu6Var.p2(nt0.g3(context), str, null);
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

    public static ku6 c() {
        return new ku6(new ou6());
    }

    public final ju6 a(byte[] bArr) {
        return new ju6(this, bArr, null);
    }
}
