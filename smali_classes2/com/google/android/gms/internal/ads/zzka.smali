.class final Lcom/google/android/gms/internal/ads/zzka;
.super Lcom/google/android/gms/internal/ads/zzjr$zza;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzjr$zza<",
        "Lcom/google/android/gms/internal/ads/zzaap;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic val$activity:Landroid/app/Activity;

.field private final synthetic zzart:Lcom/google/android/gms/internal/ads/zzjr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzjr;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzka;->zzart:Lcom/google/android/gms/internal/ads/zzjr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzka;->val$activity:Landroid/app/Activity;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzjr$zza;-><init>(Lcom/google/android/gms/internal/ads/zzjr;)V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzld;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzka;->val$activity:Landroid/app/Activity;

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzld;->createAdOverlay(Lcom/google/android/gms/dynamic/IObjectWrapper;)Lcom/google/android/gms/internal/ads/zzaap;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzib()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzka;->zzart:Lcom/google/android/gms/internal/ads/zzjr;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzjr;->zzh(Lcom/google/android/gms/internal/ads/zzjr;)Lcom/google/android/gms/internal/ads/zzaao;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzka;->val$activity:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaao;->zze(Landroid/app/Activity;)Lcom/google/android/gms/internal/ads/zzaap;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzka;->zzart:Lcom/google/android/gms/internal/ads/zzjr;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzka;->val$activity:Landroid/app/Activity;

    const-string v2, "ad_overlay"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzjr;->zza(Lcom/google/android/gms/internal/ads/zzjr;Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
