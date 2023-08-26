package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.AOSP.MyThumbnailUtils;
import java.io.IOException;
/* loaded from: classes2.dex */
public final class zzba extends zzbfc<zzba> {
    public Integer zzel;
    public Integer zzem;
    public Integer zzes;
    private Integer zzfe;
    private Integer zzff;
    private Integer zzfg;
    public Integer zzfj;
    public String zzdc = null;
    public String zzcw = null;
    public Long zzdd = null;
    private Long zzde = null;
    public Long zzdf = null;
    public Long zzdg = null;
    private Long zzdh = null;
    private Long zzdi = null;
    private Long zzdj = null;
    private Long zzdk = null;
    private Long zzdl = null;
    public Long zzdm = null;
    private String zzdn = null;
    public Long zzdo = null;
    public Long zzdp = null;
    public Long zzdq = null;
    public Long zzdr = null;
    private Long zzds = null;
    private Long zzdt = null;
    public Long zzdu = null;
    public Long zzdv = null;
    public Long zzdw = null;
    public String zzcx = null;
    public String zzdx = null;
    public Long zzdy = null;
    public Long zzdz = null;
    public Long zzea = null;
    public String zzcz = null;
    public Long zzeb = null;
    public Long zzec = null;
    public Long zzed = null;
    private zzbd zzee = null;
    public Long zzef = null;
    public Long zzeg = null;
    public Long zzeh = null;
    public Long zzei = null;
    public Long zzej = null;
    public Long zzek = null;
    public String zzda = null;
    public String zzdb = null;
    public Long zzen = null;
    public Long zzeo = null;
    public Long zzep = null;
    private Long zzeq = null;
    private Long zzer = null;
    public zzbb zzet = null;
    public zzbb[] zzeu = zzbb.zzs();
    public zzbc zzev = null;
    private Long zzew = null;
    public Long zzex = null;
    public Long zzey = null;
    public Long zzez = null;
    public Long zzfa = null;
    public Long zzfb = null;
    public String zzfc = null;
    private Long zzfd = null;
    private Long zzfh = null;
    public String zzfi = null;
    public Boolean zzfk = null;
    private String zzfl = null;
    public Long zzfm = null;
    public zzbf zzfn = null;

