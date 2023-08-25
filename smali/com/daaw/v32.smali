.class public final Lcom/daaw/v32;
.super Lcom/daaw/ku2;
.source ""


# instance fields
.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lcom/google/android/gms/ads/internal/client/zzaw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzaw;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v32;->c:Lcom/google/android/gms/ads/internal/client/zzaw;

    iput-object p2, p0, Lcom/daaw/v32;->b:Landroid/app/Activity;

    invoke-direct {p0}, Lcom/daaw/ku2;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/v32;->b:Landroid/app/Activity;

    const-string v1, "ad_overlay"

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzaw;->i(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/ads/internal/client/zzce;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v32;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/ads/internal/client/zzce;->zzm(Lcom/daaw/yd0;)Lcom/daaw/hr3;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/v32;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/daaw/g93;->c(Landroid/content/Context;)V

    sget-object v0, Lcom/daaw/g93;->S8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/v32;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/v32;->b:Landroid/app/Activity;

    const-string v2, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl"

    sget-object v3, Lcom/google/android/gms/ads/internal/client/zzz;->zza:Lcom/google/android/gms/ads/internal/client/zzz;

    invoke-static {v1, v2, v3}, Lcom/daaw/o04;->b(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m04;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/kr3;

    invoke-interface {v1, v0}, Lcom/daaw/kr3;->zze(Lcom/daaw/yd0;)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/gr3;->zzF(Landroid/os/IBinder;)Lcom/daaw/hr3;

    move-result-object v0
    :try_end_0
    .catch Lcom/daaw/n04; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    iget-object v1, p0, Lcom/daaw/v32;->c:Lcom/google/android/gms/ads/internal/client/zzaw;

    iget-object v2, p0, Lcom/daaw/v32;->b:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/et3;->c(Landroid/content/Context;)Lcom/daaw/gt3;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/ads/internal/client/zzaw;->h(Lcom/google/android/gms/ads/internal/client/zzaw;Lcom/daaw/gt3;)V

    iget-object v1, p0, Lcom/daaw/v32;->c:Lcom/google/android/gms/ads/internal/client/zzaw;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/client/zzaw;->g(Lcom/google/android/gms/ads/internal/client/zzaw;)Lcom/daaw/gt3;

    move-result-object v1

    const-string v2, "ClientApiBroker.createAdOverlay"

    invoke-interface {v1, v0, v2}, Lcom/daaw/gt3;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/v32;->c:Lcom/google/android/gms/ads/internal/client/zzaw;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/zzaw;->f(Lcom/google/android/gms/ads/internal/client/zzaw;)Lcom/daaw/er3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/v32;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/daaw/er3;->c(Landroid/app/Activity;)Lcom/daaw/hr3;

    move-result-object v0

    :goto_1
    return-object v0
.end method
