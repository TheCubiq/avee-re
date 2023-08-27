.class final Lcom/google/android/gms/internal/ads/zztc;
.super Lcom/google/android/gms/internal/ads/zzlb;


# instance fields
.field private final synthetic zzbnw:Lcom/google/android/gms/internal/ads/zzst;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzst;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztc;->zzbnw:Lcom/google/android/gms/internal/ads/zzst;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzlb;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztc;->zzbnw:Lcom/google/android/gms/internal/ads/zzst;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzst;->zza(Lcom/google/android/gms/internal/ads/zzst;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zztd;

    invoke-direct {v1, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zztd;-><init>(Lcom/google/android/gms/internal/ads/zztc;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
