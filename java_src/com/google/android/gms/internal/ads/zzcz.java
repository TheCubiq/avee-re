package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes2.dex */
public class zzcz {
    private static final String TAG = zzcz.class.getSimpleName();
    protected Context zzrt;
    private ExecutorService zzru;
    private DexClassLoader zzrv;
    private zzck zzrw;
    private byte[] zzrx;
    private boolean zzsa;
    private zzcc zzsd;
    private Map<Pair<String, String>, zzeg> zzsg;
    private volatile AdvertisingIdClient zzry = null;
    private volatile boolean zzqt = false;
    private Future zzrz = null;
    private volatile zzba zzsb = null;
    private Future zzsc = null;
    private boolean zzse = false;
    private boolean zzsf = false;
    private boolean zzsh = false;
    private boolean zzsi = true;
    private boolean zzsj = false;

    /* loaded from: classes2.dex */
    final class zza extends BroadcastReceiver {
        private zza() {
        }

        /* synthetic */ zza(zzcz zzczVar, zzda zzdaVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                zzcz.this.zzsi = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                zzcz.this.zzsi = false;
            }
        }
    }

    private zzcz(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.zzsa = z;
        this.zzrt = z ? applicationContext : context;
        this.zzsg = new HashMap();
    }

    public static zzcz zza(Context context, String str, String str2, boolean z) {
        zzcz zzczVar = new zzcz(context);
        try {
            zzczVar.zzru = Executors.newCachedThreadPool(new zzda());
            zzczVar.zzqt = z;
            if (z) {
                zzczVar.zzrz = zzczVar.zzru.submit(new zzdb(zzczVar));
            }
            zzczVar.zzru.execute(new zzdd(zzczVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                zzczVar.zzse = googleApiAvailabilityLight.getApkVersion(zzczVar.zzrt) > 0;
                zzczVar.zzsf = googleApiAvailabilityLight.isGooglePlayServicesAvailable(zzczVar.zzrt) == 0;
            } catch (Throwable unused) {
            }
            zzczVar.zza(0, true);
            if (zzdg.isMainThread() && ((Boolean) zzkb.zzik().zzd(zznk.zzbaz)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzck zzckVar = new zzck(null);
            zzczVar.zzrw = zzckVar;
            try {
                zzczVar.zzrx = zzckVar.zzl(str);
            } catch (zzcl e) {
                throw new zzcw(e);
            }
        } catch (zzcw unused2) {
        }
        try {
            try {
                try {
                    File cacheDir = zzczVar.zzrt.getCacheDir();
                    if (cacheDir == null && (cacheDir = zzczVar.zzrt.getDir("dex", 0)) == null) {
                        throw new zzcw();
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1521499837408"));
                    if (!file.exists()) {
                        byte[] zza2 = zzczVar.zzrw.zza(zzczVar.zzrx, str2);
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(zza2, 0, zza2.length);
                        fileOutputStream.close();
                    }
                    zzczVar.zzb(cacheDir, "1521499837408");
                    try {
                        zzczVar.zzrv = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzczVar.zzrt.getClassLoader());
                        zzb(file);
                        zzczVar.zza(cacheDir, "1521499837408");
                        zzm(String.format("%s/%s.dex", cacheDir, "1521499837408"));
                        if (!zzczVar.zzsj) {
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("android.intent.action.USER_PRESENT");
                            intentFilter.addAction("android.intent.action.SCREEN_OFF");
                            zzczVar.zzrt.registerReceiver(new zza(zzczVar, null), intentFilter);
                            zzczVar.zzsj = true;
                        }
                        zzczVar.zzsd = new zzcc(zzczVar);
                        zzczVar.zzsh = true;
                        return zzczVar;
                    } catch (Throwable th) {
                        zzb(file);
                        zzczVar.zza(cacheDir, "1521499837408");
                        zzm(String.format("%s/%s.dex", cacheDir, "1521499837408"));
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    throw new zzcw(e2);
                }
            } catch (IOException e3) {
                throw new zzcw(e3);
            }
        } catch (zzcl e4) {
            throw new zzcw(e4);
        } catch (NullPointerException e5) {
            throw new zzcw(e5);
        }
    }

    private final void zza(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    zzb(file3);
                    return;
                }
                zzbe zzbeVar = new zzbe();
                zzbeVar.zzgs = Build.VERSION.SDK.getBytes();
                zzbeVar.zzgr = str.getBytes();
                byte[] bytes = this.zzrw.zzb(this.zzrx, bArr).getBytes();
                zzbeVar.data = bytes;
                zzbeVar.zzgq = zzbk.zzb(bytes);
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] zzb = zzbfi.zzb(zzbeVar);
                    fileOutputStream.write(zzb, 0, zzb.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    zzb(file3);
                } catch (zzcl | IOException | NoSuchAlgorithmException unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    zzb(file3);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    zzb(file3);
                    throw th;
                }
            } catch (zzcl | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzcl | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(int i, zzba zzbaVar) {
        if (i < 4) {
            if (zzbaVar == null) {
                return true;
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbbc)).booleanValue() && (zzbaVar.zzcx == null || zzbaVar.zzcx.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbbd)).booleanValue()) {
                return zzbaVar.zzfn == null || zzbaVar.zzfn.zzgl == null || zzbaVar.zzfn.zzgl.longValue() == -2;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzal() {
        try {
            if (this.zzry == null && this.zzsa) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzrt);
                advertisingIdClient.start();
                this.zzry = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzry = null;
        }
    }

    private final zzba zzam() {
        try {
            return zzatq.zzl(this.zzrt, this.zzrt.getPackageName(), Integer.toString(this.zzrt.getPackageManager().getPackageInfo(this.zzrt.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void zzb(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(TAG, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    private final boolean zzb(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                zzb(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    Log.d(TAG, "Cannot read the cache data.");
                    zzb(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return false;
                }
                zzbe zzbeVar = (zzbe) zzbfi.zza(new zzbe(), bArr);
                if (str.equals(new String(zzbeVar.zzgr)) && Arrays.equals(zzbeVar.zzgq, zzbk.zzb(zzbeVar.data)) && Arrays.equals(zzbeVar.zzgs, Build.VERSION.SDK.getBytes())) {
                    byte[] zza2 = this.zzrw.zza(this.zzrx, new String(zzbeVar.data));
                    file3.createNewFile();
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        fileOutputStream.write(zza2, 0, zza2.length);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        return true;
                    } catch (zzcl | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        throw th;
                    }
                }
                zzb(file2);
                try {
                    fileInputStream2.close();
                } catch (IOException unused9) {
                }
                return false;
            } catch (zzcl | IOException | NoSuchAlgorithmException unused10) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzcl | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void zzm(String str) {
        zzb(new File(str));
    }

    public final Context getContext() {
        return this.zzrt;
    }

    public final boolean isInitialized() {
        return this.zzsh;
    }

    public final Method zza(String str, String str2) {
        zzeg zzegVar = this.zzsg.get(new Pair(str, str2));
        if (zzegVar == null) {
            return null;
        }
        return zzegVar.zzaw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, boolean z) {
        if (this.zzsf) {
            Future<?> submit = this.zzru.submit(new zzdc(this, i, z));
            if (i == 0) {
                this.zzsc = submit;
            }
        }
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzsg.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzsg.put(new Pair<>(str, str2), new zzeg(this, str, str2, clsArr));
        return true;
    }

    public final ExecutorService zzab() {
        return this.zzru;
    }

    public final DexClassLoader zzac() {
        return this.zzrv;
    }

    public final zzck zzad() {
        return this.zzrw;
    }

    public final byte[] zzae() {
        return this.zzrx;
    }

    public final boolean zzaf() {
        return this.zzse;
    }

    public final zzcc zzag() {
        return this.zzsd;
    }

    public final boolean zzah() {
        return this.zzsf;
    }

    public final boolean zzai() {
        return this.zzsi;
    }

    public final zzba zzaj() {
        return this.zzsb;
    }

    public final Future zzak() {
        return this.zzsc;
    }

    public final AdvertisingIdClient zzan() {
        if (this.zzqt) {
            if (this.zzry != null) {
                return this.zzry;
            }
            Future future = this.zzrz;
            if (future != null) {
                try {
                    future.get(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS, TimeUnit.MILLISECONDS);
                    this.zzrz = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    this.zzrz.cancel(true);
                }
            }
            return this.zzry;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzba zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return zzam();
    }

    public final int zzx() {
        if (this.zzsd != null) {
            return zzcc.zzx();
        }
        return Integer.MIN_VALUE;
    }
}
