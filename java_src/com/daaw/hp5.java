package com.daaw;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class hp5 extends ip5 {
    public static final SparseArray h;
    public final Context c;
    public final op4 d;
    public final TelephonyManager e;
    public final zo5 f;
    public int g;

    static {
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), x63.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        x63 x63Var = x63.CONNECTING;
        sparseArray.put(ordinal, x63Var);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), x63Var);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), x63Var);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), x63.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        x63 x63Var2 = x63.DISCONNECTED;
        sparseArray.put(ordinal2, x63Var2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), x63Var2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), x63Var2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), x63Var2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), x63Var2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), x63.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), x63Var);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), x63Var);
    }

    public hp5(Context context, op4 op4Var, zo5 zo5Var, so5 so5Var, zzg zzgVar) {
        super(so5Var, zzgVar);
        this.c = context;
        this.d = op4Var;
        this.f = zo5Var;
        this.e = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ o63 b(hp5 hp5Var, Bundle bundle) {
        c63 L = o63.L();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            hp5Var.g = 2;
        } else {
            hp5Var.g = 1;
            if (i == 0) {
                L.t(2);
            } else if (i != 1) {
                L.t(1);
            } else {
                L.t(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            L.s(i3);
        }
        return (o63) L.n();
    }

    public static /* bridge */ /* synthetic */ x63 c(hp5 hp5Var, Bundle bundle) {
        return (x63) h.get(cj6.a(cj6.a(bundle, "device"), "network").getInt("active_network_state", -1), x63.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] f(hp5 hp5Var, boolean z, ArrayList arrayList, o63 o63Var, x63 x63Var) {
        s63 T = t63.T();
        T.s(arrayList);
        T.A(g(Settings.Global.getInt(hp5Var.c.getContentResolver(), "airplane_mode_on", 0) != 0));
        T.B(zzt.zzq().zzi(hp5Var.c, hp5Var.e));
        T.x(hp5Var.f.e());
        T.w(hp5Var.f.b());
        T.t(hp5Var.f.a());
        T.u(x63Var);
        T.v(o63Var);
        T.C(hp5Var.g);
        T.D(g(z));
        T.z(hp5Var.f.d());
        T.y(zzt.zzB().a());
        T.E(g(Settings.Global.getInt(hp5Var.c.getContentResolver(), "wifi_on", 0) != 0));
        return ((t63) T.n()).a();
    }

    public static final int g(boolean z) {
        return z ? 2 : 1;
    }

    public final void e(boolean z) {
        s67.r(this.d.b(), new gp5(this, z), z04.f);
    }
}
