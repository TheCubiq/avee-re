package com.google.android.gms.internal.ads;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzeai uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class zzbes {
    public static final zzbes zzeaa = new zzbes("DOUBLE", 0, zzbex.DOUBLE, 1);
    public static final zzbes zzeab = new zzbes("FLOAT", 1, zzbex.FLOAT, 5);
    public static final zzbes zzeac = new zzbes("INT64", 2, zzbex.LONG, 0);
    public static final zzbes zzead = new zzbes("UINT64", 3, zzbex.LONG, 0);
    public static final zzbes zzeae = new zzbes("INT32", 4, zzbex.INT, 0);
    public static final zzbes zzeaf = new zzbes("FIXED64", 5, zzbex.LONG, 1);
    public static final zzbes zzeag = new zzbes("FIXED32", 6, zzbex.INT, 5);
    public static final zzbes zzeah = new zzbes("BOOL", 7, zzbex.BOOLEAN, 0);
    public static final zzbes zzeai;
    public static final zzbes zzeaj;
    public static final zzbes zzeak;
    public static final zzbes zzeal;
    public static final zzbes zzeam;
    public static final zzbes zzean;
    public static final zzbes zzeao;
    public static final zzbes zzeap;
    public static final zzbes zzeaq;
    public static final zzbes zzear;
    private static final /* synthetic */ zzbes[] zzeau;
    private final zzbex zzeas;
    private final int zzeat;

    static {
        final zzbex zzbexVar = zzbex.STRING;
        zzeai = new zzbes("STRING", 8, zzbexVar, 2) { // from class: com.google.android.gms.internal.ads.zzbet
        };
        final zzbex zzbexVar2 = zzbex.MESSAGE;
        zzeaj = new zzbes("GROUP", 9, zzbexVar2, 3) { // from class: com.google.android.gms.internal.ads.zzbeu
        };
        final zzbex zzbexVar3 = zzbex.MESSAGE;
        zzeak = new zzbes("MESSAGE", 10, zzbexVar3, 2) { // from class: com.google.android.gms.internal.ads.zzbev
        };
        final zzbex zzbexVar4 = zzbex.BYTE_STRING;
        zzeal = new zzbes("BYTES", 11, zzbexVar4, 2) { // from class: com.google.android.gms.internal.ads.zzbew
        };
        zzeam = new zzbes("UINT32", 12, zzbex.INT, 0);
        zzean = new zzbes("ENUM", 13, zzbex.ENUM, 0);
        zzeao = new zzbes("SFIXED32", 14, zzbex.INT, 5);
        zzeap = new zzbes("SFIXED64", 15, zzbex.LONG, 1);
        zzeaq = new zzbes("SINT32", 16, zzbex.INT, 0);
        zzbes zzbesVar = new zzbes("SINT64", 17, zzbex.LONG, 0);
        zzear = zzbesVar;
        zzeau = new zzbes[]{zzeaa, zzeab, zzeac, zzead, zzeae, zzeaf, zzeag, zzeah, zzeai, zzeaj, zzeak, zzeal, zzeam, zzean, zzeao, zzeap, zzeaq, zzbesVar};
    }

    private zzbes(String str, int i, zzbex zzbexVar, int i2) {
        this.zzeas = zzbexVar;
        this.zzeat = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbes(String str, int i, zzbex zzbexVar, int i2, zzber zzberVar) {
        this(str, i, zzbexVar, i2);
    }

    public static zzbes[] values() {
        return (zzbes[]) zzeau.clone();
    }

    public final zzbex zzagl() {
        return this.zzeas;
    }

    public final int zzagm() {
        return this.zzeat;
    }
}
