.class public final Lcom/daaw/f78;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ua5;

.field public final synthetic q:Lcom/daaw/u78;


# direct methods
.method public constructor <init>(Lcom/daaw/u78;Lcom/daaw/ua5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f78;->q:Lcom/daaw/u78;

    iput-object p2, p0, Lcom/daaw/f78;->p:Lcom/daaw/ua5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/f78;->q:Lcom/daaw/u78;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/f78;->q:Lcom/daaw/u78;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/u78;->a(Lcom/daaw/u78;Z)V

    iget-object v1, p0, Lcom/daaw/f78;->q:Lcom/daaw/u78;

    iget-object v1, v1, Lcom/daaw/u78;->c:Lcom/daaw/x78;

    invoke-virtual {v1}, Lcom/daaw/x78;->z()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/daaw/f78;->q:Lcom/daaw/u78;

    iget-object v1, v1, Lcom/daaw/u78;->c:Lcom/daaw/x78;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->v()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "Connected to service"

    invoke-virtual {v1, v2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/f78;->q:Lcom/daaw/u78;

    iget-object v1, v1, Lcom/daaw/u78;->c:Lcom/daaw/x78;

    iget-object v2, p0, Lcom/daaw/f78;->p:Lcom/daaw/ua5;

    invoke-virtual {v1, v2}, Lcom/daaw/x78;->x(Lcom/daaw/ua5;)V

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
