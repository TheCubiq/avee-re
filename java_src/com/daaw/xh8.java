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

    /* renamed from: a */
    public final g01 f32725a;

    /* renamed from: b */
    public final c33 f32726b;

    /* renamed from: c */
    public final is3 f32727c;

    /* renamed from: d */
    public boolean f32728d;

    /* renamed from: e */
    public final /* synthetic */ gk8 f32729e;

    public /* synthetic */ xh8(gk8 gk8Var, c33 c33Var, lf8 lf8Var) {
        this.f32729e = gk8Var;
        this.f32725a = null;
        this.f32727c = null;
        this.f32726b = null;
    }

    public /* synthetic */ xh8(gk8 gk8Var, g01 g01Var, is3 is3Var, lf8 lf8Var) {
        this.f32729e = gk8Var;
        this.f32725a = g01Var;
        this.f32727c = is3Var;
        this.f32726b = null;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ c33 m5094a(xh8 xh8Var) {
        c33 c33Var = xh8Var.f32726b;
        return null;
    }

    /* renamed from: c */
    public final void m5092c(Context context, IntentFilter intentFilter) {
        xh8 xh8Var;
        if (this.f32728d) {
            return;
        }
        xh8Var = this.f32729e.f11402b;
        context.registerReceiver(xh8Var, intentFilter);
        this.f32728d = true;
    }

    /* renamed from: d */
    public final void m5091d(Context context) {
        xh8 xh8Var;
        if (!this.f32728d) {
            yx2.m3094l("BillingBroadcastManager", "Receiver is not registered.");
            return;
        }
        xh8Var = this.f32729e.f11402b;
        context.unregisterReceiver(xh8Var);
        this.f32728d = false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C3518xb m3099g = yx2.m3099g(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            this.f32725a.mo6252b(m3099g, yx2.m3096j(intent.getExtras()));
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            Bundle extras = intent.getExtras();
            if (m3099g.m5324b() != 0) {
                this.f32725a.mo6252b(m3099g, rt8.m10942r());
            } else if (this.f32727c == null) {
                yx2.m3094l("BillingBroadcastManager", "AlternativeBillingListener is null.");
                this.f32725a.mo6252b(uz2.f29676j, rt8.m10942r());
            } else if (extras == null) {
                yx2.m3094l("BillingBroadcastManager", "Bundle is null.");
                this.f32725a.mo6252b(uz2.f29676j, rt8.m10942r());
            } else {
                String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                if (string == null) {
                    yx2.m3094l("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                    this.f32725a.mo6252b(uz2.f29676j, rt8.m10942r());
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
                    this.f32727c.zza();
                } catch (JSONException unused) {
                    yx2.m3094l("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", string));
                    this.f32725a.mo6252b(uz2.f29676j, rt8.m10942r());
                }
            }
        }
    }
}
