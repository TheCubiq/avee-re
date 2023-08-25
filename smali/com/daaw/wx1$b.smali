.class public Lcom/daaw/wx1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wx1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/sb1;

.field public final synthetic q:Lcom/daaw/wx1;


# direct methods
.method public constructor <init>(Lcom/daaw/wx1;Lcom/daaw/sb1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wx1$b;->q:Lcom/daaw/wx1;

    iput-object p2, p0, Lcom/daaw/wx1$b;->p:Lcom/daaw/sb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    :try_start_0
    iget-object v0, p0, Lcom/daaw/wx1$b;->p:Lcom/daaw/sb1;

    invoke-virtual {v0}, Lcom/daaw/i;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/g30;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v3

    sget-object v4, Lcom/daaw/wx1;->v:Ljava/lang/String;

    const-string v5, "Updating notification for %s"

    new-array v6, v2, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/daaw/wx1$b;->q:Lcom/daaw/wx1;

    iget-object v7, v7, Lcom/daaw/wx1;->r:Lcom/daaw/qy1;

    iget-object v7, v7, Lcom/daaw/qy1;->c:Ljava/lang/String;

    aput-object v7, v6, v1

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v1, v1, [Ljava/lang/Throwable;

    invoke-virtual {v3, v4, v5, v1}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/daaw/wx1$b;->q:Lcom/daaw/wx1;

    iget-object v1, v1, Lcom/daaw/wx1;->s:Landroidx/work/ListenableWorker;

    invoke-virtual {v1, v2}, Landroidx/work/ListenableWorker;->setRunInForeground(Z)V

    iget-object v1, p0, Lcom/daaw/wx1$b;->q:Lcom/daaw/wx1;

    iget-object v2, v1, Lcom/daaw/wx1;->p:Lcom/daaw/sb1;

    iget-object v3, v1, Lcom/daaw/wx1;->t:Lcom/daaw/j30;

    iget-object v4, v1, Lcom/daaw/wx1;->q:Landroid/content/Context;

    iget-object v1, v1, Lcom/daaw/wx1;->s:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-interface {v3, v4, v1, v0}, Lcom/daaw/j30;->a(Landroid/content/Context;Ljava/util/UUID;Lcom/daaw/g30;)Lcom/daaw/fk0;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/daaw/sb1;->s(Lcom/daaw/fk0;)Z

    goto :goto_0

    :cond_0
    const-string v0, "Worker was marked important (%s) but did not provide ForegroundInfo"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/wx1$b;->q:Lcom/daaw/wx1;

    iget-object v3, v3, Lcom/daaw/wx1;->r:Lcom/daaw/qy1;

    iget-object v3, v3, Lcom/daaw/qy1;->c:Ljava/lang/String;

    aput-object v3, v2, v1

    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/wx1$b;->q:Lcom/daaw/wx1;

    iget-object v1, v1, Lcom/daaw/wx1;->p:Lcom/daaw/sb1;

    invoke-virtual {v1, v0}, Lcom/daaw/sb1;->r(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
