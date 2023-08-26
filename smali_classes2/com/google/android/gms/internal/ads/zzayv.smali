.class public final enum Lcom/google/android/gms/internal/ads/zzayv;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/ads/zzayv;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum zzdno:Lcom/google/android/gms/internal/ads/zzayv;

.field public static final enum zzdnp:Lcom/google/android/gms/internal/ads/zzayv;

.field public static final enum zzdnq:Lcom/google/android/gms/internal/ads/zzayv;

.field private static final synthetic zzdnr:[Lcom/google/android/gms/internal/ads/zzayv;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayv;

    const/4 v1, 0x0

    const-string v2, "NIST_P256"

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzayv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayv;->zzdno:Lcom/google/android/gms/internal/ads/zzayv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayv;

    const/4 v2, 0x1

    const-string v3, "NIST_P384"

    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzayv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayv;->zzdnp:Lcom/google/android/gms/internal/ads/zzayv;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayv;

    const/4 v3, 0x2

    const-string v4, "NIST_P521"

    invoke-direct {v0, v4, v3}, Lcom/google/android/gms/internal/ads/zzayv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayv;->zzdnq:Lcom/google/android/gms/internal/ads/zzayv;

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/google/android/gms/internal/ads/zzayv;

    sget-object v5, Lcom/google/android/gms/internal/ads/zzayv;->zzdno:Lcom/google/android/gms/internal/ads/zzayv;

    aput-object v5, v4, v1

    sget-object v1, Lcom/google/android/gms/internal/ads/zzayv;->zzdnp:Lcom/google/android/gms/internal/ads/zzayv;

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    sput-object v4, Lcom/google/android/gms/internal/ads/zzayv;->zzdnr:[Lcom/google/android/gms/internal/ads/zzayv;

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

.method public static values()[Lcom/google/android/gms/internal/ads/zzayv;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzayv;->zzdnr:[Lcom/google/android/gms/internal/ads/zzayv;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/ads/zzayv;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/ads/zzayv;

    return-object v0
.end method
