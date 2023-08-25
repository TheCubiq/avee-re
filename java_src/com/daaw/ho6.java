package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
/* loaded from: classes.dex */
public final /* synthetic */ class ho6 {
    /* renamed from: a */
    public static io6 m20568a(Context context, int i) {
        ma3 ma3Var;
        if (vo6.m6970a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        ma3Var = ta3.f27158c;
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        ma3Var = ta3.f27159d;
                        break;
                    case 5:
                        ma3Var = ta3.f27157b;
                        break;
                }
            } else {
                ma3Var = ta3.f27160e;
            }
            if (((Boolean) ma3Var.m16137e()).booleanValue()) {
                return new ko6(context, i);
            }
        }
        return new hp6();
    }

    /* renamed from: b */
    public static io6 m20567b(Context context, int i, int i2, zzl zzlVar) {
        io6 m20568a = m20568a(context, i);
        if (m20568a instanceof ko6) {
            m20568a.zzh();
            m20568a.mo17592c(i2);
            if (so6.m10110e(zzlVar.zzp)) {
                m20568a.mo17594a(zzlVar.zzp);
            }
            return m20568a;
        }
        return m20568a;
    }
}
