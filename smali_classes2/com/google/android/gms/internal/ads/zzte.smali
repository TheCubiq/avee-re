.class final Lcom/google/android/gms/internal/ads/zzte;
.super Lcom/google/android/gms/internal/ads/zzoe;


# instance fields
.field private final synthetic zzbnw:Lcom/google/android/gms/internal/ads/zzst;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzst;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzte;->zzbnw:Lcom/google/android/gms/internal/ads/zzst;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzoe;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzoa;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzte;->zzbnw:Lcom/google/android/gms/internal/ads/zzst;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzst;->zza(Lcom/google/android/gms/internal/ads/zzst;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zztf;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zztf;-><init>(Lcom/google/android/gms/internal/ads/zzte;Lcom/google/android/gms/internal/ads/zzoa;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