    public zzba() {
        this.zzebt = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        r5 = new java.lang.StringBuilder(45);
        r5.append(r2);
        r5.append(" is not a valid enum DebuggerState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    @Override // com.google.android.gms.internal.ads.zzbfi
    /* renamed from: zzb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzba zza(zzbez zzbezVar) throws IOException {
        int zzacc;
        zzbfi zzbfiVar;
        int zzacc2;
        while (true) {
            int zzabk = zzbezVar.zzabk();
            switch (zzabk) {
                case 0:
                    return this;
                case 10:
                    this.zzdc = zzbezVar.readString();
                    continue;
                case 18:
                    this.zzcw = zzbezVar.readString();
                    continue;
                case 24:
                    this.zzdd = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 32:
                    this.zzde = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 40:
                    this.zzdf = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 48:
                    this.zzdg = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 56:
                    this.zzdh = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 64:
                    this.zzdi = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 72:
                    this.zzdj = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 80:
                    this.zzdk = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 88:
                    this.zzdl = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 96:
                    this.zzdm = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 106:
                    this.zzdn = zzbezVar.readString();
                    continue;
                case 112:
                    this.zzdo = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 120:
                    this.zzdp = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 128:
                    this.zzdq = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 136:
                    this.zzdr = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 144:
                    this.zzds = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 152:
                    this.zzdt = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 160:
                    this.zzdu = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 168:
                    this.zzfh = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 176:
                    this.zzdv = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 184:
                    this.zzdw = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 194:
                    this.zzfi = zzbezVar.readString();
                    continue;
                case ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                    this.zzfm = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 208:
                    zzbezVar.getPosition();
                    zzacc = zzbezVar.zzacc();
                    if (zzacc >= 0 && zzacc <= 6) {
                        this.zzfj = Integer.valueOf(zzacc);
                        continue;
                    }
                    break;
                case 218:
                    this.zzcx = zzbezVar.readString();
                    continue;
                case 224:
                    this.zzfk = Boolean.valueOf(zzbezVar.zzabq());
                    continue;
                case 234:
                    this.zzdx = zzbezVar.readString();
                    continue;
                case 242:
                    this.zzfl = zzbezVar.readString();
                    continue;
                case 248:
                    this.zzdy = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 256:
                    this.zzdz = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 264:
                    this.zzea = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 274:
                    this.zzcz = zzbezVar.readString();
                    continue;
                case 280:
                    this.zzeb = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 288:
                    this.zzec = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 296:
                    this.zzed = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 306:
                    if (this.zzee == null) {
                        this.zzee = new zzbd();
                    }
                    zzbfiVar = this.zzee;
                    break;
                case 312:
                    this.zzef = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case MyThumbnailUtils.TARGET_SIZE_MINI_THUMBNAIL /* 320 */:
                    this.zzeg = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 328:
                    this.zzeh = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 336:
                    this.zzei = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 346:
                    int zzb = zzbfl.zzb(zzbezVar, 346);
                    zzbb[] zzbbVarArr = this.zzeu;
                    int length = zzbbVarArr == null ? 0 : zzbbVarArr.length;
                    int i = zzb + length;
                    zzbb[] zzbbVarArr2 = new zzbb[i];
                    if (length != 0) {
                        System.arraycopy(this.zzeu, 0, zzbbVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        zzbbVarArr2[length] = new zzbb();
                        zzbezVar.zza(zzbbVarArr2[length]);
                        zzbezVar.zzabk();
                        length++;
                    }
                    zzbbVarArr2[length] = new zzbb();
                    zzbezVar.zza(zzbbVarArr2[length]);
                    this.zzeu = zzbbVarArr2;
                    continue;
                case 352:
                    this.zzej = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 360:
                    this.zzek = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 370:
                    this.zzda = zzbezVar.readString();
                    continue;
                case 378:
                    this.zzdb = zzbezVar.readString();
                    continue;
                case 384:
                    zzbezVar.getPosition();
                    this.zzel = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                    continue;
                case 392:
                    zzbezVar.getPosition();
                    this.zzem = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                    continue;
                case 402:
                    if (this.zzet == null) {
                        this.zzet = new zzbb();
                    }
                    zzbfiVar = this.zzet;
                    break;
                case 408:
                    this.zzen = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 416:
                    this.zzeo = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 424:
                    this.zzep = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 432:
                    this.zzeq = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 440:
                    this.zzer = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 448:
                    zzbezVar.getPosition();
                    this.zzes = Integer.valueOf(zzaz.zzd(zzbezVar.zzacc()));
                    continue;
                case 458:
                    if (this.zzev == null) {
                        this.zzev = new zzbc();
                    }
                    zzbfiVar = this.zzev;
                    break;
                case 464:
                    this.zzew = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 472:
                    this.zzex = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 480:
                    this.zzey = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 488:
                    this.zzez = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 496:
                    this.zzfa = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 504:
                    this.zzfb = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 512:
                    this.zzfd = Long.valueOf(zzbezVar.zzacd());
                    continue;
                case 520:
                    zzbezVar.getPosition();
                    this.zzfe = Integer.valueOf(zzaz.zzf(zzbezVar.zzacc()));
                    continue;
                case 528:
                    zzbezVar.getPosition();
                    this.zzff = Integer.valueOf(zzaz.zze(zzbezVar.zzacc()));
                    continue;
                case 538:
                    this.zzfc = zzbezVar.readString();
                    continue;
                case 544:
                    try {
                        zzacc2 = zzbezVar.zzacc();
                    } catch (IllegalArgumentException unused) {
                        zzbezVar.zzdc(zzbezVar.getPosition());
                        zza(zzbezVar, zzabk);
                    }
                    if (zzacc2 >= 0 && zzacc2 <= 3) {
                        this.zzfg = Integer.valueOf(zzacc2);
                        continue;
                    }
                    break;
                case 1610:
                    if (this.zzfn == null) {
                        this.zzfn = new zzbf();
                    }
                    zzbfiVar = this.zzfn;
                    break;
                default:
                    if (super.zza(zzbezVar, zzabk)) {
                        continue;
                    } else {
                        return this;
                    }
            }
            zzbezVar.zza(zzbfiVar);
        }
        StringBuilder sb = new StringBuilder(44);
        sb.append(zzacc);
        sb.append(" is not a valid enum DeviceIdType");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    public final void zza(zzbfa zzbfaVar) throws IOException {
        String str = this.zzdc;
        if (str != null) {
            zzbfaVar.zzf(1, str);
        }
        String str2 = this.zzcw;
        if (str2 != null) {
            zzbfaVar.zzf(2, str2);
        }
        Long l = this.zzdd;
        if (l != null) {
            zzbfaVar.zzi(3, l.longValue());
        }
        Long l2 = this.zzde;
        if (l2 != null) {
            zzbfaVar.zzi(4, l2.longValue());
        }
        Long l3 = this.zzdf;
        if (l3 != null) {
            zzbfaVar.zzi(5, l3.longValue());
        }
        Long l4 = this.zzdg;
        if (l4 != null) {
            zzbfaVar.zzi(6, l4.longValue());
        }
        Long l5 = this.zzdh;
        if (l5 != null) {
            zzbfaVar.zzi(7, l5.longValue());
        }
        Long l6 = this.zzdi;
        if (l6 != null) {
            zzbfaVar.zzi(8, l6.longValue());
        }
        Long l7 = this.zzdj;
        if (l7 != null) {
            zzbfaVar.zzi(9, l7.longValue());
        }
        Long l8 = this.zzdk;
        if (l8 != null) {
            zzbfaVar.zzi(10, l8.longValue());
        }
        Long l9 = this.zzdl;
        if (l9 != null) {
            zzbfaVar.zzi(11, l9.longValue());
        }
        Long l10 = this.zzdm;
        if (l10 != null) {
            zzbfaVar.zzi(12, l10.longValue());
        }
        String str3 = this.zzdn;
        if (str3 != null) {
            zzbfaVar.zzf(13, str3);
        }
        Long l11 = this.zzdo;
        if (l11 != null) {
            zzbfaVar.zzi(14, l11.longValue());
        }
        Long l12 = this.zzdp;
        if (l12 != null) {
            zzbfaVar.zzi(15, l12.longValue());
        }
        Long l13 = this.zzdq;
        if (l13 != null) {
            zzbfaVar.zzi(16, l13.longValue());
        }
        Long l14 = this.zzdr;
        if (l14 != null) {
            zzbfaVar.zzi(17, l14.longValue());
        }
        Long l15 = this.zzds;
        if (l15 != null) {
            zzbfaVar.zzi(18, l15.longValue());
        }
        Long l16 = this.zzdt;
        if (l16 != null) {
            zzbfaVar.zzi(19, l16.longValue());
        }
        Long l17 = this.zzdu;
        if (l17 != null) {
            zzbfaVar.zzi(20, l17.longValue());
        }
        Long l18 = this.zzfh;
        if (l18 != null) {
            zzbfaVar.zzi(21, l18.longValue());
        }
        Long l19 = this.zzdv;
        if (l19 != null) {
            zzbfaVar.zzi(22, l19.longValue());
        }
        Long l20 = this.zzdw;
        if (l20 != null) {
            zzbfaVar.zzi(23, l20.longValue());
        }
        String str4 = this.zzfi;
        if (str4 != null) {
            zzbfaVar.zzf(24, str4);
        }
        Long l21 = this.zzfm;
        if (l21 != null) {
            zzbfaVar.zzi(25, l21.longValue());
        }
        Integer num = this.zzfj;
        if (num != null) {
            zzbfaVar.zzm(26, num.intValue());
        }
        String str5 = this.zzcx;
        if (str5 != null) {
            zzbfaVar.zzf(27, str5);
        }
        Boolean bool = this.zzfk;
        if (bool != null) {
            zzbfaVar.zzf(28, bool.booleanValue());
        }
        String str6 = this.zzdx;
        if (str6 != null) {
            zzbfaVar.zzf(29, str6);
        }
        String str7 = this.zzfl;
        if (str7 != null) {
            zzbfaVar.zzf(30, str7);
        }
        Long l22 = this.zzdy;
        if (l22 != null) {
            zzbfaVar.zzi(31, l22.longValue());
        }
        Long l23 = this.zzdz;
        if (l23 != null) {
            zzbfaVar.zzi(32, l23.longValue());
        }
        Long l24 = this.zzea;
        if (l24 != null) {
            zzbfaVar.zzi(33, l24.longValue());
        }
        String str8 = this.zzcz;
        if (str8 != null) {
            zzbfaVar.zzf(34, str8);
        }
        Long l25 = this.zzeb;
        if (l25 != null) {
            zzbfaVar.zzi(35, l25.longValue());
        }
        Long l26 = this.zzec;
        if (l26 != null) {
            zzbfaVar.zzi(36, l26.longValue());
        }
        Long l27 = this.zzed;
        if (l27 != null) {
            zzbfaVar.zzi(37, l27.longValue());
        }
        zzbd zzbdVar = this.zzee;
        if (zzbdVar != null) {
            zzbfaVar.zza(38, zzbdVar);
        }
        Long l28 = this.zzef;
        if (l28 != null) {
            zzbfaVar.zzi(39, l28.longValue());
        }
        Long l29 = this.zzeg;
        if (l29 != null) {
            zzbfaVar.zzi(40, l29.longValue());
        }
        Long l30 = this.zzeh;
        if (l30 != null) {
            zzbfaVar.zzi(41, l30.longValue());
        }
        Long l31 = this.zzei;
        if (l31 != null) {
            zzbfaVar.zzi(42, l31.longValue());
        }
        zzbb[] zzbbVarArr = this.zzeu;
        if (zzbbVarArr != null && zzbbVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzbb[] zzbbVarArr2 = this.zzeu;
                if (i >= zzbbVarArr2.length) {
                    break;
                }
                zzbb zzbbVar = zzbbVarArr2[i];
                if (zzbbVar != null) {
                    zzbfaVar.zza(43, zzbbVar);
                }
                i++;
            }
        }
        Long l32 = this.zzej;
        if (l32 != null) {
            zzbfaVar.zzi(44, l32.longValue());
        }
        Long l33 = this.zzek;
        if (l33 != null) {
            zzbfaVar.zzi(45, l33.longValue());
        }
        String str9 = this.zzda;
        if (str9 != null) {
            zzbfaVar.zzf(46, str9);
        }
        String str10 = this.zzdb;
        if (str10 != null) {
            zzbfaVar.zzf(47, str10);
        }
        Integer num2 = this.zzel;
        if (num2 != null) {
            zzbfaVar.zzm(48, num2.intValue());
        }
        Integer num3 = this.zzem;
        if (num3 != null) {
            zzbfaVar.zzm(49, num3.intValue());
        }
        zzbb zzbbVar2 = this.zzet;
        if (zzbbVar2 != null) {
            zzbfaVar.zza(50, zzbbVar2);
        }
        Long l34 = this.zzen;
        if (l34 != null) {
            zzbfaVar.zzi(51, l34.longValue());
        }
        Long l35 = this.zzeo;
        if (l35 != null) {
            zzbfaVar.zzi(52, l35.longValue());
        }
        Long l36 = this.zzep;
        if (l36 != null) {
            zzbfaVar.zzi(53, l36.longValue());
        }
        Long l37 = this.zzeq;
        if (l37 != null) {
            zzbfaVar.zzi(54, l37.longValue());
        }
        Long l38 = this.zzer;
        if (l38 != null) {
            zzbfaVar.zzi(55, l38.longValue());
        }
        Integer num4 = this.zzes;
        if (num4 != null) {
            zzbfaVar.zzm(56, num4.intValue());
        }
        zzbc zzbcVar = this.zzev;
        if (zzbcVar != null) {
            zzbfaVar.zza(57, zzbcVar);
        }
        Long l39 = this.zzew;
        if (l39 != null) {
            zzbfaVar.zzi(58, l39.longValue());
        }
        Long l40 = this.zzex;
        if (l40 != null) {
            zzbfaVar.zzi(59, l40.longValue());
        }
        Long l41 = this.zzey;
        if (l41 != null) {
            zzbfaVar.zzi(60, l41.longValue());
        }
        Long l42 = this.zzez;
        if (l42 != null) {
            zzbfaVar.zzi(61, l42.longValue());
        }
        Long l43 = this.zzfa;
        if (l43 != null) {
            zzbfaVar.zzi(62, l43.longValue());
        }
        Long l44 = this.zzfb;
        if (l44 != null) {
            zzbfaVar.zzi(63, l44.longValue());
        }
        Long l45 = this.zzfd;
        if (l45 != null) {
            zzbfaVar.zzi(64, l45.longValue());
        }
        Integer num5 = this.zzfe;
        if (num5 != null) {
            zzbfaVar.zzm(65, num5.intValue());
        }
        Integer num6 = this.zzff;
        if (num6 != null) {
            zzbfaVar.zzm(66, num6.intValue());
        }
        String str11 = this.zzfc;
        if (str11 != null) {
            zzbfaVar.zzf(67, str11);
        }
        Integer num7 = this.zzfg;
        if (num7 != null) {
            zzbfaVar.zzm(68, num7.intValue());
        }
        zzbf zzbfVar = this.zzfn;
        if (zzbfVar != null) {
            zzbfaVar.zza(201, zzbfVar);
        }
        super.zza(zzbfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfc, com.google.android.gms.internal.ads.zzbfi
    protected final int zzr() {
        int zzr = super.zzr();
        String str = this.zzdc;
        if (str != null) {
            zzr += zzbfa.zzg(1, str);
        }
        String str2 = this.zzcw;
        if (str2 != null) {
            zzr += zzbfa.zzg(2, str2);
        }
        Long l = this.zzdd;
        if (l != null) {
            zzr += zzbfa.zzd(3, l.longValue());
        }
        Long l2 = this.zzde;
        if (l2 != null) {
            zzr += zzbfa.zzd(4, l2.longValue());
        }
        Long l3 = this.zzdf;
        if (l3 != null) {
            zzr += zzbfa.zzd(5, l3.longValue());
        }
        Long l4 = this.zzdg;
        if (l4 != null) {
            zzr += zzbfa.zzd(6, l4.longValue());
        }
        Long l5 = this.zzdh;
        if (l5 != null) {
            zzr += zzbfa.zzd(7, l5.longValue());
        }
        Long l6 = this.zzdi;
        if (l6 != null) {
            zzr += zzbfa.zzd(8, l6.longValue());
        }
        Long l7 = this.zzdj;
        if (l7 != null) {
            zzr += zzbfa.zzd(9, l7.longValue());
        }
        Long l8 = this.zzdk;
        if (l8 != null) {
            zzr += zzbfa.zzd(10, l8.longValue());
        }
        Long l9 = this.zzdl;
        if (l9 != null) {
            zzr += zzbfa.zzd(11, l9.longValue());
        }
        Long l10 = this.zzdm;
        if (l10 != null) {
            zzr += zzbfa.zzd(12, l10.longValue());
        }
        String str3 = this.zzdn;
        if (str3 != null) {
            zzr += zzbfa.zzg(13, str3);
        }
        Long l11 = this.zzdo;
        if (l11 != null) {
            zzr += zzbfa.zzd(14, l11.longValue());
        }
        Long l12 = this.zzdp;
        if (l12 != null) {
            zzr += zzbfa.zzd(15, l12.longValue());
        }
        Long l13 = this.zzdq;
        if (l13 != null) {
            zzr += zzbfa.zzd(16, l13.longValue());
        }
        Long l14 = this.zzdr;
        if (l14 != null) {
            zzr += zzbfa.zzd(17, l14.longValue());
        }
        Long l15 = this.zzds;
        if (l15 != null) {
            zzr += zzbfa.zzd(18, l15.longValue());
        }
        Long l16 = this.zzdt;
        if (l16 != null) {
            zzr += zzbfa.zzd(19, l16.longValue());
        }
        Long l17 = this.zzdu;
        if (l17 != null) {
            zzr += zzbfa.zzd(20, l17.longValue());
        }
        Long l18 = this.zzfh;
        if (l18 != null) {
            zzr += zzbfa.zzd(21, l18.longValue());
        }
        Long l19 = this.zzdv;
        if (l19 != null) {
            zzr += zzbfa.zzd(22, l19.longValue());
        }
        Long l20 = this.zzdw;
        if (l20 != null) {
            zzr += zzbfa.zzd(23, l20.longValue());
        }
        String str4 = this.zzfi;
        if (str4 != null) {
            zzr += zzbfa.zzg(24, str4);
        }
        Long l21 = this.zzfm;
        if (l21 != null) {
            zzr += zzbfa.zzd(25, l21.longValue());
        }
        Integer num = this.zzfj;
        if (num != null) {
            zzr += zzbfa.zzq(26, num.intValue());
        }
        String str5 = this.zzcx;
        if (str5 != null) {
            zzr += zzbfa.zzg(27, str5);
        }
        Boolean bool = this.zzfk;
        if (bool != null) {
            bool.booleanValue();
            zzr += zzbfa.zzcd(28) + 1;
        }
        String str6 = this.zzdx;
        if (str6 != null) {
            zzr += zzbfa.zzg(29, str6);
        }
        String str7 = this.zzfl;
        if (str7 != null) {
            zzr += zzbfa.zzg(30, str7);
        }
        Long l22 = this.zzdy;
        if (l22 != null) {
            zzr += zzbfa.zzd(31, l22.longValue());
        }
        Long l23 = this.zzdz;
        if (l23 != null) {
            zzr += zzbfa.zzd(32, l23.longValue());
        }
        Long l24 = this.zzea;
        if (l24 != null) {
            zzr += zzbfa.zzd(33, l24.longValue());
        }
        String str8 = this.zzcz;
        if (str8 != null) {
            zzr += zzbfa.zzg(34, str8);
        }
        Long l25 = this.zzeb;
        if (l25 != null) {
            zzr += zzbfa.zzd(35, l25.longValue());
        }
        Long l26 = this.zzec;
        if (l26 != null) {
            zzr += zzbfa.zzd(36, l26.longValue());
        }
        Long l27 = this.zzed;
        if (l27 != null) {
            zzr += zzbfa.zzd(37, l27.longValue());
        }
        zzbd zzbdVar = this.zzee;
        if (zzbdVar != null) {
            zzr += zzbfa.zzb(38, zzbdVar);
        }
        Long l28 = this.zzef;
        if (l28 != null) {
            zzr += zzbfa.zzd(39, l28.longValue());
        }
        Long l29 = this.zzeg;
        if (l29 != null) {
            zzr += zzbfa.zzd(40, l29.longValue());
        }
        Long l30 = this.zzeh;
        if (l30 != null) {
            zzr += zzbfa.zzd(41, l30.longValue());
        }
        Long l31 = this.zzei;
        if (l31 != null) {
            zzr += zzbfa.zzd(42, l31.longValue());
        }
        zzbb[] zzbbVarArr = this.zzeu;
        if (zzbbVarArr != null && zzbbVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzbb[] zzbbVarArr2 = this.zzeu;
                if (i >= zzbbVarArr2.length) {
                    break;
                }
                zzbb zzbbVar = zzbbVarArr2[i];
                if (zzbbVar != null) {
                    zzr += zzbfa.zzb(43, zzbbVar);
                }
                i++;
            }
        }
        Long l32 = this.zzej;
        if (l32 != null) {
            zzr += zzbfa.zzd(44, l32.longValue());
        }
        Long l33 = this.zzek;
        if (l33 != null) {
            zzr += zzbfa.zzd(45, l33.longValue());
        }
        String str9 = this.zzda;
        if (str9 != null) {
            zzr += zzbfa.zzg(46, str9);
        }
        String str10 = this.zzdb;
        if (str10 != null) {
            zzr += zzbfa.zzg(47, str10);
        }
        Integer num2 = this.zzel;
        if (num2 != null) {
            zzr += zzbfa.zzq(48, num2.intValue());
        }
        Integer num3 = this.zzem;
        if (num3 != null) {
            zzr += zzbfa.zzq(49, num3.intValue());
        }
        zzbb zzbbVar2 = this.zzet;
        if (zzbbVar2 != null) {
            zzr += zzbfa.zzb(50, zzbbVar2);
        }
        Long l34 = this.zzen;
        if (l34 != null) {
            zzr += zzbfa.zzd(51, l34.longValue());
        }
        Long l35 = this.zzeo;
        if (l35 != null) {
            zzr += zzbfa.zzd(52, l35.longValue());
        }
        Long l36 = this.zzep;
        if (l36 != null) {
            zzr += zzbfa.zzd(53, l36.longValue());
        }
        Long l37 = this.zzeq;
        if (l37 != null) {
            zzr += zzbfa.zzd(54, l37.longValue());
        }
        Long l38 = this.zzer;
        if (l38 != null) {
            zzr += zzbfa.zzd(55, l38.longValue());
        }
        Integer num4 = this.zzes;
        if (num4 != null) {
            zzr += zzbfa.zzq(56, num4.intValue());
        }
        zzbc zzbcVar = this.zzev;
        if (zzbcVar != null) {
            zzr += zzbfa.zzb(57, zzbcVar);
        }
        Long l39 = this.zzew;
        if (l39 != null) {
            zzr += zzbfa.zzd(58, l39.longValue());
        }
        Long l40 = this.zzex;
        if (l40 != null) {
            zzr += zzbfa.zzd(59, l40.longValue());
        }
        Long l41 = this.zzey;
        if (l41 != null) {
            zzr += zzbfa.zzd(60, l41.longValue());
        }
        Long l42 = this.zzez;
        if (l42 != null) {
            zzr += zzbfa.zzd(61, l42.longValue());
        }
        Long l43 = this.zzfa;
        if (l43 != null) {
            zzr += zzbfa.zzd(62, l43.longValue());
        }
        Long l44 = this.zzfb;
        if (l44 != null) {
            zzr += zzbfa.zzd(63, l44.longValue());
        }
        Long l45 = this.zzfd;
        if (l45 != null) {
            zzr += zzbfa.zzd(64, l45.longValue());
        }
        Integer num5 = this.zzfe;
        if (num5 != null) {
            zzr += zzbfa.zzq(65, num5.intValue());
        }
        Integer num6 = this.zzff;
        if (num6 != null) {
            zzr += zzbfa.zzq(66, num6.intValue());
        }
        String str11 = this.zzfc;
        if (str11 != null) {
            zzr += zzbfa.zzg(67, str11);
        }
        Integer num7 = this.zzfg;
        if (num7 != null) {
            zzr += zzbfa.zzq(68, num7.intValue());
        }
        zzbf zzbfVar = this.zzfn;
        return zzbfVar != null ? zzr + zzbfa.zzb(201, zzbfVar) : zzr;
    }
}
