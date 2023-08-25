.class public final Lcom/daaw/jl3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/google/android/gms/internal/ads/zzchu;

.field public final e:Lcom/daaw/vo6;

.field public final f:Lcom/google/android/gms/ads/internal/util/zzbb;

.field public final g:Lcom/google/android/gms/ads/internal/util/zzbb;

.field public h:Lcom/daaw/il3;

.field public i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/zzbb;Lcom/google/android/gms/ads/internal/util/zzbb;Lcom/daaw/vo6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/jl3;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/jl3;->i:I

    iput-object p3, p0, Lcom/daaw/jl3;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/jl3;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/jl3;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p6, p0, Lcom/daaw/jl3;->e:Lcom/daaw/vo6;

    iput-object p4, p0, Lcom/daaw/jl3;->f:Lcom/google/android/gms/ads/internal/util/zzbb;

    iput-object p5, p0, Lcom/daaw/jl3;->g:Lcom/google/android/gms/ads/internal/util/zzbb;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/jl3;)I
    .locals 0

    iget p0, p0, Lcom/daaw/jl3;->i:I

    return p0
.end method

.method public static bridge synthetic c(Lcom/daaw/jl3;)Lcom/daaw/il3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jl3;->h:Lcom/daaw/il3;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/jl3;)Lcom/daaw/vo6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jl3;->e:Lcom/daaw/vo6;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/daaw/jl3;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jl3;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/jl3;Lcom/daaw/il3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jl3;->h:Lcom/daaw/il3;

    return-void
.end method

.method public static bridge synthetic h(Lcom/daaw/jl3;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/jl3;->i:I

    return-void
.end method


# virtual methods
.method public final b(Lcom/daaw/sl2;)Lcom/daaw/al3;
    .locals 4

    iget-object p1, p0, Lcom/daaw/jl3;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/jl3;->a:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/daaw/jl3;->h:Lcom/daaw/il3;

    if-eqz v1, :cond_0

    iget v2, p0, Lcom/daaw/jl3;->i:I

    if-nez v2, :cond_0

    new-instance v2, Lcom/daaw/lk3;

    invoke-direct {v2, p0}, Lcom/daaw/lk3;-><init>(Lcom/daaw/jl3;)V

    sget-object v3, Lcom/daaw/mk3;->a:Lcom/daaw/mk3;

    invoke-virtual {v1, v2, v3}, Lcom/daaw/l14;->e(Lcom/daaw/i14;Lcom/daaw/g14;)V

    :cond_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/daaw/jl3;->h:Lcom/daaw/il3;

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/daaw/l14;->a()I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/daaw/jl3;->i:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/jl3;->h:Lcom/daaw/il3;

    invoke-virtual {v0}, Lcom/daaw/il3;->f()Lcom/daaw/al3;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_2
    const/4 v3, 0x1

    if-ne v0, v3, :cond_3

    iput v2, p0, Lcom/daaw/jl3;->i:I

    invoke-virtual {p0, v1}, Lcom/daaw/jl3;->d(Lcom/daaw/sl2;)Lcom/daaw/il3;

    iget-object v0, p0, Lcom/daaw/jl3;->h:Lcom/daaw/il3;

    invoke-virtual {v0}, Lcom/daaw/il3;->f()Lcom/daaw/al3;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_3
    iget-object v0, p0, Lcom/daaw/jl3;->h:Lcom/daaw/il3;

    invoke-virtual {v0}, Lcom/daaw/il3;->f()Lcom/daaw/al3;

    move-result-object v0

    monitor-exit p1

    return-object v0

    :cond_4
    :goto_0
    iput v2, p0, Lcom/daaw/jl3;->i:I

    invoke-virtual {p0, v1}, Lcom/daaw/jl3;->d(Lcom/daaw/sl2;)Lcom/daaw/il3;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/jl3;->h:Lcom/daaw/il3;

    invoke-virtual {v0}, Lcom/daaw/il3;->f()Lcom/daaw/al3;

    move-result-object v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v1

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public final d(Lcom/daaw/sl2;)Lcom/daaw/il3;
    .locals 4

    iget-object p1, p0, Lcom/daaw/jl3;->b:Landroid/content/Context;

    const/4 v0, 0x6

    invoke-static {p1, v0}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    new-instance v0, Lcom/daaw/il3;

    iget-object v1, p0, Lcom/daaw/jl3;->g:Lcom/google/android/gms/ads/internal/util/zzbb;

    invoke-direct {v0, v1}, Lcom/daaw/il3;-><init>(Lcom/google/android/gms/ads/internal/util/zzbb;)V

    sget-object v1, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v2, Lcom/daaw/nk3;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/daaw/nk3;-><init>(Lcom/daaw/jl3;Lcom/daaw/sl2;Lcom/daaw/il3;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Lcom/daaw/vk3;

    invoke-direct {v1, p0, v0, p1}, Lcom/daaw/vk3;-><init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/io6;)V

    new-instance v2, Lcom/daaw/wk3;

    invoke-direct {v2, p0, v0, p1}, Lcom/daaw/wk3;-><init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/io6;)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/l14;->e(Lcom/daaw/i14;Lcom/daaw/g14;)V

    return-object v0
