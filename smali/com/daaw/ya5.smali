.class public final Lcom/daaw/ya5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/kj6;

.field public final b:Lcom/daaw/sa5;


# direct methods
.method public constructor <init>(Lcom/daaw/kj6;Lcom/daaw/sa5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ya5;->a:Lcom/daaw/kj6;

    iput-object p2, p0, Lcom/daaw/ya5;->b:Lcom/daaw/sa5;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/an3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ya5;->a:Lcom/daaw/kj6;

    invoke-virtual {v0}, Lcom/daaw/kj6;->b()Lcom/daaw/an3;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "Unexpected call to adapter creator."

    invoke-static {v0}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final b(Ljava/lang/String;)Lcom/daaw/dp3;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ya5;->a()Lcom/daaw/an3;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/daaw/an3;->m(Ljava/lang/String;)Lcom/daaw/dp3;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ya5;->b:Lcom/daaw/sa5;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/sa5;->e(Ljava/lang/String;Lcom/daaw/dp3;)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/daaw/oj6;
    .locals 5

    const-string v0, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"

    :try_start_0
    new-instance v1, Lcom/daaw/oj6;

    const-string v2, "com.google.ads.mediation.admob.AdMobAdapter"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance p2, Lcom/daaw/do3;

    new-instance v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-direct {v0}, Lcom/google/ads/mediation/admob/AdMobAdapter;-><init>()V

    invoke-direct {p2, v0}, Lcom/daaw/do3;-><init>(Lcom/google/android/gms/ads/mediation/MediationAdapter;)V

    goto :goto_0

    :cond_0
    const-string v2, "com.google.ads.mediation.admob.AdMobCustomTabsAdapter"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p2, Lcom/daaw/do3;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbyi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbyi;-><init>()V

    invoke-direct {p2, v0}, Lcom/daaw/do3;-><init>(Lcom/google/android/gms/ads/mediation/MediationAdapter;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/ya5;->a()Lcom/daaw/an3;

    move-result-object v2

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "com.google.ads.mediation.customevent.CustomEventAdapter"

    if-nez v3, :cond_2

    :try_start_1
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_5

    :cond_2
    :try_start_2
    const-string v3, "class_name"

    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v2, p2}, Lcom/daaw/an3;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2, v0}, Lcom/daaw/an3;->zzb(Ljava/lang/String;)Lcom/daaw/dn3;

    move-result-object p2

    goto :goto_0

    :cond_3
    invoke-interface {v2, p2}, Lcom/daaw/an3;->l(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2, p2}, Lcom/daaw/an3;->zzb(Ljava/lang/String;)Lcom/daaw/dn3;

    move-result-object p2

    goto :goto_0

    :cond_4
    invoke-interface {v2, v4}, Lcom/daaw/an3;->zzb(Ljava/lang/String;)Lcom/daaw/dn3;

    move-result-object p2
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p2

    :try_start_3
    const-string v0, "Invalid custom event."

    invoke-static {v0, p2}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-interface {v2, p1}, Lcom/daaw/an3;->zzb(Ljava/lang/String;)Lcom/daaw/dn3;

    move-result-object p2

    :goto_0
    invoke-direct {v1, p2}, Lcom/daaw/oj6;-><init>(Lcom/daaw/dn3;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object p2, p0, Lcom/daaw/ya5;->b:Lcom/daaw/sa5;

    invoke-virtual {p2, p1, v1}, Lcom/daaw/sa5;->d(Ljava/lang/String;Lcom/daaw/oj6;)V

    return-object v1

    :catchall_0
    move-exception p2

    sget-object v0, Lcom/daaw/g93;->s8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/daaw/ya5;->b:Lcom/daaw/sa5;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/daaw/sa5;->d(Ljava/lang/String;Lcom/daaw/oj6;)V

    :cond_6
    new-instance p1, Lcom/daaw/wi6;

    invoke-direct {p1, p2}, Lcom/daaw/wi6;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ya5;->a:Lcom/daaw/kj6;

    invoke-virtual {v0}, Lcom/daaw/kj6;->b()Lcom/daaw/an3;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
