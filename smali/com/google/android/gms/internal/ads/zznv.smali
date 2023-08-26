.class public final Lcom/google/android/gms/internal/ads/zznv;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final zzbgj:J

.field private final zzbgk:Ljava/lang/String;

.field private final zzbgl:Lcom/google/android/gms/internal/ads/zznv;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lcom/google/android/gms/internal/ads/zznv;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zznv;->zzbgj:J

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zznv;->zzbgk:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zznv;->zzbgl:Lcom/google/android/gms/internal/ads/zznv;

    return-void
.end method


# virtual methods
.method public final getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zznv;->zzbgj:J

    return-wide v0
.end method

.method public final zzjg()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zznv;->zzbgk:Ljava/lang/String;

    return-object v0
.end method

.method public final zzjh()Lcom/google/android/gms/internal/ads/zznv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zznv;->zzbgl:Lcom/google/android/gms/internal/ads/zznv;

    return-object v0
.end method
