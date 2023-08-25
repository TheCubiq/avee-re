.class public final Lcom/daaw/kv6;
.super Lcom/daaw/iv6;
.source ""


# static fields
.field public static h:Lcom/daaw/kv6;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "PaidV1LifecycleImpl.class"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "paidv1_id"

    const-string v1, "paidv1_creation_time"

    const-string v2, "PaidV1LifecycleImpl"

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/daaw/iv6;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final k(Landroid/content/Context;)Lcom/daaw/kv6;
    .locals 2

    const-class v0, Lcom/daaw/kv6;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/kv6;->h:Lcom/daaw/kv6;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/kv6;

    invoke-direct {v1, p0}, Lcom/daaw/kv6;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/daaw/kv6;->h:Lcom/daaw/kv6;

    :cond_0
    sget-object p0, Lcom/daaw/kv6;->h:Lcom/daaw/kv6;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final i(JZ)Lcom/daaw/hv6;
    .locals 7

    const-class v0, Lcom/daaw/kv6;

    monitor-enter v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-wide v4, p1

    move v6, p3

    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lcom/daaw/iv6;->b(Ljava/lang/String;Ljava/lang/String;JZ)Lcom/daaw/hv6;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;JZ)Lcom/daaw/hv6;
    .locals 1

    const-class v0, Lcom/daaw/kv6;

    monitor-enter v0

    :try_start_0
    invoke-virtual/range {p0 .. p5}, Lcom/daaw/iv6;->b(Ljava/lang/String;Ljava/lang/String;JZ)Lcom/daaw/hv6;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final l()V
    .locals 2

    const-class v0, Lcom/daaw/kv6;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/daaw/iv6;->f(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final m()V
    .locals 2

    const-class v0, Lcom/daaw/kv6;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/daaw/iv6;->f(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
