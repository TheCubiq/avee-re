package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.Objects;
/* loaded from: classes.dex */
public final class yg5 extends BroadcastReceiver {
    public final /* synthetic */ bi5 a;

    public /* synthetic */ yg5(bi5 bi5Var, vf5 vf5Var) {
        this.a = bi5Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 2;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            break;
                        case 20:
                            if (it5.a >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
            if (it5.a >= 31 || i != 5) {
                bi5.c(this.a, i);
            }
            bi5 bi5Var = this.a;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                Objects.requireNonNull(telephonyManager);
                se5 se5Var = new se5(bi5Var);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), se5Var);
                telephonyManager.unregisterTelephonyCallback(se5Var);
                return;
            } catch (RuntimeException unused2) {
                bi5.c(bi5Var, 5);
                return;
            }
        }
        i = 0;
        if (it5.a >= 31) {
        }
        bi5.c(this.a, i);
    }
}
