package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class xh8 extends BroadcastReceiver {
    public final g01 a;
    public final c33 b;
    public final is3 c;
    public boolean d;
    public final /* synthetic */ gk8 e;

    public /* synthetic */ xh8(gk8 gk8Var, c33 c33Var, lf8 lf8Var) {
        this.e = gk8Var;
        this.a = null;
        this.c = null;
        this.b = null;
    }

    public /* synthetic */ xh8(gk8 gk8Var, g01 g01Var, is3 is3Var, lf8 lf8Var) {
        this.e = gk8Var;
        this.a = g01Var;
        this.c = is3Var;
        this.b = null;
    }

    public static /* bridge */ /* synthetic */ c33 a(xh8 xh8Var) {
        c33 c33Var = xh8Var.b;
        return null;
    }

    public final void c(Context context, IntentFilter intentFilter) {
        xh8 xh8Var;
        if (this.d) {
            return;
        }
        xh8Var = this.e.b;
        context.registerReceiver(xh8Var, intentFilter);
        this.d = true;
    }

    public final void d(Context context) {
        xh8 xh8Var;
        if (!this.d) {
            yx2.l("BillingBroadcastManager", "Receiver is not registered.");
            return;
        }
        xh8Var = this.e.b;
        context.unregisterReceiver(xh8Var);
        this.d = false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        xb g = yx2.g(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            this.a.b(g, yx2.j(intent.getExtras()));
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            Bundle extras = intent.getExtras();
            if (g.b() != 0) {
                this.a.b(g, rt8.r());
            } else if (this.c == null) {
                yx2.l("BillingBroadcastManager", "AlternativeBillingListener is null.");
                this.a.b(uz2.j, rt8.r());
            } else if (extras == null) {
                yx2.l("BillingBroadcastManager", "Bundle is null.");
                this.a.b(uz2.j, rt8.r());
            } else {
                String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string == null) {
                    yx2.l("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                    this.a.b(uz2.j, rt8.r());
                    return;
                }
                try {
                    JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                    ArrayList arrayList = new ArrayList();
                    if (optJSONArray != null) {
                        for (int i = 0; i < optJSONArray.length(); i++) {
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            if (optJSONObject != null) {
                                arrayList.add(new pe5(optJSONObject, null));
                            }
                        }
                    }
                    this.c.zza();
                } catch (JSONException unused) {
                    yx2.l("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", string));
                    this.a.b(uz2.j, rt8.r());
                }
            }
        }
    }
}
