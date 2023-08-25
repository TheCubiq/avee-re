.class public final Lcom/daaw/uo2;
.super Lcom/daaw/ku2;
.source ""


# instance fields
.field public final synthetic b:Landroid/widget/FrameLayout;

.field public final synthetic c:Landroid/widget/FrameLayout;

.field public final synthetic d:Landroid/content/Context;

.field public final synthetic e:Lcom/google/android/gms/ads/internal/client/zzaw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzaw;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uo2;->e:Lcom/google/android/gms/ads/internal/client/zzaw;

    iput-object p2, p0, Lcom/daaw/uo2;->b:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lcom/daaw/uo2;->c:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lcom/daaw/uo2;->d:Landroid/content/Context;

    invoke-direct {p0}, Lcom/daaw/ku2;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/uo2;->d:Landroid/content/Context;

    const-string v1, "native_ad_view_delegate"

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzaw;->i(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzez;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzez;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/ads/internal/client/zzce;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/uo2;->b:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uo2;->c:Landroid/widget/FrameLayout;

    invoke-static {v1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/ads/internal/client/zzce;->zzi(Lcom/daaw/yd0;Lcom/daaw/yd0;)Lcom/daaw/zc3;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/daaw/uo2;->d:Landroid/content/Context;

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
    iget-object v0, p0, Lcom/daaw/uo2;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uo2;->b:Landroid/widget/FrameLayout;

    invoke-static {v1}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/uo2;->c:Landroid/widget/FrameLayout;

    invoke-static {v2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/uo2;->d:Landroid/content/Context;

    const-string v4, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl"

    sget-object v5, Lcom/google/android/gms/ads/internal/client/zzar;->zza:Lcom/google/android/gms/ads/internal/client/zzar;

    invoke-static {v3, v4, v5}, Lcom/daaw/o04;->b(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/m04;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/cd3;

    const v4, 0xd601280

    invoke-interface {v3, v0, v1, v2, v4}, Lcom/daaw/cd3;->g1(Lcom/daaw/yd0;Lcom/daaw/yd0;Lcom/daaw/yd0;I)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/yc3;->zzbD(Landroid/os/IBinder;)Lcom/daaw/zc3;

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
    iget-object v1, p0, Lcom/daaw/uo2;->e:Lcom/google/android/gms/ads/internal/client/zzaw;

    iget-object v2, p0, Lcom/daaw/uo2;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/daaw/et3;->c(Landroid/content/Context;)Lcom/daaw/gt3;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/android/gms/ads/internal/client/zzaw;->h(Lcom/google/android/gms/ads/internal/client/zzaw;Lcom/daaw/gt3;)V

    iget-object v1, p0, Lcom/daaw/uo2;->e:Lcom/google/android/gms/ads/internal/client/zzaw;

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/client/zzaw;->g(Lcom/google/android/gms/ads/internal/client/zzaw;)Lcom/daaw/gt3;

    move-result-object v1

    const-string v2, "ClientApiBroker.createNativeAdViewDelegate"

    invoke-interface {v1, v0, v2}, Lcom/daaw/gt3;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/uo2;->e:Lcom/google/android/gms/ads/internal/client/zzaw;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/client/zzaw;->d(Lcom/google/android/gms/ads/internal/client/zzaw;)Lcom/daaw/af3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/uo2;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/uo2;->b:Landroid/widget/FrameLayout;

    iget-object v3, p0, Lcom/daaw/uo2;->c:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/af3;->c(Landroid/content/Context;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)Lcom/daaw/zc3;

    move-result-object v0

    :goto_1
    return-object v0
.end method
