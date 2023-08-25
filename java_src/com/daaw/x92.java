package com.daaw;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzacg;
import com.google.android.gms.internal.ads.zzw;
import com.google.android.gms.internal.ads.zzx;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class x92 implements j09 {

    /* renamed from: E */
    public static final q09 f32195E = new q09() { // from class: com.daaw.t92
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = x92.f32195E;
            return new j09[]{new x92(0, null)};
        }
    };

    /* renamed from: F */
    public static final byte[] f32196F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    public static final f92 f32197G;

    /* renamed from: D */
    public boolean f32201D;

    /* renamed from: f */
    public final byte[] f32207f;

    /* renamed from: g */
    public final ik5 f32208g;

    /* renamed from: l */
    public int f32213l;

    /* renamed from: m */
    public int f32214m;

    /* renamed from: n */
    public long f32215n;

    /* renamed from: o */
    public int f32216o;

    /* renamed from: p */
    public ik5 f32217p;

    /* renamed from: q */
    public long f32218q;

    /* renamed from: r */
    public int f32219r;

    /* renamed from: v */
    public w92 f32223v;

    /* renamed from: w */
    public int f32224w;

    /* renamed from: x */
    public int f32225x;

    /* renamed from: y */
    public int f32226y;

    /* renamed from: z */
    public boolean f32227z;

    /* renamed from: a */
    public final List f32202a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: h */
    public final q62 f32209h = new q62();

    /* renamed from: i */
    public final ik5 f32210i = new ik5(16);

    /* renamed from: c */
    public final ik5 f32204c = new ik5(c42.f5462a);

    /* renamed from: d */
    public final ik5 f32205d = new ik5(5);

    /* renamed from: e */
    public final ik5 f32206e = new ik5();

    /* renamed from: j */
    public final ArrayDeque f32211j = new ArrayDeque();

    /* renamed from: k */
    public final ArrayDeque f32212k = new ArrayDeque();

    /* renamed from: b */
    public final SparseArray f32203b = new SparseArray();

    /* renamed from: t */
    public long f32221t = -9223372036854775807L;

    /* renamed from: s */
    public long f32220s = -9223372036854775807L;

    /* renamed from: u */
    public long f32222u = -9223372036854775807L;

    /* renamed from: A */
    public m09 f32198A = m09.f17985o;

    /* renamed from: B */
    public m42[] f32199B = new m42[0];

    /* renamed from: C */
    public m42[] f32200C = new m42[0];

    static {
        b72 b72Var = new b72();
        b72Var.m26372s("application/x-emsg");
        f32197G = b72Var.m26366y();
    }

    public x92(int i, cr5 cr5Var) {
        byte[] bArr = new byte[16];
        this.f32207f = bArr;
        this.f32208g = new ik5(bArr);
    }

    /* renamed from: b */
    public static int m5420b(int i) {
        if (i >= 0) {
            return i;
        }
        throw dl3.m24267a("Unexpected negative value: " + i, null);
    }

    /* renamed from: e */
    public static zzx m5419e(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            b92 b92Var = (b92) list.get(i);
            if (b92Var.f5641a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] m19714h = b92Var.f4558b.m19714h();
                UUID m23633a = ea2.m23633a(m19714h);
                if (m23633a == null) {
                    s95.m10493e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzw(m23633a, null, "video/mp4", m19714h));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzx(arrayList);
    }

    /* renamed from: h */
    public static void m5417h(ik5 ik5Var, int i, ja2 ja2Var) {
        ik5Var.m19716f(i + 8);
        int m19709m = ik5Var.m19709m() & 16777215;
        if ((m19709m & 1) != 0) {
            throw dl3.m24265c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m19709m & 2) != 0;
        int m19700v = ik5Var.m19700v();
        if (m19700v == 0) {
            Arrays.fill(ja2Var.f14601l, 0, ja2Var.f14594e, false);
            return;
        }
        int i2 = ja2Var.f14594e;
        if (m19700v != i2) {
            throw dl3.m24267a("Senc sample count " + m19700v + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(ja2Var.f14601l, 0, m19700v, z);
        ja2Var.m18679a(ik5Var.m19713i());
        ik5 ik5Var2 = ja2Var.f14603n;
        ik5Var.m19720b(ik5Var2.m19714h(), 0, ik5Var2.m19710l());
        ja2Var.f14603n.m19716f(0);
        ja2Var.f14604o = false;
    }

    /* renamed from: j */
    public static final s92 m5415j(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (s92) sparseArray.valueAt(0);
        }
        s92 s92Var = (s92) sparseArray.get(i);
        Objects.requireNonNull(s92Var);
        return s92Var;
    }

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        return ga2.m21850a(k09Var);
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f32198A = m09Var;
        m5418g();
        m42[] m42VarArr = new m42[2];
        this.f32199B = m42VarArr;
        int i = 0;
        m42[] m42VarArr2 = (m42[]) it5.m19426F(m42VarArr, 0);
        this.f32199B = m42VarArr2;
        for (m42 m42Var : m42VarArr2) {
            m42Var.mo16218f(f32197G);
        }
        this.f32200C = new m42[this.f32202a.size()];
        int i2 = 100;
        while (i < this.f32200C.length) {
            int i3 = i2 + 1;
            m42 mo3292n = this.f32198A.mo3292n(i2, 3);
            mo3292n.mo16218f((f92) this.f32202a.get(i));
            this.f32200C[i] = mo3292n;
            i++;
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023f, code lost:
        r23 = r1.f13394c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0244, code lost:
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0246, code lost:
        r5.mo16222b(r10, r20, r33.f32224w, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0259, code lost:
        if (r33.f32212k.isEmpty() != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025b, code lost:
        r1 = (com.daaw.v92) r33.f32212k.removeFirst();
        r33.f32219r -= r1.f30052c;
        r3 = r1.f30050a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026e, code lost:
        if (r1.f30051b == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0270, code lost:
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0271, code lost:
        r5 = r33.f32199B;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0275, code lost:
        if (r8 >= r6) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0277, code lost:
        r5[r8].mo16222b(r3, 1, r1.f30052c, r33.f32219r, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x028f, code lost:
        if (r2.m6300k() != false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0291, code lost:
        r33.f32223v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0293, code lost:
        r33.f32213l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r33.f32213l != 3) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        r3 = r2.m6309b();
        r33.f32224w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
        if (r2.f31065f >= r2.f31068i) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
        ((com.daaw.rz8) r1).m10811l(r3, false);
        r1 = r2.m6305f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
        if (r1 != null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
        r3 = r2.f31061b.f14603n;
        r1 = r1.f13395d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r1 == 0) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
        r3.m19715g(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
        if (r2.f31061b.m18678b(r2.f31065f) == false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
        r3.m19715g(r3.m19699w() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d8, code lost:
        if (r2.m6300k() != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00da, code lost:
        r33.f32223v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dc, code lost:
        r33.f32213l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
        if (r2.f31063d.f15844a.f12293g != 1) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
        r33.f32224w = r3 - 8;
        ((com.daaw.rz8) r1).m10811l(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
        if ("audio/ac4".equals(r2.f31063d.f15844a.f12292f.f9275l) == false) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
        r33.f32225x = r2.m6308c(r33.f32224w, 7);
        com.daaw.fz8.m22116b(r33.f32224w, r33.f32208g);
        r2.f31060a.mo16221c(r33.f32208g, 7);
        r3 = r33.f32225x + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0120, code lost:
        r3 = r2.m6308c(r33.f32224w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
        r33.f32225x = r3;
        r33.f32224w += r3;
        r33.f32213l = 4;
        r33.f32226y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0132, code lost:
        r3 = r2.f31063d.f15844a;
        r5 = r2.f31060a;
        r10 = r2.m6306e();
        r6 = r3.f12296j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013e, code lost:
        if (r6 != 0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0140, code lost:
        r3 = r33.f32225x;
        r4 = r33.f32224w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
        if (r3 >= r4) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0146, code lost:
        r33.f32225x += r5.mo16219e(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
        r13 = r33.f32205d.m19714h();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0167, code lost:
        if (r33.f32225x >= r33.f32224w) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
        r12 = r33.f32226y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016d, code lost:
        if (r12 != 0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016f, code lost:
        ((com.daaw.rz8) r1).mo5663e(r13, r6, r14, r9);
        r33.f32205d.m19716f(r9);
        r12 = r33.f32205d.m19709m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0180, code lost:
        if (r12 <= 0) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0182, code lost:
        r33.f32226y = r12 - 1;
        r33.f32204c.m19716f(r9);
        r5.mo16221c(r33.f32204c, 4);
        r5.mo16221c(r33.f32205d, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
        if (r33.f32200C.length <= 0) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
        r12 = r3.f12292f.f9275l;
        r17 = r13[4];
        r9 = com.daaw.c42.f5462a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a9, code lost:
        if ("video/avc".equals(r12) == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ad, code lost:
        if ((r17 & 31) == r4) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
        if ("video/hevc".equals(r12) == false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bd, code lost:
        if (((r17 & 126) >> r8) != 39) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c0, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
        r33.f32227z = r9;
        r33.f32225x += 5;
        r33.f32224w += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d5, code lost:
        throw com.daaw.dl3.m24267a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d8, code lost:
        if (r33.f32227z == false) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
        r33.f32206e.m19719c(r12);
        ((com.daaw.rz8) r1).mo5663e(r33.f32206e.m19714h(), 0, r33.f32226y, false);
        r5.mo16221c(r33.f32206e, r33.f32226y);
        r4 = r33.f32226y;
        r8 = r33.f32206e;
        r8 = com.daaw.c42.m25631b(r8.m19714h(), r8.m19710l());
        r33.f32206e.m19716f("video/hevc".equals(r3.f12292f.f9275l) ? 1 : 0);
        r33.f32206e.m19717e(r8);
        com.daaw.oz8.m13792a(r10, r33.f32206e, r33.f32200C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021f, code lost:
        r4 = r5.mo16219e(r1, r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0225, code lost:
        r33.f32225x += r4;
        r33.f32226y -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0231, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0235, code lost:
        r20 = r2.m6310a();
        r1 = r2.m6305f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023d, code lost:
        if (r1 == null) goto L330;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0729 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.daaw.j09
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        boolean z;
        boolean z2;
        int i;
        long m19392g0;
        long m19729A;
        String str;
        String str2;
        long j;
        long j2;
        m42[] m42VarArr;
        ArrayDeque arrayDeque;
        v92 v92Var;
        long m19728B;
        long m19728B2;
        int[] iArr;
        long zzf;
        long j3;
        long j4;
        ik5 ik5Var;
        k09 k09Var2 = k09Var;
        while (true) {
            int i2 = this.f32213l;
            int i3 = 1;
            ?? r9 = 0;
            if (i2 == 0) {
                if (this.f32216o == 0) {
                    if (!k09Var2.mo5663e(this.f32210i.m19714h(), 0, 8, true)) {
                        return -1;
                    }
                    this.f32216o = 8;
                    this.f32210i.m19716f(0);
                    this.f32215n = this.f32210i.m19729A();
                    this.f32214m = this.f32210i.m19709m();
                }
                long j5 = this.f32215n;
                if (j5 == 1) {
                    ((rz8) k09Var2).mo5663e(this.f32210i.m19714h(), 8, 8, false);
                    this.f32216o += 8;
                    zzf = this.f32210i.m19728B();
                } else {
                    if (j5 == 0) {
                        long zzd = k09Var.zzd();
                        if (zzd == -1) {
                            zzd = !this.f32211j.isEmpty() ? ((a92) this.f32211j.peek()).f3004b : -1L;
                        }
                        if (zzd != -1) {
                            zzf = (zzd - k09Var.zzf()) + this.f32216o;
                        }
                    }
                    j3 = this.f32215n;
                    j4 = this.f32216o;
                    if (j3 >= j4) {
                        throw dl3.m24265c("Atom size less than header length (unsupported).");
                    }
                    long zzf2 = k09Var.zzf() - j4;
                    int i4 = this.f32214m;
                    if ((i4 == 1836019558 || i4 == 1835295092) && !this.f32201D) {
                        this.f32198A.mo3297i(new h42(this.f32221t, zzf2));
                        this.f32201D = true;
                    }
                    if (this.f32214m == 1836019558) {
                        int size = this.f32203b.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            ja2 ja2Var = ((w92) this.f32203b.valueAt(i5)).f31061b;
                            ja2Var.f14592c = zzf2;
                            ja2Var.f14591b = zzf2;
                        }
                    }
                    int i6 = this.f32214m;
                    if (i6 == 1835295092) {
                        this.f32223v = null;
                        this.f32218q = zzf2 + this.f32215n;
                        i = 2;
                    } else if (i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1836019558 || i6 == 1953653094 || i6 == 1836475768 || i6 == 1701082227) {
                        long zzf3 = (k09Var.zzf() + this.f32215n) - 8;
                        this.f32211j.push(new a92(i6, zzf3));
                        if (this.f32215n == this.f32216o) {
                            m5416i(zzf3);
                        } else {
                            m5418g();
                        }
                    } else {
                        if (i6 == 1751411826 || i6 == 1835296868 || i6 == 1836476516 || i6 == 1936286840 || i6 == 1937011556 || i6 == 1937011827 || i6 == 1668576371 || i6 == 1937011555 || i6 == 1937011578 || i6 == 1937013298 || i6 == 1937007471 || i6 == 1668232756 || i6 == 1937011571 || i6 == 1952867444 || i6 == 1952868452 || i6 == 1953196132 || i6 == 1953654136 || i6 == 1953658222 || i6 == 1886614376 || i6 == 1935763834 || i6 == 1935763823 || i6 == 1936027235 || i6 == 1970628964 || i6 == 1935828848 || i6 == 1936158820 || i6 == 1701606260 || i6 == 1835362404 || i6 == 1701671783) {
                            if (this.f32216o != 8) {
                                throw dl3.m24265c("Leaf atom defines extended atom size (unsupported).");
                            }
                            long j6 = this.f32215n;
                            if (j6 > 2147483647L) {
                                throw dl3.m24265c("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            ik5Var = new ik5((int) j6);
                            System.arraycopy(this.f32210i.m19714h(), 0, ik5Var.m19714h(), 0, 8);
                        } else if (this.f32215n > 2147483647L) {
                            throw dl3.m24265c("Skipping atom with length > 2147483647 (unsupported).");
                        } else {
                            ik5Var = null;
                        }
                        this.f32217p = ik5Var;
                        i = 1;
                    }
                    this.f32213l = i;
                }
                this.f32215n = zzf;
                j3 = this.f32215n;
                j4 = this.f32216o;
                if (j3 >= j4) {
                }
            } else if (i2 != 1) {
                long j7 = Long.MAX_VALUE;
                if (i2 != 2) {
                    w92 w92Var = this.f32223v;
                    if (w92Var != null) {
                        break;
                    }
                    SparseArray sparseArray = this.f32203b;
                    int size2 = sparseArray.size();
                    long j8 = Long.MAX_VALUE;
                    w92 w92Var2 = null;
                    for (int i7 = 0; i7 < size2; i7++) {
                        w92 w92Var3 = (w92) sparseArray.valueAt(i7);
                        z = w92Var3.f31071l;
                        if (z || w92Var3.f31065f != w92Var3.f31063d.f15845b) {
                            z2 = w92Var3.f31071l;
                            if (!z2 || w92Var3.f31067h != w92Var3.f31061b.f14593d) {
                                long m6307d = w92Var3.m6307d();
                                if (m6307d < j8) {
                                    w92Var2 = w92Var3;
                                    j8 = m6307d;
                                }
                            }
                        }
                    }
                    if (w92Var2 == null) {
                        int zzf4 = (int) (this.f32218q - k09Var.zzf());
                        if (zzf4 < 0) {
                            throw dl3.m24267a("Offset to end of mdat was negative.", null);
                        }
                        ((rz8) k09Var2).m10811l(zzf4, false);
                        m5418g();
                    } else {
                        int m6307d2 = (int) (w92Var2.m6307d() - k09Var.zzf());
                        if (m6307d2 < 0) {
                            s95.m10493e("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            m6307d2 = 0;
                        }
                        ((rz8) k09Var2).m10811l(m6307d2, false);
                        this.f32223v = w92Var2;
                        w92Var = w92Var2;
                    }
                } else {
                    int size3 = this.f32203b.size();
                    w92 w92Var4 = null;
                    for (int i8 = 0; i8 < size3; i8++) {
                        ja2 ja2Var2 = ((w92) this.f32203b.valueAt(i8)).f31061b;
                        if (ja2Var2.f14604o) {
                            long j9 = ja2Var2.f14592c;
                            if (j9 < j7) {
                                w92Var4 = (w92) this.f32203b.valueAt(i8);
                                j7 = j9;
                            }
                        }
                    }
                    if (w92Var4 == null) {
                        i = 3;
                        this.f32213l = i;
                    } else {
                        int zzf5 = (int) (j7 - k09Var.zzf());
                        if (zzf5 < 0) {
                            throw dl3.m24267a("Offset to encryption data was negative.", null);
                        }
                        rz8 rz8Var = (rz8) k09Var2;
                        rz8Var.m10811l(zzf5, false);
                        ja2 ja2Var3 = w92Var4.f31061b;
                        ik5 ik5Var2 = ja2Var3.f14603n;
                        rz8Var.mo5663e(ik5Var2.m19714h(), 0, ik5Var2.m19710l(), false);
                        ja2Var3.f14603n.m19716f(0);
                        ja2Var3.f14604o = false;
                    }
                }
            } else {
                int i9 = ((int) this.f32215n) - this.f32216o;
                ik5 ik5Var3 = this.f32217p;
                if (ik5Var3 != null) {
                    ((rz8) k09Var2).mo5663e(ik5Var3.m19714h(), 8, i9, false);
                    b92 b92Var = new b92(this.f32214m, ik5Var3);
                    long zzf6 = k09Var.zzf();
                    if (this.f32211j.isEmpty()) {
                        int i10 = b92Var.f5641a;
                        if (i10 == 1936286840) {
                            ik5 ik5Var4 = b92Var.f4558b;
                            ik5Var4.m19716f(8);
                            int m19709m = ik5Var4.m19709m();
                            ik5Var4.m19715g(4);
                            long m19729A2 = ik5Var4.m19729A();
                            if (c92.m25488a(m19709m) == 0) {
                                m19728B = ik5Var4.m19729A();
                                m19728B2 = ik5Var4.m19729A();
                            } else {
                                m19728B = ik5Var4.m19728B();
                                m19728B2 = ik5Var4.m19728B();
                            }
                            long j10 = zzf6 + m19728B2;
                            long m19392g02 = it5.m19392g0(m19728B, 1000000L, m19729A2);
                            ik5Var4.m19715g(2);
                            int m19699w = ik5Var4.m19699w();
                            int[] iArr2 = new int[m19699w];
                            long[] jArr = new long[m19699w];
                            long[] jArr2 = new long[m19699w];
                            long[] jArr3 = new long[m19699w];
                            long j11 = m19392g02;
                            int i11 = 0;
                            while (i11 < m19699w) {
                                int m19709m2 = ik5Var4.m19709m();
                                if ((m19709m2 & Integer.MIN_VALUE) != 0) {
                                    throw dl3.m24267a("Unhandled indirect reference", null);
                                }
                                long m19729A3 = ik5Var4.m19729A();
                                iArr2[i11] = m19709m2 & Integer.MAX_VALUE;
                                jArr[i11] = j10;
                                jArr3[i11] = j11;
                                long j12 = m19728B + m19729A3;
                                long[] jArr4 = jArr3;
                                int i12 = i11;
                                long[] jArr5 = jArr2;
                                j11 = it5.m19392g0(j12, 1000000L, m19729A2);
                                jArr5[i12] = j11 - jArr4[i12];
                                ik5Var4.m19715g(4);
                                j10 += iArr[i12];
                                i11 = i12 + 1;
                                iArr2 = iArr2;
                                jArr = jArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                m19699w = m19699w;
                                m19728B = j12;
                            }
                            Pair create = Pair.create(Long.valueOf(m19392g02), new pz8(iArr2, jArr, jArr2, jArr3));
                            this.f32222u = ((Long) create.first).longValue();
                            this.f32198A.mo3297i((i42) create.second);
                            this.f32201D = true;
                        } else if (i10 == 1701671783) {
                            ik5 ik5Var5 = b92Var.f4558b;
                            if (this.f32199B.length != 0) {
                                ik5Var5.m19716f(8);
                                int m25488a = c92.m25488a(ik5Var5.m19709m());
                                if (m25488a == 0) {
                                    String m19726D = ik5Var5.m19726D((char) 0);
                                    Objects.requireNonNull(m19726D);
                                    String m19726D2 = ik5Var5.m19726D((char) 0);
                                    Objects.requireNonNull(m19726D2);
                                    long m19729A4 = ik5Var5.m19729A();
                                    long m19392g03 = it5.m19392g0(ik5Var5.m19729A(), 1000000L, m19729A4);
                                    long j13 = this.f32222u;
                                    long j14 = j13 != -9223372036854775807L ? j13 + m19392g03 : -9223372036854775807L;
                                    m19392g0 = it5.m19392g0(ik5Var5.m19729A(), 1000L, m19729A4);
                                    m19729A = ik5Var5.m19729A();
                                    str = m19726D;
                                    str2 = m19726D2;
                                    j = m19392g03;
                                    j2 = j14;
                                } else if (m25488a != 1) {
                                    s95.m10493e("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + m25488a);
                                } else {
                                    long m19729A5 = ik5Var5.m19729A();
                                    long m19392g04 = it5.m19392g0(ik5Var5.m19728B(), 1000000L, m19729A5);
                                    long m19392g05 = it5.m19392g0(ik5Var5.m19729A(), 1000L, m19729A5);
                                    long m19729A6 = ik5Var5.m19729A();
                                    String m19726D3 = ik5Var5.m19726D((char) 0);
                                    Objects.requireNonNull(m19726D3);
                                    String m19726D4 = ik5Var5.m19726D((char) 0);
                                    Objects.requireNonNull(m19726D4);
                                    m19392g0 = m19392g05;
                                    m19729A = m19729A6;
                                    str = m19726D3;
                                    str2 = m19726D4;
                                    j = -9223372036854775807L;
                                    j2 = m19392g04;
                                }
                                byte[] bArr = new byte[ik5Var5.m19713i()];
                                ik5Var5.m19720b(bArr, 0, ik5Var5.m19713i());
                                ik5 ik5Var6 = new ik5(this.f32209h.m12744a(new zzacg(str, str2, m19392g0, m19729A, bArr)));
                                int m19713i = ik5Var6.m19713i();
                                for (m42 m42Var : this.f32199B) {
                                    ik5Var6.m19716f(0);
                                    m42Var.mo16221c(ik5Var6, m19713i);
                                }
                                if (j2 == -9223372036854775807L) {
                                    arrayDeque = this.f32212k;
                                    v92Var = new v92(j, true, m19713i);
                                } else if (this.f32212k.isEmpty()) {
                                    for (m42 m42Var2 : this.f32199B) {
                                        m42Var2.mo16222b(j2, 1, m19713i, 0, null);
                                    }
                                } else {
                                    arrayDeque = this.f32212k;
                                    v92Var = new v92(j2, false, m19713i);
                                }
                                arrayDeque.addLast(v92Var);
                                this.f32219r += m19713i;
                            }
                        }
                        k09Var2 = k09Var;
                    } else {
                        ((a92) this.f32211j.peek()).m27554f(b92Var);
                    }
                } else {
                    ((rz8) k09Var2).m10811l(i9, false);
                }
                m5416i(k09Var.zzf());
            }
        }
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        int size = this.f32203b.size();
        for (int i = 0; i < size; i++) {
            ((w92) this.f32203b.valueAt(i)).m6302i();
        }
        this.f32212k.clear();
        this.f32219r = 0;
        this.f32220s = j2;
        this.f32211j.clear();
        m5418g();
    }

    /* renamed from: g */
    public final void m5418g() {
        this.f32213l = 0;
        this.f32216o = 0;
    }

    /* renamed from: i */
    public final void m5416i(long j) {
        x92 x92Var;
        SparseArray sparseArray;
        a92 a92Var;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        int i5;
        a92 a92Var2;
        byte[] bArr4;
        ja2 ja2Var;
        List list;
        int i6;
        int i7;
        int i8;
        a92 a92Var3;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        s92 s92Var;
        long j2;
        final x92 x92Var2 = this;
        while (!x92Var2.f32211j.isEmpty() && ((a92) x92Var2.f32211j.peek()).f3004b == j) {
            a92 a92Var4 = (a92) x92Var2.f32211j.pop();
            int i18 = a92Var4.f5641a;
            int i19 = 12;
            int i20 = 8;
            if (i18 == 1836019574) {
                zzx m5419e = m5419e(a92Var4.f3005c);
                a92 m27557c = a92Var4.m27557c(1836475768);
                Objects.requireNonNull(m27557c);
                SparseArray sparseArray2 = new SparseArray();
                int size = m27557c.f3005c.size();
                long j3 = -9223372036854775807L;
                int i21 = 0;
                while (i21 < size) {
                    b92 b92Var = (b92) m27557c.f3005c.get(i21);
                    int i22 = b92Var.f5641a;
                    if (i22 == 1953654136) {
                        ik5 ik5Var = b92Var.f4558b;
                        ik5Var.m19716f(i19);
                        Pair create = Pair.create(Integer.valueOf(ik5Var.m19709m()), new s92(ik5Var.m19709m() - 1, ik5Var.m19709m(), ik5Var.m19709m(), ik5Var.m19709m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (s92) create.second);
                    } else if (i22 == 1835362404) {
                        ik5 ik5Var2 = b92Var.f4558b;
                        ik5Var2.m19716f(8);
                        j3 = c92.m25488a(ik5Var2.m19709m()) == 0 ? ik5Var2.m19729A() : ik5Var2.m19728B();
                    }
                    i21++;
                    i19 = 12;
                }
                List m11563c = r92.m11563c(a92Var4, new y09(), j3, m5419e, false, false, new ey6() { // from class: com.daaw.u92
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        return (ha2) obj;
                    }
                });
                int size2 = m11563c.size();
                if (x92Var2.f32203b.size() == 0) {
                    for (int i23 = 0; i23 < size2; i23++) {
                        ka2 ka2Var = (ka2) m11563c.get(i23);
                        ha2 ha2Var = ka2Var.f15844a;
                        x92Var2.f32203b.put(ha2Var.f12287a, new w92(x92Var2.f32198A.mo3292n(i23, ha2Var.f12288b), ka2Var, m5415j(sparseArray2, ha2Var.f12287a)));
                        x92Var2.f32221t = Math.max(x92Var2.f32221t, ha2Var.f12291e);
                    }
                    x92Var2.f32198A.zzC();
                } else {
                    uo4.m7872f(x92Var2.f32203b.size() == size2);
                    for (int i24 = 0; i24 < size2; i24++) {
                        ka2 ka2Var2 = (ka2) m11563c.get(i24);
                        ha2 ha2Var2 = ka2Var2.f15844a;
                        ((w92) x92Var2.f32203b.get(ha2Var2.f12287a)).m6303h(ka2Var2, m5415j(sparseArray2, ha2Var2.f12287a));
                    }
                }
            } else {
                if (i18 == 1836019558) {
                    SparseArray sparseArray3 = x92Var2.f32203b;
                    byte[] bArr5 = x92Var2.f32207f;
                    int size3 = a92Var4.f3006d.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        a92 a92Var5 = (a92) a92Var4.f3006d.get(i25);
                        if (a92Var5.f5641a == 1953653094) {
                            b92 m27556d = a92Var5.m27556d(1952868452);
                            Objects.requireNonNull(m27556d);
                            ik5 ik5Var3 = m27556d.f4558b;
                            ik5Var3.m19716f(i20);
                            int m19709m = ik5Var3.m19709m() & 16777215;
                            w92 w92Var = (w92) sparseArray3.get(ik5Var3.m19709m());
                            if (w92Var == null) {
                                w92Var = null;
                            } else {
                                if ((m19709m & 1) != 0) {
                                    long m19728B = ik5Var3.m19728B();
                                    ja2 ja2Var2 = w92Var.f31061b;
                                    ja2Var2.f14591b = m19728B;
                                    ja2Var2.f14592c = m19728B;
                                }
                                s92 s92Var2 = w92Var.f31064e;
                                w92Var.f31061b.f14590a = new s92((m19709m & 2) != 0 ? ik5Var3.m19709m() - 1 : s92Var2.f26019a, (m19709m & 8) != 0 ? ik5Var3.m19709m() : s92Var2.f26020b, (m19709m & 16) != 0 ? ik5Var3.m19709m() : s92Var2.f26021c, (m19709m & 32) != 0 ? ik5Var3.m19709m() : s92Var2.f26022d);
                            }
                            if (w92Var != null) {
                                ja2 ja2Var3 = w92Var.f31061b;
                                long j4 = ja2Var3.f14605p;
                                boolean z3 = ja2Var3.f14606q;
                                w92Var.m6302i();
                                w92Var.f31071l = true;
                                b92 m27556d2 = a92Var5.m27556d(1952867444);
                                if (m27556d2 != null) {
                                    ik5 ik5Var4 = m27556d2.f4558b;
                                    ik5Var4.m19716f(i20);
                                    ja2Var3.f14605p = c92.m25488a(ik5Var4.m19709m()) == 1 ? ik5Var4.m19728B() : ik5Var4.m19729A();
                                    ja2Var3.f14606q = true;
                                } else {
                                    ja2Var3.f14605p = j4;
                                    ja2Var3.f14606q = z3;
                                }
                                List list2 = a92Var5.f3005c;
                                int size4 = list2.size();
                                int i26 = 0;
                                int i27 = 0;
                                int i28 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i26 >= size4) {
                                        break;
                                    }
                                    b92 b92Var2 = (b92) list2.get(i26);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (b92Var2.f5641a == 1953658222) {
                                        ik5 ik5Var5 = b92Var2.f4558b;
                                        ik5Var5.m19716f(12);
                                        int m19700v = ik5Var5.m19700v();
                                        if (m19700v > 0) {
                                            i28 += m19700v;
                                            i27++;
                                        }
                                    }
                                    i26++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                w92Var.f31067h = 0;
                                w92Var.f31066g = 0;
                                w92Var.f31065f = 0;
                                ja2 ja2Var4 = w92Var.f31061b;
                                ja2Var4.f14593d = i27;
                                ja2Var4.f14594e = i28;
                                if (ja2Var4.f14596g.length < i27) {
                                    ja2Var4.f14595f = new long[i27];
                                    ja2Var4.f14596g = new int[i27];
                                }
                                if (ja2Var4.f14597h.length < i28) {
                                    int i29 = (i28 * x21.f31814L0) / 100;
                                    ja2Var4.f14597h = new int[i29];
                                    ja2Var4.f14598i = new long[i29];
                                    ja2Var4.f14599j = new boolean[i29];
                                    ja2Var4.f14601l = new boolean[i29];
                                }
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i30 >= size4) {
                                        break;
                                    }
                                    b92 b92Var3 = (b92) list2.get(i30);
                                    if (b92Var3.f5641a == i3) {
                                        int i33 = i32 + 1;
                                        ik5 ik5Var6 = b92Var3.f4558b;
                                        ik5Var6.m19716f(8);
                                        int m19709m2 = ik5Var6.m19709m() & 16777215;
                                        list = list2;
                                        ha2 ha2Var3 = w92Var.f31063d.f15844a;
                                        i6 = size3;
                                        ja2 ja2Var5 = w92Var.f31061b;
                                        i8 = size4;
                                        s92 s92Var3 = ja2Var5.f14590a;
                                        int i34 = it5.f13991a;
                                        ja2Var5.f14596g[i32] = ik5Var6.m19700v();
                                        long[] jArr = ja2Var5.f14595f;
                                        a92Var2 = a92Var4;
                                        bArr4 = bArr5;
                                        long j6 = ja2Var5.f14591b;
                                        jArr[i32] = j6;
                                        if ((m19709m2 & 1) != 0) {
                                            i5 = i30;
                                            jArr[i32] = j6 + ik5Var6.m19709m();
                                        } else {
                                            i5 = i30;
                                        }
                                        boolean z4 = (m19709m2 & 4) != 0;
                                        int i35 = s92Var3.f26022d;
                                        if (z4) {
                                            i35 = ik5Var6.m19709m();
                                        }
                                        int i36 = m19709m2 & 256;
                                        int i37 = m19709m2 & 512;
                                        int i38 = m19709m2 & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                                        int i39 = m19709m2 & 2048;
                                        int i40 = i35;
                                        long[] jArr2 = ha2Var3.f12294h;
                                        i7 = i25;
                                        if (jArr2 != null) {
                                            a92Var3 = a92Var5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) it5.m19391h(ha2Var3.f12295i))[0];
                                            }
                                        } else {
                                            a92Var3 = a92Var5;
                                        }
                                        int[] iArr = ja2Var5.f14597h;
                                        long[] jArr3 = ja2Var5.f14598i;
                                        boolean[] zArr = ja2Var5.f14599j;
                                        ja2Var = ja2Var3;
                                        int i41 = ja2Var5.f14596g[i32] + i31;
                                        long j7 = ha2Var3.f12289c;
                                        int i42 = i31;
                                        long j8 = ja2Var5.f14605p;
                                        while (i42 < i41) {
                                            if (i36 != 0) {
                                                i9 = i36;
                                                i10 = ik5Var6.m19709m();
                                            } else {
                                                i9 = i36;
                                                i10 = s92Var3.f26020b;
                                            }
                                            m5420b(i10);
                                            if (i37 != 0) {
                                                i11 = i37;
                                                i12 = ik5Var6.m19709m();
                                            } else {
                                                i11 = i37;
                                                i12 = s92Var3.f26021c;
                                            }
                                            m5420b(i12);
                                            if (i38 != 0) {
                                                z2 = z4;
                                                i13 = ik5Var6.m19709m();
                                            } else {
                                                z2 = z4;
                                                if (i42 == 0) {
                                                    if (z4) {
                                                        i13 = i40;
                                                        i42 = 0;
                                                    } else {
                                                        i42 = 0;
                                                    }
                                                }
                                                i13 = s92Var3.f26022d;
                                            }
                                            if (i39 != 0) {
                                                i14 = i41;
                                                i15 = i38;
                                                i16 = i39;
                                                i17 = ik5Var6.m19709m();
                                            } else {
                                                i14 = i41;
                                                i15 = i38;
                                                i16 = i39;
                                                i17 = 0;
                                            }
                                            long m19392g0 = it5.m19392g0((i17 + j8) - j5, 1000000L, j7);
                                            jArr3[i42] = m19392g0;
                                            if (ja2Var5.f14606q) {
                                                s92Var = s92Var3;
                                                j2 = j7;
                                            } else {
                                                s92Var = s92Var3;
                                                j2 = j7;
                                                jArr3[i42] = m19392g0 + w92Var.f31063d.f15851h;
                                            }
                                            iArr[i42] = i12;
                                            zArr[i42] = 1 == (((i13 >> 16) & 1) ^ 1);
                                            j8 += i10;
                                            i42++;
                                            s92Var3 = s92Var;
                                            j7 = j2;
                                            i36 = i9;
                                            i37 = i11;
                                            z4 = z2;
                                            i41 = i14;
                                            i38 = i15;
                                            i39 = i16;
                                        }
                                        ja2Var5.f14605p = j8;
                                        i32 = i33;
                                        i31 = i41;
                                    } else {
                                        i5 = i30;
                                        a92Var2 = a92Var4;
                                        bArr4 = bArr5;
                                        ja2Var = ja2Var3;
                                        list = list2;
                                        i6 = size3;
                                        i7 = i25;
                                        i8 = size4;
                                        a92Var3 = a92Var5;
                                    }
                                    i30 = i5 + 1;
                                    list2 = list;
                                    size3 = i6;
                                    size4 = i8;
                                    a92Var4 = a92Var2;
                                    bArr5 = bArr4;
                                    i25 = i7;
                                    a92Var5 = a92Var3;
                                    ja2Var3 = ja2Var;
                                    i3 = 1953658222;
                                }
                                a92Var = a92Var4;
                                byte[] bArr6 = bArr5;
                                ja2 ja2Var6 = ja2Var3;
                                i = size3;
                                i2 = i25;
                                a92 a92Var6 = a92Var5;
                                ha2 ha2Var4 = w92Var.f31063d.f15844a;
                                s92 s92Var4 = ja2Var6.f14590a;
                                Objects.requireNonNull(s92Var4);
                                ia2 m20888a = ha2Var4.m20888a(s92Var4.f26019a);
                                b92 m27556d3 = a92Var6.m27556d(1935763834);
                                if (m27556d3 != null) {
                                    Objects.requireNonNull(m20888a);
                                    ik5 ik5Var7 = m27556d3.f4558b;
                                    int i43 = m20888a.f13395d;
                                    ik5Var7.m19716f(8);
                                    if ((ik5Var7.m19709m() & 1) == 1) {
                                        ik5Var7.m19715g(8);
                                    }
                                    int m19703s = ik5Var7.m19703s();
                                    int m19700v2 = ik5Var7.m19700v();
                                    int i44 = ja2Var6.f14594e;
                                    if (m19700v2 > i44) {
                                        throw dl3.m24267a("Saiz sample count " + m19700v2 + " is greater than fragment sample count" + i44, null);
                                    }
                                    if (m19703s == 0) {
                                        boolean[] zArr2 = ja2Var6.f14601l;
                                        i4 = 0;
                                        for (int i45 = 0; i45 < m19700v2; i45++) {
                                            int m19703s2 = ik5Var7.m19703s();
                                            i4 += m19703s2;
                                            zArr2[i45] = m19703s2 > i43;
                                        }
                                        z = false;
                                    } else {
                                        boolean z5 = m19703s > i43;
                                        i4 = m19703s * m19700v2;
                                        z = false;
                                        Arrays.fill(ja2Var6.f14601l, 0, m19700v2, z5);
                                    }
                                    Arrays.fill(ja2Var6.f14601l, m19700v2, ja2Var6.f14594e, z);
                                    if (i4 > 0) {
                                        ja2Var6.m18679a(i4);
                                    }
                                }
                                b92 m27556d4 = a92Var6.m27556d(1935763823);
                                if (m27556d4 != null) {
                                    ik5 ik5Var8 = m27556d4.f4558b;
                                    ik5Var8.m19716f(8);
                                    int m19709m3 = ik5Var8.m19709m();
                                    if ((m19709m3 & 1) == 1) {
                                        ik5Var8.m19715g(8);
                                    }
                                    int m19700v3 = ik5Var8.m19700v();
                                    if (m19700v3 != 1) {
                                        throw dl3.m24267a("Unexpected saio entry count: " + m19700v3, null);
                                    }
                                    ja2Var6.f14592c += c92.m25488a(m19709m3) == 0 ? ik5Var8.m19729A() : ik5Var8.m19728B();
                                }
                                b92 m27556d5 = a92Var6.m27556d(1936027235);
                                if (m27556d5 != null) {
                                    m5417h(m27556d5.f4558b, 0, ja2Var6);
                                }
                                String str = m20888a != null ? m20888a.f13393b : null;
                                ik5 ik5Var9 = null;
                                ik5 ik5Var10 = null;
                                for (int i46 = 0; i46 < a92Var6.f3005c.size(); i46++) {
                                    b92 b92Var4 = (b92) a92Var6.f3005c.get(i46);
                                    ik5 ik5Var11 = b92Var4.f4558b;
                                    int i47 = b92Var4.f5641a;
                                    if (i47 == 1935828848) {
                                        ik5Var11.m19716f(12);
                                        if (ik5Var11.m19709m() == 1936025959) {
                                            ik5Var9 = ik5Var11;
                                        }
                                    } else if (i47 == 1936158820) {
                                        ik5Var11.m19716f(12);
                                        if (ik5Var11.m19709m() == 1936025959) {
                                            ik5Var10 = ik5Var11;
                                        }
                                    }
                                }
                                if (ik5Var9 != null && ik5Var10 != null) {
                                    ik5Var9.m19716f(8);
                                    int m19709m4 = ik5Var9.m19709m();
                                    ik5Var9.m19715g(4);
                                    if (c92.m25488a(m19709m4) == 1) {
                                        ik5Var9.m19715g(4);
                                    }
                                    if (ik5Var9.m19709m() != 1) {
                                        throw dl3.m24265c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    ik5Var10.m19716f(8);
                                    int m25488a = c92.m25488a(ik5Var10.m19709m());
                                    ik5Var10.m19715g(4);
                                    if (m25488a == 1) {
                                        if (ik5Var10.m19729A() == 0) {
                                            throw dl3.m24265c("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (m25488a >= 2) {
                                        ik5Var10.m19715g(4);
                                    }
                                    if (ik5Var10.m19729A() != 1) {
                                        throw dl3.m24265c("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    ik5Var10.m19715g(1);
                                    int m19703s3 = ik5Var10.m19703s();
                                    int i48 = (m19703s3 & 240) >> 4;
                                    int i49 = m19703s3 & 15;
                                    if (ik5Var10.m19703s() == 1) {
                                        int m19703s4 = ik5Var10.m19703s();
                                        byte[] bArr7 = new byte[16];
                                        ik5Var10.m19720b(bArr7, 0, 16);
                                        if (m19703s4 == 0) {
                                            int m19703s5 = ik5Var10.m19703s();
                                            byte[] bArr8 = new byte[m19703s5];
                                            ik5Var10.m19720b(bArr8, 0, m19703s5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        ja2Var6.f14600k = true;
                                        ja2Var6.f14602m = new ia2(true, str, m19703s4, bArr7, i48, i49, bArr3);
                                    }
                                }
                                int size5 = a92Var6.f3005c.size();
                                int i50 = 0;
                                while (i50 < size5) {
                                    b92 b92Var5 = (b92) a92Var6.f3005c.get(i50);
                                    if (b92Var5.f5641a == 1970628964) {
                                        ik5 ik5Var12 = b92Var5.f4558b;
                                        ik5Var12.m19716f(8);
                                        bArr2 = bArr6;
                                        ik5Var12.m19720b(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, f32196F)) {
                                            m5417h(ik5Var12, 16, ja2Var6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i50++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i;
                                a92Var4 = a92Var;
                                i20 = 8;
                                i25 = i2 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        a92Var = a92Var4;
                        i = size3;
                        i2 = i25;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i;
                        a92Var4 = a92Var;
                        i20 = 8;
                        i25 = i2 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx m5419e2 = m5419e(a92Var4.f3005c);
                    x92Var = this;
                    if (m5419e2 != null) {
                        int size6 = x92Var.f32203b.size();
                        for (int i51 = 0; i51 < size6; i51++) {
                            w92 w92Var2 = (w92) x92Var.f32203b.valueAt(i51);
                            ha2 ha2Var5 = w92Var2.f31063d.f15844a;
                            s92 s92Var5 = w92Var2.f31061b.f14590a;
                            int i52 = it5.f13991a;
                            ia2 m20888a2 = ha2Var5.m20888a(s92Var5.f26019a);
                            zzx m1089b = m5419e2.m1089b(m20888a2 != null ? m20888a2.f13393b : null);
                            b72 m22830b = w92Var2.f31063d.f15844a.f12292f.m22830b();
                            m22830b.m26396b(m1089b);
                            w92Var2.f31060a.mo16218f(m22830b.m26366y());
                        }
                    }
                    if (x92Var.f32220s != -9223372036854775807L) {
                        int size7 = x92Var.f32203b.size();
                        for (int i53 = 0; i53 < size7; i53++) {
                            w92 w92Var3 = (w92) x92Var.f32203b.valueAt(i53);
                            long j9 = x92Var.f32220s;
                            int i54 = w92Var3.f31065f;
                            while (true) {
                                ja2 ja2Var7 = w92Var3.f31061b;
                                if (i54 < ja2Var7.f14594e && ja2Var7.f14598i[i54] < j9) {
                                    if (ja2Var7.f14599j[i54]) {
                                        w92Var3.f31068i = i54;
                                    }
                                    i54++;
                                }
                            }
                        }
                        x92Var.f32220s = -9223372036854775807L;
                    }
                } else {
                    x92Var = x92Var2;
                    if (!x92Var.f32211j.isEmpty()) {
                        ((a92) x92Var.f32211j.peek()).m27555e(a92Var4);
                    }
                }
                x92Var2 = x92Var;
            }
        }
        m5418g();
    }
}
