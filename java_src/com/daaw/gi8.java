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
/* loaded from: classes2.dex */
public final class gi8 {
    public static final gi8 A;
    public static final gi8 B;
    public static final gi8 C;
    public static final gi8 D;
    public static final gi8 E;
    public static final gi8 F;
    public static final gi8 G;
    public static final gi8 H;
    public static final /* synthetic */ gi8[] I;
    public static final gi8 q;
    public static final gi8 r;
    public static final gi8 s;
    public static final gi8 t;
    public static final gi8 u;
    public static final gi8 v;
    public static final gi8 w;
    public static final gi8 x;
    public static final gi8 y;
    public static final gi8 z;
    public final ii8 p;

    static {
        gi8 gi8Var = new gi8("DOUBLE", 0, ii8.DOUBLE, 1);
        q = gi8Var;
        gi8 gi8Var2 = new gi8("FLOAT", 1, ii8.FLOAT, 5);
        r = gi8Var2;
        ii8 ii8Var = ii8.LONG;
        gi8 gi8Var3 = new gi8("INT64", 2, ii8Var, 0);
        s = gi8Var3;
        gi8 gi8Var4 = new gi8("UINT64", 3, ii8Var, 0);
        t = gi8Var4;
        ii8 ii8Var2 = ii8.INT;
        gi8 gi8Var5 = new gi8("INT32", 4, ii8Var2, 0);
        u = gi8Var5;
        gi8 gi8Var6 = new gi8("FIXED64", 5, ii8Var, 1);
        v = gi8Var6;
        gi8 gi8Var7 = new gi8("FIXED32", 6, ii8Var2, 5);
        w = gi8Var7;
        gi8 gi8Var8 = new gi8("BOOL", 7, ii8.BOOLEAN, 0);
        x = gi8Var8;
        gi8 gi8Var9 = new gi8("STRING", 8, ii8.STRING, 2);
        y = gi8Var9;
        ii8 ii8Var3 = ii8.MESSAGE;
        gi8 gi8Var10 = new gi8("GROUP", 9, ii8Var3, 3);
        z = gi8Var10;
        gi8 gi8Var11 = new gi8("MESSAGE", 10, ii8Var3, 2);
        A = gi8Var11;
        gi8 gi8Var12 = new gi8("BYTES", 11, ii8.BYTE_STRING, 2);
        B = gi8Var12;
        gi8 gi8Var13 = new gi8("UINT32", 12, ii8Var2, 0);
        C = gi8Var13;
        gi8 gi8Var14 = new gi8("ENUM", 13, ii8.ENUM, 0);
        D = gi8Var14;
        gi8 gi8Var15 = new gi8("SFIXED32", 14, ii8Var2, 5);
        E = gi8Var15;
        gi8 gi8Var16 = new gi8("SFIXED64", 15, ii8Var, 1);
        F = gi8Var16;
        gi8 gi8Var17 = new gi8("SINT32", 16, ii8Var2, 0);
        G = gi8Var17;
        gi8 gi8Var18 = new gi8("SINT64", 17, ii8Var, 0);
        H = gi8Var18;
        I = new gi8[]{gi8Var, gi8Var2, gi8Var3, gi8Var4, gi8Var5, gi8Var6, gi8Var7, gi8Var8, gi8Var9, gi8Var10, gi8Var11, gi8Var12, gi8Var13, gi8Var14, gi8Var15, gi8Var16, gi8Var17, gi8Var18};
    }

    public gi8(String str, int i, ii8 ii8Var, int i2) {
        this.p = ii8Var;
    }

    public static gi8[] values() {
        return (gi8[]) I.clone();
    }

    public final ii8 a() {
        return this.p;
    }
}
