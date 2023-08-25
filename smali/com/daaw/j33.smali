.class public final Lcom/daaw/j33;
.super Lcom/google/android/gms/ads/internal/zzc;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/pa$a;Lcom/daaw/pa$b;)V
    .locals 7

    invoke-static {p1}, Lcom/daaw/av3;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    const/16 v3, 0x7b

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/zzc;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/daaw/pa$a;Lcom/daaw/pa$b;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final J()Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/pa;->getAvailableFeatures()[Lcom/google/android/gms/common/Feature;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/google/android/gms/ads/zzg;->zza:Lcom/google/android/gms/common/Feature;

    invoke-static {v0, v1}, Lcom/daaw/k6;->c([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final K()Lcom/daaw/l33;
    .locals 1

    invoke-super {p0}, Lcom/daaw/pa;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/daaw/l33;

    return-object v0
.end method

.method public final synthetic e(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.cache.ICacheService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/l33;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/daaw/l33;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/l33;

    invoke-direct {v0, p1}, Lcom/daaw/l33;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final getApiFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    sget-object v0, Lcom/google/android/gms/ads/zzg;->zzb:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.cache.ICacheService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.ads.service.CACHE"

    return-object v0
.end method
