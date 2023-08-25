.class public final Lcom/daaw/ol3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public c:Lcom/daaw/xl3;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lockClient"
    .end annotation
.end field

.field public d:Lcom/daaw/xl3;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lockService"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/ol3;->a:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/ol3;->b:Ljava/lang/Object;

    return-void
.end method

.method public static final c(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ol3;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ol3;->c:Lcom/daaw/xl3;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/xl3;

    invoke-static {p1}, Lcom/daaw/ol3;->c(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    sget-object v2, Lcom/daaw/g93;->a:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2, p3}, Lcom/daaw/xl3;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Lcom/daaw/vo6;)V

    iput-object v1, p0, Lcom/daaw/ol3;->c:Lcom/daaw/xl3;

    :cond_0
    iget-object p1, p0, Lcom/daaw/ol3;->c:Lcom/daaw/xl3;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final b(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/vo6;)Lcom/daaw/xl3;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ol3;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ol3;->d:Lcom/daaw/xl3;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/xl3;

    invoke-static {p1}, Lcom/daaw/ol3;->c(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    sget-object v2, Lcom/daaw/ob3;->b:Lcom/daaw/ma3;

    invoke-virtual {v2}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2, p3}, Lcom/daaw/xl3;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Lcom/daaw/vo6;)V

    iput-object v1, p0, Lcom/daaw/ol3;->d:Lcom/daaw/xl3;

    :cond_0
    iget-object p1, p0, Lcom/daaw/ol3;->d:Lcom/daaw/xl3;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
