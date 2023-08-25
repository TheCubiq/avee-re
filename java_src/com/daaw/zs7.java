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
/* loaded from: classes.dex */
public final class zs7 {
    public static final zs7 A;
    public static final zs7 B;
    public static final /* synthetic */ zs7[] C;
    public static final zs7 s;
    public static final zs7 t;
    public static final zs7 u;
    public static final zs7 v;
    public static final zs7 w;
    public static final zs7 x;
    public static final zs7 y;
    public static final zs7 z;
    public final Class p;
    public final Class q;
    public final Object r;

    static {
        zs7 zs7Var = new zs7("VOID", 0, Void.class, Void.class, null);
        s = zs7Var;
        Class cls = Integer.TYPE;
        zs7 zs7Var2 = new zs7("INT", 1, cls, Integer.class, 0);
        t = zs7Var2;
        zs7 zs7Var3 = new zs7("LONG", 2, Long.TYPE, Long.class, 0L);
        u = zs7Var3;
        zs7 zs7Var4 = new zs7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        v = zs7Var4;
        zs7 zs7Var5 = new zs7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        w = zs7Var5;
        zs7 zs7Var6 = new zs7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        x = zs7Var6;
        zs7 zs7Var7 = new zs7("STRING", 6, String.class, String.class, "");
        y = zs7Var7;
        zs7 zs7Var8 = new zs7("BYTE_STRING", 7, yq7.class, yq7.class, yq7.q);
        z = zs7Var8;
        zs7 zs7Var9 = new zs7("ENUM", 8, cls, Integer.class, null);
        A = zs7Var9;
        zs7 zs7Var10 = new zs7("MESSAGE", 9, Object.class, Object.class, null);
        B = zs7Var10;
        C = new zs7[]{zs7Var, zs7Var2, zs7Var3, zs7Var4, zs7Var5, zs7Var6, zs7Var7, zs7Var8, zs7Var9, zs7Var10};
    }

    public zs7(String str, int i, Class cls, Class cls2, Object obj) {
        this.p = cls;
        this.q = cls2;
        this.r = obj;
    }

    public static zs7[] values() {
        return (zs7[]) C.clone();
    }

    public final Class a() {
        return this.q;
    }
}
