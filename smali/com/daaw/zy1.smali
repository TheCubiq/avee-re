.class public Lcom/daaw/zy1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/zy1$c;
    }
.end annotation


# static fields
.field public static final I:Ljava/lang/String;


# instance fields
.field public A:Lcom/daaw/ry1;

.field public B:Lcom/daaw/bt;

.field public C:Lcom/daaw/uy1;

.field public D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public E:Ljava/lang/String;

.field public F:Lcom/daaw/sb1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sb1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public G:Lcom/daaw/fk0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/fk0<",
            "Landroidx/work/ListenableWorker$a;",
            ">;"
        }
    .end annotation
.end field

.field public volatile H:Z

.field public p:Landroid/content/Context;

.field public q:Ljava/lang/String;

.field public r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/r81;",
            ">;"
        }
    .end annotation
.end field

.field public s:Landroidx/work/WorkerParameters$a;

.field public t:Lcom/daaw/qy1;

.field public u:Landroidx/work/ListenableWorker;

.field public v:Lcom/daaw/wj1;

.field public w:Landroidx/work/ListenableWorker$a;

.field public x:Landroidx/work/a;

.field public y:Lcom/daaw/i30;

.field public z:Landroidx/work/impl/WorkDatabase;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkerWrapper"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/zy1;->I:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/zy1$c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/work/ListenableWorker$a;->a()Landroidx/work/ListenableWorker$a;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zy1;->w:Landroidx/work/ListenableWorker$a;

    invoke-static {}, Lcom/daaw/sb1;->u()Lcom/daaw/sb1;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zy1;->F:Lcom/daaw/sb1;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/zy1;->G:Lcom/daaw/fk0;

    iget-object v0, p1, Lcom/daaw/zy1$c;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/daaw/zy1;->p:Landroid/content/Context;

    iget-object v0, p1, Lcom/daaw/zy1$c;->d:Lcom/daaw/wj1;

    iput-object v0, p0, Lcom/daaw/zy1;->v:Lcom/daaw/wj1;

    iget-object v0, p1, Lcom/daaw/zy1$c;->c:Lcom/daaw/i30;

    iput-object v0, p0, Lcom/daaw/zy1;->y:Lcom/daaw/i30;

    iget-object v0, p1, Lcom/daaw/zy1$c;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    iget-object v0, p1, Lcom/daaw/zy1$c;->h:Ljava/util/List;

    iput-object v0, p0, Lcom/daaw/zy1;->r:Ljava/util/List;

    iget-object v0, p1, Lcom/daaw/zy1$c;->i:Landroidx/work/WorkerParameters$a;

    iput-object v0, p0, Lcom/daaw/zy1;->s:Landroidx/work/WorkerParameters$a;

    iget-object v0, p1, Lcom/daaw/zy1$c;->b:Landroidx/work/ListenableWorker;

    iput-object v0, p0, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    iget-object v0, p1, Lcom/daaw/zy1$c;->e:Landroidx/work/a;

    iput-object v0, p0, Lcom/daaw/zy1;->x:Landroidx/work/a;

    iget-object p1, p1, Lcom/daaw/zy1$c;->f:Landroidx/work/impl/WorkDatabase;

    iput-object p1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->B()Lcom/daaw/ry1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object p1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->t()Lcom/daaw/bt;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/zy1;->B:Lcom/daaw/bt;

    iget-object p1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->C()Lcom/daaw/uy1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/zy1;->C:Lcom/daaw/uy1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Work [ id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tags={ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, " } ]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()Lcom/daaw/fk0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/fk0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/zy1;->F:Lcom/daaw/sb1;

    return-object v0
.end method

.method public final c(Landroidx/work/ListenableWorker$a;)V
    .locals 4

    instance-of v0, p1, Landroidx/work/ListenableWorker$a$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object p1

    sget-object v0, Lcom/daaw/zy1;->I:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/zy1;->E:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v3, "Worker result SUCCESS for %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/ll0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    invoke-virtual {p1}, Lcom/daaw/qy1;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/zy1;->h()V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/zy1;->m()V

    goto :goto_1

    :cond_1
    instance-of p1, p1, Landroidx/work/ListenableWorker$a$b;

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object p1

    sget-object v0, Lcom/daaw/zy1;->I:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/zy1;->E:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v3, "Worker result RETRY for %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/ll0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/daaw/zy1;->g()V

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object p1

    sget-object v0, Lcom/daaw/zy1;->I:Ljava/lang/String;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/zy1;->E:Ljava/lang/String;

    aput-object v3, v1, v2

    const-string v3, "Worker result FAILURE for %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {p1, v0, v1, v2}, Lcom/daaw/ll0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object p1, p0, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    invoke-virtual {p1}, Lcom/daaw/qy1;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/zy1;->l()V

    :goto_1
    return-void
.end method

.method public d()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/zy1;->H:Z

    invoke-virtual {p0}, Lcom/daaw/zy1;->n()Z

    iget-object v1, p0, Lcom/daaw/zy1;->G:Lcom/daaw/fk0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v1

    iget-object v3, p0, Lcom/daaw/zy1;->G:Lcom/daaw/fk0;

    invoke-interface {v3, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    if-eqz v3, :cond_1

    if-nez v1, :cond_1

    invoke-virtual {v3}, Landroidx/work/ListenableWorker;->stop()V

    goto :goto_1

    :cond_1
    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    aput-object v1, v0, v2

    const-string v1, "WorkSpec %s is already done. Not interrupting."

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v1

    sget-object v3, Lcom/daaw/zy1;->I:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Throwable;

    invoke-virtual {v1, v3, v0, v2}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 5

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    invoke-interface {v1, p1}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v1

    sget-object v2, Lcom/daaw/yx1;->u:Lcom/daaw/yx1;

    if-eq v1, v2, :cond_0

    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    sget-object v2, Lcom/daaw/yx1;->s:Lcom/daaw/yx1;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-interface {v1, v2, v3}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Lcom/daaw/zy1;->B:Lcom/daaw/bt;

    invoke-interface {v1, p1}, Lcom/daaw/bt;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public f()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/zy1;->n()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->A()Lcom/daaw/ky1;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/daaw/ky1;->a(Ljava/lang/String;)V

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/daaw/yx1;->q:Lcom/daaw/yx1;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/zy1;->w:Landroidx/work/ListenableWorker$a;

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->c(Landroidx/work/ListenableWorker$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/daaw/yx1;->a()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lcom/daaw/zy1;->g()V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->g()V

    throw v0

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/daaw/zy1;->r:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/r81;

    iget-object v2, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/daaw/r81;->d(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/daaw/zy1;->x:Landroidx/work/a;

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    iget-object v2, p0, Lcom/daaw/zy1;->r:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/daaw/v81;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_5
    return-void
.end method

.method public final g()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    sget-object v2, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    new-array v3, v0, [Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-interface {v1, v2, v3}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v2, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Lcom/daaw/ry1;->s(Ljava/lang/String;J)V

    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v2, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, Lcom/daaw/ry1;->b(Ljava/lang/String;J)I

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lcom/daaw/b61;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    throw v1
.end method

.method public final h()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v2, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Lcom/daaw/ry1;->s(Ljava/lang/String;J)V

    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    sget-object v2, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    aput-object v4, v3, v0

    invoke-interface {v1, v2, v3}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v2, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/daaw/ry1;->n(Ljava/lang/String;)I

    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v2, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {v1, v2, v3, v4}, Lcom/daaw/ry1;->b(Ljava/lang/String;J)I

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lcom/daaw/b61;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    throw v1
.end method

.method public final i(Z)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Lcom/daaw/ry1;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ry1;->i()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/zy1;->p:Landroid/content/Context;

    const-class v2, Landroidx/work/impl/background/systemalarm/RescheduleReceiver;

    invoke-static {v0, v2, v1}, Lcom/daaw/hv0;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    sget-object v2, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    aput-object v4, v3, v1

    invoke-interface {v0, v2, v3}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    iget-object v0, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/ry1;->b(Ljava/lang/String;J)I

    :cond_1
    iget-object v0, p0, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->isRunInForeground()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/zy1;->y:Lcom/daaw/i30;

    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/daaw/i30;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    iget-object v0, p0, Lcom/daaw/zy1;->F:Lcom/daaw/sb1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/sb1;->q(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    throw p1
.end method

.method public final j()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v0

    sget-object v1, Lcom/daaw/yx1;->q:Lcom/daaw/yx1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v1, Lcom/daaw/zy1;->I:Ljava/lang/String;

    new-array v4, v2, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    aput-object v5, v4, v3

    const-string v5, "Status for %s is RUNNING;not doing any work and rescheduling for later execution"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v4, v3}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {p0, v2}, Lcom/daaw/zy1;->i(Z)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v1

    sget-object v4, Lcom/daaw/zy1;->I:Ljava/lang/String;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    aput-object v6, v5, v3

    aput-object v0, v5, v2

    const-string v0, "Status for %s is %s; not doing any work"

    invoke-static {v0, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Throwable;

    invoke-virtual {v1, v4, v0, v2}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {p0, v3}, Lcom/daaw/zy1;->i(Z)V

    :goto_0
    return-void
.end method

.method public final k()V
    .locals 16

    move-object/from16 v1, p0

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zy1;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v0, v1, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v2, v1, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/daaw/ry1;->m(Ljava/lang/String;)Lcom/daaw/qy1;

    move-result-object v0

    iput-object v0, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v4, Lcom/daaw/zy1;->I:Ljava/lang/String;

    const-string v5, "Didn\'t find WorkSpec for id %s"

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v6, v1, Lcom/daaw/zy1;->q:Ljava/lang/String;

    aput-object v6, v2, v3

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v5, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v4, v2, v5}, Lcom/daaw/ll0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {v1, v3}, Lcom/daaw/zy1;->i(Z)V

    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    return-void

    :cond_1
    :try_start_1
    iget-object v4, v0, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    sget-object v5, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    if-eq v4, v5, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zy1;->j()V

    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v4, Lcom/daaw/zy1;->I:Ljava/lang/String;

    const-string v5, "%s is not in ENQUEUED state. Nothing more to do."

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v6, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v6, v6, Lcom/daaw/qy1;->c:Ljava/lang/String;

    aput-object v6, v2, v3

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v4, v2, v3}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    return-void

    :cond_2
    :try_start_2
    invoke-virtual {v0}, Lcom/daaw/qy1;->d()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    invoke-virtual {v0}, Lcom/daaw/qy1;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-wide v6, v0, Lcom/daaw/qy1;->n:J

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-nez v10, :cond_4

    const/4 v6, 0x1

    goto :goto_0

    :cond_4
    const/4 v6, 0x0

    :goto_0
    if-nez v6, :cond_5

    invoke-virtual {v0}, Lcom/daaw/qy1;->a()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gez v0, :cond_5

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v4, Lcom/daaw/zy1;->I:Ljava/lang/String;

    const-string v5, "Delaying execution for %s because it is being executed before schedule."

    new-array v6, v2, [Ljava/lang/Object;

    iget-object v7, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v7, v7, Lcom/daaw/qy1;->c:Ljava/lang/String;

    aput-object v7, v6, v3

    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v4, v5, v3}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/daaw/zy1;->i(Z)V

    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    return-void

    :cond_5
    :try_start_3
    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    iget-object v0, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    invoke-virtual {v0}, Lcom/daaw/qy1;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v0, v0, Lcom/daaw/qy1;->e:Landroidx/work/b;

    :goto_1
    move-object v6, v0

    goto :goto_2

    :cond_6
    iget-object v0, v1, Lcom/daaw/zy1;->x:Landroidx/work/a;

    invoke-virtual {v0}, Landroidx/work/a;->f()Lcom/daaw/dg0;

    move-result-object v0

    iget-object v4, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v4, v4, Lcom/daaw/qy1;->d:Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/daaw/dg0;->b(Ljava/lang/String;)Lcom/daaw/cg0;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v4, Lcom/daaw/zy1;->I:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v5, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v5, v5, Lcom/daaw/qy1;->d:Ljava/lang/String;

    aput-object v5, v2, v3

    const-string v5, "Could not create Input Merger %s"

    invoke-static {v5, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Throwable;

    invoke-virtual {v0, v4, v2, v3}, Lcom/daaw/ll0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zy1;->l()V

    return-void

    :cond_7
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v5, v5, Lcom/daaw/qy1;->e:Landroidx/work/b;

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v5, v1, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v6, v1, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v5, v6}, Lcom/daaw/ry1;->p(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, v4}, Lcom/daaw/cg0;->b(Ljava/util/List;)Landroidx/work/b;

    move-result-object v0

    goto :goto_1

    :goto_2
    new-instance v0, Landroidx/work/WorkerParameters;

    iget-object v4, v1, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v5

    iget-object v7, v1, Lcom/daaw/zy1;->D:Ljava/util/List;

    iget-object v8, v1, Lcom/daaw/zy1;->s:Landroidx/work/WorkerParameters$a;

    iget-object v4, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget v9, v4, Lcom/daaw/qy1;->k:I

    iget-object v4, v1, Lcom/daaw/zy1;->x:Landroidx/work/a;

    invoke-virtual {v4}, Landroidx/work/a;->e()Ljava/util/concurrent/Executor;

    move-result-object v10

    iget-object v11, v1, Lcom/daaw/zy1;->v:Lcom/daaw/wj1;

    iget-object v4, v1, Lcom/daaw/zy1;->x:Landroidx/work/a;

    invoke-virtual {v4}, Landroidx/work/a;->m()Lcom/daaw/yy1;

    move-result-object v12

    new-instance v13, Lcom/daaw/my1;

    iget-object v4, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    iget-object v14, v1, Lcom/daaw/zy1;->v:Lcom/daaw/wj1;

    invoke-direct {v13, v4, v14}, Lcom/daaw/my1;-><init>(Landroidx/work/impl/WorkDatabase;Lcom/daaw/wj1;)V

    new-instance v14, Lcom/daaw/xx1;

    iget-object v4, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    iget-object v15, v1, Lcom/daaw/zy1;->y:Lcom/daaw/i30;

    iget-object v3, v1, Lcom/daaw/zy1;->v:Lcom/daaw/wj1;

    invoke-direct {v14, v4, v15, v3}, Lcom/daaw/xx1;-><init>(Landroidx/work/impl/WorkDatabase;Lcom/daaw/i30;Lcom/daaw/wj1;)V

    move-object v4, v0

    invoke-direct/range {v4 .. v14}, Landroidx/work/WorkerParameters;-><init>(Ljava/util/UUID;Landroidx/work/b;Ljava/util/Collection;Landroidx/work/WorkerParameters$a;ILjava/util/concurrent/Executor;Lcom/daaw/wj1;Lcom/daaw/yy1;Lcom/daaw/mz0;Lcom/daaw/j30;)V

    iget-object v3, v1, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    if-nez v3, :cond_8

    iget-object v3, v1, Lcom/daaw/zy1;->x:Landroidx/work/a;

    invoke-virtual {v3}, Landroidx/work/a;->m()Lcom/daaw/yy1;

    move-result-object v3

    iget-object v4, v1, Lcom/daaw/zy1;->p:Landroid/content/Context;

    iget-object v5, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v5, v5, Lcom/daaw/qy1;->c:Ljava/lang/String;

    invoke-virtual {v3, v4, v5, v0}, Lcom/daaw/yy1;->b(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    move-result-object v3

    iput-object v3, v1, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    :cond_8
    iget-object v3, v1, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    if-nez v3, :cond_9

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v3, Lcom/daaw/zy1;->I:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v4, v4, Lcom/daaw/qy1;->c:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v2, v5

    const-string v4, "Could not create Worker %s"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v3, v2, v4}, Lcom/daaw/ll0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zy1;->l()V

    return-void

    :cond_9
    const/4 v5, 0x0

    invoke-virtual {v3}, Landroidx/work/ListenableWorker;->isUsed()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v3, Lcom/daaw/zy1;->I:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v4, v4, Lcom/daaw/qy1;->c:Ljava/lang/String;

    aput-object v4, v2, v5

    const-string v4, "Received an already-used Worker %s; WorkerFactory should return new instances"

    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v3, v2, v4}, Lcom/daaw/ll0;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zy1;->l()V

    return-void

    :cond_a
    iget-object v2, v1, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    invoke-virtual {v2}, Landroidx/work/ListenableWorker;->setUsed()V

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zy1;->o()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zy1;->n()Z

    move-result v2

    if-eqz v2, :cond_b

    return-void

    :cond_b
    invoke-static {}, Lcom/daaw/sb1;->u()Lcom/daaw/sb1;

    move-result-object v2

    new-instance v9, Lcom/daaw/wx1;

    iget-object v4, v1, Lcom/daaw/zy1;->p:Landroid/content/Context;

    iget-object v5, v1, Lcom/daaw/zy1;->t:Lcom/daaw/qy1;

    iget-object v6, v1, Lcom/daaw/zy1;->u:Landroidx/work/ListenableWorker;

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->b()Lcom/daaw/j30;

    move-result-object v7

    iget-object v8, v1, Lcom/daaw/zy1;->v:Lcom/daaw/wj1;

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/daaw/wx1;-><init>(Landroid/content/Context;Lcom/daaw/qy1;Landroidx/work/ListenableWorker;Lcom/daaw/j30;Lcom/daaw/wj1;)V

    iget-object v0, v1, Lcom/daaw/zy1;->v:Lcom/daaw/wj1;

    invoke-interface {v0}, Lcom/daaw/wj1;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v9}, Lcom/daaw/wx1;->a()Lcom/daaw/fk0;

    move-result-object v0

    new-instance v3, Lcom/daaw/zy1$a;

    invoke-direct {v3, v1, v0, v2}, Lcom/daaw/zy1$a;-><init>(Lcom/daaw/zy1;Lcom/daaw/fk0;Lcom/daaw/sb1;)V

    iget-object v4, v1, Lcom/daaw/zy1;->v:Lcom/daaw/wj1;

    invoke-interface {v4}, Lcom/daaw/wj1;->a()Ljava/util/concurrent/Executor;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Lcom/daaw/fk0;->d(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, v1, Lcom/daaw/zy1;->E:Ljava/lang/String;

    new-instance v3, Lcom/daaw/zy1$b;

    invoke-direct {v3, v1, v2, v0}, Lcom/daaw/zy1$b;-><init>(Lcom/daaw/zy1;Lcom/daaw/sb1;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/daaw/zy1;->v:Lcom/daaw/wj1;

    invoke-interface {v0}, Lcom/daaw/wj1;->c()Lcom/daaw/mb1;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lcom/daaw/i;->d(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_3

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/zy1;->j()V

    :goto_3
    return-void

    :catchall_0
    move-exception v0

    iget-object v2, v1, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lcom/daaw/b61;->g()V

    goto :goto_5

    :goto_4
    throw v0

    :goto_5
    goto :goto_4
.end method

.method public l()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/daaw/zy1;->e(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/zy1;->w:Landroidx/work/ListenableWorker$a;

    check-cast v1, Landroidx/work/ListenableWorker$a$a;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker$a$a;->e()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v3, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Lcom/daaw/ry1;->g(Ljava/lang/String;Landroidx/work/b;)V

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lcom/daaw/b61;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    throw v1
.end method

.method public final m()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    sget-object v2, Lcom/daaw/yx1;->r:Lcom/daaw/yx1;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    aput-object v5, v4, v0

    invoke-interface {v1, v2, v4}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    iget-object v1, p0, Lcom/daaw/zy1;->w:Landroidx/work/ListenableWorker$a;

    check-cast v1, Landroidx/work/ListenableWorker$a$c;

    invoke-virtual {v1}, Landroidx/work/ListenableWorker$a$c;->e()Landroidx/work/b;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v4, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v2, v4, v1}, Lcom/daaw/ry1;->g(Ljava/lang/String;Landroidx/work/b;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-object v4, p0, Lcom/daaw/zy1;->B:Lcom/daaw/bt;

    iget-object v5, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v4, v5}, Lcom/daaw/bt;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v6, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    invoke-interface {v6, v5}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v6

    sget-object v7, Lcom/daaw/yx1;->t:Lcom/daaw/yx1;

    if-ne v6, v7, :cond_0

    iget-object v6, p0, Lcom/daaw/zy1;->B:Lcom/daaw/bt;

    invoke-interface {v6, v5}, Lcom/daaw/bt;->b(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v6

    sget-object v7, Lcom/daaw/zy1;->I:Ljava/lang/String;

    const-string v8, "Setting status to enqueued for %s"

    new-array v9, v3, [Ljava/lang/Object;

    aput-object v5, v9, v0

    invoke-static {v8, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    new-array v9, v0, [Ljava/lang/Throwable;

    invoke-virtual {v6, v7, v8, v9}, Lcom/daaw/ll0;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v6, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    sget-object v7, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    new-array v8, v3, [Ljava/lang/String;

    aput-object v5, v8, v0

    invoke-interface {v6, v7, v8}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    iget-object v6, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    invoke-interface {v6, v5, v1, v2}, Lcom/daaw/ry1;->s(Ljava/lang/String;J)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Lcom/daaw/b61;->g()V

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public final n()Z
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/zy1;->H:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v0

    sget-object v2, Lcom/daaw/zy1;->I:Ljava/lang/String;

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/daaw/zy1;->E:Ljava/lang/String;

    aput-object v5, v4, v1

    const-string v5, "Work interrupted for %s"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v1, [Ljava/lang/Throwable;

    invoke-virtual {v0, v2, v4, v5}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v2, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/daaw/zy1;->i(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/yx1;->a()Z

    move-result v0

    xor-int/2addr v0, v3

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->i(Z)V

    :goto_0
    return v3

    :cond_1
    return v1
.end method

.method public final o()Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v0

    sget-object v1, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    sget-object v1, Lcom/daaw/yx1;->q:Lcom/daaw/yx1;

    new-array v4, v2, [Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    aput-object v5, v4, v3

    invoke-interface {v0, v1, v4}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    iget-object v0, p0, Lcom/daaw/zy1;->A:Lcom/daaw/ry1;

    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/daaw/ry1;->r(Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    return v2

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/zy1;->z:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Lcom/daaw/b61;->g()V

    throw v0
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zy1;->C:Lcom/daaw/uy1;

    iget-object v1, p0, Lcom/daaw/zy1;->q:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/daaw/uy1;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zy1;->D:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/daaw/zy1;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/zy1;->E:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/zy1;->k()V

    return-void
.end method
