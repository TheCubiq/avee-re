.class final Lcom/google/android/gms/internal/ads/zzabz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzcal:Lcom/google/android/gms/internal/ads/zzabv;

.field private final synthetic zzcam:Lcom/google/android/gms/internal/ads/zzos;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzos;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabz;->zzcal:Lcom/google/android/gms/internal/ads/zzabv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabz;->zzcam:Lcom/google/android/gms/internal/ads/zzos;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string p1, "asset"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzabz;->zzcal:Lcom/google/android/gms/internal/ads/zzabv;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabz;->zzcam:Lcom/google/android/gms/internal/ads/zzos;

    invoke-static {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzqs;Ljava/lang/String;)V

    return-void
.end method
