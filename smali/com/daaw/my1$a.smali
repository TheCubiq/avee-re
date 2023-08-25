.class public Lcom/daaw/my1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/my1;->a(Landroid/content/Context;Ljava/util/UUID;Landroidx/work/b;)Lcom/daaw/fk0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/util/UUID;

.field public final synthetic q:Landroidx/work/b;

.field public final synthetic r:Lcom/daaw/sb1;

.field public final synthetic s:Lcom/daaw/my1;


# direct methods
.method public constructor <init>(Lcom/daaw/my1;Ljava/util/UUID;Landroidx/work/b;Lcom/daaw/sb1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/my1$a;->s:Lcom/daaw/my1;

    iput-object p2, p0, Lcom/daaw/my1$a;->p:Ljava/util/UUID;

    iput-object p3, p0, Lcom/daaw/my1$a;->q:Landroidx/work/b;

    iput-object p4, p0, Lcom/daaw/my1$a;->r:Lcom/daaw/sb1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/my1$a;->p:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v1

    sget-object v2, Lcom/daaw/my1;->c:Ljava/lang/String;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/my1$a;->p:Ljava/util/UUID;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/daaw/my1$a;->q:Landroidx/work/b;

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const-string v4, "Updating progress for %s (%s)"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/daaw/my1$a;->s:Lcom/daaw/my1;

    iget-object v1, v1, Lcom/daaw/my1;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v1, p0, Lcom/daaw/my1$a;->s:Lcom/daaw/my1;

    iget-object v1, v1, Lcom/daaw/my1;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->B()Lcom/daaw/ry1;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/daaw/ry1;->m(Ljava/lang/String;)Lcom/daaw/qy1;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, v1, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    sget-object v3, Lcom/daaw/yx1;->q:Lcom/daaw/yx1;

    if-ne v1, v3, :cond_0

    new-instance v1, Lcom/daaw/jy1;

    iget-object v2, p0, Lcom/daaw/my1$a;->q:Landroidx/work/b;

    invoke-direct {v1, v0, v2}, Lcom/daaw/jy1;-><init>(Ljava/lang/String;Landroidx/work/b;)V

    iget-object v0, p0, Lcom/daaw/my1$a;->s:Lcom/daaw/my1;

    iget-object v0, v0, Lcom/daaw/my1;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->A()Lcom/daaw/ky1;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/daaw/ky1;->b(Lcom/daaw/jy1;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v1

    const-string v3, "Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state."

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v3, v5, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v0, v3}, Lcom/daaw/ll0;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lcom/daaw/my1$a;->r:Lcom/daaw/sb1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/sb1;->q(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/my1$a;->s:Lcom/daaw/my1;

    iget-object v0, v0, Lcom/daaw/my1;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V

    goto :goto_1

    :cond_1
    const-string v0, "Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v1

    sget-object v2, Lcom/daaw/my1;->c:Ljava/lang/String;

    const-string v3, "Error updating Worker progress"

    new-array v4, v6, [Ljava/lang/Throwable;

    aput-object v0, v4, v5

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/ll0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v1, p0, Lcom/daaw/my1$a;->r:Lcom/daaw/sb1;

    invoke-virtual {v1, v0}, Lcom/daaw/sb1;->r(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    iget-object v0, p0, Lcom/daaw/my1$a;->s:Lcom/daaw/my1;

    iget-object v0, v0, Lcom/daaw/my1;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    return-void

    :catchall_1
    move-exception v0

    iget-object v1, p0, Lcom/daaw/my1$a;->s:Lcom/daaw/my1;

    iget-object v1, v1, Lcom/daaw/my1;->a:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->g()V

    throw v0
.end method
