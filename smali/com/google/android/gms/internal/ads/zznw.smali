.class public final Lcom/google/android/gms/internal/ads/zznw;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final zzbgm:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zznv;",
            ">;"
        }
    .end annotation
.end field

.field private final zzvr:Lcom/google/android/gms/internal/ads/zznx;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zznx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zznw;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zznw;->zzbgm:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zznv;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zznw;->zzbgm:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final zza(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zznw;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zznw;->zzbgm:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/ads/zznv;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2, p3, p4, v1}, Lcom/google/android/gms/internal/ads/zznx;->zza(Lcom/google/android/gms/internal/ads/zznv;J[Ljava/lang/String;)Z

    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zznw;->zzbgm:Ljava/util/Map;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zznw;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    if-nez v0, :cond_2

    const/4 p3, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p3, p4}, Lcom/google/android/gms/internal/ads/zznx;->zzd(J)Lcom/google/android/gms/internal/ads/zznv;

    move-result-object p3

    :goto_1
    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final zzji()Lcom/google/android/gms/internal/ads/zznx;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zznw;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    return-object v0
.end method
