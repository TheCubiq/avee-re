.class public final enum Lcom/google/android/gms/internal/ads/zzayw;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/zzayw;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zzdns:Lcom/google/android/gms/internal/ads/zzayw;

.field public static final enum zzdnt:Lcom/google/android/gms/internal/ads/zzayw;

.field private static final synthetic zzdnu:[Lcom/google/android/gms/internal/ads/zzayw;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayw;

    const/4 v1, 0x0

    const-string v2, "UNCOMPRESSED"

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzayw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayw;->zzdns:Lcom/google/android/gms/internal/ads/zzayw;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayw;

    const/4 v2, 0x1

    const-string v3, "COMPRESSED"

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzayw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayw;->zzdnt:Lcom/google/android/gms/internal/ads/zzayw;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/android/gms/internal/ads/zzayw;

    sget-object v4, Lcom/google/android/gms/internal/ads/zzayw;->zzdns:Lcom/google/android/gms/internal/ads/zzayw;

    aput-object v4, v3, v1

    aput-object v0, v3, v2

    sput-object v3, Lcom/google/android/gms/internal/ads/zzayw;->zzdnu:[Lcom/google/android/gms/internal/ads/zzayw;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/ads/zzayw;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzayw;->zzdnu:[Lcom/google/android/gms/internal/ads/zzayw;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzayw;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzayw;

    return-object v0
.end method
