package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b7 {
    public final int a;
    public static final int b = sq1.v("ftyp");
    public static final int c = sq1.v("avc1");
    public static final int d = sq1.v("avc3");
    public static final int e = sq1.v("hvc1");
    public static final int f = sq1.v("hev1");
    public static final int g = sq1.v("s263");
    public static final int h = sq1.v("d263");
    public static final int i = sq1.v("mdat");
    public static final int j = sq1.v("mp4a");
    public static final int k = sq1.v(".mp3");
    public static final int l = sq1.v("wave");
    public static final int m = sq1.v("lpcm");
    public static final int n = sq1.v("sowt");
    public static final int o = sq1.v("ac-3");
    public static final int p = sq1.v("dac3");
    public static final int q = sq1.v("ec-3");
    public static final int r = sq1.v("dec3");
    public static final int s = sq1.v("dtsc");
    public static final int t = sq1.v("dtsh");
    public static final int u = sq1.v("dtsl");
    public static final int v = sq1.v("dtse");
    public static final int w = sq1.v("ddts");
    public static final int x = sq1.v("tfdt");
    public static final int y = sq1.v("tfhd");
    public static final int z = sq1.v("trex");
    public static final int A = sq1.v("trun");
    public static final int B = sq1.v("sidx");
    public static final int C = sq1.v("moov");
    public static final int D = sq1.v("mvhd");
    public static final int E = sq1.v("trak");
    public static final int F = sq1.v("mdia");
    public static final int G = sq1.v("minf");
    public static final int H = sq1.v("stbl");
    public static final int I = sq1.v("avcC");
    public static final int J = sq1.v("hvcC");
    public static final int K = sq1.v("esds");
    public static final int L = sq1.v("moof");
    public static final int M = sq1.v("traf");
    public static final int N = sq1.v("mvex");
    public static final int O = sq1.v("mehd");
    public static final int P = sq1.v("tkhd");
    public static final int Q = sq1.v("edts");
    public static final int R = sq1.v("elst");
    public static final int S = sq1.v("mdhd");
    public static final int T = sq1.v("hdlr");
    public static final int U = sq1.v("stsd");
    public static final int V = sq1.v("pssh");
    public static final int W = sq1.v("sinf");
    public static final int X = sq1.v("schm");
    public static final int Y = sq1.v("schi");
    public static final int Z = sq1.v("tenc");
    public static final int a0 = sq1.v("encv");
    public static final int b0 = sq1.v("enca");
    public static final int c0 = sq1.v("frma");
    public static final int d0 = sq1.v("saiz");
    public static final int e0 = sq1.v("saio");
    public static final int f0 = sq1.v("sbgp");
    public static final int g0 = sq1.v("sgpd");
    public static final int h0 = sq1.v("uuid");
    public static final int i0 = sq1.v("senc");
    public static final int j0 = sq1.v("pasp");
    public static final int k0 = sq1.v("TTML");
    public static final int l0 = sq1.v("vmhd");
    public static final int m0 = sq1.v("mp4v");
    public static final int n0 = sq1.v("stts");
    public static final int o0 = sq1.v("stss");
    public static final int p0 = sq1.v("ctts");
    public static final int q0 = sq1.v("stsc");
    public static final int r0 = sq1.v("stsz");
    public static final int s0 = sq1.v("stz2");
    public static final int t0 = sq1.v("stco");
    public static final int u0 = sq1.v("co64");
    public static final int v0 = sq1.v("tx3g");
    public static final int w0 = sq1.v("wvtt");
    public static final int x0 = sq1.v("stpp");
    public static final int y0 = sq1.v("c608");
    public static final int z0 = sq1.v("samr");
    public static final int A0 = sq1.v("sawb");
    public static final int B0 = sq1.v("udta");
    public static final int C0 = sq1.v("meta");
    public static final int D0 = sq1.v("ilst");
    public static final int E0 = sq1.v("mean");
    public static final int F0 = sq1.v("name");
    public static final int G0 = sq1.v("data");
    public static final int H0 = sq1.v("emsg");
    public static final int I0 = sq1.v("st3d");
    public static final int J0 = sq1.v("sv3d");
    public static final int K0 = sq1.v("proj");
    public static final int L0 = sq1.v("vp08");
    public static final int M0 = sq1.v("vp09");
    public static final int N0 = sq1.v("vpcC");
    public static final int O0 = sq1.v("camm");
    public static final int P0 = sq1.v("alac");

    /* loaded from: classes.dex */
    public static final class a extends b7 {
        public final long Q0;
        public final List<b> R0;
        public final List<a> S0;

        public a(int i, long j) {
            super(i);
            this.Q0 = j;
            this.R0 = new ArrayList();
            this.S0 = new ArrayList();
        }

        public void d(a aVar) {
            this.S0.add(aVar);
        }

        public void e(b bVar) {
            this.R0.add(bVar);
        }

        public a f(int i) {
            int size = this.S0.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.S0.get(i2);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public b g(int i) {
            int size = this.R0.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.R0.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.daaw.b7
        public String toString() {
            return b7.a(this.a) + " leaves: " + Arrays.toString(this.R0.toArray()) + " containers: " + Arrays.toString(this.S0.toArray());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends b7 {
        public final rv0 Q0;

        public b(int i, rv0 rv0Var) {
            super(i);
            this.Q0 = rv0Var;
        }
    }

    public b7(int i2) {
        this.a = i2;
    }

    public static String a(int i2) {
        return "" + ((char) ((i2 >> 24) & 255)) + ((char) ((i2 >> 16) & 255)) + ((char) ((i2 >> 8) & 255)) + ((char) (i2 & 255));
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static int c(int i2) {
        return (i2 >> 24) & 255;
    }

    public String toString() {
        return a(this.a);
    }
}
