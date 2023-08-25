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
public final class mw7 {

    /* renamed from: A */
    public static final mw7 f19198A;

    /* renamed from: B */
    public static final mw7 f19199B;

    /* renamed from: C */
    public static final mw7 f19200C;

    /* renamed from: D */
    public static final mw7 f19201D;

    /* renamed from: E */
    public static final mw7 f19202E;

    /* renamed from: F */
    public static final mw7 f19203F;

    /* renamed from: G */
    public static final mw7 f19204G;

    /* renamed from: H */
    public static final mw7 f19205H;

    /* renamed from: I */
    public static final /* synthetic */ mw7[] f19206I;

    /* renamed from: q */
    public static final mw7 f19207q;

    /* renamed from: r */
    public static final mw7 f19208r;

    /* renamed from: s */
    public static final mw7 f19209s;

    /* renamed from: t */
    public static final mw7 f19210t;

    /* renamed from: u */
    public static final mw7 f19211u;

    /* renamed from: v */
    public static final mw7 f19212v;

    /* renamed from: w */
    public static final mw7 f19213w;

    /* renamed from: x */
    public static final mw7 f19214x;

    /* renamed from: y */
    public static final mw7 f19215y;

    /* renamed from: z */
    public static final mw7 f19216z;

    /* renamed from: p */
    public final nw7 f19217p;

    static {
        mw7 mw7Var = new mw7("DOUBLE", 0, nw7.DOUBLE, 1);
        f19207q = mw7Var;
        mw7 mw7Var2 = new mw7("FLOAT", 1, nw7.FLOAT, 5);
        f19208r = mw7Var2;
        nw7 nw7Var = nw7.LONG;
        mw7 mw7Var3 = new mw7("INT64", 2, nw7Var, 0);
        f19209s = mw7Var3;
        mw7 mw7Var4 = new mw7("UINT64", 3, nw7Var, 0);
        f19210t = mw7Var4;
        nw7 nw7Var2 = nw7.INT;
        mw7 mw7Var5 = new mw7("INT32", 4, nw7Var2, 0);
        f19211u = mw7Var5;
        mw7 mw7Var6 = new mw7("FIXED64", 5, nw7Var, 1);
        f19212v = mw7Var6;
        mw7 mw7Var7 = new mw7("FIXED32", 6, nw7Var2, 5);
        f19213w = mw7Var7;
        mw7 mw7Var8 = new mw7("BOOL", 7, nw7.BOOLEAN, 0);
        f19214x = mw7Var8;
        mw7 mw7Var9 = new mw7("STRING", 8, nw7.STRING, 2);
        f19215y = mw7Var9;
        nw7 nw7Var3 = nw7.MESSAGE;
        mw7 mw7Var10 = new mw7("GROUP", 9, nw7Var3, 3);
        f19216z = mw7Var10;
        mw7 mw7Var11 = new mw7("MESSAGE", 10, nw7Var3, 2);
        f19198A = mw7Var11;
        mw7 mw7Var12 = new mw7("BYTES", 11, nw7.BYTE_STRING, 2);
        f19199B = mw7Var12;
        mw7 mw7Var13 = new mw7("UINT32", 12, nw7Var2, 0);
        f19200C = mw7Var13;
        mw7 mw7Var14 = new mw7("ENUM", 13, nw7.ENUM, 0);
        f19201D = mw7Var14;
        mw7 mw7Var15 = new mw7("SFIXED32", 14, nw7Var2, 5);
        f19202E = mw7Var15;
        mw7 mw7Var16 = new mw7("SFIXED64", 15, nw7Var, 1);
        f19203F = mw7Var16;
        mw7 mw7Var17 = new mw7("SINT32", 16, nw7Var2, 0);
        f19204G = mw7Var17;
        mw7 mw7Var18 = new mw7("SINT64", 17, nw7Var, 0);
        f19205H = mw7Var18;
        f19206I = new mw7[]{mw7Var, mw7Var2, mw7Var3, mw7Var4, mw7Var5, mw7Var6, mw7Var7, mw7Var8, mw7Var9, mw7Var10, mw7Var11, mw7Var12, mw7Var13, mw7Var14, mw7Var15, mw7Var16, mw7Var17, mw7Var18};
    }

    public mw7(String str, int i, nw7 nw7Var, int i2) {
        this.f19217p = nw7Var;
    }

    public static mw7[] values() {
        return (mw7[]) f19206I.clone();
    }

    /* renamed from: a */
    public final nw7 m15739a() {
        return this.f19217p;
    }
}
