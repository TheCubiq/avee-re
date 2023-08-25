.class public final Lcom/daaw/qz3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/google/android/gms/ads/internal/util/zzj;

.field public final c:Lcom/daaw/xz3;

.field public d:Z

.field public e:Landroid/content/Context;

.field public f:Lcom/google/android/gms/internal/ads/zzchu;

.field public g:Ljava/lang/String;

.field public h:Lcom/daaw/l93;

.field public i:Ljava/lang/Boolean;

.field public final j:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final k:Lcom/daaw/pz3;

.field public final l:Ljava/lang/Object;

.field public m:Lcom/daaw/f77;

.field public final n:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/qz3;->a:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/ads/internal/util/zzj;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/util/zzj;-><init>()V

    iput-object v0, p0, Lcom/daaw/qz3;->b:Lcom/google/android/gms/ads/internal/util/zzj;

    new-instance v1, Lcom/daaw/xz3;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzay;->zzd()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/daaw/xz3;-><init>(Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/zzg;)V

    iput-object v1, p0, Lcom/daaw/qz3;->c:Lcom/daaw/xz3;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/qz3;->d:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/qz3;->h:Lcom/daaw/l93;

    iput-object v1, p0, Lcom/daaw/qz3;->i:Ljava/lang/Boolean;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v2, p0, Lcom/daaw/qz3;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lcom/daaw/pz3;

    invoke-direct {v0, v1}, Lcom/daaw/pz3;-><init>(Lcom/daaw/oz3;)V

    iput-object v0, p0, Lcom/daaw/qz3;->k:Lcom/daaw/pz3;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/qz3;->l:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/daaw/qz3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/qz3;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/qz3;)Lcom/daaw/l93;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qz3;->h:Lcom/daaw/l93;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/daaw/qz3;)Lcom/google/android/gms/internal/ads/zzchu;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qz3;->f:Lcom/google/android/gms/internal/ads/zzchu;

    return-object p0
.end method

