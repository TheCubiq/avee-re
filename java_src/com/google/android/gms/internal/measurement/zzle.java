package com.google.android.gms.internal.measurement;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzi uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public class zzle {
    public static final zzle zza = new zzle("DOUBLE", 0, zzlh.DOUBLE, 1);
    public static final zzle zzb = new zzle("FLOAT", 1, zzlh.FLOAT, 5);
    public static final zzle zzc = new zzle("INT64", 2, zzlh.LONG, 0);
    public static final zzle zzd = new zzle("UINT64", 3, zzlh.LONG, 0);
    public static final zzle zze = new zzle("INT32", 4, zzlh.INT, 0);
    public static final zzle zzf = new zzle("FIXED64", 5, zzlh.LONG, 1);
    public static final zzle zzg = new zzle("FIXED32", 6, zzlh.INT, 5);
    public static final zzle zzh = new zzle("BOOL", 7, zzlh.BOOLEAN, 0);
    public static final zzle zzi;
    public static final zzle zzj;
    public static final zzle zzk;
    public static final zzle zzl;
    public static final zzle zzm;
    public static final zzle zzn;
    public static final zzle zzo;
    public static final zzle zzp;
    public static final zzle zzq;
    public static final zzle zzr;
    private static final /* synthetic */ zzle[] zzu;
    private final zzlh zzs;
    private final int zzt;

    public static zzle[] values() {
        return (zzle[]) zzu.clone();
    }

    private zzle(String str, int i, zzlh zzlhVar, int i2) {
        this.zzs = zzlhVar;
        this.zzt = i2;
    }

    public final zzlh zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzle(String str, int i, zzlh zzlhVar, int i2, zzlb zzlbVar) {
        this(str, i, zzlhVar, i2);
    }

    static {
        final zzlh zzlhVar = zzlh.STRING;
        zzi = new zzle("STRING", 8, zzlhVar, 2) { // from class: com.google.android.gms.internal.measurement.zzld
        };
        final zzlh zzlhVar2 = zzlh.MESSAGE;
        zzj = new zzle("GROUP", 9, zzlhVar2, 3) { // from class: com.google.android.gms.internal.measurement.zzlg
        };
        final zzlh zzlhVar3 = zzlh.MESSAGE;
        zzk = new zzle("MESSAGE", 10, zzlhVar3, 2) { // from class: com.google.android.gms.internal.measurement.zzlf
        };
        final zzlh zzlhVar4 = zzlh.BYTE_STRING;
        zzl = new zzle("BYTES", 11, zzlhVar4, 2) { // from class: com.google.android.gms.internal.measurement.zzli
        };
        zzm = new zzle("UINT32", 12, zzlh.INT, 0);
        zzn = new zzle("ENUM", 13, zzlh.ENUM, 0);
        zzo = new zzle("SFIXED32", 14, zzlh.INT, 5);
        zzp = new zzle("SFIXED64", 15, zzlh.LONG, 1);
        zzq = new zzle("SINT32", 16, zzlh.INT, 0);
        zzle zzleVar = new zzle("SINT64", 17, zzlh.LONG, 0);
        zzr = zzleVar;
        zzu = new zzle[]{zza, zzb, zzc, zzd, zze, zzf, zzg, zzh, zzi, zzj, zzk, zzl, zzm, zzn, zzo, zzp, zzq, zzleVar};
    }
}
