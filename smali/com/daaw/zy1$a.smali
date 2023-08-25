.class public Lcom/daaw/zy1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/zy1;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/fk0;

.field public final synthetic q:Lcom/daaw/sb1;

.field public final synthetic r:Lcom/daaw/zy1;


# direct methods
.method public constructor <init>(Lcom/daaw/zy1;Lcom/daaw/fk0;Lcom/daaw/sb1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zy1$a;->r:Lcom/daaw/zy1;

    iput-object p2, p0, Lcom/daaw/zy1$a;->p:Lcom/daaw/fk0;

    iput-object p3, p0, Lcom/daaw/zy1$a;->q:Lcom/daaw/sb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zy1$a;->p:Lcom/daaw/fk0;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v1, Lcom/daaw/zy1;->I:Ljava/lang/String;

    const-string v2, "Starting work for %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/zy1$a;->r:Lcom/daaw/zy1;

    iget-object v4, v4, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v4, v4, Lcom/daaw/qy1;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/daaw/zy1$a;->r:Lcom/daaw/zy1;

    iget-object v1, v0, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->startWork()Lcom/daaw/fk0;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/zy1;->G:Lcom/daaw/fk0;

    iget-object v0, p0, Lcom/daaw/zy1$a;->q:Lcom/daaw/sb1;

    iget-object v1, p0, Lcom/daaw/zy1$a;->r:Lcom/daaw/zy1;

    iget-object v1, v1, Lcom/daaw/zy1;->G:Lcom/daaw/fk0;

    invoke-virtual {v0, v1}, Lcom/daaw/sb1;->s(Lcom/daaw/fk0;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/zy1$a;->q:Lcom/daaw/sb1;

    invoke-virtual {v1, v0}, Lcom/daaw/sb1;->r(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method
