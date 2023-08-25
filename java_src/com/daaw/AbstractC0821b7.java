package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* renamed from: com.daaw.b7 */
/* loaded from: classes.dex */
public abstract class AbstractC0821b7 {

    /* renamed from: a */
    public final int f4471a;

    /* renamed from: b */
    public static final int f4421b = sq1.m9994v("ftyp");

    /* renamed from: c */
    public static final int f4423c = sq1.m9994v("avc1");

    /* renamed from: d */
    public static final int f4425d = sq1.m9994v("avc3");

    /* renamed from: e */
    public static final int f4427e = sq1.m9994v("hvc1");

    /* renamed from: f */
    public static final int f4429f = sq1.m9994v("hev1");

    /* renamed from: g */
    public static final int f4431g = sq1.m9994v("s263");

    /* renamed from: h */
    public static final int f4433h = sq1.m9994v("d263");

    /* renamed from: i */
    public static final int f4435i = sq1.m9994v("mdat");

    /* renamed from: j */
    public static final int f4437j = sq1.m9994v("mp4a");

    /* renamed from: k */
    public static final int f4439k = sq1.m9994v(".mp3");

    /* renamed from: l */
    public static final int f4441l = sq1.m9994v("wave");

    /* renamed from: m */
    public static final int f4443m = sq1.m9994v("lpcm");

    /* renamed from: n */
    public static final int f4445n = sq1.m9994v("sowt");

    /* renamed from: o */
    public static final int f4447o = sq1.m9994v("ac-3");

    /* renamed from: p */
    public static final int f4449p = sq1.m9994v("dac3");

    /* renamed from: q */
    public static final int f4451q = sq1.m9994v("ec-3");

    /* renamed from: r */
    public static final int f4453r = sq1.m9994v("dec3");

    /* renamed from: s */
    public static final int f4455s = sq1.m9994v("dtsc");

    /* renamed from: t */
    public static final int f4457t = sq1.m9994v("dtsh");

    /* renamed from: u */
    public static final int f4459u = sq1.m9994v("dtsl");

    /* renamed from: v */
    public static final int f4461v = sq1.m9994v("dtse");

    /* renamed from: w */
    public static final int f4463w = sq1.m9994v("ddts");

    /* renamed from: x */
    public static final int f4465x = sq1.m9994v("tfdt");

    /* renamed from: y */
    public static final int f4467y = sq1.m9994v("tfhd");

    /* renamed from: z */
    public static final int f4469z = sq1.m9994v("trex");

    /* renamed from: A */
    public static final int f4378A = sq1.m9994v("trun");

    /* renamed from: B */
    public static final int f4380B = sq1.m9994v("sidx");

    /* renamed from: C */
    public static final int f4382C = sq1.m9994v("moov");

    /* renamed from: D */
    public static final int f4384D = sq1.m9994v("mvhd");

    /* renamed from: E */
    public static final int f4386E = sq1.m9994v("trak");

    /* renamed from: F */
    public static final int f4388F = sq1.m9994v("mdia");

    /* renamed from: G */
    public static final int f4390G = sq1.m9994v("minf");

    /* renamed from: H */
    public static final int f4392H = sq1.m9994v("stbl");

    /* renamed from: I */
    public static final int f4394I = sq1.m9994v("avcC");

    /* renamed from: J */
    public static final int f4396J = sq1.m9994v("hvcC");

    /* renamed from: K */
    public static final int f4398K = sq1.m9994v("esds");

    /* renamed from: L */
    public static final int f4400L = sq1.m9994v("moof");

    /* renamed from: M */
    public static final int f4402M = sq1.m9994v("traf");

    /* renamed from: N */
    public static final int f4404N = sq1.m9994v("mvex");

    /* renamed from: O */
    public static final int f4406O = sq1.m9994v("mehd");

    /* renamed from: P */
    public static final int f4408P = sq1.m9994v("tkhd");

    /* renamed from: Q */
    public static final int f4410Q = sq1.m9994v("edts");

    /* renamed from: R */
    public static final int f4411R = sq1.m9994v("elst");

    /* renamed from: S */
    public static final int f4412S = sq1.m9994v("mdhd");

    /* renamed from: T */
    public static final int f4413T = sq1.m9994v("hdlr");

    /* renamed from: U */
    public static final int f4414U = sq1.m9994v("stsd");

    /* renamed from: V */
    public static final int f4415V = sq1.m9994v("pssh");

    /* renamed from: W */
    public static final int f4416W = sq1.m9994v("sinf");

    /* renamed from: X */
    public static final int f4417X = sq1.m9994v("schm");

    /* renamed from: Y */
    public static final int f4418Y = sq1.m9994v("schi");

    /* renamed from: Z */
    public static final int f4419Z = sq1.m9994v("tenc");

    /* renamed from: a0 */
    public static final int f4420a0 = sq1.m9994v("encv");

    /* renamed from: b0 */
    public static final int f4422b0 = sq1.m9994v("enca");

    /* renamed from: c0 */
    public static final int f4424c0 = sq1.m9994v("frma");

    /* renamed from: d0 */
    public static final int f4426d0 = sq1.m9994v("saiz");

    /* renamed from: e0 */
    public static final int f4428e0 = sq1.m9994v("saio");

    /* renamed from: f0 */
    public static final int f4430f0 = sq1.m9994v("sbgp");

    /* renamed from: g0 */
    public static final int f4432g0 = sq1.m9994v("sgpd");

    /* renamed from: h0 */
    public static final int f4434h0 = sq1.m9994v("uuid");