.method public static bridge synthetic l(Lcom/daaw/qz3;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qz3;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic o(Lcom/daaw/qz3;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/daaw/qz3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/qz3;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    return-object v0
.end method

.method public final d()Landroid/content/res/Resources;
    .locals 3

    iget-object v0, p0, Lcom/daaw/qz3;->f:Lcom/google/android/gms/internal/ads/zzchu;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzchu;->s:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lcom/daaw/g93;->Y8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/daaw/o04;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/daaw/o04;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    :try_end_0
    .catch Lcom/daaw/n04; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Cannot load resource from dynamite apk or local jar"

    invoke-static {v2, v1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final f()Lcom/daaw/l93;
    .locals 2

    iget-object v0, p0, Lcom/daaw/qz3;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qz3;->h:Lcom/daaw/l93;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g()Lcom/daaw/xz3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qz3;->c:Lcom/daaw/xz3;

    return-object v0
.end method

.method public final h()Lcom/google/android/gms/ads/internal/util/zzg;
    .locals 2

    iget-object v0, p0, Lcom/daaw/qz3;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qz3;->b:Lcom/google/android/gms/ads/internal/util/zzj;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/daaw/g93;->o2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/qz3;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qz3;->m:Lcom/daaw/f77;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :cond_1
    sget-object v1, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    new-instance v2, Lcom/daaw/lz3;

    invoke-direct {v2, p0}, Lcom/daaw/lz3;-><init>(Lcom/daaw/qz3;)V

    invoke-interface {v1, v2}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/qz3;->m:Lcom/daaw/f77;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/daaw/qz3;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/qz3;->i:Ljava/lang/Boolean;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qz3;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final synthetic n()Ljava/util/ArrayList;
    .locals 5

    iget-object v0, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/av3;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-static {v0}, Lcom/daaw/ez1;->a(Landroid/content/Context;)Lcom/daaw/iv0;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/16 v3, 0x1000

    invoke-virtual {v2, v0, v3}, Lcom/daaw/iv0;->f(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v2, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    :goto_0
    iget-object v3, v0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    iget-object v4, v0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    aget v4, v4, v2

    and-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_0

    aget-object v3, v3, v2

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    :cond_1
    return-object v1
.end method

.method public final p()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qz3;->k:Lcom/daaw/pz3;

    invoke-virtual {v0}, Lcom/daaw/pz3;->a()V

    return-void
.end method

.method public final q()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qz3;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void
.end method

.method public final r()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qz3;->j:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final s(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x17
    .end annotation

    iget-object v0, p0, Lcom/daaw/qz3;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/qz3;->d:Z

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/qz3;->f:Lcom/google/android/gms/internal/ads/zzchu;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzb()Lcom/daaw/n13;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/qz3;->c:Lcom/daaw/xz3;

    invoke-virtual {v1, v2}, Lcom/daaw/n13;->c(Lcom/daaw/m13;)V

    iget-object v1, p0, Lcom/daaw/qz3;->b:Lcom/google/android/gms/ads/internal/util/zzj;

    iget-object v2, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/util/zzj;->zzr(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/qz3;->f:Lcom/google/android/gms/internal/ads/zzchu;

    invoke-static {v1, v2}, Lcom/daaw/et3;->d(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)Lcom/daaw/gt3;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zze()Lcom/daaw/m93;

    sget-object v1, Lcom/daaw/ua3;->c:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "CsiReporterFactory: CSI is not enabled. No CSI reporter created."

    invoke-static {v1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/l93;

    invoke-direct {v1}, Lcom/daaw/l93;-><init>()V

    :goto_0
    iput-object v1, p0, Lcom/daaw/qz3;->h:Lcom/daaw/l93;

    if-eqz v1, :cond_1

    new-instance v1, Lcom/daaw/mz3;

    invoke-direct {v1, p0}, Lcom/daaw/mz3;-><init>(Lcom/daaw/qz3;)V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/util/zzb;->zzb()Lcom/daaw/f77;

    move-result-object v1

    const-string v2, "AppState.registerCsiReporter"

    invoke-static {v1, v2}, Lcom/daaw/c14;->a(Lcom/daaw/f77;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lcom/daaw/vw0;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lcom/daaw/g93;->D7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "connectivity"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    new-instance v2, Lcom/daaw/nz3;

    invoke-direct {v2, p0}, Lcom/daaw/nz3;-><init>(Lcom/daaw/qz3;)V

    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    :cond_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/qz3;->d:Z

    invoke-virtual {p0}, Lcom/daaw/qz3;->j()Lcom/daaw/f77;

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v0

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/ads/internal/util/zzs;->zzc(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final t(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/qz3;->f:Lcom/google/android/gms/internal/ads/zzchu;

    invoke-static {v0, v1}, Lcom/daaw/et3;->d(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)Lcom/daaw/gt3;

    move-result-object v0

    sget-object v1, Lcom/daaw/nb3;->g:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Double;

    invoke-virtual {v1}, Ljava/lang/Double;->floatValue()F

    move-result v1

    invoke-interface {v0, p1, p2, v1}, Lcom/daaw/gt3;->b(Ljava/lang/Throwable;Ljava/lang/String;F)V

    return-void
.end method

.method public final u(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/qz3;->e:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/qz3;->f:Lcom/google/android/gms/internal/ads/zzchu;

    invoke-static {v0, v1}, Lcom/daaw/et3;->d(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;)Lcom/daaw/gt3;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/gt3;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final v(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qz3;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/daaw/qz3;->i:Ljava/lang/Boolean;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final w(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qz3;->g:Ljava/lang/String;

    return-void
.end method

.method public final x(Landroid/content/Context;)Z
    .locals 2

    invoke-static {}, Lcom/daaw/vw0;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/daaw/g93;->D7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/qz3;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
