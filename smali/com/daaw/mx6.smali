.class public final Lcom/daaw/mx6;
.super Lcom/daaw/dx6;
.source ""


# instance fields
.field public final synthetic q:Landroid/os/IBinder;

.field public final synthetic r:Lcom/daaw/px6;


# direct methods
.method public constructor <init>(Lcom/daaw/px6;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mx6;->r:Lcom/daaw/px6;

    iput-object p2, p0, Lcom/daaw/mx6;->q:Landroid/os/IBinder;

    invoke-direct {p0}, Lcom/daaw/dx6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/mx6;->r:Lcom/daaw/px6;

    iget-object v0, v0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    iget-object v1, p0, Lcom/daaw/mx6;->q:Landroid/os/IBinder;

    invoke-static {v1}, Lcom/daaw/yw6;->g3(Landroid/os/IBinder;)Lcom/daaw/zw6;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/qx6;->k(Lcom/daaw/qx6;Landroid/os/IInterface;)V

    iget-object v0, p0, Lcom/daaw/mx6;->r:Lcom/daaw/px6;

    iget-object v0, v0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->n(Lcom/daaw/qx6;)V

    iget-object v0, p0, Lcom/daaw/mx6;->r:Lcom/daaw/px6;

    iget-object v0, v0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/qx6;->j(Lcom/daaw/qx6;Z)V

    iget-object v0, p0, Lcom/daaw/mx6;->r:Lcom/daaw/px6;

    iget-object v0, v0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->g(Lcom/daaw/qx6;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/mx6;->r:Lcom/daaw/px6;

    iget-object v0, v0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->g(Lcom/daaw/qx6;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
