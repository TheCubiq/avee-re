.class public final Lcom/daaw/u56;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/g77;

.field public final c:Lcom/daaw/ri6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/g77;Lcom/daaw/ri6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/u56;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/u56;->b:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/u56;->c:Lcom/daaw/ri6;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/v56;
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/daaw/u56;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/u56;->c:Lcom/daaw/ri6;

    invoke-virtual {v1}, Lcom/daaw/ri6;->b()Z

    move-result v7

    new-instance v1, Lcom/daaw/hv6;

    invoke-direct {v1}, Lcom/daaw/hv6;-><init>()V

    new-instance v2, Lcom/daaw/hv6;

    invoke-direct {v2}, Lcom/daaw/hv6;-><init>()V

    const/4 v3, 0x1

    if-eqz v7, :cond_0

    sget-object v4, Lcom/daaw/g93;->B2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v0, Lcom/daaw/v56;

    invoke-direct {v0, v3}, Lcom/daaw/v56;-><init>(Z)V

    goto/16 :goto_1

    :cond_0
    if-nez v7, :cond_1

    sget-object v4, Lcom/daaw/g93;->x2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    if-eqz v7, :cond_3

    sget-object v4, Lcom/daaw/g93;->z2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    invoke-static {v0}, Lcom/daaw/kv6;->k(Landroid/content/Context;)Lcom/daaw/kv6;

    move-result-object v1

    sget-object v4, Lcom/daaw/g93;->I2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v6

    invoke-interface {v6}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result v6

    invoke-virtual {v1, v4, v5, v6}, Lcom/daaw/kv6;->i(JZ)Lcom/daaw/hv6;

    move-result-object v1

    :cond_3
    if-nez v7, :cond_4

    sget-object v4, Lcom/daaw/g93;->y2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    if-eqz v7, :cond_6

    sget-object v4, Lcom/daaw/g93;->A2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_5
    invoke-static {v0}, Lcom/daaw/lv6;->j(Landroid/content/Context;)Lcom/daaw/lv6;

    move-result-object v0

    sget-object v2, Lcom/daaw/g93;->J2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v4

    invoke-virtual {v4}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object v4

    invoke-interface {v4}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result v4

    invoke-virtual {v0, v2, v3, v4}, Lcom/daaw/lv6;->i(JZ)Lcom/daaw/hv6;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/lv6;->p()Z

    move-result v3

    invoke-virtual {v0}, Lcom/daaw/lv6;->q()Z

    move-result v0

    move v6, v0

    move-object v4, v2

    move v5, v3

    goto :goto_0

    :cond_6
    move-object v4, v2

    const/4 v5, 0x1

    const/4 v6, 0x1

    :goto_0
    new-instance v0, Lcom/daaw/v56;

    move-object v2, v0

    move-object v3, v1

    invoke-direct/range {v2 .. v7}, Lcom/daaw/v56;-><init>(Lcom/daaw/hv6;Lcom/daaw/hv6;ZZZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    const-string v2, "PerAppIdSignal"

    invoke-virtual {v1, v0, v2}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/v56;

    iget-object v1, p0, Lcom/daaw/u56;->c:Lcom/daaw/ri6;

    invoke-virtual {v1}, Lcom/daaw/ri6;->b()Z

    move-result v1

    invoke-direct {v0, v1}, Lcom/daaw/v56;-><init>(Z)V

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x35

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/u56;->b:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/t56;

    invoke-direct {v1, p0}, Lcom/daaw/t56;-><init>(Lcom/daaw/u56;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
