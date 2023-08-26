.class final Lcom/google/android/gms/internal/ads/zzfl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
        "Lcom/google/android/gms/internal/ads/zzwb;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzaga:Lcom/google/android/gms/internal/ads/zzff;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzff;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfl;->zzaga:Lcom/google/android/gms/internal/ads/zzff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfl;->zzaga:Lcom/google/android/gms/internal/ads/zzff;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzff;->zza(Lcom/google/android/gms/internal/ads/zzff;)Lcom/google/android/gms/internal/ads/zzet;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzet;->zzc(Ljava/util/Map;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfl;->zzaga:Lcom/google/android/gms/internal/ads/zzff;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzff;->zza(Lcom/google/android/gms/internal/ads/zzff;)Lcom/google/android/gms/internal/ads/zzet;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfl;->zzaga:Lcom/google/android/gms/internal/ads/zzff;

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzet;->zza(Lcom/google/android/gms/internal/ads/zzfo;Ljava/util/Map;)V

    :cond_0
    return-void
.end method
