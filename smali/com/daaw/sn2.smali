.class public final Lcom/daaw/sn2;
.super Lcom/daaw/no2;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V
    .locals 7

    const-string v2, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3"

    const-string v3, "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg="

    const/16 v6, 0x18

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/no2;-><init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/no2;->b:Lcom/daaw/wm2;

    invoke-virtual {v0}, Lcom/daaw/wm2;->q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v2, p0, Lcom/daaw/no2;->f:Ljava/lang/reflect/Method;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/daaw/no2;->b:Lcom/daaw/wm2;

    invoke-virtual {v5}, Lcom/daaw/wm2;->b()Landroid/content/Context;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/daaw/hi2;->q0(Ljava/lang/String;)Lcom/daaw/hi2;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/sn2;->c()V

    return-void
.end method

.method public final b()Ljava/lang/Void;
    .locals 2

    iget-object v0, p0, Lcom/daaw/no2;->b:Lcom/daaw/wm2;

    invoke-virtual {v0}, Lcom/daaw/wm2;->r()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/daaw/no2;->b()Ljava/lang/Void;

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/no2;->b:Lcom/daaw/wm2;

    invoke-virtual {v0}, Lcom/daaw/wm2;->q()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/sn2;->c()V

    :cond_1
    return-object v1
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/no2;->b:Lcom/daaw/wm2;

    invoke-virtual {v0}, Lcom/daaw/wm2;->h()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getInfo()Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/an2;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    monitor-enter v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v3, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    invoke-virtual {v3, v1}, Lcom/daaw/hi2;->q0(Ljava/lang/String;)Lcom/daaw/hi2;

    iget-object v1, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/daaw/hi2;->p0(Z)Lcom/daaw/hi2;

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lcom/daaw/hi2;->U(I)Lcom/daaw/hi2;

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/no2;->b()Ljava/lang/Void;

    const/4 v0, 0x0

    return-object v0
.end method
