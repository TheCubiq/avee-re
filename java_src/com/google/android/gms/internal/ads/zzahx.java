package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzahx extends zzajx implements zzahw {
    private final Context mContext;
    private final Object mLock;
    private final zzaji zzbze;
    private final long zzclp;
    private final ArrayList<zzahn> zzcmd;
    private final List<zzahq> zzcme;
    private final HashSet<String> zzcmf;
    private final zzago zzcmg;

    public zzahx(Context context, zzaji zzajiVar, zzago zzagoVar) {
        this(context, zzajiVar, zzagoVar, ((Long) zzkb.zzik().zzd(zznk.zzaye)).longValue());
    }

    private zzahx(Context context, zzaji zzajiVar, zzago zzagoVar, long j) {
        this.zzcmd = new ArrayList<>();
        this.zzcme = new ArrayList();
        this.zzcmf = new HashSet<>();
        this.mLock = new Object();
        this.mContext = context;
        this.zzbze = zzajiVar;
        this.zzcmg = zzagoVar;
        this.zzclp = j;
    }

    private final zzajh zza(int i, String str, zzwx zzwxVar) {
        zzjn zzjnVar;
        boolean z;
        String str2;
        long j;
        String substring;
        boolean z2;
        int i2;
        zzjj zzjjVar = this.zzbze.zzcgs.zzccv;
        List<String> list = this.zzbze.zzcos.zzbsn;
        List<String> list2 = this.zzbze.zzcos.zzbso;
        List<String> list3 = this.zzbze.zzcos.zzces;
        int i3 = this.zzbze.zzcos.orientation;
        long j2 = this.zzbze.zzcos.zzbsu;
        String str3 = this.zzbze.zzcgs.zzccy;
        boolean z3 = this.zzbze.zzcos.zzceq;
        zzwy zzwyVar = this.zzbze.zzcod;
        long j3 = this.zzbze.zzcos.zzcer;
        zzjn zzjnVar2 = this.zzbze.zzacv;
        long j4 = this.zzbze.zzcos.zzcep;
        long j5 = this.zzbze.zzcoh;
        long j6 = this.zzbze.zzcos.zzceu;
        String str4 = this.zzbze.zzcos.zzcev;
        JSONObject jSONObject = this.zzbze.zzcob;
        zzaig zzaigVar = this.zzbze.zzcos.zzcfe;
        List<String> list4 = this.zzbze.zzcos.zzcff;
        List<String> list5 = this.zzbze.zzcos.zzcfg;
        boolean z4 = this.zzbze.zzcos.zzcfh;
        zzael zzaelVar = this.zzbze.zzcos.zzcfi;
        StringBuilder sb = new StringBuilder("");
        List<zzahq> list6 = this.zzcme;
        if (list6 == null) {
            substring = sb.toString();
            zzjnVar = zzjnVar2;
            z = z3;
            str2 = str4;
            j = j6;
        } else {
            Iterator<zzahq> it = list6.iterator();
            while (true) {
                zzjnVar = zzjnVar2;
                if (!it.hasNext()) {
                    break;
                }
                zzahq next = it.next();
                if (next != null) {
                    Iterator<zzahq> it2 = it;
                    if (TextUtils.isEmpty(next.zzbru)) {
                        it = it2;
                    } else {
                        String str5 = next.zzbru;
                        String str6 = str4;
                        int i4 = next.errorCode;
                        long j7 = j6;
                        if (i4 == 3) {
                            z2 = z3;
                            i2 = 1;
                        } else if (i4 == 4) {
                            z2 = z3;
                            i2 = 2;
                        } else if (i4 != 5) {
                            i2 = 6;
                            if (i4 == 6) {
                                z2 = z3;
                                i2 = 0;
                            } else if (i4 != 7) {
                                z2 = z3;
                            } else {
                                z2 = z3;
                                i2 = 3;
                            }
                        } else {
                            z2 = z3;
                            i2 = 4;
                        }
                        long j8 = next.zzbub;
                        boolean z5 = z2;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 33);
                        sb2.append(str5);
                        sb2.append(".");
                        sb2.append(i2);
                        sb2.append(".");
                        sb2.append(j8);
                        sb.append(String.valueOf(sb2.toString()).concat("_"));
                        it = it2;
                        zzjnVar2 = zzjnVar;
                        str4 = str6;
                        j6 = j7;
                        z3 = z5;
                    }
                }
                zzjnVar2 = zzjnVar;
            }
            z = z3;
            str2 = str4;
            j = j6;
            substring = sb.substring(0, Math.max(0, sb.length() - 1));
        }
        return new zzajh(zzjjVar, null, list, i, list2, list3, i3, j2, str3, z, zzwxVar, null, str, zzwyVar, null, j3, zzjnVar, j4, j5, j, str2, jSONObject, null, zzaigVar, list4, list5, z4, zzaelVar, substring, this.zzbze.zzcos.zzbsr, this.zzbze.zzcos.zzcfl, this.zzbze.zzcoq, this.zzbze.zzcos.zzzl, this.zzbze.zzcor, this.zzbze.zzcos.zzcfp, this.zzbze.zzcos.zzbsp, this.zzbze.zzcos.zzzm, this.zzbze.zzcos.zzcfq);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void zza(String str, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void zzcb(String str) {
        synchronized (this.mLock) {
            this.zzcmf.add(str);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:? -> B:35:0x00b5). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        Object obj;
        for (zzwx zzwxVar : this.zzbze.zzcod.zzbsm) {
            String str = zzwxVar.zzbsb;
            for (String str2 : zzwxVar.zzbrt) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str2) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str2)) {
                    try {
                        str2 = new JSONObject(str).getString("class_name");
                    } catch (JSONException e) {
                        zzakb.zzb("Unable to determine custom event class name, skipping...", e);
                    }
                }
                String str3 = str2;
                Object obj2 = this.mLock;
                synchronized (obj2) {
                    try {
                        zzaib zzca = this.zzcmg.zzca(str3);
                        if (zzca != null && zzca.zzpf() != null && zzca.zzpe() != null) {
                            obj = obj2;
                            try {
                                zzahn zzahnVar = new zzahn(this.mContext, str3, str, zzwxVar, this.zzbze, zzca, this, this.zzclp);
                                zzahnVar.zza(this.zzcmg.zzos());
                                this.zzcmd.add(zzahnVar);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        obj = obj2;
                        this.zzcme.add(new zzahs().zzcd(zzwxVar.zzbru).zzcc(str3).zzg(0L).zzad(7).zzpd());
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<zzahn> arrayList = this.zzcmd;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            zzahn zzahnVar2 = arrayList.get(i2);
            i2++;
            zzahn zzahnVar3 = zzahnVar2;
            if (hashSet.add(zzahnVar3.zzbth)) {
                zzahnVar3.zzoz();
            }
        }
        ArrayList<zzahn> arrayList2 = this.zzcmd;
        int size2 = arrayList2.size();
        while (i < size2) {
            zzahn zzahnVar4 = arrayList2.get(i);
            i++;
            zzahn zzahnVar5 = zzahnVar4;
            try {
                try {
                    try {
                        zzahnVar5.zzoz().get();
                        synchronized (this.mLock) {
                            if (!TextUtils.isEmpty(zzahnVar5.zzbth)) {
                                this.zzcme.add(zzahnVar5.zzpa());
                            }
                        }
                        synchronized (this.mLock) {
                            if (this.zzcmf.contains(zzahnVar5.zzbth)) {
                                final zzajh zza = zza(-2, zzahnVar5.zzbth, zzahnVar5.zzpb());
                                zzamu.zzsy.post(new Runnable(this, zza) { // from class: com.google.android.gms.internal.ads.zzahy
                                    private final zzahx zzcmh;
                                    private final zzajh zzxk;

                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    {
                                        this.zzcmh = this;
                                        this.zzxk = zza;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zzcmh.zzm(this.zzxk);
                                    }
                                });
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        synchronized (this.mLock) {
                            if (!TextUtils.isEmpty(zzahnVar5.zzbth)) {
                                this.zzcme.add(zzahnVar5.zzpa());
                            }
                            throw th3;
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    synchronized (this.mLock) {
                        if (!TextUtils.isEmpty(zzahnVar5.zzbth)) {
                            this.zzcme.add(zzahnVar5.zzpa());
                        }
                    }
                }
            } catch (Exception e2) {
                zzakb.zzc("Unable to resolve rewarded adapter.", e2);
                synchronized (this.mLock) {
                    if (!TextUtils.isEmpty(zzahnVar5.zzbth)) {
                        this.zzcme.add(zzahnVar5.zzpa());
                    }
                }
            }
        }
        final zzajh zza2 = zza(3, null, null);
        zzamu.zzsy.post(new Runnable(this, zza2) { // from class: com.google.android.gms.internal.ads.zzahz
            private final zzahx zzcmh;
            private final zzajh zzxk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcmh = this;
                this.zzxk = zza2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzcmh.zzl(this.zzxk);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzajh zzajhVar) {
        this.zzcmg.zzot().zzb(zzajhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzajh zzajhVar) {
        this.zzcmg.zzot().zzb(zzajhVar);
    }
}
