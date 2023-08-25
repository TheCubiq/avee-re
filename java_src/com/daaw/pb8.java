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
    public static final pb8 A;
    public static final pb8 B;
    public static final /* synthetic */ pb8[] C;
    public static final pb8 s;
    public static final pb8 t;
    public static final pb8 u;
    public static final pb8 v;
    public static final pb8 w;
    public static final pb8 x;
    public static final pb8 y;
    public static final pb8 z;
    public final Class p;
    public final Class q;
    public final Object r;

    static {
        pb8 pb8Var = new pb8("VOID", 0, Void.class, Void.class, null);
        s = pb8Var;
        Class cls = Integer.TYPE;
        pb8 pb8Var2 = new pb8("INT", 1, cls, Integer.class, 0);
        t = pb8Var2;
        pb8 pb8Var3 = new pb8("LONG", 2, Long.TYPE, Long.class, 0L);
        u = pb8Var3;
        pb8 pb8Var4 = new pb8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        v = pb8Var4;
        pb8 pb8Var5 = new pb8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        w = pb8Var5;
        pb8 pb8Var6 = new pb8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        x = pb8Var6;
        pb8 pb8Var7 = new pb8("STRING", 6, String.class, String.class, "");
        y = pb8Var7;
        pb8 pb8Var8 = new pb8("BYTE_STRING", 7, y68.class, y68.class, y68.q);
        z = pb8Var8;
        pb8 pb8Var9 = new pb8("ENUM", 8, cls, Integer.class, null);
        A = pb8Var9;
        pb8 pb8Var10 = new pb8("MESSAGE", 9, Object.class, Object.class, null);
        B = pb8Var10;
        C = new pb8[]{pb8Var, pb8Var2, pb8Var3, pb8Var4, pb8Var5, pb8Var6, pb8Var7, pb8Var8, pb8Var9, pb8Var10};
    }

    public pb8(String str, int i, Class cls, Class cls2, Object obj) {
        this.p = cls;
        this.q = cls2;
        this.r = obj;
    }

    public static pb8[] values() {
        return (pb8[]) C.clone();
    }

    public final Class a() {
        return this.q;
    }
}
