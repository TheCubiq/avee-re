package com.daaw;

import android.net.TrafficStats;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public class p04 implements c04 {

    /* renamed from: a */
    public final String f22187a;

    public p04() {
        this.f22187a = null;
    }

    public p04(String str) {
        this.f22187a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    @Override // com.daaw.c04
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean zza(String str) {
        int responseCode;
        boolean m7198a;
        boolean z = false;
        try {
            try {
                if (C3327vf.m7198a()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                k04.zze("Pinging URL: " + str);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    zzay.zzb();
                    String str2 = this.f22187a;
                    httpURLConnection.setConnectTimeout(60000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setReadTimeout(60000);
                    if (str2 != null) {
                        httpURLConnection.setRequestProperty("User-Agent", str2);
                    }
                    httpURLConnection.setUseCaches(false);
                    j04 j04Var = new j04(null);
                    j04Var.m19197c(httpURLConnection, null);
                    responseCode = httpURLConnection.getResponseCode();
                    j04Var.m19195e(httpURLConnection, responseCode);
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                k04.zzj("Error while pinging URL: " + str + ". " + message);
                if (C3327vf.m7198a()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (IndexOutOfBoundsException e2) {
                String message2 = e2.getMessage();
                k04.zzj("Error while parsing ping URL: " + str + ". " + message2);
                if (C3327vf.m7198a()) {
                    TrafficStats.clearThreadStatsTag();
                    return false;
                }
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                k04.zzj("Error while pinging URL: " + str + ". " + message3);
                if (C3327vf.m7198a()) {
                }
            }
            if (responseCode >= 200 && responseCode < 300) {
                z = true;
                if (m7198a) {
                    return z;
                }
                return z;
            }
            k04.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
            return z;
        } finally {
            if (C3327vf.m7198a()) {
                TrafficStats.clearThreadStatsTag();
            }
        }
    }
}
