package com.daaw;
/* loaded from: classes.dex */
public class kx0 {
    public static kx0[] d = {new kx0("PLA Playlist", 1, "pla", true), new kx0("PLS Playlist", 3, "pls", true), new kx0("MPCPL Playlist", 4, "mpcpl", true), new kx0("PLP Playlist", 5, "plp", true), new kx0("M3U Playlist", 6, "m3u", true), new kx0("M3U8 Playlist", 7, "m3u8", true)};
    public final String a;
    public final String b;
    public final boolean c;

    public kx0(String str, int i, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static boolean a(String str) {
        return str.equals("pla") || str.equals("pls") || str.equals("mpcpl") || str.equals("plp") || str.equals("m3u") || str.equals("m3u8") || str.equals("m4u") || str.equals("ram");
    }
}
