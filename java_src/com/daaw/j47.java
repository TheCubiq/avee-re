package com.daaw;

import java.util.List;
import org.conscrypt.NativeConstants;
/* loaded from: classes2.dex */
public final class j47 extends ja8 implements be8 {
    public static final /* synthetic */ int zza = 0;
    private static final j47 zzd;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private e87 zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private boolean zzZ;
    private boolean zzab;
    private oz6 zzac;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private db8 zzh = ja8.m18667o();
    private db8 zzi = ja8.m18667o();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private db8 zzG = ja8.m18667o();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private xa8 zzT = ja8.m18670l();
    private String zzW = "";
    private String zzX = "";
    private String zzaa = "";
    private String zzad = "";
    private db8 zzae = ja8.m18667o();
    private String zzaf = "";

    static {
        j47 j47Var = new j47();
        zzd = j47Var;
        ja8.m18661v(j47.class, j47Var);
    }

    /* renamed from: E0 */
    public static /* synthetic */ void m19074E0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zzf |= 8192;
        j47Var.zzad = str;
    }

    /* renamed from: F0 */
    public static /* synthetic */ void m19071F0(j47 j47Var) {
        j47Var.zzf &= -8193;
        j47Var.zzad = zzd.zzad;
    }

    /* renamed from: G0 */
    public static /* synthetic */ void m19068G0(j47 j47Var, Iterable iterable) {
        db8 db8Var = j47Var.zzae;
        if (!db8Var.zzc()) {
            j47Var.zzae = ja8.m18666p(db8Var);
        }
        w48.m6532f(iterable, j47Var.zzae);
    }

    /* renamed from: I0 */
    public static /* synthetic */ void m19062I0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zzf |= 16384;
        j47Var.zzaf = str;
    }

    /* renamed from: J0 */
    public static /* synthetic */ void m19059J0(j47 j47Var, int i) {
        j47Var.m19003f1();
        j47Var.zzh.remove(i);
    }

    /* renamed from: K0 */
    public static /* synthetic */ void m19056K0(j47 j47Var, int i, we7 we7Var) {
        we7Var.getClass();
        j47Var.m19001g1();
        j47Var.zzi.set(i, we7Var);
    }

    /* renamed from: L0 */
    public static /* synthetic */ void m19053L0(j47 j47Var, we7 we7Var) {
        we7Var.getClass();
        j47Var.m19001g1();
        j47Var.zzi.add(we7Var);
    }

    /* renamed from: M0 */
    public static /* synthetic */ void m19050M0(j47 j47Var, Iterable iterable) {
        j47Var.m19001g1();
        w48.m6532f(iterable, j47Var.zzi);
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m19047N0(j47 j47Var, int i) {
        j47Var.m19001g1();
        j47Var.zzi.remove(i);
    }

    /* renamed from: O0 */
    public static /* synthetic */ void m19044O0(j47 j47Var, long j) {
        j47Var.zze |= 2;
        j47Var.zzj = j;
    }

    /* renamed from: O1 */
    public static g37 m19043O1() {
        return (g37) zzd.m18657z();
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m19041P0(j47 j47Var, long j) {
        j47Var.zze |= 4;
        j47Var.zzk = j;
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m19038Q0(j47 j47Var, long j) {
        j47Var.zze |= 8;
        j47Var.zzl = j;
    }

    /* renamed from: R0 */
    public static /* synthetic */ void m19035R0(j47 j47Var, long j) {
        j47Var.zze |= 16;
        j47Var.zzm = j;
    }

    /* renamed from: S */
    public static /* synthetic */ void m19033S(j47 j47Var) {
        j47Var.zze &= Integer.MAX_VALUE;
        j47Var.zzO = zzd.zzO;
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m19032S0(j47 j47Var) {
        j47Var.zze &= -17;
        j47Var.zzm = 0L;
    }

    /* renamed from: T */
    public static /* synthetic */ void m19030T(j47 j47Var, int i) {
        j47Var.zzf |= 2;
        j47Var.zzQ = i;
    }

    /* renamed from: T0 */
    public static /* synthetic */ void m19029T0(j47 j47Var, long j) {
        j47Var.zze |= 32;
        j47Var.zzn = j;
    }

    /* renamed from: U */
    public static /* synthetic */ void m19027U(j47 j47Var, int i, it6 it6Var) {
        it6Var.getClass();
        j47Var.m19003f1();
        j47Var.zzh.set(i, it6Var);
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m19026U0(j47 j47Var) {
        j47Var.zze &= -33;
        j47Var.zzn = 0L;
    }

    /* renamed from: V */
    public static /* synthetic */ void m19024V(j47 j47Var, String str) {
        str.getClass();
        j47Var.zzf |= 4;
        j47Var.zzR = str;
    }

    /* renamed from: V0 */
    public static /* synthetic */ void m19023V0(j47 j47Var, String str) {
        j47Var.zze |= 64;
        j47Var.zzo = "android";
    }

    /* renamed from: W */
    public static /* synthetic */ void m19022W(j47 j47Var, e87 e87Var) {
        e87Var.getClass();
        j47Var.zzS = e87Var;
        j47Var.zzf |= 8;
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m19021W0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 128;
        j47Var.zzp = str;
    }

    /* renamed from: X */
    public static /* synthetic */ void m19020X(j47 j47Var, Iterable iterable) {
        xa8 xa8Var = j47Var.zzT;
        if (!xa8Var.zzc()) {
            int size = xa8Var.size();
            j47Var.zzT = xa8Var.mo5326c(size == 0 ? 10 : size + size);
        }
        w48.m6532f(iterable, j47Var.zzT);
    }

    /* renamed from: X0 */
    public static /* synthetic */ void m19019X0(j47 j47Var) {
        j47Var.zze &= -129;
        j47Var.zzp = zzd.zzp;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m19018Y(j47 j47Var, it6 it6Var) {
        it6Var.getClass();
        j47Var.m19003f1();
        j47Var.zzh.add(it6Var);
    }

    /* renamed from: Y0 */
    public static /* synthetic */ void m19017Y0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 256;
        j47Var.zzq = str;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m19016Z(j47 j47Var, long j) {
        j47Var.zzf |= 16;
        j47Var.zzU = j;
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m19015Z0(j47 j47Var) {
        j47Var.zze &= -257;
        j47Var.zzq = zzd.zzq;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m19014a0(j47 j47Var, long j) {
        j47Var.zzf |= 32;
        j47Var.zzV = j;
    }

    /* renamed from: a1 */
    public static /* synthetic */ void m19013a1(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 512;
        j47Var.zzr = str;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m19012b0(j47 j47Var, String str) {
        j47Var.zzf |= 128;
        j47Var.zzX = str;
    }

    /* renamed from: b1 */
    public static /* synthetic */ void m19011b1(j47 j47Var, int i) {
        j47Var.zze |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
        j47Var.zzs = i;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m19010c0(j47 j47Var, Iterable iterable) {
        j47Var.m19003f1();
        w48.m6532f(iterable, j47Var.zzh);
    }

    /* renamed from: c1 */
    public static /* synthetic */ void m19009c1(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 2048;
        j47Var.zzt = str;
    }

    /* renamed from: d1 */
    public static /* synthetic */ void m19007d1(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 4096;
        j47Var.zzu = str;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m19006e0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 8192;
        j47Var.zzv = str;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m19004f0(j47 j47Var, long j) {
        j47Var.zze |= 16384;
        j47Var.zzw = j;
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m19002g0(j47 j47Var, long j) {
        j47Var.zze |= 32768;
        j47Var.zzx = 74029L;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m19000h0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 65536;
        j47Var.zzy = str;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m18998i0(j47 j47Var) {
        j47Var.zze &= -65537;
        j47Var.zzy = zzd.zzy;
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m18996j0(j47 j47Var, boolean z) {
        j47Var.zze |= 131072;
        j47Var.zzz = z;
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m18994k0(j47 j47Var) {
        j47Var.zze &= -131073;
        j47Var.zzz = false;
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m18992l0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 262144;
        j47Var.zzA = str;
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m18990m0(j47 j47Var) {
        j47Var.zze &= -262145;
        j47Var.zzA = zzd.zzA;
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m18988n0(j47 j47Var, long j) {
        j47Var.zze |= 524288;
        j47Var.zzB = j;
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m18986o0(j47 j47Var, int i) {
        j47Var.zze |= 1048576;
        j47Var.zzC = i;
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m18984p0(j47 j47Var, String str) {
        j47Var.zze |= 2097152;
        j47Var.zzD = str;
    }

    /* renamed from: q0 */
    public static /* synthetic */ void m18982q0(j47 j47Var) {
        j47Var.zze &= -2097153;
        j47Var.zzD = zzd.zzD;
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m18980r0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE;
        j47Var.zzE = str;
    }

    /* renamed from: s0 */
    public static /* synthetic */ void m18978s0(j47 j47Var, boolean z) {
        j47Var.zze |= 8388608;
        j47Var.zzF = z;
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m18976t0(j47 j47Var, Iterable iterable) {
        db8 db8Var = j47Var.zzG;
        if (!db8Var.zzc()) {
            j47Var.zzG = ja8.m18666p(db8Var);
        }
        w48.m6532f(iterable, j47Var.zzG);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m18972v0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 16777216;
        j47Var.zzH = str;
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m18970w0(j47 j47Var, int i) {
        j47Var.zze |= 33554432;
        j47Var.zzI = i;
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m18968x0(j47 j47Var, int i) {
        j47Var.zze |= 1;
        j47Var.zzg = 1;
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m18966y0(j47 j47Var) {
        j47Var.zze &= -268435457;
        j47Var.zzL = zzd.zzL;
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m18964z0(j47 j47Var, long j) {
        j47Var.zze |= 536870912;
        j47Var.zzM = j;
    }

    /* renamed from: A0 */
    public final boolean m19084A0() {
        return this.zzz;
    }

    /* renamed from: A1 */
    public final int m19083A1() {
        return this.zzQ;
    }

    /* renamed from: B0 */
    public final boolean m19082B0() {
        return this.zzF;
    }

    /* renamed from: B1 */
    public final int m19081B1() {
        return this.zzs;
    }

    @Override // com.daaw.ja8
    /* renamed from: C */
    public final Object mo4853C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new g37(null);
                }
                return new j47();
            }
            return ja8.m18664s(zzd, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zze", "zzf", "zzg", "zzh", it6.class, "zzi", we7.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", xo6.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", mk6.f18948a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf"});
        }
        return (byte) 1;
    }

    /* renamed from: C0 */
    public final boolean m19080C0() {
        return (this.zze & 33554432) != 0;
    }

    /* renamed from: C1 */
    public final int m19079C1() {
        return this.zzi.size();
    }

    /* renamed from: D */
    public final String m19078D() {
        return this.zzv;
    }

    /* renamed from: D0 */
    public final boolean m19077D0() {
        return (this.zze & 1048576) != 0;
    }

    /* renamed from: D1 */
    public final long m19076D1() {
        return this.zzM;
    }

    /* renamed from: E */
    public final String m19075E() {
        return this.zzX;
    }

    /* renamed from: E1 */
    public final long m19073E1() {
        return this.zzB;
    }

    /* renamed from: F */
    public final String m19072F() {
        return this.zzq;
    }

    /* renamed from: F1 */
    public final long m19070F1() {
        return this.zzU;
    }

    /* renamed from: G */
    public final String m19069G() {
        return this.zzO;
    }

    /* renamed from: G1 */
    public final long m19067G1() {
        return this.zzl;
    }

    /* renamed from: H */
    public final String m19066H() {
        return this.zzH;
    }

    /* renamed from: H1 */
    public final long m19064H1() {
        return this.zzw;
    }

    /* renamed from: I */
    public final String m19063I() {
        return this.zzE;
    }

    /* renamed from: I1 */
    public final long m19061I1() {
        return this.zzn;
    }

    /* renamed from: J */
    public final String m19060J() {
        return this.zzD;
    }

    /* renamed from: J1 */
    public final long m19058J1() {
        return this.zzm;
    }

    /* renamed from: K */
    public final String m19057K() {
        return this.zzp;
    }

    /* renamed from: K1 */
    public final long m19055K1() {
        return this.zzk;
    }

    /* renamed from: L */
    public final String m19054L() {
        return this.zzo;
    }

    /* renamed from: L1 */
    public final long m19052L1() {
        return this.zzj;
    }

    /* renamed from: M */
    public final String m19051M() {
        return this.zzy;
    }

    /* renamed from: M1 */
    public final long m19049M1() {
        return this.zzx;
    }

    /* renamed from: N */
    public final String m19048N() {
        return this.zzad;
    }

    /* renamed from: N1 */
    public final it6 m19046N1(int i) {
        return (it6) this.zzh.get(i);
    }

    /* renamed from: O */
    public final String m19045O() {
        return this.zzr;
    }

    /* renamed from: P */
    public final List m19042P() {
        return this.zzG;
    }

    /* renamed from: Q */
    public final List m19039Q() {
        return this.zzh;
    }

    /* renamed from: Q1 */
    public final we7 m19037Q1(int i) {
        return (we7) this.zzi.get(i);
    }

    /* renamed from: R */
    public final List m19036R() {
        return this.zzi;
    }

    /* renamed from: R1 */
    public final String m19034R1() {
        return this.zzR;
    }

    /* renamed from: S1 */
    public final String m19031S1() {
        return this.zzu;
    }

    /* renamed from: T1 */
    public final String m19028T1() {
        return this.zzA;
    }

    /* renamed from: U1 */
    public final String m19025U1() {
        return this.zzt;
    }

    /* renamed from: d0 */
    public final int m19008d0() {
        return this.zzI;
    }

    /* renamed from: e1 */
    public final int m19005e1() {
        return this.zzC;
    }

    /* renamed from: f1 */
    public final void m19003f1() {
        db8 db8Var = this.zzh;
        if (db8Var.zzc()) {
            return;
        }
        this.zzh = ja8.m18666p(db8Var);
    }

    /* renamed from: g1 */
    public final void m19001g1() {
        db8 db8Var = this.zzi;
        if (db8Var.zzc()) {
            return;
        }
        this.zzi = ja8.m18666p(db8Var);
    }

    /* renamed from: h1 */
    public final boolean m18999h1() {
        return (this.zze & 536870912) != 0;
    }

    /* renamed from: i1 */
    public final boolean m18997i1() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: j1 */
    public final boolean m18995j1() {
        return (this.zze & 524288) != 0;
    }

    /* renamed from: k1 */
    public final boolean m18993k1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: l1 */
    public final boolean m18991l1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: m1 */
    public final boolean m18989m1() {
        return (this.zze & 16384) != 0;
    }

    /* renamed from: n1 */
    public final boolean m18987n1() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: o1 */
    public final boolean m18985o1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: p1 */
    public final boolean m18983p1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: q1 */
    public final boolean m18981q1() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: r1 */
    public final boolean m18979r1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: s1 */
    public final boolean m18977s1() {
        return (this.zze & 8388608) != 0;
    }

    /* renamed from: t1 */
    public final boolean m18975t1() {
        return (this.zzf & 8192) != 0;
    }

    /* renamed from: u1 */
    public final boolean m18973u1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: v1 */
    public final boolean m18971v1() {
        return (this.zze & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV) != 0;
    }

    /* renamed from: w1 */
    public final boolean m18969w1() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: x1 */
    public final boolean m18967x1() {
        return (this.zze & 32768) != 0;
    }

    /* renamed from: y1 */
    public final int m18965y1() {
        return this.zzh.size();
    }

    /* renamed from: z1 */
    public final int m18963z1() {
        return this.zzg;
    }
}
