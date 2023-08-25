package com.daaw;

import android.os.SystemClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public class fg2 implements ff2 {

    /* renamed from: a */
    public final eg2 f9554a;

    /* renamed from: b */
    public final hg2 f9555b;
    @Deprecated

    /* renamed from: c */
    public final eg2 f9556c;

    public fg2(eg2 eg2Var) {
        hg2 hg2Var = new hg2(4096);
        this.f9554a = eg2Var;
        this.f9556c = eg2Var;
        this.f9555b = hg2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.daaw.ff2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mf2 zza(qf2 qf2Var) {
        tg2 tg2Var;
        byte[] bArr;
        yg2 yg2Var;
        yg2 yg2Var2;
        int zzb;
        String str;
        zf2 zf2Var;
        String str2;
        Map map;
        byte[] bArr2;
        byte[] bArr3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z = true;
            try {
                ve2 zzd = qf2Var.zzd();
                if (zzd == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str3 = zzd.f30177b;
                    if (str3 != null) {
                        hashMap.put("If-None-Match", str3);
                    }
                    long j = zzd.f30179d;
                    if (j > 0) {
                        hashMap.put("If-Modified-Since", sg2.m10371c(j));
                    }
                    map = hashMap;
                }
                String zzk = qf2Var.zzk();
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(map);
                hashMap2.putAll(qf2Var.zzl());
                URL url = new URL(zzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int zzb2 = qf2Var.zzb();
                httpURLConnection.setConnectTimeout(zzb2);
                httpURLConnection.setReadTimeout(zzb2);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str4 : hashMap2.keySet()) {
                        httpURLConnection.setRequestProperty(str4, (String) hashMap2.get(str4));
                    }
                    if (qf2Var.zza() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] zzx = qf2Var.zzx();
                        if (zzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(zzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                            break;
                        } catch (Throwable th) {
                            th = th;
                            z = false;
                            if (!z) {
                            }
                            throw th;
                            break;
                            break;
                        }
                    }
                    qf2Var.zza();
                    if ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) {
                        try {
                            tg2Var = new tg2(responseCode, wg2.m6075a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new ug2(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e) {
                                    e = e;
                                    tg2Var = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        yg2Var = new yg2("socket", new yf2(), null);
                                    } else if (e instanceof MalformedURLException) {
                                        throw new RuntimeException("Bad URL ".concat(String.valueOf(qf2Var.zzk())), e);
                                    } else {
                                        if (tg2Var == null) {
                                            throw new nf2(e);
                                        }
                                        int m9182b = tg2Var.m9182b();
                                        cg2.m25391b("Unexpected response code %d for %s", Integer.valueOf(m9182b), qf2Var.zzk());
                                        if (bArr != null) {
                                            mf2 mf2Var = new mf2(m9182b, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, tg2Var.m9180d());
                                            if (m9182b != 401 && m9182b != 403) {
                                                if (m9182b < 400 || m9182b > 499) {
                                                    throw new xf2(mf2Var);
                                                }
                                                throw new ze2(mf2Var);
                                            }
                                            yg2Var = new yg2("auth", new ue2(mf2Var), null);
                                        } else {
                                            yg2Var = new yg2("network", new hf2(), null);
                                        }
                                    }
                                    yg2Var2 = yg2Var;
                                    af2 zzy = qf2Var.zzy();
                                    zzb = qf2Var.zzb();
                                    try {
                                        zf2Var = yg2Var2.f33642b;
                                        zzy.m27493c(zf2Var);
                                        str2 = yg2Var2.f33641a;
                                        qf2Var.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                                    } catch (zf2 e2) {
                                        str = yg2Var2.f33641a;
                                        qf2Var.zzm(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(zzb)));
                                        throw e2;
                                    }
                                }
                            }
                            throw th;
                            break;
                        }
                    } else {
                        tg2Var = new tg2(responseCode, wg2.m6075a(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    }
                    try {
                        int m9182b2 = tg2Var.m9182b();
                        List<ef2> m9180d = tg2Var.m9180d();
                        if (m9182b2 == 304) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            ve2 zzd2 = qf2Var.zzd();
                            if (zzd2 == null) {
                                return new mf2(304, (byte[]) null, true, elapsedRealtime2, m9180d);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!m9180d.isEmpty()) {
                                for (ef2 ef2Var : m9180d) {
                                    treeSet.add(ef2Var.m23524a());
                                }
                            }
                            ArrayList arrayList = new ArrayList(m9180d);
                            List list = zzd2.f30183h;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (ef2 ef2Var2 : zzd2.f30183h) {
                                        if (!treeSet.contains(ef2Var2.m23524a())) {
                                            arrayList.add(ef2Var2);
                                        }
                                    }
                                }
                            } else if (!zzd2.f30182g.isEmpty()) {
                                for (Map.Entry entry : zzd2.f30182g.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new ef2((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new mf2(304, zzd2.f30176a, true, elapsedRealtime2, (List) arrayList);
                        }
                        InputStream m9181c = tg2Var.m9181c();
                        if (m9181c != null) {
                            int m9183a = tg2Var.m9183a();
                            try {
                                hg2 hg2Var = this.f9555b;
                                zg2 zg2Var = new zg2(hg2Var, m9183a);
                                try {
                                    bArr3 = hg2Var.m20801b(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
                                    while (true) {
                                        try {
                                            int read = m9181c.read(bArr3);
                                            if (read == -1) {
                                                break;
                                            }
                                            zg2Var.write(bArr3, 0, read);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                m9181c.close();
                                            } catch (IOException unused) {
                                                cg2.m25389d("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            hg2Var.m20802a(bArr3);
                                            zg2Var.close();
                                            throw th;
                                            break;
                                        }
                                    }
                                    bArr2 = zg2Var.toByteArray();
                                    try {
                                        m9181c.close();
                                    } catch (IOException unused2) {
                                        cg2.m25389d("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    hg2Var.m20802a(bArr3);
                                    zg2Var.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArr3 = null;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                bArr = null;
                                if (e instanceof SocketTimeoutException) {
                                }
                                yg2Var2 = yg2Var;
                                af2 zzy2 = qf2Var.zzy();
                                zzb = qf2Var.zzb();
                                zf2Var = yg2Var2.f33642b;
                                zzy2.m27493c(zf2Var);
                                str2 = yg2Var2.f33641a;
                                qf2Var.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                            }
                        } else {
                            bArr2 = new byte[0];
                        }
                        try {
                            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (!cg2.f5792a) {
                                if (elapsedRealtime3 > 3000) {
                                }
                                if (m9182b2 >= 200 || m9182b2 > 299) {
                                    throw new IOException();
                                }
                                return new mf2(m9182b2, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, m9180d);
                            }
                            Object[] objArr = new Object[5];
                            objArr[0] = qf2Var;
                            objArr[1] = Long.valueOf(elapsedRealtime3);
                            objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                            objArr[3] = Integer.valueOf(m9182b2);
                            objArr[4] = Integer.valueOf(qf2Var.zzy().m27495a());
                            cg2.m25392a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            if (m9182b2 >= 200) {
                            }
                            throw new IOException();
                        } catch (IOException e4) {
                            e = e4;
                            bArr = bArr2;
                            if (e instanceof SocketTimeoutException) {
                            }
                            yg2Var2 = yg2Var;
                            af2 zzy22 = qf2Var.zzy();
                            zzb = qf2Var.zzb();
                            zf2Var = yg2Var2.f33642b;
                            zzy22.m27493c(zf2Var);
                            str2 = yg2Var2.f33641a;
                            qf2Var.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e6) {
                e = e6;
            }
            str2 = yg2Var2.f33641a;
            qf2Var.zzm(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(zzb)));
        }
    }
}
