package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzajh {
    public final int errorCode;
    public final int orientation;
    public final List<String> zzbsn;
    public final List<String> zzbso;
    public final List<String> zzbsp;
    public final List<String> zzbsr;
    public final long zzbsu;
    public final zzwx zzbtw;
    public final zzxq zzbtx;
    public final String zzbty;
    public final zzxa zzbtz;
    public final zzaqw zzbyo;
    public final zzjj zzccv;
    public final String zzccy;
    private final long zzcep;
    public final boolean zzceq;
    private final long zzcer;
    public final List<String> zzces;
    public final String zzcev;
    public final zzaig zzcfe;
    public final List<String> zzcfg;
    public final boolean zzcfh;
    private final zzael zzcfi;
    public final String zzcfl;
    public final boolean zzcfp;
    private final String zzcfq;
    public final JSONObject zzcob;
    public boolean zzcoc;
    public final zzwy zzcod;
    public final String zzcoe;
    public final zzjn zzcof;
    public final List<String> zzcog;
    public final long zzcoh;
    public final long zzcoi;
    public final zzpb zzcoj;
    public boolean zzcok;
    public boolean zzcol;
    public boolean zzcom;
    public boolean zzcon;
    public boolean zzcoo;
    public boolean zzcop;
    public final zzhs zzcoq;
    public final boolean zzcor;
    public final boolean zzzl;
    public final boolean zzzm;

    public zzajh(zzaji zzajiVar, zzaqw zzaqwVar, zzwx zzwxVar, zzxq zzxqVar, String str, zzxa zzxaVar, zzpb zzpbVar, String str2) {
        this(zzajiVar.zzcgs.zzccv, null, zzajiVar.zzcos.zzbsn, zzajiVar.errorCode, zzajiVar.zzcos.zzbso, zzajiVar.zzcos.zzces, zzajiVar.zzcos.orientation, zzajiVar.zzcos.zzbsu, zzajiVar.zzcgs.zzccy, zzajiVar.zzcos.zzceq, null, null, null, zzajiVar.zzcod, null, zzajiVar.zzcos.zzcer, zzajiVar.zzacv, zzajiVar.zzcos.zzcep, zzajiVar.zzcoh, zzajiVar.zzcoi, zzajiVar.zzcos.zzcev, zzajiVar.zzcob, null, zzajiVar.zzcos.zzcfe, zzajiVar.zzcos.zzcff, zzajiVar.zzcos.zzcff, zzajiVar.zzcos.zzcfh, zzajiVar.zzcos.zzcfi, null, zzajiVar.zzcos.zzbsr, zzajiVar.zzcos.zzcfl, zzajiVar.zzcoq, zzajiVar.zzcos.zzzl, zzajiVar.zzcor, zzajiVar.zzcos.zzcfp, zzajiVar.zzcos.zzbsp, zzajiVar.zzcos.zzzm, zzajiVar.zzcos.zzcfq);
    }

    public zzajh(zzjj zzjjVar, zzaqw zzaqwVar, List<String> list, int i, List<String> list2, List<String> list3, int i2, long j, String str, boolean z, zzwx zzwxVar, zzxq zzxqVar, String str2, zzwy zzwyVar, zzxa zzxaVar, long j2, zzjn zzjnVar, long j3, long j4, long j5, String str3, JSONObject jSONObject, zzpb zzpbVar, zzaig zzaigVar, List<String> list4, List<String> list5, boolean z2, zzael zzaelVar, String str4, List<String> list6, String str5, zzhs zzhsVar, boolean z3, boolean z4, boolean z5, List<String> list7, boolean z6, String str6) {
        this.zzcok = false;
        this.zzcol = false;
        this.zzcom = false;
        this.zzcon = false;
        this.zzcoo = false;
        this.zzcop = false;
        this.zzccv = zzjjVar;
        this.zzbyo = zzaqwVar;
        this.zzbsn = zzn(list);
        this.errorCode = i;
        this.zzbso = zzn(list2);
        this.zzces = zzn(list3);
        this.orientation = i2;
        this.zzbsu = j;
        this.zzccy = str;
        this.zzceq = z;
        this.zzbtw = zzwxVar;
        this.zzbtx = zzxqVar;
        this.zzbty = str2;
        this.zzcod = zzwyVar;
        this.zzbtz = zzxaVar;
        this.zzcer = j2;
        this.zzcof = zzjnVar;
        this.zzcep = j3;
        this.zzcoh = j4;
        this.zzcoi = j5;
        this.zzcev = str3;
        this.zzcob = jSONObject;
        this.zzcoj = zzpbVar;
        this.zzcfe = zzaigVar;
        this.zzcog = zzn(list4);
        this.zzcfg = zzn(list5);
        this.zzcfh = z2;
        this.zzcfi = zzaelVar;
        this.zzcoe = str4;
        this.zzbsr = zzn(list6);
        this.zzcfl = str5;
        this.zzcoq = zzhsVar;
        this.zzzl = z3;
        this.zzcor = z4;
        this.zzcfp = z5;
        this.zzbsp = zzn(list7);
        this.zzzm = z6;
        this.zzcfq = str6;
    }

    private static <T> List<T> zzn(List<T> list) {
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public final boolean zzfz() {
        zzaqw zzaqwVar = this.zzbyo;
        if (zzaqwVar == null || zzaqwVar.zzuf() == null) {
            return false;
        }
        return this.zzbyo.zzuf().zzfz();
    }
}
