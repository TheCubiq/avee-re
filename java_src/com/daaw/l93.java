package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class l93 {

    /* renamed from: d */
    public String f17158d;

    /* renamed from: e */
    public Context f17159e;

    /* renamed from: f */
    public String f17160f;

    /* renamed from: h */
    public AtomicBoolean f17162h;

    /* renamed from: i */
    public File f17163i;

    /* renamed from: a */
    public final BlockingQueue f17155a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    public final LinkedHashMap f17156b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f17157c = new HashMap();

    /* renamed from: g */
    public final HashSet f17161g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    /* renamed from: c */
    public static /* synthetic */ void m17084c(l93 l93Var) {
        while (true) {
            try {
                v93 v93Var = (v93) l93Var.f17155a.take();
                u93 m7317a = v93Var.m7317a();
                if (!TextUtils.isEmpty(m7317a.m8406b())) {
                    l93Var.m17080g(l93Var.m17085b(l93Var.f17156b, v93Var.m7316b()), m7317a);
                }
            } catch (InterruptedException e) {
                k04.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* renamed from: a */
    public final r93 m17086a(String str) {
        r93 r93Var = (r93) this.f17157c.get(str);
        return r93Var != null ? r93Var : r93.f24986a;
    }

    /* renamed from: b */
    public final Map m17085b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, m17086a(str).mo11550a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public final void m17083d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f17159e = context;
        this.f17160f = str;
        this.f17158d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f17162h = atomicBoolean;
        atomicBoolean.set(((Boolean) va3.f30079c.m16137e()).booleanValue());
        if (this.f17162h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f17163i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f17156b.put((String) entry.getKey(), (String) entry.getValue());
        }
        z04.f34305a.execute(new Runnable() { // from class: com.daaw.k93
            @Override // java.lang.Runnable
            public final void run() {
                l93.m17084c(l93.this);
            }
        });
        Map map2 = this.f17157c;
        r93 r93Var = r93.f24987b;
        map2.put("action", r93Var);
        this.f17157c.put("ad_format", r93Var);
        this.f17157c.put("e", r93.f24988c);
    }

    /* renamed from: e */
    public final void m17082e(String str) {
        if (this.f17161g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f17160f);
        linkedHashMap.put("ue", str);
        m17080g(m17085b(this.f17156b, linkedHashMap), null);
    }

    /* renamed from: f */
    public final boolean m17081f(v93 v93Var) {
        return this.f17155a.offer(v93Var);
    }

    /* renamed from: g */
    public final void m17080g(Map map, u93 u93Var) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.f17158d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (u93Var != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(u93Var.m8406b())) {
                sb.append("&it=");
                sb.append(u93Var.m8406b());
            }
            if (!TextUtils.isEmpty(u93Var.m8407a())) {
                sb.append("&blat=");
                sb.append(u93Var.m8407a());
            }
            uri = sb.toString();
        }
        if (!this.f17162h.get()) {
            zzt.zzp();
            zzs.zzH(this.f17159e, this.f17160f, uri);
            return;
        }
        File file = this.f17163i;
        if (file == null) {
            k04.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                k04.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            k04.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    k04.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    k04.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            }
            throw th;
        }
    }
}
