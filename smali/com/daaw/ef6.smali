.class public final Lcom/daaw/ef6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Landroid/content/Context;Lcom/daaw/bk6;Lcom/daaw/vk6;)Lcom/daaw/cf6;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/ef6;->c(Landroid/content/Context;Lcom/daaw/bk6;Lcom/daaw/vk6;)Lcom/daaw/cf6;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lcom/daaw/bk6;Lcom/daaw/vk6;)Lcom/daaw/cf6;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/daaw/ef6;->c(Landroid/content/Context;Lcom/daaw/bk6;Lcom/daaw/vk6;)Lcom/daaw/cf6;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;Lcom/daaw/bk6;Lcom/daaw/vk6;)Lcom/daaw/cf6;
    .locals 6

    sget-object v0, Lcom/daaw/g93;->M5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzh()Lcom/daaw/kz3;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/util/zzg;->zzi()Lcom/daaw/kz3;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/kz3;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    sget-object v0, Lcom/daaw/g93;->c6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, Lcom/daaw/g93;->L5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v1, :cond_3

    :cond_2
    new-instance v0, Lcom/daaw/ae6;

    invoke-direct {v0}, Lcom/daaw/ae6;-><init>()V

    sget-object v1, Lcom/daaw/jk6;->r:Lcom/daaw/jk6;

    new-instance v2, Lcom/daaw/de6;

    invoke-direct {v2, v0}, Lcom/daaw/de6;-><init>(Lcom/daaw/cf6;)V

    invoke-virtual {p2, v1, p0, p1, v2}, Lcom/daaw/vk6;->a(Lcom/daaw/jk6;Landroid/content/Context;Lcom/daaw/bk6;Lcom/daaw/bl6;)Lcom/daaw/uk6;

    move-result-object p0

    new-instance p1, Lcom/daaw/fe6;

    new-instance v1, Lcom/daaw/pe6;

    new-instance p2, Lcom/daaw/oe6;

    invoke-direct {p2}, Lcom/daaw/oe6;-><init>()V

    invoke-direct {v1, p2}, Lcom/daaw/pe6;-><init>(Lcom/daaw/cf6;)V

    new-instance v2, Lcom/daaw/le6;

    iget-object p2, p0, Lcom/daaw/uk6;->a:Lcom/daaw/fk6;

    sget-object v5, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-direct {v2, p2, v5}, Lcom/daaw/le6;-><init>(Lcom/daaw/fk6;Ljava/util/concurrent/Executor;)V

    iget-object v3, p0, Lcom/daaw/uk6;->b:Lcom/daaw/dl6;

    iget-object p0, p0, Lcom/daaw/uk6;->a:Lcom/daaw/fk6;

    invoke-interface {p0}, Lcom/daaw/fk6;->zza()Lcom/google/android/gms/internal/ads/zzfkz;

    move-result-object p0

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfkz;->w:Ljava/lang/String;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/fe6;-><init>(Lcom/daaw/cf6;Lcom/daaw/cf6;Lcom/daaw/dl6;Ljava/lang/String;Ljava/util/concurrent/Executor;)V

    return-object p1

    :cond_3
    new-instance p0, Lcom/daaw/oe6;

    invoke-direct {p0}, Lcom/daaw/oe6;-><init>()V

    return-object p0
.end method
