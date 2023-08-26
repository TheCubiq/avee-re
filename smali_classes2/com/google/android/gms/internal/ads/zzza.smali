.class final Lcom/google/android/gms/internal/ads/zzza;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzbvd:Lcom/google/android/gms/internal/ads/zzyq;

.field private final synthetic zzbve:Lcom/google/ads/AdRequest$ErrorCode;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzyq;Lcom/google/ads/AdRequest$ErrorCode;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzza;->zzbvd:Lcom/google/android/gms/internal/ads/zzyq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzza;->zzbve:Lcom/google/ads/AdRequest$ErrorCode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzza;->zzbvd:Lcom/google/android/gms/internal/ads/zzyq;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzyq;->zza(Lcom/google/android/gms/internal/ads/zzyq;)Lcom/google/android/gms/internal/ads/zzxt;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzza;->zzbve:Lcom/google/ads/AdRequest$ErrorCode;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzzc;->zza(Lcom/google/ads/AdRequest$ErrorCode;)I

    move-result v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzxt;->onAdFailedToLoad(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzane;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
