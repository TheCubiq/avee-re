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
    public String d;
    public Context e;
    public String f;
    public AtomicBoolean h;
    public File i;
    public final BlockingQueue a = new ArrayBlockingQueue(100);
    public final LinkedHashMap b = new LinkedHashMap();
    public final Map c = new HashMap();
    public final HashSet g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(l93 l93Var) {
        while (true) {
            try {
                v93 v93Var = (v93) l93Var.a.take();
                u93 a = v93Var.a();
                if (!TextUtils.isEmpty(a.b())) {
                    l93Var.g(l93Var.b(l93Var.b, v93Var.b()), a);
                }
            } catch (InterruptedException e) {
                k04.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    public final r93 a(String str) {
        r93 r93Var = (r93) this.c.get(str);
        return r93Var != null ? r93Var : r93.a;
    }

    public final Map b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, a(str).a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.e = context;
        this.f = str;
        this.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        atomicBoolean.set(((Boolean) va3.c.e()).booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.b.put((String) entry.getKey(), (String) entry.getValue());
        }
        z04.a.execute(new Runnable() { // from class: com.daaw.k93
            @Override // java.lang.Runnable
            public final void run() {
                l93.c(l93.this);
            }
        });
        Map map2 = this.c;
        r93 r93Var = r93.b;
        map2.put("action", r93Var);
        this.c.put("ad_format", r93Var);
        this.c.put("e", r93.c);
    }

    public final void e(String str) {
        if (this.g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f);
        linkedHashMap.put("ue", str);
        g(b(this.b, linkedHashMap), null);
    }

    public final boolean f(v93 v93Var) {
        return this.a.offer(v93Var);
    }

    public final void g(Map map, u93 u93Var) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (u93Var != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(u93Var.b())) {
                sb.append("&it=");
                sb.append(u93Var.b());
            }
            if (!TextUtils.isEmpty(u93Var.a())) {
                sb.append("&blat=");
                sb.append(u93Var.a());
            }
            uri = sb.toString();
        }
        if (!this.h.get()) {
            zzt.zzp();
            zzs.zzH(this.e, this.f, uri);
            return;
        }
        File file = this.i;
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
