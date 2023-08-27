package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zznn {
    private Context mContext;
    private String zzaej;
    private String zzbfx;
    private ExecutorService zzbga;
    private AtomicBoolean zzbgd;
    private File zzbge;
    private BlockingQueue<zznx> zzbfz = new ArrayBlockingQueue(100);
    private LinkedHashMap<String, String> zzbgb = new LinkedHashMap<>();
    private Map<String, zznr> zzbgc = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzjf() {
        FileOutputStream fileOutputStream;
        while (true) {
            try {
                zznx take = this.zzbfz.take();
                String zzjk = take.zzjk();
                if (!TextUtils.isEmpty(zzjk)) {
                    Map<String, String> zza = zza(this.zzbgb, take.zzjl());
                    Uri.Builder buildUpon = Uri.parse(this.zzbfx).buildUpon();
                    for (Map.Entry<String, String> entry : zza.entrySet()) {
                        buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    }
                    String str = buildUpon.build().toString() + "&it=" + zzjk;
                    if (this.zzbgd.get()) {
                        File file = this.zzbge;
                        if (file != null) {
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
                                fileOutputStream.write(str.getBytes());
                                fileOutputStream.write(10);
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e2) {
                                    zzakb.zzc("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
                                }
                            } catch (IOException e3) {
                                e = e3;
                                fileOutputStream2 = fileOutputStream;
                                zzakb.zzc("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream2 = fileOutputStream;
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e4) {
                                        zzakb.zzc("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                    }
                                }
                                throw th;
                            }
                        } else {
                            zzakb.zzdk("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzbv.zzek();
                        zzakk.zzd(this.mContext, this.zzaej, str);
                    }
                }
            } catch (InterruptedException e5) {
                zzakb.zzc("CsiReporter:reporter interrupted", e5);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zza(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, zzal(key).zzd(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void zza(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.mContext = context;
        this.zzaej = str;
        this.zzbfx = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzbgd = atomicBoolean;
        atomicBoolean.set(((Boolean) zzkb.zzik().zzd(zznk.zzawj)).booleanValue());
        if (this.zzbgd.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzbge = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.zzbgb.put(entry.getKey(), entry.getValue());
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.zzbga = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new zzno(this));
        this.zzbgc.put("action", zznr.zzbgh);
        this.zzbgc.put("ad_format", zznr.zzbgh);
        this.zzbgc.put("e", zznr.zzbgi);
    }

    public final boolean zza(zznx zznxVar) {
        return this.zzbfz.offer(zznxVar);
    }

    public final zznr zzal(String str) {
        zznr zznrVar = this.zzbgc.get(str);
        return zznrVar != null ? zznrVar : zznr.zzbgg;
    }

    public final void zzg(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.zzbgb.put("e", TextUtils.join(",", list));
    }
}
