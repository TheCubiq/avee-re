package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class xn5 implements em6 {

    /* renamed from: d */
    public static final Pattern f32833d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a */
    public final String f32834a;

    /* renamed from: b */
    public final io6 f32835b;

    /* renamed from: c */
    public final to6 f32836c;

    public xn5(String str, to6 to6Var, io6 io6Var) {
        this.f32834a = str;
        this.f32836c = to6Var;
        this.f32835b = io6Var;
    }

    @Override // com.daaw.em6
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject;
        pu3 pu3Var;
        gi5 gi5Var;
        pu3 pu3Var2;
        pu3 pu3Var3;
        pu3 pu3Var4;
        pu3 pu3Var5;
        pu3 pu3Var6;
        pu3 pu3Var7;
        pu3 pu3Var8;
        JSONObject jSONObject2;
        String str;
        wn5 wn5Var = (wn5) obj;
        jSONObject = wn5Var.f31397a;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        pu3Var = wn5Var.f31398b;
        String str2 = "";
        if (pu3Var.m13130a() != -2) {
            if (pu3Var.m13130a() == 1) {
                if (pu3Var.m13125f() != null) {
                    str2 = TextUtils.join(", ", pu3Var.m13125f());
                    k04.zzg(str2);
                }
                gi5Var = new gi5(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                gi5Var = new gi5(1);
            }
            to6 to6Var = this.f32836c;
            io6 io6Var = this.f32835b;
            io6Var.mo17590e(gi5Var);
            io6Var.zzf(false);
            to6Var.m8902a(io6Var);
            throw gi5Var;
        }
        HashMap hashMap = new HashMap();
        pu3Var2 = wn5Var.f31398b;
        if (pu3Var2.m13123h() && !TextUtils.isEmpty(this.f32834a)) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10442I0)).booleanValue()) {
                String str3 = this.f32834a;
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    Matcher matcher = f32833d.matcher(str3);
                    str = "";
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (group != null) {
                            Locale locale = Locale.ROOT;
                            if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put("Cookie", str);
                }
            } else {
                hashMap.put("Cookie", this.f32834a);
            }
        }
        pu3Var3 = wn5Var.f31398b;
        if (pu3Var3.m13122i()) {
            jSONObject2 = wn5Var.f31397a;
            yn5.m3481a(hashMap, jSONObject2);
        }
        pu3Var4 = wn5Var.f31398b;
        if (pu3Var4 != null) {
            pu3Var7 = wn5Var.f31398b;
            if (!TextUtils.isEmpty(pu3Var7.m13127d())) {
                pu3Var8 = wn5Var.f31398b;
                str2 = pu3Var8.m13127d();
            }
        }
        to6 to6Var2 = this.f32836c;
        io6 io6Var2 = this.f32835b;
        io6Var2.zzf(true);
        to6Var2.m8902a(io6Var2);
        pu3Var5 = wn5Var.f31398b;
        String m13126e = pu3Var5.m13126e();
        byte[] bytes = str2.getBytes(cy6.f6275c);
        pu3Var6 = wn5Var.f31398b;
        return new on5(m13126e, optInt, hashMap, bytes, "", pu3Var6.m13122i());
    }
}
