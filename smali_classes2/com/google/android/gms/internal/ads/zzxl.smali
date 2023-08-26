.class final Lcom/google/android/gms/internal/ads/zzxl;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbun:Lcom/google/android/gms/internal/ads/zzxe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzxk;Lcom/google/android/gms/internal/ads/zzxe;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzxl;->zzbun:Lcom/google/android/gms/internal/ads/zzxe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzxl;->zzbun:Lcom/google/android/gms/internal/ads/zzxe;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzxe;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzxq;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not destroy mediation adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
