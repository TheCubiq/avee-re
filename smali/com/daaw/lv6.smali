.class public final Lcom/daaw/lv6;
.super Lcom/daaw/iv6;
.source ""


# static fields
.field public static h:Lcom/daaw/lv6;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "PaidV2LifecycleImpl.class"
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    const-string v0, "paidv2_id"

    const-string v1, "paidv2_creation_time"

    const-string v2, "PaidV2LifecycleImpl"

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/daaw/iv6;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final j(Landroid/content/Context;)Lcom/daaw/lv6;
    .locals 2

    const-class v0, Lcom/daaw/lv6;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/lv6;->h:Lcom/daaw/lv6;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/lv6;

    invoke-direct {v1, p0}, Lcom/daaw/lv6;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/daaw/lv6;->h:Lcom/daaw/lv6;

    :cond_0
    sget-object p0, Lcom/daaw/lv6;->h:Lcom/daaw/lv6;

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

    const-class v0, Lcom/daaw/lv6;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/lv6;->p()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance p1, Lcom/daaw/hv6;

    invoke-direct {p1}, Lcom/daaw/hv6;-><init>()V

    monitor-exit v0

    return-object p1

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-wide v4, p1

    move v6, p3

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

.method public final k()V
    .locals 3

    const-class v0, Lcom/daaw/lv6;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, v1}, Lcom/daaw/iv6;->g(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/iv6;->f(Z)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/iv6;->f:Lcom/daaw/jv6;

    const-string v1, "paidv2_publisher_option"

    invoke-virtual {v0, v1}, Lcom/daaw/jv6;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final m()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/iv6;->f:Lcom/daaw/jv6;

    const-string v1, "paidv2_user_option"

    invoke-virtual {v0, v1}, Lcom/daaw/jv6;->e(Ljava/lang/String;)V

    return-void
.end method

.method public final n(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/iv6;->f:Lcom/daaw/jv6;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "paidv2_user_option"

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jv6;->d(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final o(Z)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/iv6;->f:Lcom/daaw/jv6;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "paidv2_publisher_option"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/jv6;->d(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/lv6;->k()V

    :cond_0
    return-void
.end method

.method public final p()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/iv6;->f:Lcom/daaw/jv6;

    const-string v1, "paidv2_publisher_option"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/jv6;->f(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final q()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/iv6;->f:Lcom/daaw/jv6;

    const-string v1, "paidv2_user_option"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/jv6;->f(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method
