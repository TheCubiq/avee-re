package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzajm implements zzakh {
    private Context mContext;
    private String zzcpq;
    private zzanz<ArrayList<String>> zzcpu;
    private zzes zzvy;
    private zzang zzyf;
    private final Object mLock = new Object();
    private final zzajt zzcpl = new zzajt();
    private final zzakd zzcpm = new zzakd();
    private boolean zzzv = false;
    @Nullable
    private zznn zzcpn = null;
    @Nullable
    private zzgk zzcpo = null;
    @Nullable
    private zzgf zzahz = null;
    @Nullable
    private Boolean zzcpp = null;
    private final AtomicInteger zzcpr = new AtomicInteger(0);
    private final zzajp zzcps = new zzajp(null);
    private final Object zzcpt = new Object();

    @Nullable
    private final zzgk zza(@Nullable Context context, boolean z, boolean z2) {
        if (((Boolean) zzkb.zzik().zzd(zznk.zzawk)).booleanValue() && PlatformVersion.isAtLeastIceCreamSandwich()) {
            if (!((Boolean) zzkb.zzik().zzd(zznk.zzaws)).booleanValue()) {
                if (!((Boolean) zzkb.zzik().zzd(zznk.zzawq)).booleanValue()) {
                    return null;
                }
            }
            if (z && z2) {
                return null;
            }
            synchronized (this.mLock) {
                if (Looper.getMainLooper() != null && context != null) {
                    if (this.zzahz == null) {
                        this.zzahz = new zzgf();
                    }
                    if (this.zzcpo == null) {
                        this.zzcpo = new zzgk(this.zzahz, zzadb.zzc(context, this.zzyf));
                    }
                    this.zzcpo.zzgw();
                    zzakb.zzdj("start fetching content...");
                    return this.zzcpo;
                }
                return null;
            }
        }
        return null;
    }

    private static ArrayList<String> zzag(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    @Nullable
    public final Context getApplicationContext() {
        return this.mContext;
    }

    @Nullable
    public final Resources getResources() {
        if (this.zzyf.zzcvg) {
            return this.mContext.getResources();
        }
        try {
            DynamiteModule load = DynamiteModule.load(this.mContext, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
            if (load != null) {
                return load.getModuleContext().getResources();
            }
            return null;
        } catch (DynamiteModule.LoadingException e) {
            zzakb.zzc("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zza(Boolean bool) {
        synchronized (this.mLock) {
            this.zzcpp = bool;
        }
    }

    public final void zza(Throwable th, String str) {
        zzadb.zzc(this.mContext, this.zzyf).zza(th, str);
    }

    public final void zzaa(boolean z) {
        this.zzcps.zzaa(z);
    }

    @Nullable
    public final zzgk zzaf(@Nullable Context context) {
        return zza(context, this.zzcpm.zzqu(), this.zzcpm.zzqw());
    }

    public final void zzb(Throwable th, String str) {
        zzadb.zzc(this.mContext, this.zzyf).zza(th, str, ((Float) zzkb.zzik().zzd(zznk.zzaul)).floatValue());
    }

    public final void zzd(Context context, zzang zzangVar) {
        zznn zznnVar;
        synchronized (this.mLock) {
            if (!this.zzzv) {
                this.mContext = context.getApplicationContext();
                this.zzyf = zzangVar;
                com.google.android.gms.ads.internal.zzbv.zzen().zza(com.google.android.gms.ads.internal.zzbv.zzep());
                this.zzcpm.initialize(this.mContext);
                this.zzcpm.zza(this);
                zzadb.zzc(this.mContext, this.zzyf);
                this.zzcpq = com.google.android.gms.ads.internal.zzbv.zzek().zzm(context, zzangVar.zzcw);
                this.zzvy = new zzes(context.getApplicationContext(), this.zzyf);
                com.google.android.gms.ads.internal.zzbv.zzet();
                if (((Boolean) zzkb.zzik().zzd(zznk.zzawh)).booleanValue()) {
                    zznnVar = new zznn();
                } else {
                    zzakb.v("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zznnVar = null;
                }
                this.zzcpn = zznnVar;
                zzanm.zza((zzanz) new zzajo(this).zznt(), "AppState.registerCsiReporter");
                this.zzzv = true;
                zzqi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakh
    public final void zzd(Bundle bundle) {
        if (bundle.containsKey("content_url_opted_out") && bundle.containsKey("content_vertical_opted_out")) {
            zza(this.mContext, bundle.getBoolean("content_url_opted_out"), bundle.getBoolean("content_vertical_opted_out"));
        }
    }

    public final zzajt zzpx() {
        return this.zzcpl;
    }

    @Nullable
    public final zznn zzpy() {
        zznn zznnVar;
        synchronized (this.mLock) {
            zznnVar = this.zzcpn;
        }
        return zznnVar;
    }

    public final Boolean zzpz() {
        Boolean bool;
        synchronized (this.mLock) {
            bool = this.zzcpp;
        }
        return bool;
    }

    public final boolean zzqa() {
        return this.zzcps.zzqa();
    }

    public final boolean zzqb() {
        return this.zzcps.zzqb();
    }

    public final void zzqc() {
        this.zzcps.zzqc();
    }

    public final zzes zzqd() {
        return this.zzvy;
    }

    public final void zzqe() {
        this.zzcpr.incrementAndGet();
    }

    public final void zzqf() {
        this.zzcpr.decrementAndGet();
    }

    public final int zzqg() {
        return this.zzcpr.get();
    }

    public final zzakd zzqh() {
        zzakd zzakdVar;
        synchronized (this.mLock) {
            zzakdVar = this.zzcpm;
        }
        return zzakdVar;
    }

    public final zzanz<ArrayList<String>> zzqi() {
        if (this.mContext != null && PlatformVersion.isAtLeastJellyBean()) {
            if (!((Boolean) zzkb.zzik().zzd(zznk.zzbau)).booleanValue()) {
                synchronized (this.zzcpt) {
                    if (this.zzcpu != null) {
                        return this.zzcpu;
                    }
                    zzanz<ArrayList<String>> zza = zzaki.zza(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzajn
                        private final zzajm zzcpv;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzcpv = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzcpv.zzqj();
                        }
                    });
                    this.zzcpu = zza;
                    return zza;
                }
            }
        }
        return zzano.zzi(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzqj() throws Exception {
        return zzag(this.mContext);
    }
}
