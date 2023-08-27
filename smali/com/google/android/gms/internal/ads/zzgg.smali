.class public final Lcom/google/android/gms/internal/ads/zzgg;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final zzaho:Ljava/lang/Object;

.field private zzahp:Lcom/google/android/gms/internal/ads/zzgh;

.field private zzahq:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzaho:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahq:Z

    return-void
.end method


# virtual methods
.method public final getActivity()Landroid/app/Activity;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzaho:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastIceCreamSandwich()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgh;->getActivity()Landroid/app/Activity;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final getContext()Landroid/content/Context;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzaho:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastIceCreamSandwich()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgh;->getContext()Landroid/content/Context;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final initialize(Landroid/content/Context;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzaho:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahq:Z

    if-nez v1, :cond_6

    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastIceCreamSandwich()Z

    move-result v1

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zznk;->zzayg:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_2

    move-object v2, p1

    :cond_2
    instance-of v3, v2, Landroid/app/Application;

    if-eqz v3, :cond_3

    move-object v1, v2

    check-cast v1, Landroid/app/Application;

    :cond_3
    if-nez v1, :cond_4

    const-string p1, "Can not cast Context to Application"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_4
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    if-nez v2, :cond_5

    new-instance v2, Lcom/google/android/gms/internal/ads/zzgh;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzgh;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    invoke-virtual {v2, v1, p1}, Lcom/google/android/gms/internal/ads/zzgh;->zza(Landroid/app/Application;Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahq:Z

    :cond_6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzgj;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzaho:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastIceCreamSandwich()Z

    move-result v1

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zznk;->zzayg:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    if-nez v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgh;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgh;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgg;->zzahp:Lcom/google/android/gms/internal/ads/zzgh;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzgh;->zza(Lcom/google/android/gms/internal/ads/zzgj;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
