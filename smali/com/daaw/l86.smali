.class public final Lcom/daaw/l86;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:I

.field public final e:Z

.field public final f:Z

.field public final g:Lcom/daaw/hz3;


# direct methods
.method public constructor <init>(Lcom/daaw/hz3;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;IZZ[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l86;->g:Lcom/daaw/hz3;

    iput-object p2, p0, Lcom/daaw/l86;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/l86;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lcom/daaw/l86;->c:Ljava/util/concurrent/Executor;

    iput p5, p0, Lcom/daaw/l86;->d:I

    iput-boolean p6, p0, Lcom/daaw/l86;->e:Z

    iput-boolean p7, p0, Lcom/daaw/l86;->f:Z

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;)Lcom/daaw/m86;
    .locals 7

    new-instance v0, Lcom/daaw/hv6;

    invoke-direct {v0}, Lcom/daaw/hv6;-><init>()V

    iget-boolean v1, p0, Lcom/daaw/l86;->e:Z

    if-nez v1, :cond_0

    sget-object v1, Lcom/daaw/g93;->E2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/l86;->e:Z

    if-eqz v1, :cond_2

    sget-object v1, Lcom/daaw/g93;->F2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/daaw/l86;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/kv6;->k(Landroid/content/Context;)Lcom/daaw/kv6;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/l86;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lcom/daaw/g93;->I2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-boolean v6, p0, Lcom/daaw/l86;->f:Z

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/kv6;->j(Ljava/lang/String;Ljava/lang/String;JZ)Lcom/daaw/hv6;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v1

    const-string v2, "AdIdInfoSignalSource.getPaidV1"

    invoke-virtual {v1, v0, v2}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/hv6;

    invoke-direct {v0}, Lcom/daaw/hv6;-><init>()V

    :cond_2
    :goto_1
    new-instance v1, Lcom/daaw/m86;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2, v0}, Lcom/daaw/m86;-><init>(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;Ljava/lang/String;Lcom/daaw/hv6;)V

    return-object v1
.end method

.method public final synthetic b(Ljava/lang/Throwable;)Lcom/daaw/m86;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzb()Lcom/daaw/d04;

    iget-object p1, p0, Lcom/daaw/l86;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    const-string v1, "android_id"

    invoke-static {p1, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    new-instance v1, Lcom/daaw/m86;

    new-instance v2, Lcom/daaw/hv6;

    invoke-direct {v2}, Lcom/daaw/hv6;-><init>()V

    invoke-direct {v1, v0, p1, v2}, Lcom/daaw/m86;-><init>(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;Ljava/lang/String;Lcom/daaw/hv6;)V

    return-object v1
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x28

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 5

    sget-object v0, Lcom/daaw/g93;->O0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/l86;->g:Lcom/daaw/hz3;

    iget-object v1, p0, Lcom/daaw/l86;->a:Landroid/content/Context;

    iget v2, p0, Lcom/daaw/l86;->d:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/hz3;->a(Landroid/content/Context;I)Lcom/daaw/f77;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object v0

    new-instance v1, Lcom/daaw/v76;

    invoke-direct {v1, p0}, Lcom/daaw/v76;-><init>(Lcom/daaw/l86;)V

    iget-object v2, p0, Lcom/daaw/l86;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    sget-object v1, Lcom/daaw/g93;->P0:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v4, p0, Lcom/daaw/l86;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v0

    check-cast v0, Lcom/daaw/j67;

    new-instance v1, Lcom/daaw/k86;

    invoke-direct {v1, p0}, Lcom/daaw/k86;-><init>(Lcom/daaw/l86;)V

    const-class v2, Ljava/lang/Throwable;

    iget-object v3, p0, Lcom/daaw/l86;->c:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2, v1, v3}, Lcom/daaw/s67;->f(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Did not ad Ad ID into query param."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
