package com.daaw;
/* loaded from: classes.dex */
public class kx0 {

    /* renamed from: d */
    public static kx0[] f16800d = {new kx0("PLA Playlist", 1, "pla", true), new kx0("PLS Playlist", 3, "pls", true), new kx0("MPCPL Playlist", 4, "mpcpl", true), new kx0("PLP Playlist", 5, "plp", true), new kx0("M3U Playlist", 6, "m3u", true), new kx0("M3U8 Playlist", 7, "m3u8", true)};

    /* renamed from: a */
    public final String f16801a;

    /* renamed from: b */
    public final String f16802b;

    /* renamed from: c */
    public final boolean f16803c;

    public kx0(String str, int i, String str2, boolean z) {
        this.f16801a = str;
        this.f16802b = str2;
        this.f16803c = z;
    }

    /* renamed from: a */
    public static boolean m17366a(String str) {
        return str.equals("pla") || str.equals("pls") || str.equals("mpcpl") || str.equals("plp") || str.equals("m3u") || str.equals("m3u8") || str.equals("m4u") || str.equals("ram");
    }
}
