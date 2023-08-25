package com.daaw;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum t uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class pb8 {

    /* renamed from: A */
    public static final pb8 f22811A;

    /* renamed from: B */
    public static final pb8 f22812B;

    /* renamed from: C */
    public static final /* synthetic */ pb8[] f22813C;

    /* renamed from: s */
    public static final pb8 f22814s;

    /* renamed from: t */
    public static final pb8 f22815t;

    /* renamed from: u */
    public static final pb8 f22816u;

    /* renamed from: v */
    public static final pb8 f22817v;

    /* renamed from: w */
    public static final pb8 f22818w;

    /* renamed from: x */
    public static final pb8 f22819x;

    /* renamed from: y */
    public static final pb8 f22820y;

    /* renamed from: z */
    public static final pb8 f22821z;

    /* renamed from: p */
    public final Class f22822p;

    /* renamed from: q */
    public final Class f22823q;

    /* renamed from: r */
    public final Object f22824r;

    static {
        pb8 pb8Var = new pb8("VOID", 0, Void.class, Void.class, null);
        f22814s = pb8Var;
        Class cls = Integer.TYPE;
        pb8 pb8Var2 = new pb8("INT", 1, cls, Integer.class, 0);
        f22815t = pb8Var2;
        pb8 pb8Var3 = new pb8("LONG", 2, Long.TYPE, Long.class, 0L);
        f22816u = pb8Var3;
        pb8 pb8Var4 = new pb8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f22817v = pb8Var4;
        pb8 pb8Var5 = new pb8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f22818w = pb8Var5;
        pb8 pb8Var6 = new pb8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f22819x = pb8Var6;
        pb8 pb8Var7 = new pb8("STRING", 6, String.class, String.class, "");
        f22820y = pb8Var7;
        pb8 pb8Var8 = new pb8("BYTE_STRING", 7, y68.class, y68.class, y68.f33399q);
        f22821z = pb8Var8;
        pb8 pb8Var9 = new pb8("ENUM", 8, cls, Integer.class, null);
        f22811A = pb8Var9;
        pb8 pb8Var10 = new pb8("MESSAGE", 9, Object.class, Object.class, null);
        f22812B = pb8Var10;
        f22813C = new pb8[]{pb8Var, pb8Var2, pb8Var3, pb8Var4, pb8Var5, pb8Var6, pb8Var7, pb8Var8, pb8Var9, pb8Var10};
    }

    public pb8(String str, int i, Class cls, Class cls2, Object obj) {
        this.f22822p = cls;
        this.f22823q = cls2;
        this.f22824r = obj;
    }

    public static pb8[] values() {
        return (pb8[]) f22813C.clone();
    }

    /* renamed from: a */
    public final Class m13457a() {
        return this.f22823q;
    }
}
