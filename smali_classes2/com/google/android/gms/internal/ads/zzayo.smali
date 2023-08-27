.class public final Lcom/google/android/gms/internal/ads/zzayo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaue;


# static fields
.field private static final zzdhv:[B


# instance fields
.field private final zzdnc:Ljava/security/interfaces/ECPrivateKey;

.field private final zzdnd:Lcom/google/android/gms/internal/ads/zzayq;

.field private final zzdne:Ljava/lang/String;

.field private final zzdnf:[B

.field private final zzdng:Lcom/google/android/gms/internal/ads/zzayw;

.field private final zzdnh:Lcom/google/android/gms/internal/ads/zzayn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayo;->zzdhv:[B

    return-void
.end method

.method public constructor <init>(Ljava/security/interfaces/ECPrivateKey;[BLjava/lang/String;Lcom/google/android/gms/internal/ads/zzayw;Lcom/google/android/gms/internal/ads/zzayn;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzayo;->zzdnc:Ljava/security/interfaces/ECPrivateKey;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayq;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzayq;-><init>(Ljava/security/interfaces/ECPrivateKey;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzayo;->zzdnd:Lcom/google/android/gms/internal/ads/zzayq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzayo;->zzdnf:[B

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzayo;->zzdne:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzayo;->zzdng:Lcom/google/android/gms/internal/ads/zzayw;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzayo;->zzdnh:Lcom/google/android/gms/internal/ads/zzayn;

    return-void
.end method
