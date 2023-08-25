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
    private db8 zzh = ja8.o();
    private db8 zzi = ja8.o();
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
    private db8 zzG = ja8.o();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private xa8 zzT = ja8.l();
    private String zzW = "";
    private String zzX = "";
    private String zzaa = "";
    private String zzad = "";
    private db8 zzae = ja8.o();
    private String zzaf = "";

    static {
        j47 j47Var = new j47();
        zzd = j47Var;
        ja8.v(j47.class, j47Var);
    }

    public static /* synthetic */ void E0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zzf |= 8192;
        j47Var.zzad = str;
    }

    public static /* synthetic */ void F0(j47 j47Var) {
        j47Var.zzf &= -8193;
        j47Var.zzad = zzd.zzad;
    }

    public static /* synthetic */ void G0(j47 j47Var, Iterable iterable) {
        db8 db8Var = j47Var.zzae;
        if (!db8Var.zzc()) {
            j47Var.zzae = ja8.p(db8Var);
        }
        w48.f(iterable, j47Var.zzae);
    }

    public static /* synthetic */ void I0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zzf |= 16384;
        j47Var.zzaf = str;
    }

    public static /* synthetic */ void J0(j47 j47Var, int i) {
        j47Var.f1();
        j47Var.zzh.remove(i);
    }

    public static /* synthetic */ void K0(j47 j47Var, int i, we7 we7Var) {
        we7Var.getClass();
        j47Var.g1();
        j47Var.zzi.set(i, we7Var);
    }

    public static /* synthetic */ void L0(j47 j47Var, we7 we7Var) {
        we7Var.getClass();
        j47Var.g1();
        j47Var.zzi.add(we7Var);
    }

    public static /* synthetic */ void M0(j47 j47Var, Iterable iterable) {
        j47Var.g1();
        w48.f(iterable, j47Var.zzi);
    }

    public static /* synthetic */ void N0(j47 j47Var, int i) {
        j47Var.g1();
        j47Var.zzi.remove(i);
    }

    public static /* synthetic */ void O0(j47 j47Var, long j) {
        j47Var.zze |= 2;
        j47Var.zzj = j;
    }

    public static g37 O1() {
        return (g37) zzd.z();
    }

    public static /* synthetic */ void P0(j47 j47Var, long j) {
        j47Var.zze |= 4;
        j47Var.zzk = j;
    }

    public static /* synthetic */ void Q0(j47 j47Var, long j) {
        j47Var.zze |= 8;
        j47Var.zzl = j;
    }

    public static /* synthetic */ void R0(j47 j47Var, long j) {
        j47Var.zze |= 16;
        j47Var.zzm = j;
    }

    public static /* synthetic */ void S(j47 j47Var) {
        j47Var.zze &= Integer.MAX_VALUE;
        j47Var.zzO = zzd.zzO;
    }

    public static /* synthetic */ void S0(j47 j47Var) {
        j47Var.zze &= -17;
        j47Var.zzm = 0L;
    }

    public static /* synthetic */ void T(j47 j47Var, int i) {
        j47Var.zzf |= 2;
        j47Var.zzQ = i;
    }

    public static /* synthetic */ void T0(j47 j47Var, long j) {
        j47Var.zze |= 32;
        j47Var.zzn = j;
    }

    public static /* synthetic */ void U(j47 j47Var, int i, it6 it6Var) {
        it6Var.getClass();
        j47Var.f1();
        j47Var.zzh.set(i, it6Var);
    }

    public static /* synthetic */ void U0(j47 j47Var) {
        j47Var.zze &= -33;
        j47Var.zzn = 0L;
    }

    public static /* synthetic */ void V(j47 j47Var, String str) {
        str.getClass();
        j47Var.zzf |= 4;
        j47Var.zzR = str;
    }

    public static /* synthetic */ void V0(j47 j47Var, String str) {
        j47Var.zze |= 64;
        j47Var.zzo = "android";
    }

    public static /* synthetic */ void W(j47 j47Var, e87 e87Var) {
        e87Var.getClass();
        j47Var.zzS = e87Var;
        j47Var.zzf |= 8;
    }

    public static /* synthetic */ void W0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 128;
        j47Var.zzp = str;
    }

    public static /* synthetic */ void X(j47 j47Var, Iterable iterable) {
        xa8 xa8Var = j47Var.zzT;
        if (!xa8Var.zzc()) {
            int size = xa8Var.size();
            j47Var.zzT = xa8Var.c(size == 0 ? 10 : size + size);
        }
        w48.f(iterable, j47Var.zzT);
    }

    public static /* synthetic */ void X0(j47 j47Var) {
        j47Var.zze &= -129;
        j47Var.zzp = zzd.zzp;
    }

    public static /* synthetic */ void Y(j47 j47Var, it6 it6Var) {
        it6Var.getClass();
        j47Var.f1();
        j47Var.zzh.add(it6Var);
    }

    public static /* synthetic */ void Y0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 256;
        j47Var.zzq = str;
    }

    public static /* synthetic */ void Z(j47 j47Var, long j) {
        j47Var.zzf |= 16;
        j47Var.zzU = j;
    }

    public static /* synthetic */ void Z0(j47 j47Var) {
        j47Var.zze &= -257;
        j47Var.zzq = zzd.zzq;
    }

    public static /* synthetic */ void a0(j47 j47Var, long j) {
        j47Var.zzf |= 32;
        j47Var.zzV = j;
    }

    public static /* synthetic */ void a1(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 512;
        j47Var.zzr = str;
    }

    public static /* synthetic */ void b0(j47 j47Var, String str) {
        j47Var.zzf |= 128;
        j47Var.zzX = str;
    }

    public static /* synthetic */ void b1(j47 j47Var, int i) {
        j47Var.zze |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
        j47Var.zzs = i;
    }

    public static /* synthetic */ void c0(j47 j47Var, Iterable iterable) {
        j47Var.f1();
        w48.f(iterable, j47Var.zzh);
    }

    public static /* synthetic */ void c1(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 2048;
        j47Var.zzt = str;
    }

    public static /* synthetic */ void d1(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 4096;
        j47Var.zzu = str;
    }

    public static /* synthetic */ void e0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 8192;
        j47Var.zzv = str;
    }

    public static /* synthetic */ void f0(j47 j47Var, long j) {
        j47Var.zze |= 16384;
        j47Var.zzw = j;
    }

    public static /* synthetic */ void g0(j47 j47Var, long j) {
        j47Var.zze |= 32768;
        j47Var.zzx = 74029L;
    }

    public static /* synthetic */ void h0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 65536;
        j47Var.zzy = str;
    }

    public static /* synthetic */ void i0(j47 j47Var) {
        j47Var.zze &= -65537;
        j47Var.zzy = zzd.zzy;
    }

    public static /* synthetic */ void j0(j47 j47Var, boolean z) {
        j47Var.zze |= 131072;
        j47Var.zzz = z;
    }

    public static /* synthetic */ void k0(j47 j47Var) {
        j47Var.zze &= -131073;
        j47Var.zzz = false;
    }

    public static /* synthetic */ void l0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 262144;
        j47Var.zzA = str;
    }

    public static /* synthetic */ void m0(j47 j47Var) {
        j47Var.zze &= -262145;
        j47Var.zzA = zzd.zzA;
    }

    public static /* synthetic */ void n0(j47 j47Var, long j) {
        j47Var.zze |= 524288;
        j47Var.zzB = j;
    }

    public static /* synthetic */ void o0(j47 j47Var, int i) {
        j47Var.zze |= 1048576;
        j47Var.zzC = i;
    }

    public static /* synthetic */ void p0(j47 j47Var, String str) {
        j47Var.zze |= 2097152;
        j47Var.zzD = str;
    }

    public static /* synthetic */ void q0(j47 j47Var) {
        j47Var.zze &= -2097153;
        j47Var.zzD = zzd.zzD;
    }

    public static /* synthetic */ void r0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE;
        j47Var.zzE = str;
    }

    public static /* synthetic */ void s0(j47 j47Var, boolean z) {
        j47Var.zze |= 8388608;
        j47Var.zzF = z;
    }

    public static /* synthetic */ void t0(j47 j47Var, Iterable iterable) {
        db8 db8Var = j47Var.zzG;
        if (!db8Var.zzc()) {
            j47Var.zzG = ja8.p(db8Var);
        }
        w48.f(iterable, j47Var.zzG);
    }

    public static /* synthetic */ void v0(j47 j47Var, String str) {
        str.getClass();
        j47Var.zze |= 16777216;
        j47Var.zzH = str;
    }

    public static /* synthetic */ void w0(j47 j47Var, int i) {
        j47Var.zze |= 33554432;
        j47Var.zzI = i;
    }

    public static /* synthetic */ void x0(j47 j47Var, int i) {
        j47Var.zze |= 1;
        j47Var.zzg = 1;
    }

    public static /* synthetic */ void y0(j47 j47Var) {
        j47Var.zze &= -268435457;
        j47Var.zzL = zzd.zzL;
    }

    public static /* synthetic */ void z0(j47 j47Var, long j) {
        j47Var.zze |= 536870912;
        j47Var.zzM = j;
    }

    public final boolean A0() {
        return this.zzz;
    }

    public final int A1() {
        return this.zzQ;
    }

    public final boolean B0() {
        return this.zzF;
    }

    public final int B1() {
        return this.zzs;
    }

    @Override // com.daaw.ja8
    public final Object C(int i, Object obj, Object obj2) {
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
            return ja8.s(zzd, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zze", "zzf", "zzg", "zzh", it6.class, "zzi", we7.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", xo6.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", mk6.a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf"});
        }
        return (byte) 1;
    }

    public final boolean C0() {
        return (this.zze & 33554432) != 0;
    }

    public final int C1() {
        return this.zzi.size();
    }

    public final String D() {
        return this.zzv;
    }

    public final boolean D0() {
        return (this.zze & 1048576) != 0;
    }

    public final long D1() {
        return this.zzM;
    }

    public final String E() {
        return this.zzX;
    }

    public final long E1() {
        return this.zzB;
    }

    public final String F() {
        return this.zzq;
    }

    public final long F1() {
        return this.zzU;
    }

    public final String G() {
        return this.zzO;
    }

    public final long G1() {
        return this.zzl;
    }

    public final String H() {
        return this.zzH;
    }

    public final long H1() {
        return this.zzw;
    }

    public final String I() {
        return this.zzE;
    }

    public final long I1() {
        return this.zzn;
    }

    public final String J() {
        return this.zzD;
    }

    public final long J1() {
        return this.zzm;
    }

    public final String K() {
        return this.zzp;
    }

    public final long K1() {
        return this.zzk;
    }

    public final String L() {
        return this.zzo;
    }

    public final long L1() {
        return this.zzj;
    }

    public final String M() {
        return this.zzy;
    }

    public final long M1() {
        return this.zzx;
    }

    public final String N() {
        return this.zzad;
    }

    public final it6 N1(int i) {
        return (it6) this.zzh.get(i);
    }

    public final String O() {
        return this.zzr;
    }

    public final List P() {
        return this.zzG;
    }

    public final List Q() {
        return this.zzh;
    }

    public final we7 Q1(int i) {
        return (we7) this.zzi.get(i);
    }

    public final List R() {
        return this.zzi;
    }

    public final String R1() {
        return this.zzR;
    }

    public final String S1() {
        return this.zzu;
    }

    public final String T1() {
        return this.zzA;
    }

    public final String U1() {
        return this.zzt;
    }

    public final int d0() {
        return this.zzI;
    }

    public final int e1() {
        return this.zzC;
    }

    public final void f1() {
        db8 db8Var = this.zzh;
        if (db8Var.zzc()) {
            return;
        }
        this.zzh = ja8.p(db8Var);
    }

    public final void g1() {
        db8 db8Var = this.zzi;
        if (db8Var.zzc()) {
            return;
        }
        this.zzi = ja8.p(db8Var);
    }

    public final boolean h1() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean i1() {
        return (this.zzf & 128) != 0;
    }

    public final boolean j1() {
        return (this.zze & 524288) != 0;
    }

    public final boolean k1() {
        return (this.zzf & 16) != 0;
    }

    public final boolean l1() {
        return (this.zze & 8) != 0;
    }

    public final boolean m1() {
        return (this.zze & 16384) != 0;
    }

    public final boolean n1() {
        return (this.zze & 131072) != 0;
    }

    public final boolean o1() {
        return (this.zze & 32) != 0;
    }

    public final boolean p1() {
        return (this.zze & 16) != 0;
    }

    public final boolean q1() {
        return (this.zze & 1) != 0;
    }

    public final boolean r1() {
        return (this.zzf & 2) != 0;
    }

    public final boolean s1() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean t1() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean u1() {
        return (this.zze & 4) != 0;
    }

    public final boolean v1() {
        return (this.zze & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV) != 0;
    }

    public final boolean w1() {
        return (this.zze & 2) != 0;
    }

    public final boolean x1() {
        return (this.zze & 32768) != 0;
    }

    public final int y1() {
        return this.zzh.size();
    }

    public final int z1() {
        return this.zzg;
    }
}
