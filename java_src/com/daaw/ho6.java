package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
/* loaded from: classes.dex */
public final /* synthetic */ class ho6 {
    public static io6 a(Context context, int i) {
        ma3 ma3Var;
        if (vo6.a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        ma3Var = ta3.c;
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        ma3Var = ta3.d;
                        break;
                    case 5:
                        ma3Var = ta3.b;
                        break;
                }
            } else {
                ma3Var = ta3.e;
            }
            if (((Boolean) ma3Var.e()).booleanValue()) {
                return new ko6(context, i);
            }
        }
        return new hp6();
    }

    public static io6 b(Context context, int i, int i2, zzl zzlVar) {
        io6 a = a(context, i);
        if (a instanceof ko6) {
            a.zzh();
            a.c(i2);
            if (so6.e(zzlVar.zzp)) {
                a.a(zzlVar.zzp);
            }
            return a;
        }
        return a;
    }
}
