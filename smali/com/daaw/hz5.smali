.class public final Lcom/daaw/hz5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pz5;


# instance fields
.field public final synthetic a:Lcom/daaw/iz5;


# direct methods
.method public constructor <init>(Lcom/daaw/iz5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hz5;->a:Lcom/daaw/iz5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/daaw/oz4;

    iget-object v0, p0, Lcom/daaw/hz5;->a:Lcom/daaw/iz5;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/hz5;->a:Lcom/daaw/iz5;

    invoke-static {v1, p1}, Lcom/daaw/iz5;->h3(Lcom/daaw/iz5;Lcom/daaw/oz4;)V

    iget-object p1, p0, Lcom/daaw/hz5;->a:Lcom/daaw/iz5;

    invoke-static {p1}, Lcom/daaw/iz5;->g3(Lcom/daaw/iz5;)Lcom/daaw/oz4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/zl4;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zza()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/hz5;->a:Lcom/daaw/iz5;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/hz5;->a:Lcom/daaw/iz5;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/iz5;->h3(Lcom/daaw/iz5;Lcom/daaw/oz4;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