    /* renamed from: i0 */
    public static final int f4436i0 = sq1.m9994v("senc");

    /* renamed from: j0 */
    public static final int f4438j0 = sq1.m9994v("pasp");

    /* renamed from: k0 */
    public static final int f4440k0 = sq1.m9994v("TTML");

    /* renamed from: l0 */
    public static final int f4442l0 = sq1.m9994v("vmhd");

    /* renamed from: m0 */
    public static final int f4444m0 = sq1.m9994v("mp4v");

    /* renamed from: n0 */
    public static final int f4446n0 = sq1.m9994v("stts");

    /* renamed from: o0 */
    public static final int f4448o0 = sq1.m9994v("stss");

    /* renamed from: p0 */
    public static final int f4450p0 = sq1.m9994v("ctts");

    /* renamed from: q0 */
    public static final int f4452q0 = sq1.m9994v("stsc");

    /* renamed from: r0 */
    public static final int f4454r0 = sq1.m9994v("stsz");

    /* renamed from: s0 */
    public static final int f4456s0 = sq1.m9994v("stz2");

    /* renamed from: t0 */
    public static final int f4458t0 = sq1.m9994v("stco");

    /* renamed from: u0 */
    public static final int f4460u0 = sq1.m9994v("co64");

    /* renamed from: v0 */
    public static final int f4462v0 = sq1.m9994v("tx3g");

    /* renamed from: w0 */
    public static final int f4464w0 = sq1.m9994v("wvtt");

    /* renamed from: x0 */
    public static final int f4466x0 = sq1.m9994v("stpp");

    /* renamed from: y0 */
    public static final int f4468y0 = sq1.m9994v("c608");

    /* renamed from: z0 */
    public static final int f4470z0 = sq1.m9994v("samr");

    /* renamed from: A0 */
    public static final int f4379A0 = sq1.m9994v("sawb");

    /* renamed from: B0 */
    public static final int f4381B0 = sq1.m9994v("udta");

    /* renamed from: C0 */
    public static final int f4383C0 = sq1.m9994v("meta");

    /* renamed from: D0 */
    public static final int f4385D0 = sq1.m9994v("ilst");

    /* renamed from: E0 */
    public static final int f4387E0 = sq1.m9994v("mean");

    /* renamed from: F0 */
    public static final int f4389F0 = sq1.m9994v("name");

    /* renamed from: G0 */
    public static final int f4391G0 = sq1.m9994v("data");

    /* renamed from: H0 */
    public static final int f4393H0 = sq1.m9994v("emsg");

    /* renamed from: I0 */
    public static final int f4395I0 = sq1.m9994v("st3d");

    /* renamed from: J0 */
    public static final int f4397J0 = sq1.m9994v("sv3d");

    /* renamed from: K0 */
    public static final int f4399K0 = sq1.m9994v("proj");

    /* renamed from: L0 */
    public static final int f4401L0 = sq1.m9994v("vp08");

    /* renamed from: M0 */
    public static final int f4403M0 = sq1.m9994v("vp09");

    /* renamed from: N0 */
    public static final int f4405N0 = sq1.m9994v("vpcC");

    /* renamed from: O0 */
    public static final int f4407O0 = sq1.m9994v("camm");

    /* renamed from: P0 */
    public static final int f4409P0 = sq1.m9994v("alac");

    /* renamed from: com.daaw.b7$a */
    /* loaded from: classes.dex */
    public static final class C0822a extends AbstractC0821b7 {

        /* renamed from: Q0 */
        public final long f4472Q0;

        /* renamed from: R0 */
        public final List<C0823b> f4473R0;

        /* renamed from: S0 */
        public final List<C0822a> f4474S0;

        public C0822a(int i, long j) {
            super(i);
            this.f4472Q0 = j;
            this.f4473R0 = new ArrayList();
            this.f4474S0 = new ArrayList();
        }

        /* renamed from: d */
        public void m26445d(C0822a c0822a) {
            this.f4474S0.add(c0822a);
        }

        /* renamed from: e */
        public void m26444e(C0823b c0823b) {
            this.f4473R0.add(c0823b);
        }

        /* renamed from: f */
        public C0822a m26443f(int i) {
            int size = this.f4474S0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0822a c0822a = this.f4474S0.get(i2);
                if (c0822a.f4471a == i) {
                    return c0822a;
                }
            }
            return null;
        }

        /* renamed from: g */
        public C0823b m26442g(int i) {
            int size = this.f4473R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0823b c0823b = this.f4473R0.get(i2);
                if (c0823b.f4471a == i) {
                    return c0823b;
                }
            }
            return null;
        }

        @Override // com.daaw.AbstractC0821b7
        public String toString() {
            return AbstractC0821b7.m26448a(this.f4471a) + " leaves: " + Arrays.toString(this.f4473R0.toArray()) + " containers: " + Arrays.toString(this.f4474S0.toArray());
        }
    }

    /* renamed from: com.daaw.b7$b */
    /* loaded from: classes.dex */
    public static final class C0823b extends AbstractC0821b7 {

        /* renamed from: Q0 */
        public final rv0 f4475Q0;

        public C0823b(int i, rv0 rv0Var) {
            super(i);
            this.f4475Q0 = rv0Var;
        }
    }

    public AbstractC0821b7(int i) {
        this.f4471a = i;
    }

    /* renamed from: a */
    public static String m26448a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public static int m26447b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static int m26446c(int i) {
        return (i >> 24) & 255;
    }

    public String toString() {
        return m26448a(this.f4471a);
    }
}
