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

    /* renamed from: A */
    public static final gi8 f11337A;

    /* renamed from: B */
    public static final gi8 f11338B;

    /* renamed from: C */
    public static final gi8 f11339C;

    /* renamed from: D */
    public static final gi8 f11340D;

    /* renamed from: E */
    public static final gi8 f11341E;

    /* renamed from: F */
    public static final gi8 f11342F;

    /* renamed from: G */
    public static final gi8 f11343G;

    /* renamed from: H */
    public static final gi8 f11344H;

    /* renamed from: I */
    public static final /* synthetic */ gi8[] f11345I;

    /* renamed from: q */
    public static final gi8 f11346q;

    /* renamed from: r */
    public static final gi8 f11347r;

    /* renamed from: s */
    public static final gi8 f11348s;

    /* renamed from: t */
    public static final gi8 f11349t;

    /* renamed from: u */
    public static final gi8 f11350u;

    /* renamed from: v */
    public static final gi8 f11351v;

    /* renamed from: w */
    public static final gi8 f11352w;

    /* renamed from: x */
    public static final gi8 f11353x;

    /* renamed from: y */
    public static final gi8 f11354y;

    /* renamed from: z */
    public static final gi8 f11355z;

    /* renamed from: p */
    public final ii8 f11356p;

    static {
        gi8 gi8Var = new gi8("DOUBLE", 0, ii8.DOUBLE, 1);
        f11346q = gi8Var;
        gi8 gi8Var2 = new gi8("FLOAT", 1, ii8.FLOAT, 5);
        f11347r = gi8Var2;
        ii8 ii8Var = ii8.LONG;
        gi8 gi8Var3 = new gi8("INT64", 2, ii8Var, 0);
        f11348s = gi8Var3;
        gi8 gi8Var4 = new gi8("UINT64", 3, ii8Var, 0);
        f11349t = gi8Var4;
        ii8 ii8Var2 = ii8.INT;
        gi8 gi8Var5 = new gi8("INT32", 4, ii8Var2, 0);
        f11350u = gi8Var5;
        gi8 gi8Var6 = new gi8("FIXED64", 5, ii8Var, 1);
        f11351v = gi8Var6;
        gi8 gi8Var7 = new gi8("FIXED32", 6, ii8Var2, 5);
        f11352w = gi8Var7;
        gi8 gi8Var8 = new gi8("BOOL", 7, ii8.BOOLEAN, 0);
        f11353x = gi8Var8;
        gi8 gi8Var9 = new gi8("STRING", 8, ii8.STRING, 2);
        f11354y = gi8Var9;
        ii8 ii8Var3 = ii8.MESSAGE;
        gi8 gi8Var10 = new gi8("GROUP", 9, ii8Var3, 3);
        f11355z = gi8Var10;
        gi8 gi8Var11 = new gi8("MESSAGE", 10, ii8Var3, 2);
        f11337A = gi8Var11;
        gi8 gi8Var12 = new gi8("BYTES", 11, ii8.BYTE_STRING, 2);
        f11338B = gi8Var12;
        gi8 gi8Var13 = new gi8("UINT32", 12, ii8Var2, 0);
        f11339C = gi8Var13;
        gi8 gi8Var14 = new gi8("ENUM", 13, ii8.ENUM, 0);
        f11340D = gi8Var14;
        gi8 gi8Var15 = new gi8("SFIXED32", 14, ii8Var2, 5);
        f11341E = gi8Var15;
        gi8 gi8Var16 = new gi8("SFIXED64", 15, ii8Var, 1);
        f11342F = gi8Var16;
        gi8 gi8Var17 = new gi8("SINT32", 16, ii8Var2, 0);
        f11343G = gi8Var17;
        gi8 gi8Var18 = new gi8("SINT64", 17, ii8Var, 0);
        f11344H = gi8Var18;
        f11345I = new gi8[]{gi8Var, gi8Var2, gi8Var3, gi8Var4, gi8Var5, gi8Var6, gi8Var7, gi8Var8, gi8Var9, gi8Var10, gi8Var11, gi8Var12, gi8Var13, gi8Var14, gi8Var15, gi8Var16, gi8Var17, gi8Var18};
    }

    public gi8(String str, int i, ii8 ii8Var, int i2) {
        this.f11356p = ii8Var;
    }

    public static gi8[] values() {
        return (gi8[]) f11345I.clone();
    }

    /* renamed from: a */
    public final ii8 m21569a() {
        return this.f11356p;
    }
}
