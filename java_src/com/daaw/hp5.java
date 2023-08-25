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

    /* renamed from: h */
    public static final SparseArray f12769h;

    /* renamed from: c */
    public final Context f12770c;

    /* renamed from: d */
    public final op4 f12771d;

    /* renamed from: e */
    public final TelephonyManager f12772e;

    /* renamed from: f */
    public final zo5 f12773f;

    /* renamed from: g */
    public int f12774g;

    static {
        SparseArray sparseArray = new SparseArray();
        f12769h = sparseArray;
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
        this.f12770c = context;
        this.f12771d = op4Var;
        this.f12773f = zo5Var;
        this.f12772e = (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ o63 m20545b(hp5 hp5Var, Bundle bundle) {
        c63 m14529L = o63.m14529L();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            hp5Var.f12774g = 2;
        } else {
            hp5Var.f12774g = 1;
            if (i == 0) {
                m14529L.m25568t(2);
            } else if (i != 1) {
                m14529L.m25568t(1);
            } else {
                m14529L.m25568t(3);
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
            m14529L.m25569s(i3);
        }
        return (o63) m14529L.m22315n();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ x63 m20544c(hp5 hp5Var, Bundle bundle) {
        return (x63) f12769h.get(cj6.m25318a(cj6.m25318a(bundle, "device"), "network").getInt("active_network_state", -1), x63.UNSPECIFIED);
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ byte[] m20541f(hp5 hp5Var, boolean z, ArrayList arrayList, o63 o63Var, x63 x63Var) {
        s63 m9507T = t63.m9507T();
        m9507T.m10668s(arrayList);
        m9507T.m10673A(m20540g(Settings.Global.getInt(hp5Var.f12770c.getContentResolver(), "airplane_mode_on", 0) != 0));
        m9507T.m10672B(zzt.zzq().zzi(hp5Var.f12770c, hp5Var.f12772e));
        m9507T.m10663x(hp5Var.f12773f.m2035e());
        m9507T.m10664w(hp5Var.f12773f.m2038b());
        m9507T.m10667t(hp5Var.f12773f.m2039a());
        m9507T.m10666u(x63Var);
        m9507T.m10665v(o63Var);
        m9507T.m10671C(hp5Var.f12774g);
        m9507T.m10670D(m20540g(z));
        m9507T.m10661z(hp5Var.f12773f.m2036d());
        m9507T.m10662y(zzt.zzB().mo15860a());
        m9507T.m10669E(m20540g(Settings.Global.getInt(hp5Var.f12770c.getContentResolver(), "wifi_on", 0) != 0));
        return ((t63) m9507T.m22315n()).mo4516a();
    }

    /* renamed from: g */
    public static final int m20540g(boolean z) {
        return z ? 2 : 1;
    }

    /* renamed from: e */
    public final void m20542e(boolean z) {
        s67.m10625r(this.f12771d.m14102b(), new gp5(this, z), z04.f34310f);
    }
}
