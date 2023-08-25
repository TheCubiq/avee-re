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

    /* renamed from: A */
    public static final zs7 f35463A;

    /* renamed from: B */
    public static final zs7 f35464B;

    /* renamed from: C */
    public static final /* synthetic */ zs7[] f35465C;

    /* renamed from: s */
    public static final zs7 f35466s;

    /* renamed from: t */
    public static final zs7 f35467t;

    /* renamed from: u */
    public static final zs7 f35468u;

    /* renamed from: v */
    public static final zs7 f35469v;

    /* renamed from: w */
    public static final zs7 f35470w;

    /* renamed from: x */
    public static final zs7 f35471x;

    /* renamed from: y */
    public static final zs7 f35472y;

    /* renamed from: z */
    public static final zs7 f35473z;

    /* renamed from: p */
    public final Class f35474p;

    /* renamed from: q */
    public final Class f35475q;

    /* renamed from: r */
    public final Object f35476r;

    static {
        zs7 zs7Var = new zs7("VOID", 0, Void.class, Void.class, null);
        f35466s = zs7Var;
        Class cls = Integer.TYPE;
        zs7 zs7Var2 = new zs7("INT", 1, cls, Integer.class, 0);
        f35467t = zs7Var2;
        zs7 zs7Var3 = new zs7("LONG", 2, Long.TYPE, Long.class, 0L);
        f35468u = zs7Var3;
        zs7 zs7Var4 = new zs7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f35469v = zs7Var4;
        zs7 zs7Var5 = new zs7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f35470w = zs7Var5;
        zs7 zs7Var6 = new zs7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f35471x = zs7Var6;
        zs7 zs7Var7 = new zs7("STRING", 6, String.class, String.class, "");
        f35472y = zs7Var7;
        zs7 zs7Var8 = new zs7("BYTE_STRING", 7, yq7.class, yq7.class, yq7.f33966q);
        f35473z = zs7Var8;
        zs7 zs7Var9 = new zs7("ENUM", 8, cls, Integer.class, null);
        f35463A = zs7Var9;
        zs7 zs7Var10 = new zs7("MESSAGE", 9, Object.class, Object.class, null);
        f35464B = zs7Var10;
        f35465C = new zs7[]{zs7Var, zs7Var2, zs7Var3, zs7Var4, zs7Var5, zs7Var6, zs7Var7, zs7Var8, zs7Var9, zs7Var10};
    }

    public zs7(String str, int i, Class cls, Class cls2, Object obj) {
        this.f35474p = cls;
        this.f35475q = cls2;
        this.f35476r = obj;
    }

    public static zs7[] values() {
        return (zs7[]) f35465C.clone();
    }

    /* renamed from: a */
    public final Class m1925a() {
        return this.f35475q;
    }
}
