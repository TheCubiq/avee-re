package com.daaw;
/* loaded from: classes.dex */
public class ve {
    public final char a;
    public final char b;
    public final int c;

    public ve(char c, char c2) {
        this.a = c;
        this.b = c2;
        this.c = (c2 - c) + 1;
    }

    public static ve b() {
        return new ve((char) 1536, (char) 1791);
    }

    public static ve c() {
        return new ve(' ', '~');
    }

    public static ve d() {
        return new ve('0', 'Z');
    }

    public static ve e() {
        return new ve((char) 1024, (char) 1279);
    }

    public static ve f() {
        return new ve((char) 2304, (char) 2431);
    }

    public static ve g() {
        return new ve((char) 2688, (char) 2815);
    }

    public static ve h() {
        return new ve((char) 4352, (char) 4607);
    }

    public static ve i() {
        return new ve((char) 12352, (char) 12447);
    }

    public static ve j() {
        return new ve((char) 12448, (char) 12543);
    }

    public static ve k() {
        return new ve((char) 6016, (char) 6143);
    }

    public static ve l() {
        return new ve((char) 191, (char) 382);
    }

    public int a() {
        return this.c;
    }

    public char m(int i) {
        if (i >= this.c) {
            i = 0;
        }
        return (char) (this.a + i);
    }

    public int n(char c) {
        char c2 = this.a;
        if (c - c2 < this.c && c - c2 >= 0) {
            return c - c2;
        }
        return 0;
    }
}
