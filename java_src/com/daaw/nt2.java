package com.daaw;
/* loaded from: classes.dex */
public class nt2 {
    public static final int A0;
    public static final int B0;
    public static final int C0;
    public static final int D0;
    public static final int E0;
    public static final int F0;
    public static final int G0;
    public static final int H0;
    public static final int I0;
    public static final int J0;
    public static final int K0;
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final int O0;
    public static final int l0;
    public static final int m0;
    public static final int n0;
    public static final int o0;
    public static final int p0;
    public static final int q0;
    public static final int r0;
    public static final int s0;
    public static final int t0;
    public static final int u0;
    public static final int v0;
    public static final int w0;
    public static final int x0;
    public static final int y0;
    public static final int z0;
    public final int a;
    public static final int b = pz2.g("ftyp");
    public static final int c = pz2.g("avc1");
    public static final int d = pz2.g("avc3");
    public static final int e = pz2.g("hvc1");
    public static final int f = pz2.g("hev1");
    public static final int g = pz2.g("s263");
    public static final int h = pz2.g("d263");
    public static final int i = pz2.g("mdat");
    public static final int j = pz2.g("mp4a");
    public static final int k = pz2.g(".mp3");
    public static final int l = pz2.g("wave");
    public static final int m = pz2.g("lpcm");
    public static final int n = pz2.g("sowt");
    public static final int o = pz2.g("ac-3");
    public static final int p = pz2.g("dac3");
    public static final int q = pz2.g("ec-3");
    public static final int r = pz2.g("dec3");
    public static final int s = pz2.g("dtsc");
    public static final int t = pz2.g("dtsh");
    public static final int u = pz2.g("dtsl");
    public static final int v = pz2.g("dtse");
    public static final int w = pz2.g("ddts");
    public static final int x = pz2.g("tfdt");
    public static final int y = pz2.g("tfhd");
    public static final int z = pz2.g("trex");
    public static final int A = pz2.g("trun");
    public static final int B = pz2.g("sidx");
    public static final int C = pz2.g("moov");
    public static final int D = pz2.g("mvhd");
    public static final int E = pz2.g("trak");
    public static final int F = pz2.g("mdia");
    public static final int G = pz2.g("minf");
    public static final int H = pz2.g("stbl");
    public static final int I = pz2.g("avcC");
    public static final int J = pz2.g("hvcC");
    public static final int K = pz2.g("esds");
    public static final int L = pz2.g("moof");
    public static final int M = pz2.g("traf");
    public static final int N = pz2.g("mvex");
    public static final int O = pz2.g("mehd");
    public static final int P = pz2.g("tkhd");
    public static final int Q = pz2.g("edts");
    public static final int R = pz2.g("elst");
    public static final int S = pz2.g("mdhd");
    public static final int T = pz2.g("hdlr");
    public static final int U = pz2.g("stsd");
    public static final int V = pz2.g("pssh");
    public static final int W = pz2.g("sinf");
    public static final int X = pz2.g("schm");
    public static final int Y = pz2.g("schi");
    public static final int Z = pz2.g("tenc");
    public static final int a0 = pz2.g("encv");
    public static final int b0 = pz2.g("enca");
    public static final int c0 = pz2.g("frma");
    public static final int d0 = pz2.g("saiz");
    public static final int e0 = pz2.g("saio");
    public static final int f0 = pz2.g("sbgp");
    public static final int g0 = pz2.g("sgpd");
    public static final int h0 = pz2.g("uuid");
    public static final int i0 = pz2.g("senc");
    public static final int j0 = pz2.g("pasp");
    public static final int k0 = pz2.g("TTML");

    static {
        pz2.g("vmhd");
        l0 = pz2.g("mp4v");
        m0 = pz2.g("stts");
        n0 = pz2.g("stss");
        o0 = pz2.g("ctts");
        p0 = pz2.g("stsc");
        q0 = pz2.g("stsz");
        r0 = pz2.g("stz2");
        s0 = pz2.g("stco");
        t0 = pz2.g("co64");
        u0 = pz2.g("tx3g");
        v0 = pz2.g("wvtt");
        w0 = pz2.g("stpp");
        x0 = pz2.g("c608");
        y0 = pz2.g("samr");
        z0 = pz2.g("sawb");
        A0 = pz2.g("udta");
        B0 = pz2.g("meta");
        C0 = pz2.g("ilst");
        D0 = pz2.g("mean");
        E0 = pz2.g("name");
        F0 = pz2.g("data");
        G0 = pz2.g("emsg");
        H0 = pz2.g("st3d");
        I0 = pz2.g("sv3d");
        J0 = pz2.g("proj");
        K0 = pz2.g("vp08");
        L0 = pz2.g("vp09");
        M0 = pz2.g("vpcC");
        N0 = pz2.g("camm");
        O0 = pz2.g("alac");
    }

    public nt2(int i2) {
        this.a = i2;
    }

    public static int a(int i2) {
        return i2 & 16777215;
    }

    public static int b(int i2) {
        return (i2 >> 24) & 255;
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i2 >> 24) & 255));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return c(this.a);
    }
}
