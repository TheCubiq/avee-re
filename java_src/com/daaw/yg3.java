package com.daaw;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class yg3 {

    /* renamed from: a */
    public static final zg3 f33644a = new zg3() { // from class: com.daaw.ag3
        @Override // com.daaw.zg3
        /* renamed from: a */
        public final void mo2341a(Object obj, Map map) {
            e84 e84Var = (e84) obj;
            zg3 zg3Var = yg3.f33644a;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                k04.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = e84Var.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                hashMap.put(str2, valueOf);
                zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((uj3) e84Var).mo6434T("openableURLs", hashMap);
        }
    };

    /* renamed from: b */
    public static final zg3 f33645b = new zg3() { // from class: com.daaw.bg3
        @Override // com.daaw.zg3
        /* renamed from: a */
        public final void mo2341a(Object obj, Map map) {
            e84 e84Var = (e84) obj;
            zg3 zg3Var = yg3.f33644a;
            if (!((Boolean) zzba.zzc().m23658b(g93.f10849u7)).booleanValue()) {
                k04.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                k04.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(e84Var.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((uj3) e84Var).mo6434T("openableApp", hashMap);
        }
    };

    /* renamed from: c */
    public static final zg3 f33646c = new zg3() { // from class: com.daaw.tf3
        @Override // com.daaw.zg3
        /* renamed from: a */
        public final void mo2341a(Object obj, Map map) {
            yg3.m3757c((e84) obj, map);
        }
    };

    /* renamed from: d */
    public static final zg3 f33647d = new ng3();

    /* renamed from: e */
    public static final zg3 f33648e = new og3();

    /* renamed from: f */
    public static final zg3 f33649f = new zg3() { // from class: com.daaw.zf3
        @Override // com.daaw.zg3
        /* renamed from: a */
        public final void mo2341a(Object obj, Map map) {
            e84 e84Var = (e84) obj;
            zg3 zg3Var = yg3.f33644a;
            String str = (String) map.get("u");
            if (str == null) {
                k04.zzj("URL missing from httpTrack GMSG.");
            } else {
                new zzby(e84Var.getContext(), ((m84) e84Var).zzp().f36993p, str).zzb();
            }
        }
    };

    /* renamed from: g */
    public static final zg3 f33650g = new pg3();

    /* renamed from: h */
    public static final zg3 f33651h = new qg3();

    /* renamed from: i */
    public static final zg3 f33652i = new zg3() { // from class: com.daaw.yf3
        @Override // com.daaw.zg3
        /* renamed from: a */
        public final void mo2341a(Object obj, Map map) {
            l84 l84Var = (l84) obj;
            zg3 zg3Var = yg3.f33644a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                sl2 mo6425a = l84Var.mo6425a();
                if (mo6425a != null) {
                    mo6425a.m10202c().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                k04.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };

    /* renamed from: j */
    public static final zg3 f33653j = new rg3();

    /* renamed from: k */
    public static final zg3 f33654k = new sg3();

    /* renamed from: l */
    public static final zg3 f33655l = new u44();

    /* renamed from: m */
    public static final zg3 f33656m = new v44();

    /* renamed from: n */
    public static final zg3 f33657n = new pf3();

    /* renamed from: o */
    public static final nh3 f33658o = new nh3();

    /* renamed from: p */
    public static final zg3 f33659p = new wg3();

    /* renamed from: q */
    public static final zg3 f33660q = new xg3();

    /* renamed from: r */
    public static final zg3 f33661r = new cg3();

    /* renamed from: s */
    public static final zg3 f33662s = new dg3();

    /* renamed from: t */
    public static final zg3 f33663t = new eg3();

    /* renamed from: u */
    public static final zg3 f33664u = new fg3();

    /* renamed from: v */
    public static final zg3 f33665v = new gg3();

    /* renamed from: w */
    public static final zg3 f33666w = new hg3();

    /* renamed from: x */
    public static final zg3 f33667x = new ig3();

    /* renamed from: y */
    public static final zg3 f33668y = new jg3();

    /* renamed from: z */
    public static final zg3 f33669z = new kg3();

    /* renamed from: A */
    public static final zg3 f33643A = new lg3();

    /* renamed from: a */
    public static zg3 m3759a(final vy4 vy4Var) {
        return new zg3() { // from class: com.daaw.xf3
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                a74 a74Var = (a74) obj;
                yg3.m3756d(map, vy4.this);
                String str = (String) map.get("u");
                if (str == null) {
                    k04.zzj("URL missing from click GMSG.");
                } else {
                    s67.m10625r(yg3.m3758b(a74Var, str), new mg3(a74Var), z04.f34305a);
                }
            }
        };
    }

    /* renamed from: b */
    public static f77 m3758b(a74 a74Var, String str) {
        Uri parse = Uri.parse(str);
        try {
            sl2 mo6425a = a74Var.mo6425a();
            if (mo6425a != null && mo6425a.m10199f(parse)) {
                parse = mo6425a.m10204a(parse, a74Var.getContext(), a74Var.mo6418g(), a74Var.zzk());
            }
        } catch (tl2 unused) {
            k04.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String m15659b = my3.m15659b(parse, a74Var.getContext());
        long longValue = ((Long) za3.f34685e.m16137e()).longValue();
        if (longValue <= 0 || longValue > 224400003) {
            return s67.m10634i(m15659b);
        }
        j67 m18784D = j67.m18784D(a74Var.mo6401r0());
        uf3 uf3Var = new ey6() { // from class: com.daaw.uf3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zg3 zg3Var = yg3.f33644a;
                if (((Boolean) za3.f34691k.m16137e()).booleanValue()) {
                    zzt.zzo().m11902u(th, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
                return "failure_click_attok";
            }
        };
        g77 g77Var = z04.f34310f;
        return s67.m10637f(s67.m10630m(s67.m10637f(m18784D, Throwable.class, uf3Var, g77Var), new ey6() { // from class: com.daaw.vf3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                String str2 = m15659b;
                String str3 = (String) obj;
                zg3 zg3Var = yg3.f33644a;
                if (str3 != null) {
                    if (((Boolean) za3.f34686f.m16137e()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str2).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (!host.endsWith(strArr[i])) {
                            }
                        }
                    }
                    String str4 = (String) za3.f34681a.m16137e();
                    String str5 = (String) za3.f34682b.m16137e();
                    if (!TextUtils.isEmpty(str4)) {
                        str2 = str2.replace(str4, str3);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str2);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                        }
                    }
                }
                return str2;
            }
        }, g77Var), Throwable.class, new ey6() { // from class: com.daaw.wf3
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                String str2 = m15659b;
                Throwable th = (Throwable) obj;
                zg3 zg3Var = yg3.f33644a;
                if (((Boolean) za3.f34691k.m16137e()).booleanValue()) {
                    zzt.zzo().m11902u(th, "prepareClickUrl.attestation2");
                }
                return str2;
            }
        }, g77Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:51|52|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        com.google.android.gms.ads.internal.zzt.zzo().m11902u(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r7 = r0;
        r0 = "Error constructing openable urls response.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        com.daaw.k04.zzh(r0, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m3757c(e84 e84Var, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = e84Var.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e) {
                        JSONException jSONException = e;
                        String str = "Error parsing the intent data.";
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e2) {
                            k04.zzh("Error parsing the url: ".concat(String.valueOf(optString7)), e2);
                        }
                        if (parseUri == null) {
                            parseUri = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                parseUri.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        Intent intent = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent, 65536);
                        jSONObject.put(optString, resolveInfo != null);
                    }
                    parseUri = null;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                    jSONObject.put(optString, resolveInfo != null);
                }
                ((uj3) e84Var).mo6048l("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((uj3) e84Var).mo6048l("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((uj3) e84Var).mo6048l("openableIntents", new JSONObject());
        }
    }

    /* renamed from: d */
    public static void m3756d(Map map, vy4 vy4Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10580V8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && vy4Var != null) {
            vy4Var.zzq();
        }
    }
}
