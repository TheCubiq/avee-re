package com.daaw;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum s uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class bs7 {
    public static final bs7 A;
    public static final bs7 B;
    public static final bs7 C;
    public static final bs7 D;
    public static final bs7 E;
    public static final bs7 F;
    public static final bs7 G;
    public static final bs7 H;
    public static final bs7 I;
    public static final bs7 J;
    public static final bs7 K;
    public static final bs7 L;
    public static final bs7 M;
    public static final bs7 N;
    public static final bs7 O;
    public static final bs7 P;
    public static final bs7 Q;
    public static final bs7 R;
    public static final bs7 S;
    public static final bs7 T;
    public static final bs7 U;
    public static final bs7 V;
    public static final bs7 W;
    public static final bs7 X;
    public static final bs7 Y;
    public static final bs7 Z;
    public static final bs7 a0;
    public static final bs7 b0;
    public static final bs7 c0;
    public static final bs7 d0;
    public static final bs7 e0;
    public static final bs7 f0;
    public static final bs7 g0;
    public static final bs7 h0;
    public static final bs7 i0;
    public static final bs7 j0;
    public static final bs7 k0;
    public static final bs7 l0;
    public static final bs7 m0;
    public static final bs7 n0;
    public static final bs7 o0;
    public static final bs7 p0;
    public static final bs7 q0;
    public static final bs7[] r0;
    public static final bs7 s;
    public static final /* synthetic */ bs7[] s0;
    public static final bs7 t;
    public static final bs7 u;
    public static final bs7 v;
    public static final bs7 w;
    public static final bs7 x;
    public static final bs7 y;
    public static final bs7 z;
    public final zs7 p;
    public final int q;
    public final Class r;

    static {
        zs7 zs7Var = zs7.w;
        bs7 bs7Var = new bs7("DOUBLE", 0, 0, 1, zs7Var);
        s = bs7Var;
        zs7 zs7Var2 = zs7.v;
        bs7 bs7Var2 = new bs7("FLOAT", 1, 1, 1, zs7Var2);
        t = bs7Var2;
        zs7 zs7Var3 = zs7.u;
        bs7 bs7Var3 = new bs7("INT64", 2, 2, 1, zs7Var3);
        u = bs7Var3;
        bs7 bs7Var4 = new bs7("UINT64", 3, 3, 1, zs7Var3);
        v = bs7Var4;
        zs7 zs7Var4 = zs7.t;
        bs7 bs7Var5 = new bs7("INT32", 4, 4, 1, zs7Var4);
        w = bs7Var5;
        bs7 bs7Var6 = new bs7("FIXED64", 5, 5, 1, zs7Var3);
        x = bs7Var6;
        bs7 bs7Var7 = new bs7("FIXED32", 6, 6, 1, zs7Var4);
        y = bs7Var7;
        zs7 zs7Var5 = zs7.x;
        bs7 bs7Var8 = new bs7("BOOL", 7, 7, 1, zs7Var5);
        z = bs7Var8;
        zs7 zs7Var6 = zs7.y;
        bs7 bs7Var9 = new bs7("STRING", 8, 8, 1, zs7Var6);
        A = bs7Var9;
        zs7 zs7Var7 = zs7.B;
        bs7 bs7Var10 = new bs7("MESSAGE", 9, 9, 1, zs7Var7);
        B = bs7Var10;
        zs7 zs7Var8 = zs7.z;
        bs7 bs7Var11 = new bs7("BYTES", 10, 10, 1, zs7Var8);
        C = bs7Var11;
        bs7 bs7Var12 = new bs7("UINT32", 11, 11, 1, zs7Var4);
        D = bs7Var12;
        zs7 zs7Var9 = zs7.A;
        bs7 bs7Var13 = new bs7("ENUM", 12, 12, 1, zs7Var9);
        E = bs7Var13;
        bs7 bs7Var14 = new bs7("SFIXED32", 13, 13, 1, zs7Var4);
        F = bs7Var14;
        bs7 bs7Var15 = new bs7("SFIXED64", 14, 14, 1, zs7Var3);
        G = bs7Var15;
        bs7 bs7Var16 = new bs7("SINT32", 15, 15, 1, zs7Var4);
        H = bs7Var16;
        bs7 bs7Var17 = new bs7("SINT64", 16, 16, 1, zs7Var3);
        I = bs7Var17;
        bs7 bs7Var18 = new bs7("GROUP", 17, 17, 1, zs7Var7);
        J = bs7Var18;
        bs7 bs7Var19 = new bs7("DOUBLE_LIST", 18, 18, 2, zs7Var);
        K = bs7Var19;
        bs7 bs7Var20 = new bs7("FLOAT_LIST", 19, 19, 2, zs7Var2);
        L = bs7Var20;
        bs7 bs7Var21 = new bs7("INT64_LIST", 20, 20, 2, zs7Var3);
        M = bs7Var21;
        bs7 bs7Var22 = new bs7("UINT64_LIST", 21, 21, 2, zs7Var3);
        N = bs7Var22;
        bs7 bs7Var23 = new bs7("INT32_LIST", 22, 22, 2, zs7Var4);
        O = bs7Var23;
        bs7 bs7Var24 = new bs7("FIXED64_LIST", 23, 23, 2, zs7Var3);
        P = bs7Var24;
        bs7 bs7Var25 = new bs7("FIXED32_LIST", 24, 24, 2, zs7Var4);
        Q = bs7Var25;
        bs7 bs7Var26 = new bs7("BOOL_LIST", 25, 25, 2, zs7Var5);
        R = bs7Var26;
        bs7 bs7Var27 = new bs7("STRING_LIST", 26, 26, 2, zs7Var6);
        S = bs7Var27;
        bs7 bs7Var28 = new bs7("MESSAGE_LIST", 27, 27, 2, zs7Var7);
        T = bs7Var28;
        bs7 bs7Var29 = new bs7("BYTES_LIST", 28, 28, 2, zs7Var8);
        U = bs7Var29;
        bs7 bs7Var30 = new bs7("UINT32_LIST", 29, 29, 2, zs7Var4);
        V = bs7Var30;
        bs7 bs7Var31 = new bs7("ENUM_LIST", 30, 30, 2, zs7Var9);
        W = bs7Var31;
        bs7 bs7Var32 = new bs7("SFIXED32_LIST", 31, 31, 2, zs7Var4);
        X = bs7Var32;
        bs7 bs7Var33 = new bs7("SFIXED64_LIST", 32, 32, 2, zs7Var3);
        Y = bs7Var33;
        bs7 bs7Var34 = new bs7("SINT32_LIST", 33, 33, 2, zs7Var4);
        Z = bs7Var34;
        bs7 bs7Var35 = new bs7("SINT64_LIST", 34, 34, 2, zs7Var3);
        a0 = bs7Var35;
        bs7 bs7Var36 = new bs7("DOUBLE_LIST_PACKED", 35, 35, 3, zs7Var);
        b0 = bs7Var36;
        bs7 bs7Var37 = new bs7("FLOAT_LIST_PACKED", 36, 36, 3, zs7Var2);
        c0 = bs7Var37;
        bs7 bs7Var38 = new bs7("INT64_LIST_PACKED", 37, 37, 3, zs7Var3);
        d0 = bs7Var38;
        bs7 bs7Var39 = new bs7("UINT64_LIST_PACKED", 38, 38, 3, zs7Var3);
        e0 = bs7Var39;
        bs7 bs7Var40 = new bs7("INT32_LIST_PACKED", 39, 39, 3, zs7Var4);
        f0 = bs7Var40;
        bs7 bs7Var41 = new bs7("FIXED64_LIST_PACKED", 40, 40, 3, zs7Var3);
        g0 = bs7Var41;
        bs7 bs7Var42 = new bs7("FIXED32_LIST_PACKED", 41, 41, 3, zs7Var4);
        h0 = bs7Var42;
        bs7 bs7Var43 = new bs7("BOOL_LIST_PACKED", 42, 42, 3, zs7Var5);
        i0 = bs7Var43;
        bs7 bs7Var44 = new bs7("UINT32_LIST_PACKED", 43, 43, 3, zs7Var4);
        j0 = bs7Var44;
        bs7 bs7Var45 = new bs7("ENUM_LIST_PACKED", 44, 44, 3, zs7Var9);
        k0 = bs7Var45;
        bs7 bs7Var46 = new bs7("SFIXED32_LIST_PACKED", 45, 45, 3, zs7Var4);
        l0 = bs7Var46;
        bs7 bs7Var47 = new bs7("SFIXED64_LIST_PACKED", 46, 46, 3, zs7Var3);
        m0 = bs7Var47;
        bs7 bs7Var48 = new bs7("SINT32_LIST_PACKED", 47, 47, 3, zs7Var4);
        n0 = bs7Var48;
        bs7 bs7Var49 = new bs7("SINT64_LIST_PACKED", 48, 48, 3, zs7Var3);
        o0 = bs7Var49;
        bs7 bs7Var50 = new bs7("GROUP_LIST", 49, 49, 2, zs7Var7);
        p0 = bs7Var50;
        bs7 bs7Var51 = new bs7("MAP", 50, 50, 4, zs7.s);
        q0 = bs7Var51;
        s0 = new bs7[]{bs7Var, bs7Var2, bs7Var3, bs7Var4, bs7Var5, bs7Var6, bs7Var7, bs7Var8, bs7Var9, bs7Var10, bs7Var11, bs7Var12, bs7Var13, bs7Var14, bs7Var15, bs7Var16, bs7Var17, bs7Var18, bs7Var19, bs7Var20, bs7Var21, bs7Var22, bs7Var23, bs7Var24, bs7Var25, bs7Var26, bs7Var27, bs7Var28, bs7Var29, bs7Var30, bs7Var31, bs7Var32, bs7Var33, bs7Var34, bs7Var35, bs7Var36, bs7Var37, bs7Var38, bs7Var39, bs7Var40, bs7Var41, bs7Var42, bs7Var43, bs7Var44, bs7Var45, bs7Var46, bs7Var47, bs7Var48, bs7Var49, bs7Var50, bs7Var51};
        bs7[] values = values();
        r0 = new bs7[values.length];
        for (bs7 bs7Var52 : values) {
            r0[bs7Var52.q] = bs7Var52;
        }
    }

    public bs7(String str, int i, int i2, int i3, zs7 zs7Var) {
        this.q = i2;
        this.p = zs7Var;
        zs7 zs7Var2 = zs7.s;
        int i4 = i3 - 1;
        this.r = (i4 == 1 || i4 == 3) ? zs7Var.a() : null;
        if (i3 == 1) {
            zs7Var.ordinal();
        }
    }

    public static bs7[] values() {
        return (bs7[]) s0.clone();
    }

    public final int zza() {
        return this.q;
    }
}
