package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzao;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class kx8 implements o67 {
    public final /* synthetic */ f77 a;
    public final /* synthetic */ zzcgj b;
    public final /* synthetic */ wy3 c;
    public final /* synthetic */ io6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ zzac f;

    public kx8(zzac zzacVar, f77 f77Var, zzcgj zzcgjVar, wy3 wy3Var, io6 io6Var, long j) {
        this.f = zzacVar;
        this.a = f77Var;
        this.b = zzcgjVar;
        this.c = wy3Var;
        this.d = io6Var;
        this.e = j;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        io6 io6Var;
        pd5 pd5Var;
        fd5 fd5Var;
        fd5 fd5Var2;
        boolean z;
        boolean z2;
        pd5 pd5Var2;
        fd5 fd5Var3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzchu zzchuVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        pd5 pd5Var3;
        fd5 fd5Var4;
        pd5 pd5Var4;
        fd5 fd5Var5;
        zzao zzaoVar = (zzao) obj;
        to6 M3 = zzac.M3(this.a, this.b);
        if (((Boolean) zzba.zzc().b(g93.V6)).booleanValue()) {
            long a = zzt.zzB().a() - this.e;
            try {
                try {
                    if (zzaoVar == null) {
                        this.c.B0(null, null, null);
                        zzac zzacVar = this.f;
                        pd5Var4 = zzacVar.B;
                        fd5Var5 = zzacVar.t;
                        zzf.zzc(pd5Var4, fd5Var5, "sgs", new Pair("rid", "-1"));
                        this.d.zzf(true);
                        if (!((Boolean) ta3.e.e()).booleanValue() || M3 == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(zzaoVar.zzb);
                            String optString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(optString)) {
                                k04.zzj("The request ID is empty in request JSON.");
                                this.c.zzb("Internal error: request ID is empty in request JSON.");
                                zzac zzacVar2 = this.f;
                                pd5Var3 = zzacVar2.B;
                                fd5Var4 = zzacVar2.t;
                                zzf.zzc(pd5Var3, fd5Var4, "sgf", new Pair("sgf_reason", "rid_missing"));
                                io6 io6Var2 = this.d;
                                io6Var2.m("Request ID empty");
                                io6Var2.zzf(false);
                                if (!((Boolean) ta3.e.e()).booleanValue() || M3 == null) {
                                    return;
                                }
                            } else {
                                zzac zzacVar3 = this.f;
                                String str7 = zzaoVar.zzb;
                                fd5Var2 = zzacVar3.t;
                                zzac.m3(zzacVar3, optString, str7, fd5Var2);
                                Bundle bundle = zzaoVar.zzc;
                                zzac zzacVar4 = this.f;
                                z = zzacVar4.G;
                                if (z && bundle != null) {
                                    str5 = zzacVar4.I;
                                    if (bundle.getInt(str5, -1) == -1) {
                                        zzac zzacVar5 = this.f;
                                        str6 = zzacVar5.I;
                                        atomicInteger = zzacVar5.J;
                                        bundle.putInt(str6, atomicInteger.get());
                                    }
                                }
                                zzac zzacVar6 = this.f;
                                z2 = zzacVar6.F;
                                if (z2 && bundle != null) {
                                    str = zzacVar6.H;
                                    if (TextUtils.isEmpty(bundle.getString(str))) {
                                        str2 = this.f.L;
                                        if (TextUtils.isEmpty(str2)) {
                                            zzac zzacVar7 = this.f;
                                            zzs zzp = zzt.zzp();
                                            zzac zzacVar8 = this.f;
                                            context = zzacVar8.q;
                                            zzchuVar = zzacVar8.K;
                                            zzacVar7.L = zzp.zzc(context, zzchuVar.p);
                                        }
                                        zzac zzacVar9 = this.f;
                                        str3 = zzacVar9.H;
                                        str4 = zzacVar9.L;
                                        bundle.putString(str3, str4);
                                    }
                                }
                                this.c.B0(zzaoVar.zza, zzaoVar.zzb, bundle);
                                zzac zzacVar10 = this.f;
                                pd5Var2 = zzacVar10.B;
                                fd5Var3 = zzacVar10.t;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(a));
                                String str8 = "na";
                                if (((Boolean) zzba.zzc().b(g93.C8)).booleanValue()) {
                                    try {
                                        str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e) {
                                        k04.zzh("Error retrieving JSONObject from the requestJson, ", e);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str8);
                                zzf.zzc(pd5Var2, fd5Var3, "sgs", pairArr);
                                this.d.zzf(true);
                                if (!((Boolean) ta3.e.e()).booleanValue() || M3 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            k04.zzj("Failed to create JSON object from the request string.");
                            wy3 wy3Var = this.c;
                            String obj2 = e2.toString();
                            wy3Var.zzb("Internal error for request JSON: " + obj2);
                            zzac zzacVar11 = this.f;
                            pd5Var = zzacVar11.B;
                            fd5Var = zzacVar11.t;
                            zzf.zzc(pd5Var, fd5Var, "sgf", new Pair("sgf_reason", "request_invalid"));
                            io6 io6Var3 = this.d;
                            io6Var3.e(e2);
                            io6Var3.zzf(false);
                            zzt.zzo().u(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                            if (!((Boolean) ta3.e.e()).booleanValue() || M3 == null) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (((Boolean) ta3.e.e()).booleanValue() && M3 != null) {
                        M3.a(this.d);
                        M3.g();
                    }
                    throw th;
                }
            } catch (RemoteException e3) {
                io6 io6Var4 = this.d;
                io6Var4.e(e3);
                io6Var4.zzf(false);
                k04.zzh("", e3);
                zzt.zzo().u(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) ta3.e.e()).booleanValue() || M3 == null) {
                    return;
                }
            }
            io6Var = this.d;
        } else {
            try {
                this.c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e4) {
                k04.zzg("QueryInfo generation has been disabled.".concat(e4.toString()));
            }
            if (!((Boolean) ta3.e.e()).booleanValue() || M3 == null) {
                return;
            }
            io6Var = this.d;
            io6Var.m("QueryInfo generation has been disabled.");
            io6Var.zzf(false);
        }
        M3.a(io6Var);
        M3.g();
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        pd5 pd5Var;
        fd5 fd5Var;
        long a = zzt.zzB().a();
        long j = this.e;
        String message = th.getMessage();
        zzt.zzo().u(th, "SignalGeneratorImpl.generateSignals");
        zzac zzacVar = this.f;
        pd5Var = zzacVar.B;
        fd5Var = zzacVar.t;
        zzf.zzc(pd5Var, fd5Var, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(a - j)));
        to6 M3 = zzac.M3(this.a, this.b);
        if (((Boolean) ta3.e.e()).booleanValue() && M3 != null) {
            io6 io6Var = this.d;
            io6Var.e(th);
            io6Var.zzf(false);
            M3.a(io6Var);
            M3.g();
        }
        try {
            wy3 wy3Var = this.c;
            wy3Var.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}
