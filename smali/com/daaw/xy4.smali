.class public final Lcom/daaw/xy4;
.super Lcom/daaw/kw4;
.source ""


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/kw4;-><init>(Ljava/util/Set;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized zza()V
    .locals 1

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/daaw/wy4;->a:Lcom/daaw/wy4;

    invoke-virtual {p0, v0}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
