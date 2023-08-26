package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzagr;
import com.google.android.gms.internal.ads.zzaib;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzald;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzaoe;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzlk;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zzwx;
import com.google.android.gms.internal.ads.zzwy;
import com.google.android.gms.internal.ads.zzxq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzay extends zzlk {
    private static final Object sLock = new Object();
    private static zzay zzzu;
    private final Context mContext;
    private final Object mLock = new Object();
    private boolean zzzv = false;
    private zzang zzzw;

    private zzay(Context context, zzang zzangVar) {
        this.mContext = context;
        this.zzzw = zzangVar;
    }

    public static zzay zza(Context context, zzang zzangVar) {
        zzay zzayVar;
        synchronized (sLock) {
            if (zzzu == null) {
                zzzu = new zzay(context.getApplicationContext(), zzangVar);
            }
            zzayVar = zzzu;
        }
        return zzayVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void setAppMuted(boolean z) {
        zzbv.zzfj().setAppMuted(z);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void setAppVolume(float f) {
        zzbv.zzfj().setAppVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza() {
        synchronized (sLock) {
            if (this.zzzv) {
                zzakb.zzdk("Mobile ads is initialized already.");
                return;
            }
            this.zzzv = true;
            zznk.initialize(this.mContext);
            zzbv.zzeo().zzd(this.mContext, this.zzzw);
            zzbv.zzeq().initialize(this.mContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Runnable runnable) {
        Context context = this.mContext;
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map<String, zzwy> zzpw = zzbv.zzeo().zzqh().zzra().zzpw();
        if (zzpw == null || zzpw.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzakb.zzc("Could not initialize rewarded ads.", th);
                return;
            }
        }
        zzagr zzox = zzagr.zzox();
        if (zzox != null) {
            Collection<zzwy> values = zzpw.values();
            HashMap hashMap = new HashMap();
            IObjectWrapper wrap = ObjectWrapper.wrap(context);
            for (zzwy zzwyVar : values) {
                for (zzwx zzwxVar : zzwyVar.zzbsm) {
                    String str = zzwxVar.zzbsb;
                    for (String str2 : zzwxVar.zzbrt) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzaib zzca = zzox.zzca(str3);
                    if (zzca != null) {
                        zzxq zzpe = zzca.zzpe();
                        if (!zzpe.isInitialized() && zzpe.zzms()) {
                            zzpe.zza(wrap, zzca.zzpf(), (List) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            zzakb.zzck(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (Throwable th2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    zzakb.zzc(sb.toString(), th2);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zznk.initialize(this.mContext);
        boolean booleanValue = ((Boolean) zzkb.zzik().zzd(zznk.zzbcs)).booleanValue() | ((Boolean) zzkb.zzik().zzd(zznk.zzayd)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) zzkb.zzik().zzd(zznk.zzayd)).booleanValue()) {
            booleanValue = true;
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.ads.internal.zzaz
                private final Runnable zzxi;
                private final zzay zzzx;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzzx = this;
                    this.zzxi = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final zzay zzayVar = this.zzzx;
                    final Runnable runnable3 = this.zzxi;
                    zzaoe.zzcvy.execute(new Runnable(zzayVar, runnable3) { // from class: com.google.android.gms.ads.internal.zzba
                        private final Runnable zzxi;
                        private final zzay zzzx;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzzx = zzayVar;
                            this.zzxi = runnable3;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzzx.zza(this.zzxi);
                        }
                    });
                }
            };
        }
        if (booleanValue) {
            zzbv.zzes().zza(this.mContext, this.zzzw, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzakb.e("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzakb.e("Context is null. Failed to open debug menu.");
            return;
        }
        zzald zzaldVar = new zzald(context);
        zzaldVar.setAdUnitId(str);
        zzaldVar.zzda(this.zzzw.zzcw);
        zzaldVar.showDialog();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final float zzdo() {
        return zzbv.zzfj().zzdo();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final boolean zzdp() {
        return zzbv.zzfj().zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public final void zzt(String str) {
        zznk.initialize(this.mContext);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbcs)).booleanValue()) {
            zzbv.zzes().zza(this.mContext, this.zzzw, str, null);
        }
    }
}
