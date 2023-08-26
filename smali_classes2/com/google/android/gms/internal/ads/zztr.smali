.class final Lcom/google/android/gms/internal/ads/zztr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbob:Lcom/google/android/gms/internal/ads/zzts;

.field private final synthetic zzboc:Lcom/google/android/gms/internal/ads/zztt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzst;Lcom/google/android/gms/internal/ads/zzts;Lcom/google/android/gms/internal/ads/zztt;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zztr;->zzbob:Lcom/google/android/gms/internal/ads/zzts;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zztr;->zzboc:Lcom/google/android/gms/internal/ads/zztt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zztr;->zzbob:Lcom/google/android/gms/internal/ads/zzts;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zztr;->zzboc:Lcom/google/android/gms/internal/ads/zztt;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzts;->zzb(Lcom/google/android/gms/internal/ads/zztt;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not propagate interstitial ad event."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
