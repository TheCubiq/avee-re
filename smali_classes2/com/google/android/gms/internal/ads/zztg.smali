.class final Lcom/google/android/gms/internal/ads/zztg;
.super Lcom/google/android/gms/internal/ads/zzkf;


# instance fields
.field private final synthetic zzbnw:Lcom/google/android/gms/internal/ads/zzst;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzst;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztg;->zzbnw:Lcom/google/android/gms/internal/ads/zzst;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzkf;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztg;->zzbnw:Lcom/google/android/gms/internal/ads/zzst;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzst;->zza(Lcom/google/android/gms/internal/ads/zzst;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzth;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzth;-><init>(Lcom/google/android/gms/internal/ads/zztg;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
