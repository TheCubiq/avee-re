package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class un5 implements em6 {

    /* renamed from: a */
    public final Context f29348a;

    /* renamed from: b */
    public final String f29349b;

    /* renamed from: c */
    public final yu3 f29350c;

    public un5(Context context, String str, yu3 yu3Var, int i, byte[] bArr) {
        this.f29348a = context;
        this.f29349b = str;
        this.f29350c = yu3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0218 A[Catch: all -> 0x0227, TryCatch #3 {all -> 0x0227, blocks: (B:12:0x0094, B:86:0x0206, B:88:0x0218, B:90:0x0226, B:13:0x009a, B:15:0x00a2, B:16:0x00a7, B:18:0x00ab, B:21:0x00bd, B:25:0x00c5, B:26:0x00c8, B:27:0x00c9, B:28:0x00e1, B:30:0x00e7, B:32:0x00ff, B:33:0x0109, B:34:0x0113, B:36:0x0118, B:42:0x0138, B:44:0x0146, B:47:0x0159, B:48:0x015f, B:49:0x0160, B:56:0x0174, B:57:0x0177, B:61:0x017e, B:63:0x018a, B:67:0x01af, B:68:0x01bb, B:69:0x01bc, B:70:0x01c8, B:71:0x01c9, B:72:0x01ef), top: B:105:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0226 A[Catch: all -> 0x0227, TRY_LEAVE, TryCatch #3 {all -> 0x0227, blocks: (B:12:0x0094, B:86:0x0206, B:88:0x0218, B:90:0x0226, B:13:0x009a, B:15:0x00a2, B:16:0x00a7, B:18:0x00ab, B:21:0x00bd, B:25:0x00c5, B:26:0x00c8, B:27:0x00c9, B:28:0x00e1, B:30:0x00e7, B:32:0x00ff, B:33:0x0109, B:34:0x0113, B:36:0x0118, B:42:0x0138, B:44:0x0146, B:47:0x0159, B:48:0x015f, B:49:0x0160, B:56:0x0174, B:57:0x0177, B:61:0x017e, B:63:0x018a, B:67:0x01af, B:68:0x01bb, B:69:0x01bc, B:70:0x01c8, B:71:0x01c9, B:72:0x01ef), top: B:105:0x0094 }] */
    @Override // com.daaw.em6
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pn5 zza(on5 on5Var) {
        int i;
        HttpURLConnection httpURLConnection;
        pn5 pn5Var;
        int responseCode;
        InputStreamReader inputStreamReader;
        un5 un5Var = this;
        String str = on5Var.f21686a;
        int i2 = on5Var.f21687b;
        Map map = on5Var.f21688c;
        byte[] bArr = on5Var.f21689d;
        String str2 = on5Var.f21690e;
        long mo15859b = zzt.zzB().mo15859b();
        try {
            pn5 pn5Var2 = new pn5();
            String str3 = un5Var.f29349b;
            k04.zzi("SDK version: " + str3);
            k04.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url = new URL(str);
            HashMap hashMap = new HashMap();
            int i3 = 0;
            while (true) {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                try {
                    zzs zzp = zzt.zzp();
                    Context context = un5Var.f29348a;
                    String str4 = un5Var.f29349b;
                    HttpURLConnection httpURLConnection3 = httpURLConnection2;
                    pn5 pn5Var3 = pn5Var2;
                    i = 1;
                    try {
                        zzp.zze(context, str4, false, httpURLConnection2, false, i2);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection = httpURLConnection3;
                            try {
                                try {
                                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    httpURLConnection3 = httpURLConnection;
                                } catch (Throwable th) {
                                    th = th;
                                    httpURLConnection.disconnect();
                                    throw th;
                                }
                            } catch (gi5 e) {
                                e = e;
                                pn5Var = pn5Var3;
                                if (((Boolean) zzba.zzc().m23658b(g93.f10893y7)).booleanValue()) {
                                    throw e;
                                }
                                pn5Var.f23082d = zzt.zzB().mo15859b() - mo15859b;
                                httpURLConnection.disconnect();
                                return pn5Var;
                            }
                        }
                        httpURLConnection = httpURLConnection3;
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        int length = bArr.length;
                        BufferedOutputStream bufferedOutputStream = null;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    xd0.m5227a(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    xd0.m5227a(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        j04 j04Var = new j04(null);
                        j04Var.m19197c(httpURLConnection, bArr);
                        responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (hashMap.containsKey(key)) {
                                ((List) hashMap.get(key)).addAll(value);
                            } else {
                                hashMap.put(key, new ArrayList(value));
                            }
                        }
                        j04Var.m19195e(httpURLConnection, responseCode);
                        pn5Var = pn5Var3;
                        try {
                            pn5Var.f23079a = responseCode;
                            pn5Var.f23080b = hashMap;
                            pn5Var.f23081c = "";
                            if (responseCode >= 200 && responseCode < 300) {
                                try {
                                    inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                                    try {
                                        zzt.zzp();
                                        String zzJ = zzs.zzJ(inputStreamReader);
                                        xd0.m5227a(inputStreamReader);
                                        j04Var.m19193g(zzJ);
                                        pn5Var.f23081c = zzJ;
                                        if (TextUtils.isEmpty(zzJ)) {
                                            if (!((Boolean) zzba.zzc().m23658b(g93.f10566U4)).booleanValue()) {
                                                throw new gi5(3);
                                            }
                                        }
                                        pn5Var.f23082d = zzt.zzB().mo15859b() - mo15859b;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        xd0.m5227a(inputStreamReader);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    inputStreamReader = null;
                                }
                            } else if (responseCode < 300 || responseCode >= 400) {
                                break;
                            } else {
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (TextUtils.isEmpty(headerField)) {
                                    k04.zzj("No location header to follow redirect.");
                                    throw new gi5(1, "No location header to follow redirect");
                                }
                                URL url2 = new URL(headerField);
                                int i4 = i3 + 1;
                                if (i4 > ((Integer) zzba.zzc().m23658b(g93.f10879x4)).intValue()) {
                                    k04.zzj("Too many redirects.");
                                    throw new gi5(1, "Too many redirects");
                                }
                                try {
                                    httpURLConnection.disconnect();
                                    un5Var = this;
                                    i3 = i4;
                                    pn5Var2 = pn5Var;
                                    url = url2;
                                } catch (IOException e2) {
                                    e = e2;
                                    String concat = "Error while connecting to ad server: ".concat(String.valueOf(e.getMessage()));
                                    k04.zzj(concat);
                                    throw new gi5(i, concat, e);
                                }
                            }
                        } catch (gi5 e3) {
                            e = e3;
                            if (((Boolean) zzba.zzc().m23658b(g93.f10893y7)).booleanValue()) {
                            }
                        }
                    } catch (gi5 e4) {
                        e = e4;
                        httpURLConnection = httpURLConnection3;
                    } catch (Throwable th6) {
                        th = th6;
                        httpURLConnection = httpURLConnection3;
                    }
                } catch (gi5 e5) {
                    e = e5;
                    httpURLConnection = httpURLConnection2;
                    pn5Var = pn5Var2;
                } catch (Throwable th7) {
                    th = th7;
                    httpURLConnection = httpURLConnection2;
                }
            }
            k04.zzj("Received error HTTP response code: " + responseCode);
            throw new gi5(1, "Received error HTTP response code: " + responseCode);
        } catch (IOException e6) {
            e = e6;
            i = 1;
        }
    }
}
