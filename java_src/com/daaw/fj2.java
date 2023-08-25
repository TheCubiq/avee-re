package com.daaw;

import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class fj2 extends ls7 implements yt7 {
    private static final fj2 zzb;
    private long zzA;
    private long zzB;
    private long zzF;
    private long zzG;
    private long zzH;
    private long zzJ;
    private hj2 zzM;
    private aj2 zzaC;
    private long zzaI;
    private qi2 zzaL;
    private si2 zzaM;
    private long zzaO;
    private boolean zzaR;
    private long zzaT;
    private oj2 zzaU;
    private cj2 zzae;
    private ej2 zzag;
    private int zzar;
    private int zzas;
    private int zzat;
    private qj2 zzau;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzg = "";
    private String zzh = "";
    private String zzs = "";
    private String zzC = "";
    private String zzD = "D";
    private String zzE = "";
    private String zzI = "";
    private long zzK = -1;
    private long zzL = -1;
    private long zzN = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private String zzT = "D";
    private String zzU = "D";
    private long zzV = -1;
    private int zzW = 1000;
    private int zzX = 1000;
    private long zzY = -1;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private int zzad = 1000;
    private us7 zzaf = ls7.w();
    private long zzah = -1;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private String zzap = "D";
    private long zzaq = -1;
    private long zzav = -1;
    private int zzaw = 1000;
    private int zzax = 1000;
    private String zzay = "D";
    private us7 zzaz = ls7.w();
    private int zzaA = 1000;
    private us7 zzaB = ls7.w();
    private String zzaD = "";
    private long zzaE = -1;
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaJ = -1;
    private String zzaK = "";
    private long zzaN = -1;
    private String zzaP = "";
    private int zzaQ = 2;
    private String zzaS = "";
    private long zzaV = -1;
    private String zzaW = "";

    static {
        fj2 fj2Var = new fj2();
        zzb = fj2Var;
        ls7.C(fj2.class, fj2Var);
    }

    public static /* synthetic */ void A0(fj2 fj2Var, int i) {
        fj2Var.zzad = i - 1;
        fj2Var.zze |= 131072;
    }

    public static /* synthetic */ void B0(fj2 fj2Var, int i) {
        fj2Var.zzaw = i - 1;
        fj2Var.zzf |= 8;
    }

    public static /* synthetic */ void C0(fj2 fj2Var, int i) {
        fj2Var.zzax = i - 1;
        fj2Var.zzf |= 16;
    }

    public static /* synthetic */ void D0(fj2 fj2Var, int i) {
        fj2Var.zzaQ = 5;
        fj2Var.zzf |= 2097152;
    }

    public static fj2 F0() {
        return zzb;
    }

    public static fj2 G0(byte[] bArr, vr7 vr7Var) {
        return (fj2) ls7.s(zzb, bArr, vr7Var);
    }

    public static /* synthetic */ void K0(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zzd |= 1;
        fj2Var.zzg = str;
    }

    public static /* synthetic */ void L(fj2 fj2Var, long j) {
        fj2Var.zzd |= 134217728;
        fj2Var.zzH = j;
    }

    public static /* synthetic */ void L0(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zzd |= 2;
        fj2Var.zzh = str;
    }

    public static /* synthetic */ void M(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zzd |= 268435456;
        fj2Var.zzI = str;
    }

    public static /* synthetic */ void M0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 4;
        fj2Var.zzi = j;
    }

    public static /* synthetic */ void N(fj2 fj2Var, long j) {
        fj2Var.zzd |= 536870912;
        fj2Var.zzJ = j;
    }

    public static /* synthetic */ void N0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 16;
        fj2Var.zzk = j;
    }

    public static /* synthetic */ void O(fj2 fj2Var, long j) {
        fj2Var.zzd |= 1073741824;
        fj2Var.zzK = j;
    }

    public static /* synthetic */ void O0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 32;
        fj2Var.zzl = j;
    }

    public static /* synthetic */ void P(fj2 fj2Var, long j) {
        fj2Var.zzd |= Integer.MIN_VALUE;
        fj2Var.zzL = j;
    }

    public static /* synthetic */ void P0(fj2 fj2Var, long j) {
        fj2Var.zzd |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
        fj2Var.zzq = j;
    }

    public static /* synthetic */ void Q(fj2 fj2Var, long j) {
        fj2Var.zze |= 2;
        fj2Var.zzN = j;
    }

    public static /* synthetic */ void Q0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 2048;
        fj2Var.zzr = j;
    }

    public static /* synthetic */ void R(fj2 fj2Var, long j) {
        fj2Var.zze |= 4;
        fj2Var.zzO = j;
    }

    public static /* synthetic */ void R0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 8192;
        fj2Var.zzt = j;
    }

    public static /* synthetic */ void S(fj2 fj2Var, long j) {
        fj2Var.zze |= 8;
        fj2Var.zzP = j;
    }

    public static /* synthetic */ void S0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 16384;
        fj2Var.zzu = j;
    }

    public static /* synthetic */ void T(fj2 fj2Var, long j) {
        fj2Var.zze |= 16;
        fj2Var.zzQ = j;
    }

    public static /* synthetic */ void T0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 32768;
        fj2Var.zzv = j;
    }

    public static /* synthetic */ void U(fj2 fj2Var, long j) {
        fj2Var.zze |= 32;
        fj2Var.zzR = j;
    }

    public static /* synthetic */ void U0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 65536;
        fj2Var.zzw = j;
    }

    public static /* synthetic */ void V(fj2 fj2Var, long j) {
        fj2Var.zze |= 64;
        fj2Var.zzS = j;
    }

    public static /* synthetic */ void V0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 524288;
        fj2Var.zzz = j;
    }

    public static /* synthetic */ void W(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zze |= 128;
        fj2Var.zzT = str;
    }

    public static /* synthetic */ void W0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 1048576;
        fj2Var.zzA = j;
    }

    public static /* synthetic */ void X(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zze |= 256;
        fj2Var.zzU = str;
    }

    public static /* synthetic */ void X0(fj2 fj2Var, long j) {
        fj2Var.zzd |= 2097152;
        fj2Var.zzB = j;
    }

    public static /* synthetic */ void Y(fj2 fj2Var, long j) {
        fj2Var.zze |= 4096;
        fj2Var.zzY = j;
    }

    public static /* synthetic */ void Y0(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zzd |= NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE;
        fj2Var.zzC = str;
    }

    public static /* synthetic */ void Z(fj2 fj2Var, long j) {
        fj2Var.zze |= 8192;
        fj2Var.zzZ = j;
    }

    public static /* synthetic */ void Z0(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zzd |= 16777216;
        fj2Var.zzE = str;
    }

    public static /* synthetic */ void a0(fj2 fj2Var, long j) {
        fj2Var.zze |= 16384;
        fj2Var.zzaa = j;
    }

    public static /* synthetic */ void a1(fj2 fj2Var, long j) {
        fj2Var.zzd |= 33554432;
        fj2Var.zzF = j;
    }

    public static /* synthetic */ void b0(fj2 fj2Var, cj2 cj2Var) {
        cj2Var.getClass();
        fj2Var.zzae = cj2Var;
        fj2Var.zze |= 262144;
    }

    public static /* synthetic */ void b1(fj2 fj2Var, long j) {
        fj2Var.zzd |= 67108864;
        fj2Var.zzG = j;
    }

    public static /* synthetic */ void c0(fj2 fj2Var, cj2 cj2Var) {
        cj2Var.getClass();
        us7 us7Var = fj2Var.zzaf;
        if (!us7Var.zzc()) {
            fj2Var.zzaf = ls7.x(us7Var);
        }
        fj2Var.zzaf.add(cj2Var);
    }

    public static /* synthetic */ void e0(fj2 fj2Var, ej2 ej2Var) {
        ej2Var.getClass();
        fj2Var.zzag = ej2Var;
        fj2Var.zze |= 524288;
    }

    public static /* synthetic */ void f0(fj2 fj2Var, long j) {
        fj2Var.zze |= 2097152;
        fj2Var.zzai = j;
    }

    public static /* synthetic */ void g0(fj2 fj2Var, long j) {
        fj2Var.zze |= NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE;
        fj2Var.zzaj = j;
    }

    public static /* synthetic */ void h0(fj2 fj2Var, long j) {
        fj2Var.zze |= 8388608;
        fj2Var.zzak = j;
    }

    public static /* synthetic */ void i0(fj2 fj2Var, long j) {
        fj2Var.zze |= 67108864;
        fj2Var.zzan = j;
    }

    public static /* synthetic */ void j0(fj2 fj2Var, long j) {
        fj2Var.zze |= 134217728;
        fj2Var.zzao = j;
    }

    public static /* synthetic */ void k0(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zze |= 268435456;
        fj2Var.zzap = str;
    }

    public static hi2 l0() {
        return (hi2) zzb.H();
    }

    public static /* synthetic */ void m0(fj2 fj2Var, long j) {
        fj2Var.zzf |= 512;
        fj2Var.zzaE = j;
    }

    public static /* synthetic */ void n0(fj2 fj2Var, long j) {
        fj2Var.zzf |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
        fj2Var.zzaF = j;
    }

    public static /* synthetic */ void o0(fj2 fj2Var, long j) {
        fj2Var.zzf |= 2048;
        fj2Var.zzaG = j;
    }

    public static /* synthetic */ void p0(fj2 fj2Var, long j) {
        fj2Var.zzf |= 4096;
        fj2Var.zzaH = j;
    }

    public static /* synthetic */ void q0(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zzf |= 32768;
        fj2Var.zzaK = str;
    }

    public static /* synthetic */ void r0(fj2 fj2Var, String str) {
        str.getClass();
        fj2Var.zzf |= 1048576;
        fj2Var.zzaP = str;
    }

    public static /* synthetic */ void s0(fj2 fj2Var, boolean z) {
        fj2Var.zzf |= NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE;
        fj2Var.zzaR = z;
    }

    public static /* synthetic */ void t0(fj2 fj2Var, long j) {
        fj2Var.zzf |= 16777216;
        fj2Var.zzaT = j;
    }

    public static /* synthetic */ void y0(fj2 fj2Var, int i) {
        fj2Var.zzW = i - 1;
        fj2Var.zze |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
    }

    public static /* synthetic */ void z0(fj2 fj2Var, int i) {
        fj2Var.zzX = i - 1;
        fj2Var.zze |= 2048;
    }

    public final oj2 H0() {
        oj2 oj2Var = this.zzaU;
        return oj2Var == null ? oj2.N() : oj2Var;
    }

    @Override // com.daaw.ls7
    public final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                ps7 ps7Var = lj2.a;
                return ls7.z(zzb, "\u0001_\u0000\u0003\u0001Į_\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂS\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈT\u0019ဂX\u001aဌU\u001bဈ\u0016\u001cဇV\u001dဈ\u0018\u001eဈW\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQ\\ဂRÉဉYĭဂZĮဈ[", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaO", "zzA", "zzB", "zzaP", "zzaT", "zzaQ", mi2.a, "zzC", "zzaR", "zzE", "zzaS", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzaf", cj2.class, "zzR", "zzS", "zzT", "zzU", "zzW", ps7Var, "zzX", ps7Var, "zzae", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", ps7Var, "zzag", "zzah", "zzai", "zzaj", "zzak", "zzan", "zzao", "zzaq", "zzar", kj2.a, "zzas", mj2.a, "zzap", "zzat", ii2.a, "zzau", "zzav", "zzal", "zzam", "zzaw", ps7Var, "zzV", "zzD", "zzax", ps7Var, "zzay", "zzaz", ui2.class, "zzaA", ps7Var, "zzaB", ki2.class, "zzaC", "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaU", "zzaV", "zzaW"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new hi2(null);
            } else {
                return new fj2();
            }
        }
        return (byte) 1;
    }

    public final String I0() {
        return this.zzaP;
    }

    public final String J0() {
        return this.zzC;
    }

    public final boolean u0() {
        return this.zzaR;
    }

    public final boolean v0() {
        return (this.zzd & NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE) != 0;
    }

    public final boolean w0() {
        return (this.zzf & 33554432) != 0;
    }

    public final int x0() {
        int a = ni2.a(this.zzaQ);
        if (a == 0) {
            return 3;
        }
        return a;
    }
}
