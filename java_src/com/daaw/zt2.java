package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzavc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class zt2 implements ns2 {

    /* renamed from: w */
    public static final ps2 f35489w = new wt2();

    /* renamed from: x */
    public static final int f35490x = pz2.m12843g("seig");

    /* renamed from: y */
    public static final byte[] f35491y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: j */
    public int f35501j;

    /* renamed from: k */
    public int f35502k;

    /* renamed from: l */
    public long f35503l;

    /* renamed from: m */
    public int f35504m;

    /* renamed from: n */
    public iz2 f35505n;

    /* renamed from: o */
    public long f35506o;

    /* renamed from: q */
    public yt2 f35508q;

    /* renamed from: r */
    public int f35509r;

    /* renamed from: s */
    public int f35510s;

    /* renamed from: t */
    public int f35511t;

    /* renamed from: u */
    public os2 f35512u;

    /* renamed from: v */
    public boolean f35513v;

    /* renamed from: f */
    public final iz2 f35497f = new iz2(16);

    /* renamed from: b */
    public final iz2 f35493b = new iz2(gz2.f11863a);

    /* renamed from: c */
    public final iz2 f35494c = new iz2(5);

    /* renamed from: d */
    public final iz2 f35495d = new iz2();

    /* renamed from: e */
    public final iz2 f35496e = new iz2(1);

    /* renamed from: g */
    public final byte[] f35498g = new byte[16];

    /* renamed from: h */
    public final Stack f35499h = new Stack();

    /* renamed from: i */
    public final LinkedList f35500i = new LinkedList();

    /* renamed from: a */
    public final SparseArray f35492a = new SparseArray();

    /* renamed from: p */
    public long f35507p = -9223372036854775807L;

    public zt2(int i, mz2 mz2Var, fu2 fu2Var) {
        m1910f();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzavc m1915a(List list) {
        Pair create;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            mt2 mt2Var = (mt2) list.get(i);
            int i2 = mt2Var.f20723a;
            int i3 = nt2.f20667V;
            if (i2 == i3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = mt2Var.f19141P0.f14125a;
                iz2 iz2Var = new iz2(bArr);
                if (iz2Var.m19243d() >= 32) {
                    iz2Var.m19225v(0);
                    if (iz2Var.m19242e() == iz2Var.m19246a() + 4 && iz2Var.m19242e() == i3) {
                        int m14828b = nt2.m14828b(iz2Var.m19242e());
                        if (m14828b > 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unsupported pssh version: ");
                            sb.append(m14828b);
                        } else {
                            UUID uuid2 = new UUID(iz2Var.m19235l(), iz2Var.m19235l());
                            if (m14828b == 1) {
                                iz2Var.m19224w(iz2Var.m19238i() * 16);
                            }
                            int m19238i = iz2Var.m19238i();
                            if (m19238i == iz2Var.m19246a()) {
                                byte[] bArr2 = new byte[m19238i];
                                iz2Var.m19230q(bArr2, 0, m19238i);
                                create = Pair.create(uuid2, bArr2);
                                uuid = create != null ? null : (UUID) create.first;
                                if (uuid == null) {
                                    arrayList.add(new zzavb(uuid, "video/mp4", bArr, false));
                                }
                            }
                        }
                    }
                }
                create = null;
                if (create != null) {
                }
                if (uuid == null) {
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzavc(arrayList);
    }

    /* renamed from: g */
    public static void m1909g(iz2 iz2Var, int i, hu2 hu2Var) {
        iz2Var.m19225v(i + 8);
        int m14829a = nt2.m14829a(iz2Var.m19242e());
        if ((m14829a & 1) != 0) {
            throw new eq2("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m14829a & 2) != 0;
        int m19238i = iz2Var.m19238i();
        int i2 = hu2Var.f12934e;
        if (m19238i == i2) {
            Arrays.fill(hu2Var.f12942m, 0, m19238i, z);
            hu2Var.m20415a(iz2Var.m19246a());
            iz2Var.m19230q(hu2Var.f12945p.f14125a, 0, hu2Var.f12944o);
            hu2Var.f12945p.m19225v(0);
            hu2Var.f12946q = false;
            return;
        }
        throw new eq2("Length mismatch: " + m19238i + ", " + i2);
    }

    @Override // com.daaw.ns2
    /* renamed from: b */
    public final boolean mo1914b(ms2 ms2Var) {
        return eu2.m23178a(ms2Var);
    }

    @Override // com.daaw.ns2
    /* renamed from: c */
    public final void mo1913c(os2 os2Var) {
        this.f35512u = os2Var;
    }

    @Override // com.daaw.ns2
    /* renamed from: d */
    public final void mo1912d(long j, long j2) {
        int size = this.f35492a.size();
        for (int i = 0; i < size; i++) {
            ((yt2) this.f35492a.valueAt(i)).m3230b();
        }
        this.f35500i.clear();
        this.f35499h.clear();
        m1910f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        r2 = r24.f35508q;
        r3 = r2.f34086a;
        r5 = r3.f12937h;
        r9 = r2.f34090e;
        r5 = r5[r9];
        r24.f35509r = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r3.f12941l == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        r5 = r3.f12945p;
        r10 = r3.f12930a.f30574a;
        r11 = r3.f12943n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r11 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
        r11 = r2.f34088c.f9972h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        r10 = r11.f11734a;
        r3 = r3.f12942m[r9];
        r9 = r24.f35496e;
        r11 = r9.f14125a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
        if (true == r3) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
        r11[0] = (byte) (r12 | r10);
        r9.m19225v(0);
        r2 = r2.f34087b;
        r2.mo5826c(r24.f35496e, 1);
        r2.mo5826c(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        if (r3 != false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
        r3 = r5.m19237j();
        r5.m19224w(-2);
        r3 = (r3 * 6) + 2;
        r2.mo5826c(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        r24.f35510s = r10;
        r5 = r24.f35509r + r10;
        r24.f35509r = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d7, code lost:
        r24.f35510s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
        if (r24.f35508q.f34088c.f9971g != 1) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
        r24.f35509r = r5 - 8;
        r1.m15796i(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
        r24.f35501j = 4;
        r24.f35511t = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
        r2 = r24.f35508q;
        r3 = r2.f34086a;
        r5 = r2.f34088c;
        r9 = r2.f34087b;
        r2 = r2.f34090e;
        r6 = r5.f9975k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
        if (r6 != 0) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
        r4 = r24.f35510s;
        r6 = r24.f35509r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
        if (r4 >= r6) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
        r24.f35510s += r9.mo5827b(r1, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
        r10 = r24.f35494c.f14125a;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011f, code lost:
        if (r24.f35510s >= r24.f35509r) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
        r11 = r24.f35511t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0123, code lost:
        if (r11 != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0125, code lost:
        r1.m15797h(r10, r6, r4, false);
        r24.f35494c.m19225v(0);
        r24.f35511t = r24.f35494c.m19238i() - 1;
        r24.f35493b.m19225v(0);
        r9.mo5826c(r24.f35493b, 4);
        r9.mo5826c(r24.f35494c, 1);
        r24.f35510s += 5;
        r24.f35509r += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0153, code lost:
        r11 = r9.mo5827b(r1, r11, false);
        r24.f35510s += r11;
        r24.f35511t -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0162, code lost:
        r10 = (r3.f12939j[r2] + r3.f12938i[r2]) * 1000;
        r1 = r3.f12941l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0172, code lost:
        if (true == r1) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0174, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
        r4 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0178, code lost:
        r12 = r4 | (r3.f12940k[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
        if (r1 == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0180, code lost:
        r1 = r3.f12943n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0182, code lost:
        if (r1 != null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0184, code lost:
        r1 = r5.f9972h[r3.f12930a.f30574a];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018c, code lost:
        r2 = r24.f35508q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0190, code lost:
        if (r1 == r2.f34094i) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0192, code lost:
        r2 = new com.daaw.vs2(1, r1.f11735b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019a, code lost:
        r2 = r2.f34093h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019c, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019e, code lost:
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a0, code lost:
        r2 = r24.f35508q;
        r2.f34093h = r15;
        r2.f34094i = r1;
        r9.mo5825d(r10, r12, r24.f35509r, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b2, code lost:
        if (r24.f35500i.isEmpty() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b4, code lost:
        r1 = r24.f35508q;
        r1.f34090e++;
        r2 = r1.f34091f + 1;
        r1.f34091f = r2;
        r3 = r3.f12936g;
        r4 = r1.f34092g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c6, code lost:
        if (r2 != r3[r4]) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c8, code lost:
        r1.f34092g = r4 + 1;
        r1.f34091f = 0;
        r24.f35508q = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d0, code lost:
        r24.f35501j = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d3, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
        r2 = ((com.daaw.xt2) r24.f35500i.removeFirst()).f32944a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01df, code lost:
        throw null;
     */
    @Override // com.daaw.ns2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo1911e(ms2 ms2Var, ss2 ss2Var) {
        int i;
        long m15801d;
        long m19233n;
        long m19233n2;
        ms2 ms2Var2 = ms2Var;
        while (true) {
            int i2 = this.f35501j;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f35504m == 0) {
                    if (!ms2Var2.m15797h(this.f35497f.f14125a, 0, 8, true)) {
                        return -1;
                    }
                    this.f35504m = 8;
                    this.f35497f.m19225v(0);
                    this.f35503l = this.f35497f.m19234m();
                    this.f35502k = this.f35497f.m19242e();
                }
                long j = this.f35503l;
                if (j == 1) {
                    ms2Var2.m15797h(this.f35497f.f14125a, 8, 8, false);
                    this.f35504m += 8;
                    j = this.f35497f.m19233n();
                    this.f35503l = j;
                }
                long j2 = this.f35504m;
                if (j < j2) {
                    throw new eq2("Atom size less than header length (unsupported).");
                }
                long m15801d2 = ms2Var.m15801d() - j2;
                if (this.f35502k == nt2.f20653L) {
                    int size = this.f35492a.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        hu2 hu2Var = ((yt2) this.f35492a.valueAt(i4)).f34086a;
                        hu2Var.f12932c = m15801d2;
                        hu2Var.f12931b = m15801d2;
                    }
                }
                int i5 = this.f35502k;
                if (i5 == nt2.f20687i) {
                    this.f35508q = null;
                    this.f35506o = m15801d2 + this.f35503l;
                    if (!this.f35513v) {
                        this.f35512u.mo9819b(new ts2(this.f35507p));
                        this.f35513v = true;
                    }
                    this.f35501j = 2;
                } else if (i5 == nt2.f20635C || i5 == nt2.f20639E || i5 == nt2.f20641F || i5 == nt2.f20643G || i5 == nt2.f20645H || i5 == nt2.f20653L || i5 == nt2.f20655M || i5 == nt2.f20657N || i5 == nt2.f20662Q) {
                    m15801d = (ms2Var.m15801d() + this.f35503l) - 8;
                    this.f35499h.add(new lt2(i5, m15801d));
                    if (this.f35503l == this.f35504m) {
                        m1908h(m15801d);
                    } else {
                        m1910f();
                    }
                } else {
                    if (i5 == nt2.f20665T || i5 == nt2.f20664S || i5 == nt2.f20637D || i5 == nt2.f20633B || i5 == nt2.f20666U || i5 == nt2.f20717x || i5 == nt2.f20719y || i5 == nt2.f20661P || i5 == nt2.f20721z || i5 == nt2.f20631A || i5 == nt2.f20667V || i5 == nt2.f20678d0 || i5 == nt2.f20680e0 || i5 == nt2.f20688i0 || i5 == nt2.f20686h0 || i5 == nt2.f20682f0 || i5 == nt2.f20684g0 || i5 == nt2.f20663R || i5 == nt2.f20659O || i5 == nt2.f20644G0) {
                        if (this.f35504m != 8) {
                            throw new eq2("Leaf atom defines extended atom size (unsupported).");
                        }
                        long j3 = this.f35503l;
                        if (j3 > 2147483647L) {
                            throw new eq2("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        iz2 iz2Var = new iz2((int) j3);
                        this.f35505n = iz2Var;
                        System.arraycopy(this.f35497f.f14125a, 0, iz2Var.f14125a, 0, 8);
                    } else if (this.f35503l > 2147483647L) {
                        throw new eq2("Skipping atom with length > 2147483647 (unsupported).");
                    } else {
                        this.f35505n = null;
                    }
                    i = 1;
                    this.f35501j = i;
                }
            } else if (i2 != 1) {
                long j4 = Long.MAX_VALUE;
                if (i2 != 2) {
                    if (i2 != 3) {
                        break;
                    } else {
                        if (this.f35508q != null) {
                            break;
                        }
                        SparseArray sparseArray = this.f35492a;
                        int size2 = sparseArray.size();
                        yt2 yt2Var = null;
                        for (int i6 = 0; i6 < size2; i6++) {
                            yt2 yt2Var2 = (yt2) sparseArray.valueAt(i6);
                            int i7 = yt2Var2.f34092g;
                            hu2 hu2Var2 = yt2Var2.f34086a;
                            if (i7 != hu2Var2.f12933d) {
                                long j5 = hu2Var2.f12935f[i7];
                                if (j5 < j4) {
                                    yt2Var = yt2Var2;
                                    j4 = j5;
                                }
                            }
                        }
                        if (yt2Var == null) {
                            int m15801d3 = (int) (this.f35506o - ms2Var.m15801d());
                            if (m15801d3 < 0) {
                                throw new eq2("Offset to end of mdat was negative.");
                            }
                            ms2Var2.m15796i(m15801d3, false);
                            m1910f();
                        } else {
                            int m15801d4 = (int) (yt2Var.f34086a.f12935f[yt2Var.f34092g] - ms2Var.m15801d());
                            if (m15801d4 < 0) {
                                m15801d4 = 0;
                            }
                            ms2Var2.m15796i(m15801d4, false);
                            this.f35508q = yt2Var;
                        }
                    }
                } else {
                    int size3 = this.f35492a.size();
                    yt2 yt2Var3 = null;
                    for (int i8 = 0; i8 < size3; i8++) {
                        hu2 hu2Var3 = ((yt2) this.f35492a.valueAt(i8)).f34086a;
                        if (hu2Var3.f12946q) {
                            long j6 = hu2Var3.f12932c;
                            if (j6 < j4) {
                                yt2Var3 = (yt2) this.f35492a.valueAt(i8);
                                j4 = j6;
                            }
                        }
                    }
                    if (yt2Var3 == null) {
                        i = 3;
                        this.f35501j = i;
                    } else {
                        int m15801d5 = (int) (j4 - ms2Var.m15801d());
                        if (m15801d5 < 0) {
                            throw new eq2("Offset to encryption data was negative.");
                        }
                        ms2Var2.m15796i(m15801d5, false);
                        hu2 hu2Var4 = yt2Var3.f34086a;
                        ms2Var2.m15797h(hu2Var4.f12945p.f14125a, 0, hu2Var4.f12944o, false);
                        hu2Var4.f12945p.m19225v(0);
                        hu2Var4.f12946q = false;
                    }
                }
            } else {
                int i9 = ((int) this.f35503l) - this.f35504m;
                iz2 iz2Var2 = this.f35505n;
                if (iz2Var2 != null) {
                    ms2Var2.m15797h(iz2Var2.f14125a, 8, i9, false);
                    mt2 mt2Var = new mt2(this.f35502k, this.f35505n);
                    long m15801d6 = ms2Var.m15801d();
                    if (this.f35499h.isEmpty()) {
                        if (mt2Var.f20723a == nt2.f20633B) {
                            iz2 iz2Var3 = mt2Var.f19141P0;
                            iz2Var3.m19225v(8);
                            int m19242e = iz2Var3.m19242e();
                            iz2Var3.m19224w(4);
                            long m19234m = iz2Var3.m19234m();
                            if (nt2.m14828b(m19242e) == 0) {
                                m19233n = iz2Var3.m19234m();
                                m19233n2 = iz2Var3.m19234m();
                            } else {
                                m19233n = iz2Var3.m19233n();
                                m19233n2 = iz2Var3.m19233n();
                            }
                            long j7 = m15801d6 + m19233n2;
                            long j8 = m19233n;
                            long m12840j = pz2.m12840j(j8, 1000000L, m19234m);
                            iz2Var3.m19224w(2);
                            int m19237j = iz2Var3.m19237j();
                            int[] iArr = new int[m19237j];
                            long[] jArr = new long[m19237j];
                            long[] jArr2 = new long[m19237j];
                            long[] jArr3 = new long[m19237j];
                            long j9 = m12840j;
                            while (i3 < m19237j) {
                                int m19242e2 = iz2Var3.m19242e();
                                if ((m19242e2 & Integer.MIN_VALUE) != 0) {
                                    throw new eq2("Unhandled indirect reference");
                                }
                                long m19234m2 = iz2Var3.m19234m();
                                iArr[i3] = m19242e2 & Integer.MAX_VALUE;
                                jArr[i3] = j7;
                                jArr3[i3] = j9;
                                j8 += m19234m2;
                                int i10 = m19237j;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                j9 = pz2.m12840j(j8, 1000000L, m19234m);
                                jArr4[i3] = j9 - jArr5[i3];
                                iz2Var3.m19224w(4);
                                j7 += iArr[i3];
                                i3++;
                                jArr = jArr;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                m19237j = i10;
                            }
                            Pair create = Pair.create(Long.valueOf(m12840j), new ls2(iArr, jArr, jArr2, jArr3));
                            ((Long) create.first).longValue();
                            this.f35512u.mo9819b((us2) create.second);
                            this.f35513v = true;
                        }
                        ms2Var2 = ms2Var;
                    } else {
                        ((lt2) this.f35499h.peek()).m16567g(mt2Var);
                    }
                } else {
                    ms2Var2.m15796i(i9, false);
                }
                m15801d = ms2Var.m15801d();
                m1908h(m15801d);
            }
        }
    }

    /* renamed from: f */
    public final void m1910f() {
        this.f35501j = 0;
        this.f35504m = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:246:0x062a, code lost:
        m1910f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x062e, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0592  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1908h(long j) {
        fu2 m7721a;
        zt2 zt2Var;
        lt2 lt2Var;
        SparseArray sparseArray;
        int i;
        int i2;
        byte[] bArr;
        hu2 hu2Var;
        int size;
        int i3;
        byte[] bArr2;
        int i4;
        lt2 lt2Var2;
        int i5;
        byte[] bArr3;
        int i6;
        lt2 lt2Var3;
        hu2 hu2Var2;
        List list;
        yt2 yt2Var;
        int i7;
        int i8;
        long j2;
        int i9;
        int i10;
        int i11;
        boolean z;
        int i12;
        int i13;
        int i14;
        loop0: while (true) {
            zt2 zt2Var2 = this;
            while (!zt2Var2.f35499h.isEmpty() && ((lt2) zt2Var2.f35499h.peek()).f17739P0 == j) {
                lt2 lt2Var4 = (lt2) zt2Var2.f35499h.pop();
                int i15 = lt2Var4.f20723a;
                int i16 = 12;
                int i17 = 8;
                if (i15 == nt2.f20635C) {
                    zzavc m1915a = m1915a(lt2Var4.f17740Q0);
                    lt2 m16570d = lt2Var4.m16570d(nt2.f20657N);
                    SparseArray sparseArray2 = new SparseArray();
                    int size2 = m16570d.f17740Q0.size();
                    long j3 = -9223372036854775807L;
                    int i18 = 0;
                    while (i18 < size2) {
                        mt2 mt2Var = (mt2) m16570d.f17740Q0.get(i18);
                        int i19 = mt2Var.f20723a;
                        if (i19 == nt2.f20721z) {
                            iz2 iz2Var = mt2Var.f19141P0;
                            iz2Var.m19225v(i16);
                            Pair create = Pair.create(Integer.valueOf(iz2Var.m19242e()), new vt2(iz2Var.m19238i() - 1, iz2Var.m19238i(), iz2Var.m19238i(), iz2Var.m19242e()));
                            sparseArray2.put(((Integer) create.first).intValue(), (vt2) create.second);
                        } else if (i19 == nt2.f20659O) {
                            iz2 iz2Var2 = mt2Var.f19141P0;
                            iz2Var2.m19225v(8);
                            j3 = nt2.m14828b(iz2Var2.m19242e()) == 0 ? iz2Var2.m19234m() : iz2Var2.m19233n();
                        }
                        i18++;
                        i16 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size3 = lt2Var4.f17741R0.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        lt2 lt2Var5 = (lt2) lt2Var4.f17741R0.get(i20);
                        if (lt2Var5.f20723a == nt2.f20639E && (m7721a = ut2.m7721a(lt2Var5, lt2Var4.m16569e(nt2.f20637D), j3, m1915a, false)) != null) {
                            sparseArray3.put(m7721a.f9965a, m7721a);
                        }
                    }
                    int size4 = sparseArray3.size();
                    if (zt2Var2.f35492a.size() == 0) {
                        for (int i21 = 0; i21 < size4; i21++) {
                            fu2 fu2Var = (fu2) sparseArray3.valueAt(i21);
                            yt2 yt2Var2 = new yt2(zt2Var2.f35512u.mo9817h(i21, fu2Var.f9966b));
                            yt2Var2.m3231a(fu2Var, (vt2) sparseArray2.get(fu2Var.f9965a));
                            zt2Var2.f35492a.put(fu2Var.f9965a, yt2Var2);
                            zt2Var2.f35507p = Math.max(zt2Var2.f35507p, fu2Var.f9969e);
                        }
                        zt2Var2.f35512u.zzb();
                    } else {
                        az2.m26583e(zt2Var2.f35492a.size() == size4);
                        for (int i22 = 0; i22 < size4; i22++) {
                            fu2 fu2Var2 = (fu2) sparseArray3.valueAt(i22);
                            ((yt2) zt2Var2.f35492a.get(fu2Var2.f9965a)).m3231a(fu2Var2, (vt2) sparseArray2.get(fu2Var2.f9965a));
                        }
                    }
                } else {
                    if (i15 == nt2.f20653L) {
                        SparseArray sparseArray4 = zt2Var2.f35492a;
                        byte[] bArr4 = zt2Var2.f35498g;
                        int size5 = lt2Var4.f17741R0.size();
                        int i23 = 0;
                        while (i23 < size5) {
                            lt2 lt2Var6 = (lt2) lt2Var4.f17741R0.get(i23);
                            if (lt2Var6.f20723a == nt2.f20655M) {
                                iz2 iz2Var3 = lt2Var6.m16569e(nt2.f20719y).f19141P0;
                                iz2Var3.m19225v(i17);
                                int m14829a = nt2.m14829a(iz2Var3.m19242e());
                                yt2 yt2Var3 = (yt2) sparseArray4.get(iz2Var3.m19242e());
                                if (yt2Var3 == null) {
                                    yt2Var3 = null;
                                } else {
                                    if ((m14829a & 1) != 0) {
                                        long m19233n = iz2Var3.m19233n();
                                        hu2 hu2Var3 = yt2Var3.f34086a;
                                        hu2Var3.f12931b = m19233n;
                                        hu2Var3.f12932c = m19233n;
                                    }
                                    vt2 vt2Var = yt2Var3.f34089d;
                                    yt2Var3.f34086a.f12930a = new vt2((m14829a & 2) != 0 ? iz2Var3.m19238i() - 1 : vt2Var.f30574a, (m14829a & 8) != 0 ? iz2Var3.m19238i() : vt2Var.f30575b, (m14829a & 16) != 0 ? iz2Var3.m19238i() : vt2Var.f30576c, (m14829a & 32) != 0 ? iz2Var3.m19238i() : vt2Var.f30577d);
                                }
                                if (yt2Var3 != null) {
                                    hu2 hu2Var4 = yt2Var3.f34086a;
                                    long j4 = hu2Var4.f12947r;
                                    yt2Var3.m3230b();
                                    int i24 = nt2.f20717x;
                                    if (lt2Var6.m16569e(i24) != null) {
                                        iz2 iz2Var4 = lt2Var6.m16569e(i24).f19141P0;
                                        iz2Var4.m19225v(i17);
                                        j4 = nt2.m14828b(iz2Var4.m19242e()) == r7 ? iz2Var4.m19233n() : iz2Var4.m19234m();
                                    }
                                    List list2 = lt2Var6.f17740Q0;
                                    int size6 = list2.size();
                                    int i25 = 0;
                                    int i26 = 0;
                                    int i27 = 0;
                                    while (i27 < size6) {
                                        SparseArray sparseArray5 = sparseArray4;
                                        mt2 mt2Var2 = (mt2) list2.get(i27);
                                        int i28 = size5;
                                        long j5 = j4;
                                        if (mt2Var2.f20723a == nt2.f20631A) {
                                            iz2 iz2Var5 = mt2Var2.f19141P0;
                                            iz2Var5.m19225v(12);
                                            int m19238i = iz2Var5.m19238i();
                                            if (m19238i > 0) {
                                                i25 += m19238i;
                                                i26++;
                                            }
                                        }
                                        i27++;
                                        size5 = i28;
                                        sparseArray4 = sparseArray5;
                                        j4 = j5;
                                    }
                                    sparseArray = sparseArray4;
                                    i = size5;
                                    long j6 = j4;
                                    yt2Var3.f34092g = 0;
                                    yt2Var3.f34091f = 0;
                                    yt2Var3.f34090e = 0;
                                    hu2 hu2Var5 = yt2Var3.f34086a;
                                    hu2Var5.f12933d = i26;
                                    hu2Var5.f12934e = i25;
                                    int[] iArr = hu2Var5.f12936g;
                                    if (iArr == null || iArr.length < i26) {
                                        hu2Var5.f12935f = new long[i26];
                                        hu2Var5.f12936g = new int[i26];
                                    }
                                    int[] iArr2 = hu2Var5.f12937h;
                                    if (iArr2 == null || iArr2.length < i25) {
                                        int i29 = (i25 * x21.f31814L0) / 100;
                                        hu2Var5.f12937h = new int[i29];
                                        hu2Var5.f12938i = new int[i29];
                                        hu2Var5.f12939j = new long[i29];
                                        hu2Var5.f12940k = new boolean[i29];
                                        hu2Var5.f12942m = new boolean[i29];
                                    }
                                    int i30 = 0;
                                    int i31 = 0;
                                    int i32 = 0;
                                    while (i30 < size6) {
                                        mt2 mt2Var3 = (mt2) list2.get(i30);
                                        if (mt2Var3.f20723a == nt2.f20631A) {
                                            int i33 = i32 + 1;
                                            iz2 iz2Var6 = mt2Var3.f19141P0;
                                            iz2Var6.m19225v(8);
                                            int m14829a2 = nt2.m14829a(iz2Var6.m19242e());
                                            fu2 fu2Var3 = yt2Var3.f34088c;
                                            list = list2;
                                            hu2 hu2Var6 = yt2Var3.f34086a;
                                            vt2 vt2Var2 = hu2Var6.f12930a;
                                            i7 = size6;
                                            hu2Var6.f12936g[i32] = iz2Var6.m19238i();
                                            long[] jArr = hu2Var6.f12935f;
                                            lt2Var2 = lt2Var4;
                                            long j7 = hu2Var6.f12931b;
                                            jArr[i32] = j7;
                                            if ((m14829a2 & 1) != 0) {
                                                i6 = i23;
                                                lt2Var3 = lt2Var6;
                                                hu2Var2 = hu2Var4;
                                                jArr[i32] = j7 + iz2Var6.m19242e();
                                            } else {
                                                i6 = i23;
                                                lt2Var3 = lt2Var6;
                                                hu2Var2 = hu2Var4;
                                            }
                                            boolean z2 = (m14829a2 & 4) != 0;
                                            int i34 = vt2Var2.f30577d;
                                            if (z2) {
                                                i34 = iz2Var6.m19238i();
                                            }
                                            int i35 = m14829a2 & 256;
                                            int i36 = m14829a2 & 512;
                                            int i37 = m14829a2 & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                                            int i38 = m14829a2 & 2048;
                                            long[] jArr2 = fu2Var3.f9973i;
                                            int i39 = i34;
                                            if (jArr2 != null) {
                                                bArr3 = bArr4;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    i8 = i30;
                                                    j2 = pz2.m12840j(fu2Var3.f9974j[0], 1000L, fu2Var3.f9967c);
                                                    int[] iArr3 = hu2Var6.f12937h;
                                                    int[] iArr4 = hu2Var6.f12938i;
                                                    long[] jArr3 = hu2Var6.f12939j;
                                                    yt2Var = yt2Var3;
                                                    boolean[] zArr = hu2Var6.f12940k;
                                                    i5 = i8;
                                                    i9 = hu2Var6.f12936g[i32] + i31;
                                                    long j8 = fu2Var3.f9967c;
                                                    long j9 = i32 <= 0 ? hu2Var6.f12947r : j6;
                                                    while (i31 < i9) {
                                                        int m19238i2 = i35 != 0 ? iz2Var6.m19238i() : vt2Var2.f30575b;
                                                        if (i36 != 0) {
                                                            i10 = i9;
                                                            i11 = iz2Var6.m19238i();
                                                        } else {
                                                            i10 = i9;
                                                            i11 = vt2Var2.f30576c;
                                                        }
                                                        if (i31 == 0) {
                                                            if (z2) {
                                                                z = z2;
                                                                i12 = i39;
                                                                i31 = 0;
                                                                int i40 = i35;
                                                                if (i38 == 0) {
                                                                    i13 = i36;
                                                                    i14 = i37;
                                                                    iArr4[i31] = (int) ((iz2Var6.m19242e() * 1000) / j8);
                                                                } else {
                                                                    i13 = i36;
                                                                    i14 = i37;
                                                                    iArr4[i31] = 0;
                                                                }
                                                                jArr3[i31] = pz2.m12840j(j9, 1000L, j8) - j2;
                                                                iArr3[i31] = i11;
                                                                zArr[i31] = 1 != (((i12 >> 16) & 1) ^ 1);
                                                                j9 += m19238i2;
                                                                i31++;
                                                                i9 = i10;
                                                                z2 = z;
                                                                i35 = i40;
                                                                i36 = i13;
                                                                i37 = i14;
                                                            } else {
                                                                i31 = 0;
                                                            }
                                                        }
                                                        if (i37 != 0) {
                                                            z = z2;
                                                            i12 = iz2Var6.m19242e();
                                                        } else {
                                                            z = z2;
                                                            i12 = vt2Var2.f30577d;
                                                        }
                                                        int i402 = i35;
                                                        if (i38 == 0) {
                                                        }
                                                        jArr3[i31] = pz2.m12840j(j9, 1000L, j8) - j2;
                                                        iArr3[i31] = i11;
                                                        zArr[i31] = 1 != (((i12 >> 16) & 1) ^ 1);
                                                        j9 += m19238i2;
                                                        i31++;
                                                        i9 = i10;
                                                        z2 = z;
                                                        i35 = i402;
                                                        i36 = i13;
                                                        i37 = i14;
                                                    }
                                                    hu2Var6.f12947r = j9;
                                                    i32 = i33;
                                                    i31 = i9;
                                                }
                                            } else {
                                                bArr3 = bArr4;
                                            }
                                            i8 = i30;
                                            j2 = 0;
                                            int[] iArr32 = hu2Var6.f12937h;
                                            int[] iArr42 = hu2Var6.f12938i;
                                            long[] jArr32 = hu2Var6.f12939j;
                                            yt2Var = yt2Var3;
                                            boolean[] zArr2 = hu2Var6.f12940k;
                                            i5 = i8;
                                            i9 = hu2Var6.f12936g[i32] + i31;
                                            long j82 = fu2Var3.f9967c;
                                            if (i32 <= 0) {
                                            }
                                            while (i31 < i9) {
                                            }
                                            hu2Var6.f12947r = j9;
                                            i32 = i33;
                                            i31 = i9;
                                        } else {
                                            lt2Var2 = lt2Var4;
                                            i5 = i30;
                                            bArr3 = bArr4;
                                            i6 = i23;
                                            lt2Var3 = lt2Var6;
                                            hu2Var2 = hu2Var4;
                                            list = list2;
                                            yt2Var = yt2Var3;
                                            i7 = size6;
                                        }
                                        i30 = i5 + 1;
                                        list2 = list;
                                        size6 = i7;
                                        lt2Var4 = lt2Var2;
                                        i23 = i6;
                                        lt2Var6 = lt2Var3;
                                        hu2Var4 = hu2Var2;
                                        bArr4 = bArr3;
                                        yt2Var3 = yt2Var;
                                    }
                                    lt2Var = lt2Var4;
                                    byte[] bArr5 = bArr4;
                                    i2 = i23;
                                    hu2 hu2Var7 = hu2Var4;
                                    yt2 yt2Var4 = yt2Var3;
                                    mt2 m16569e = lt2Var6.m16569e(nt2.f20678d0);
                                    if (m16569e != null) {
                                        hu2Var = hu2Var7;
                                        gu2 gu2Var = yt2Var4.f34088c.f9972h[hu2Var.f12930a.f30574a];
                                        iz2 iz2Var7 = m16569e.f19141P0;
                                        int i41 = gu2Var.f11734a;
                                        iz2Var7.m19225v(8);
                                        if ((nt2.m14829a(iz2Var7.m19242e()) & 1) == 1) {
                                            iz2Var7.m19224w(8);
                                        }
                                        int m19240g = iz2Var7.m19240g();
                                        int m19238i3 = iz2Var7.m19238i();
                                        int i42 = hu2Var.f12934e;
                                        if (m19238i3 != i42) {
                                            throw new eq2("Length mismatch: " + m19238i3 + ", " + i42);
                                        }
                                        if (m19240g == 0) {
                                            boolean[] zArr3 = hu2Var.f12942m;
                                            i4 = 0;
                                            for (int i43 = 0; i43 < m19238i3; i43++) {
                                                int m19240g2 = iz2Var7.m19240g();
                                                i4 += m19240g2;
                                                zArr3[i43] = m19240g2 > i41;
                                            }
                                        } else {
                                            i4 = m19240g * m19238i3;
                                            Arrays.fill(hu2Var.f12942m, 0, m19238i3, m19240g > i41);
                                        }
                                        hu2Var.m20415a(i4);
                                    } else {
                                        hu2Var = hu2Var7;
                                    }
                                    mt2 m16569e2 = lt2Var6.m16569e(nt2.f20680e0);
                                    if (m16569e2 != null) {
                                        iz2 iz2Var8 = m16569e2.f19141P0;
                                        iz2Var8.m19225v(8);
                                        int m19242e = iz2Var8.m19242e();
                                        if ((nt2.m14829a(m19242e) & 1) == 1) {
                                            iz2Var8.m19224w(8);
                                        }
                                        int m19238i4 = iz2Var8.m19238i();
                                        if (m19238i4 != 1) {
                                            throw new eq2("Unexpected saio entry count: " + m19238i4);
                                        }
                                        hu2Var.f12932c += nt2.m14828b(m19242e) == 0 ? iz2Var8.m19234m() : iz2Var8.m19233n();
                                    }
                                    mt2 m16569e3 = lt2Var6.m16569e(nt2.f20688i0);
                                    if (m16569e3 != null) {
                                        m1909g(m16569e3.f19141P0, 0, hu2Var);
                                    }
                                    mt2 m16569e4 = lt2Var6.m16569e(nt2.f20682f0);
                                    mt2 m16569e5 = lt2Var6.m16569e(nt2.f20684g0);
                                    if (m16569e4 != null && m16569e5 != null) {
                                        iz2 iz2Var9 = m16569e4.f19141P0;
                                        iz2 iz2Var10 = m16569e5.f19141P0;
                                        iz2Var9.m19225v(8);
                                        int m19242e2 = iz2Var9.m19242e();
                                        int m19242e3 = iz2Var9.m19242e();
                                        int i44 = f35490x;
                                        if (m19242e3 == i44) {
                                            if (nt2.m14828b(m19242e2) == 1) {
                                                iz2Var9.m19224w(4);
                                            }
                                            if (iz2Var9.m19242e() != 1) {
                                                throw new eq2("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            iz2Var10.m19225v(8);
                                            int m19242e4 = iz2Var10.m19242e();
                                            if (iz2Var10.m19242e() == i44) {
                                                int m14828b = nt2.m14828b(m19242e4);
                                                if (m14828b == 1) {
                                                    if (iz2Var10.m19234m() == 0) {
                                                        throw new eq2("Variable length decription in sgpd found (unsupported)");
                                                    }
                                                } else if (m14828b >= 2) {
                                                    iz2Var10.m19224w(4);
                                                }
                                                if (iz2Var10.m19234m() != 1) {
                                                    throw new eq2("Entry count in sgpd != 1 (unsupported).");
                                                }
                                                iz2Var10.m19224w(2);
                                                if (iz2Var10.m19240g() == 1) {
                                                    int m19240g3 = iz2Var10.m19240g();
                                                    byte[] bArr6 = new byte[16];
                                                    iz2Var10.m19230q(bArr6, 0, 16);
                                                    hu2Var.f12941l = true;
                                                    hu2Var.f12943n = new gu2(true, m19240g3, bArr6);
                                                }
                                                size = lt2Var6.f17740Q0.size();
                                                i3 = 0;
                                                while (i3 < size) {
                                                    mt2 mt2Var4 = (mt2) lt2Var6.f17740Q0.get(i3);
                                                    if (mt2Var4.f20723a == nt2.f20686h0) {
                                                        iz2 iz2Var11 = mt2Var4.f19141P0;
                                                        iz2Var11.m19225v(8);
                                                        bArr2 = bArr5;
                                                        iz2Var11.m19230q(bArr2, 0, 16);
                                                        if (Arrays.equals(bArr2, f35491y)) {
                                                            m1909g(iz2Var11, 16, hu2Var);
                                                        }
                                                    } else {
                                                        bArr2 = bArr5;
                                                    }
                                                    i3++;
                                                    bArr5 = bArr2;
                                                }
                                                bArr = bArr5;
                                                i17 = 8;
                                                bArr4 = bArr;
                                                size5 = i;
                                                sparseArray4 = sparseArray;
                                                lt2Var4 = lt2Var;
                                                r7 = true;
                                                i23 = i2 + 1;
                                            }
                                        }
                                    }
                                    size = lt2Var6.f17740Q0.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                    }
                                    bArr = bArr5;
                                    i17 = 8;
                                    bArr4 = bArr;
                                    size5 = i;
                                    sparseArray4 = sparseArray;
                                    lt2Var4 = lt2Var;
                                    r7 = true;
                                    i23 = i2 + 1;
                                }
                            }
                            lt2Var = lt2Var4;
                            sparseArray = sparseArray4;
                            i = size5;
                            i2 = i23;
                            bArr = bArr4;
                            bArr4 = bArr;
                            size5 = i;
                            sparseArray4 = sparseArray;
                            lt2Var4 = lt2Var;
                            r7 = true;
                            i23 = i2 + 1;
                        }
                        zzavc m1915a2 = m1915a(lt2Var4.f17740Q0);
                        if (m1915a2 != null) {
                            zt2Var = this;
                            int size7 = zt2Var.f35492a.size();
                            for (int i45 = 0; i45 < size7; i45++) {
                                yt2 yt2Var5 = (yt2) zt2Var.f35492a.valueAt(i45);
                                yt2Var5.f34087b.mo5828a(yt2Var5.f34088c.f9970f.m1130c(m1915a2));
                            }
                        }
                    } else {
                        zt2Var = zt2Var2;
                        if (!zt2Var.f35499h.isEmpty()) {
                            ((lt2) zt2Var.f35499h.peek()).m16568f(lt2Var4);
                        }
                    }
                    zt2Var2 = zt2Var;
                }
            }
        }
    }
}