.end method

.method public final synthetic i(Lcom/daaw/il3;Lcom/daaw/bk3;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/jl3;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/l14;->a()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p1}, Lcom/daaw/l14;->a()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/l14;->c()V

    sget-object p1, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/qk3;

    invoke-direct {v1, p2}, Lcom/daaw/qk3;-><init>(Lcom/daaw/bk3;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    const-string p1, "Could not receive loaded message in a timely manner. Rejecting."

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic j(Lcom/daaw/sl2;Lcom/daaw/il3;)V
    .locals 3

    :try_start_0
    iget-object p1, p0, Lcom/daaw/jl3;->b:Landroid/content/Context;

    iget-object v0, p0, Lcom/daaw/jl3;->d:Lcom/google/android/gms/internal/ads/zzchu;

    new-instance v1, Lcom/daaw/jk3;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2, v2}, Lcom/daaw/jk3;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/sl2;Lcom/google/android/gms/ads/internal/zza;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p1, Lcom/daaw/pk3;

    invoke-direct {p1, p0, p2, v1}, Lcom/daaw/pk3;-><init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/bk3;)V

    invoke-interface {v1, p1}, Lcom/daaw/bk3;->m(Lcom/daaw/pk3;)V

    new-instance p1, Lcom/daaw/rk3;

    invoke-direct {p1, p0, p2, v1}, Lcom/daaw/rk3;-><init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/bk3;)V

    const-string v0, "/jsLoaded"

    invoke-interface {v1, v0, p1}, Lcom/daaw/kl3;->B0(Ljava/lang/String;Lcom/daaw/zg3;)V

    new-instance p1, Lcom/google/android/gms/ads/internal/util/zzca;

    invoke-direct {p1}, Lcom/google/android/gms/ads/internal/util/zzca;-><init>()V

    new-instance v0, Lcom/daaw/sk3;

    invoke-direct {v0, p0, v2, v1, p1}, Lcom/daaw/sk3;-><init>(Lcom/daaw/jl3;Lcom/daaw/sl2;Lcom/daaw/bk3;Lcom/google/android/gms/ads/internal/util/zzca;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/internal/util/zzca;->zzb(Ljava/lang/Object;)V

    const-string p1, "/requestReload"

    invoke-interface {v1, p1, v0}, Lcom/daaw/kl3;->B0(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object p1, p0, Lcom/daaw/jl3;->c:Ljava/lang/String;

    const-string v0, ".js"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/jl3;->c:Ljava/lang/String;

    invoke-interface {v1, p1}, Lcom/daaw/bk3;->zzh(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/jl3;->c:Ljava/lang/String;

    const-string v0, "<html>"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/jl3;->c:Ljava/lang/String;

    invoke-interface {v1, p1}, Lcom/daaw/bk3;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/jl3;->c:Ljava/lang/String;

    invoke-interface {v1, p1}, Lcom/daaw/bk3;->s(Ljava/lang/String;)V

    :goto_0
    sget-object p1, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v0, Lcom/daaw/uk3;

    invoke-direct {v0, p0, p2, v1}, Lcom/daaw/uk3;-><init>(Lcom/daaw/jl3;Lcom/daaw/il3;Lcom/daaw/bk3;)V

    const-wide/32 v1, 0xea60

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception p1

    const-string v0, "Error creating webview."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    const-string v1, "SdkJavascriptFactory.loadJavascriptEngine"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/daaw/l14;->c()V

    return-void
.end method

.method public final synthetic k(Lcom/daaw/bk3;)V
    .locals 0

    invoke-interface {p1}, Lcom/daaw/bk3;->zzi()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/jl3;->i:I

    :cond_0
    return-void
.end method
