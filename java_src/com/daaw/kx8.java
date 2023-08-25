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

    /* renamed from: a */
    public final /* synthetic */ f77 f16830a;

    /* renamed from: b */
    public final /* synthetic */ zzcgj f16831b;

    /* renamed from: c */
    public final /* synthetic */ wy3 f16832c;

    /* renamed from: d */
    public final /* synthetic */ io6 f16833d;

    /* renamed from: e */
    public final /* synthetic */ long f16834e;

    /* renamed from: f */
    public final /* synthetic */ zzac f16835f;

    public kx8(zzac zzacVar, f77 f77Var, zzcgj zzcgjVar, wy3 wy3Var, io6 io6Var, long j) {
        this.f16835f = zzacVar;
        this.f16830a = f77Var;
        this.f16831b = zzcgjVar;
        this.f16832c = wy3Var;
        this.f16833d = io6Var;
        this.f16834e = j;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
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
        to6 m1268M3 = zzac.m1268M3(this.f16830a, this.f16831b);
        if (((Boolean) zzba.zzc().m23658b(g93.f10578V6)).booleanValue()) {
            long mo15860a = zzt.zzB().mo15860a() - this.f16834e;
            try {
                try {
                    if (zzaoVar == null) {
                        this.f16832c.mo5712B0(null, null, null);
                        zzac zzacVar = this.f16835f;
                        pd5Var4 = zzacVar.f36478B;
                        fd5Var5 = zzacVar.f36499t;
                        zzf.zzc(pd5Var4, fd5Var5, "sgs", new Pair("rid", "-1"));
                        this.f16833d.zzf(true);
                        if (!((Boolean) ta3.f27160e.m16137e()).booleanValue() || m1268M3 == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(zzaoVar.zzb);
                            String optString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(optString)) {
                                k04.zzj("The request ID is empty in request JSON.");
                                this.f16832c.zzb("Internal error: request ID is empty in request JSON.");
                                zzac zzacVar2 = this.f16835f;
                                pd5Var3 = zzacVar2.f36478B;
                                fd5Var4 = zzacVar2.f36499t;
                                zzf.zzc(pd5Var3, fd5Var4, "sgf", new Pair("sgf_reason", "rid_missing"));
                                io6 io6Var2 = this.f16833d;
                                io6Var2.mo17582m("Request ID empty");
                                io6Var2.zzf(false);
                                if (!((Boolean) ta3.f27160e.m16137e()).booleanValue() || m1268M3 == null) {
                                    return;
                                }
                            } else {
                                zzac zzacVar3 = this.f16835f;
                                String str7 = zzaoVar.zzb;
                                fd5Var2 = zzacVar3.f36499t;
                                zzac.m1254m3(zzacVar3, optString, str7, fd5Var2);
                                Bundle bundle = zzaoVar.zzc;
                                zzac zzacVar4 = this.f16835f;
                                z = zzacVar4.f36483G;
                                if (z && bundle != null) {
                                    str5 = zzacVar4.f36485I;
                                    if (bundle.getInt(str5, -1) == -1) {
                                        zzac zzacVar5 = this.f16835f;
                                        str6 = zzacVar5.f36485I;
                                        atomicInteger = zzacVar5.f36486J;
                                        bundle.putInt(str6, atomicInteger.get());
                                    }
                                }
                                zzac zzacVar6 = this.f16835f;
                                z2 = zzacVar6.f36482F;
                                if (z2 && bundle != null) {
                                    str = zzacVar6.f36484H;
                                    if (TextUtils.isEmpty(bundle.getString(str))) {
                                        str2 = this.f16835f.f36488L;
                                        if (TextUtils.isEmpty(str2)) {
                                            zzac zzacVar7 = this.f16835f;
                                            zzs zzp = zzt.zzp();
                                            zzac zzacVar8 = this.f16835f;
                                            context = zzacVar8.f36496q;
                                            zzchuVar = zzacVar8.f36487K;
                                            zzacVar7.f36488L = zzp.zzc(context, zzchuVar.f36993p);
                                        }
                                        zzac zzacVar9 = this.f16835f;
                                        str3 = zzacVar9.f36484H;
                                        str4 = zzacVar9.f36488L;
                                        bundle.putString(str3, str4);
                                    }
                                }
                                this.f16832c.mo5712B0(zzaoVar.zza, zzaoVar.zzb, bundle);
                                zzac zzacVar10 = this.f16835f;
                                pd5Var2 = zzacVar10.f36478B;
                                fd5Var3 = zzacVar10.f36499t;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(mo15860a));
                                String str8 = "na";
                                if (((Boolean) zzba.zzc().m23658b(g93.f10390C8)).booleanValue()) {
                                    try {
                                        str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e) {
                                        k04.zzh("Error retrieving JSONObject from the requestJson, ", e);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str8);
                                zzf.zzc(pd5Var2, fd5Var3, "sgs", pairArr);
                                this.f16833d.zzf(true);
                                if (!((Boolean) ta3.f27160e.m16137e()).booleanValue() || m1268M3 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e2) {
                            k04.zzj("Failed to create JSON object from the request string.");
                            wy3 wy3Var = this.f16832c;
                            String obj2 = e2.toString();
                            wy3Var.zzb("Internal error for request JSON: " + obj2);
                            zzac zzacVar11 = this.f16835f;
                            pd5Var = zzacVar11.f36478B;
                            fd5Var = zzacVar11.f36499t;
                            zzf.zzc(pd5Var, fd5Var, "sgf", new Pair("sgf_reason", "request_invalid"));
                            io6 io6Var3 = this.f16833d;
                            io6Var3.mo17590e(e2);
                            io6Var3.zzf(false);
                            zzt.zzo().m11902u(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                            if (!((Boolean) ta3.f27160e.m16137e()).booleanValue() || m1268M3 == null) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (((Boolean) ta3.f27160e.m16137e()).booleanValue() && m1268M3 != null) {
                        m1268M3.m8902a(this.f16833d);
                        m1268M3.m8896g();
                    }
                    throw th;
                }
            } catch (RemoteException e3) {
                io6 io6Var4 = this.f16833d;
                io6Var4.mo17590e(e3);
                io6Var4.zzf(false);
                k04.zzh("", e3);
                zzt.zzo().m11902u(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) ta3.f27160e.m16137e()).booleanValue() || m1268M3 == null) {
                    return;
                }
            }
            io6Var = this.f16833d;
        } else {
            try {
                this.f16832c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e4) {
                k04.zzg("QueryInfo generation has been disabled.".concat(e4.toString()));
            }
            if (!((Boolean) ta3.f27160e.m16137e()).booleanValue() || m1268M3 == null) {
                return;
            }
            io6Var = this.f16833d;
            io6Var.mo17582m("QueryInfo generation has been disabled.");
            io6Var.zzf(false);
        }
        m1268M3.m8902a(io6Var);
        m1268M3.m8896g();
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        pd5 pd5Var;
        fd5 fd5Var;
        long mo15860a = zzt.zzB().mo15860a();
        long j = this.f16834e;
        String message = th.getMessage();
        zzt.zzo().m11902u(th, "SignalGeneratorImpl.generateSignals");
        zzac zzacVar = this.f16835f;
        pd5Var = zzacVar.f36478B;
        fd5Var = zzacVar.f36499t;
        zzf.zzc(pd5Var, fd5Var, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(mo15860a - j)));
        to6 m1268M3 = zzac.m1268M3(this.f16830a, this.f16831b);
        if (((Boolean) ta3.f27160e.m16137e()).booleanValue() && m1268M3 != null) {
            io6 io6Var = this.f16833d;
            io6Var.mo17590e(th);
            io6Var.zzf(false);
            m1268M3.m8902a(io6Var);
            m1268M3.m8896g();
        }
        try {
            wy3 wy3Var = this.f16832c;
            wy3Var.zzb("Internal error. " + message);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}
