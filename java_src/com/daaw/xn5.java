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
    public static final Pattern d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public final String a;
    public final io6 b;
    public final to6 c;

    public xn5(String str, to6 to6Var, io6 io6Var) {
        this.a = str;
        this.c = to6Var;
        this.b = io6Var;
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
        jSONObject = wn5Var.a;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        pu3Var = wn5Var.b;
        String str2 = "";
        if (pu3Var.a() != -2) {
            if (pu3Var.a() == 1) {
                if (pu3Var.f() != null) {
                    str2 = TextUtils.join(", ", pu3Var.f());
                    k04.zzg(str2);
                }
                gi5Var = new gi5(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                gi5Var = new gi5(1);
            }
            to6 to6Var = this.c;
            io6 io6Var = this.b;
            io6Var.e(gi5Var);
            io6Var.zzf(false);
            to6Var.a(io6Var);
            throw gi5Var;
        }
        HashMap hashMap = new HashMap();
        pu3Var2 = wn5Var.b;
        if (pu3Var2.h() && !TextUtils.isEmpty(this.a)) {
            if (((Boolean) zzba.zzc().b(g93.I0)).booleanValue()) {
                String str3 = this.a;
                if (TextUtils.isEmpty(str3)) {
                    str = "";
                } else {
                    Matcher matcher = d.matcher(str3);
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
                hashMap.put("Cookie", this.a);
            }
        }
        pu3Var3 = wn5Var.b;
        if (pu3Var3.i()) {
            jSONObject2 = wn5Var.a;
            yn5.a(hashMap, jSONObject2);
        }
        pu3Var4 = wn5Var.b;
        if (pu3Var4 != null) {
            pu3Var7 = wn5Var.b;
            if (!TextUtils.isEmpty(pu3Var7.d())) {
                pu3Var8 = wn5Var.b;
                str2 = pu3Var8.d();
            }
        }
        to6 to6Var2 = this.c;
        io6 io6Var2 = this.b;
        io6Var2.zzf(true);
        to6Var2.a(io6Var2);
        pu3Var5 = wn5Var.b;
        String e = pu3Var5.e();
        byte[] bytes = str2.getBytes(cy6.c);
        pu3Var6 = wn5Var.b;
        return new on5(e, optInt, hashMap, bytes, "", pu3Var6.i());
    }
}
