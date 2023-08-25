.class public Lcom/daaw/bm$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm;->G(Lcom/daaw/zb1;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/daaw/rj1<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:Ljava/lang/Thread;

.field public final synthetic d:Lcom/daaw/zb1;

.field public final synthetic e:Z

.field public final synthetic f:Lcom/daaw/bm;


# direct methods
.method public constructor <init>(Lcom/daaw/bm;JLjava/lang/Throwable;Ljava/lang/Thread;Lcom/daaw/zb1;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    iput-wide p2, p0, Lcom/daaw/bm$b;->a:J

    iput-object p4, p0, Lcom/daaw/bm$b;->b:Ljava/lang/Throwable;

    iput-object p5, p0, Lcom/daaw/bm$b;->c:Ljava/lang/Thread;

    iput-object p6, p0, Lcom/daaw/bm$b;->d:Lcom/daaw/zb1;

    iput-boolean p7, p0, Lcom/daaw/bm$b;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/rj1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lcom/daaw/bm$b;->a:J

    invoke-static {v0, v1}, Lcom/daaw/bm;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    invoke-static {v0}, Lcom/daaw/bm;->c(Lcom/daaw/bm;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v2, "Tried to write a fatal exception while no session was open."

    invoke-virtual {v0, v2}, Lcom/daaw/ml0;->d(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v2, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    invoke-static {v2}, Lcom/daaw/bm;->g(Lcom/daaw/bm;)Lcom/daaw/em;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/em;->a()Z

    iget-object v2, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    invoke-static {v2}, Lcom/daaw/bm;->h(Lcom/daaw/bm;)Lcom/daaw/pb1;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/bm$b;->b:Ljava/lang/Throwable;

    iget-object v4, p0, Lcom/daaw/bm$b;->c:Ljava/lang/Thread;

    move-object v5, v0

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/pb1;->r(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    iget-object v2, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    iget-wide v3, p0, Lcom/daaw/bm$b;->a:J

    invoke-static {v2, v3, v4}, Lcom/daaw/bm;->i(Lcom/daaw/bm;J)V

    iget-object v2, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    iget-object v3, p0, Lcom/daaw/bm$b;->d:Lcom/daaw/zb1;

    invoke-virtual {v2, v3}, Lcom/daaw/bm;->t(Lcom/daaw/zb1;)V

    iget-object v2, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    new-instance v3, Lcom/daaw/fd;

    iget-object v4, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    invoke-static {v4}, Lcom/daaw/bm;->j(Lcom/daaw/bm;)Lcom/daaw/ue0;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/daaw/fd;-><init>(Lcom/daaw/ue0;)V

    invoke-virtual {v3}, Lcom/daaw/fd;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/daaw/bm;->k(Lcom/daaw/bm;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    invoke-static {v2}, Lcom/daaw/bm;->l(Lcom/daaw/bm;)Lcom/daaw/ep;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/ep;->d()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/daaw/bm$b;->f:Lcom/daaw/bm;

    invoke-static {v1}, Lcom/daaw/bm;->m(Lcom/daaw/bm;)Lcom/daaw/zl;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/zl;->c()Ljava/util/concurrent/Executor;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/bm$b;->d:Lcom/daaw/zb1;

    invoke-interface {v2}, Lcom/daaw/zb1;->a()Lcom/daaw/rj1;

    move-result-object v2

    new-instance v3, Lcom/daaw/bm$b$a;

    invoke-direct {v3, p0, v1, v0}, Lcom/daaw/bm$b$a;-><init>(Lcom/daaw/bm$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Lcom/daaw/rj1;->p(Ljava/util/concurrent/Executor;Lcom/daaw/ai1;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bm$b;->a()Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method
