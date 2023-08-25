.class public final Lcom/daaw/vx5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/c06;


# direct methods
.method public constructor <init>(Lcom/daaw/c06;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vx5;->p:Lcom/daaw/c06;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vx5;->p:Lcom/daaw/c06;

    iget-object v0, v0, Lcom/daaw/c06;->p:Lcom/google/android/gms/ads/internal/client/zzeu;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/zzeu;->g3(Lcom/google/android/gms/ads/internal/client/zzeu;)Lcom/google/android/gms/ads/internal/client/zzbh;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/zzeu;->g3(Lcom/google/android/gms/ads/internal/client/zzeu;)Lcom/google/android/gms/ads/internal/client/zzbh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzbh;->zze(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not notify onAdFailedToLoad event."

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
