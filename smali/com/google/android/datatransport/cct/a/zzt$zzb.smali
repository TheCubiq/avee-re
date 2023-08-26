.class public final enum Lcom/google/android/datatransport/cct/a/zzt$zzb;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/datatransport/cct/a/zzt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "zzb"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/datatransport/cct/a/zzt$zzb;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zza:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzb:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzc:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzd:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zze:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzf:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzg:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzh:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzi:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzj:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzk:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzl:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzm:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzn:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzo:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzp:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzq:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzr:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzs:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzt:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field public static final enum zzu:Lcom/google/android/datatransport/cct/a/zzt$zzb;

.field private static final zzv:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/google/android/datatransport/cct/a/zzt$zzb;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final zzw:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/4 v1, 0x0

    const-string v2, "UNKNOWN_MOBILE_SUBTYPE"

    invoke-direct {v0, v2, v1, v1}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zza:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 2
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/4 v2, 0x1

    const-string v3, "GPRS"

    invoke-direct {v0, v3, v2, v2}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzb:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 3
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/4 v3, 0x2

    const-string v4, "EDGE"

    invoke-direct {v0, v4, v3, v3}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzc:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 4
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/4 v4, 0x3

    const-string v5, "UMTS"

    invoke-direct {v0, v5, v4, v4}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzd:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 5
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/4 v5, 0x4

    const-string v6, "CDMA"

    invoke-direct {v0, v6, v5, v5}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zze:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 6
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/4 v6, 0x5

    const-string v7, "EVDO_0"

    invoke-direct {v0, v7, v6, v6}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzf:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 7
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/4 v7, 0x6

    const-string v8, "EVDO_A"

    invoke-direct {v0, v8, v7, v7}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzg:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 8
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/4 v8, 0x7

    const-string v9, "RTT"

    invoke-direct {v0, v9, v8, v8}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzh:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 9
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v9, 0x8

    const-string v10, "HSDPA"

    invoke-direct {v0, v10, v9, v9}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzi:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 10
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v10, 0x9

    const-string v11, "HSUPA"

    invoke-direct {v0, v11, v10, v10}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzj:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 11
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v11, 0xa

    const-string v12, "HSPA"

    invoke-direct {v0, v12, v11, v11}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzk:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 12
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v12, 0xb

    const-string v13, "IDEN"

    invoke-direct {v0, v13, v12, v12}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzl:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 13
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v13, 0xc

    const-string v14, "EVDO_B"

    invoke-direct {v0, v14, v13, v13}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzm:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 14
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v14, 0xd

    const-string v15, "LTE"

    invoke-direct {v0, v15, v14, v14}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzn:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 15
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v15, 0xe

    const-string v14, "EHRPD"

    invoke-direct {v0, v14, v15, v15}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzo:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 16
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v14, 0xf

    const-string v15, "HSPAP"

    invoke-direct {v0, v15, v14, v14}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzp:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 17
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v15, 0x10

    const-string v14, "GSM"

    invoke-direct {v0, v14, v15, v15}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzq:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 18
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v14, 0x11

    const-string v15, "TD_SCDMA"

    invoke-direct {v0, v15, v14, v14}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzr:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 19
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v15, 0x12

    const-string v14, "IWLAN"

    invoke-direct {v0, v14, v15, v15}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzs:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 20
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v14, 0x13

    const-string v15, "LTE_CA"

    invoke-direct {v0, v15, v14, v14}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzt:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 21
    new-instance v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const-string v15, "COMBINED"

    const/16 v14, 0x14

    const/16 v13, 0x64

    invoke-direct {v0, v15, v14, v13}, Lcom/google/android/datatransport/cct/a/zzt$zzb;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzu:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    .line 23
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    .line 24
    sget-object v13, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zza:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v1, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 25
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzb:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 26
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzc:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v3, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 27
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzd:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v4, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 28
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zze:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v5, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 29
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzf:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 30
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzg:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v7, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 31
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzh:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v8, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 32
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzi:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v9, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 33
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzj:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v10, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 34
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzk:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v11, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 35
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzl:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    invoke-virtual {v0, v12, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 36
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzm:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 37
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzn:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v2, 0xd

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 38
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzo:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v2, 0xe

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 39
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzp:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v2, 0xf

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 40
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzq:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v2, 0x10

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 41
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzr:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v2, 0x11

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 42
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzs:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v2, 0x12

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 43
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    sget-object v1, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzt:Lcom/google/android/datatransport/cct/a/zzt$zzb;

    const/16 v2, 0x13

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzw:I

    return-void
.end method

.method public static zza(I)Lcom/google/android/datatransport/cct/a/zzt$zzb;
    .locals 1

    .line 2
    sget-object v0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzv:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/datatransport/cct/a/zzt$zzb;

    return-object p0
.end method


# virtual methods
.method public zza()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/datatransport/cct/a/zzt$zzb;->zzw:I

    return v0
.end method
