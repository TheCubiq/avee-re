.class final Lcom/google/android/gms/ads/internal/zzax;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv<",
        "Lcom/google/android/gms/internal/ads/zzaqw;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzzr:Lcom/google/android/gms/internal/ads/zzxz;

.field private final synthetic zzzs:Lcom/google/android/gms/ads/internal/zzac;

.field private final synthetic zzzt:Lcom/google/android/gms/internal/ads/zzyc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzxz;Lcom/google/android/gms/ads/internal/zzac;Lcom/google/android/gms/internal/ads/zzyc;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzr:Lcom/google/android/gms/internal/ads/zzxz;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzs:Lcom/google/android/gms/ads/internal/zzac;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzt:Lcom/google/android/gms/internal/ads/zzyc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaqw;->getView()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzr:Lcom/google/android/gms/internal/ads/zzxz;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzr:Lcom/google/android/gms/internal/ads/zzxz;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzxz;->getOverrideClickHandling()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzr:Lcom/google/android/gms/internal/ads/zzxz;

    invoke-static {p2}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzxz;->zzj(Lcom/google/android/gms/dynamic/IObjectWrapper;)V

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzs:Lcom/google/android/gms/ads/internal/zzac;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzac;->zzxl:Lcom/google/android/gms/ads/internal/zzy;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zza;->onAdClicked()V

    return-void

    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/zzas;->zze(Lcom/google/android/gms/internal/ads/zzaqw;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzt:Lcom/google/android/gms/internal/ads/zzyc;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzt:Lcom/google/android/gms/internal/ads/zzyc;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzyc;->getOverrideClickHandling()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzt:Lcom/google/android/gms/internal/ads/zzyc;

    invoke-static {p2}, Lcom/google/android/gms/dynamic/ObjectWrapper;->wrap(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzyc;->zzj(Lcom/google/android/gms/dynamic/IObjectWrapper;)V

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzax;->zzzs:Lcom/google/android/gms/ads/internal/zzac;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzac;->zzxl:Lcom/google/android/gms/ads/internal/zzy;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zza;->onAdClicked()V

    return-void

    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/zzas;->zze(Lcom/google/android/gms/internal/ads/zzaqw;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-void

    :catch_0
    move-exception p1

    const-string p2, "Unable to call handleClick on mapper"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-void
.end method
