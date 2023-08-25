.class public final Lcom/daaw/vm6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/String;

.field public final c:Lcom/daaw/f77;

.field public final d:Ljava/util/List;

.field public final e:Lcom/daaw/f77;

.field public final synthetic f:Lcom/daaw/wm6;


# direct methods
.method public constructor <init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/vm6;->a:Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/vm6;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/vm6;->c:Lcom/daaw/f77;

    iput-object p5, p0, Lcom/daaw/vm6;->d:Ljava/util/List;

    iput-object p6, p0, Lcom/daaw/vm6;->e:Lcom/daaw/f77;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;Lcom/daaw/rm6;)V
    .locals 7

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/gm6;
    .locals 4

    new-instance v0, Lcom/daaw/gm6;

    iget-object v1, p0, Lcom/daaw/vm6;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/vm6;->b:Ljava/lang/String;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    invoke-virtual {v2, v1}, Lcom/daaw/wm6;->f(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_0
    iget-object v3, p0, Lcom/daaw/vm6;->e:Lcom/daaw/f77;

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/gm6;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;)V

    iget-object v1, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    invoke-static {v1}, Lcom/daaw/wm6;->c(Lcom/daaw/wm6;)Lcom/daaw/xm6;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/daaw/xm6;->i0(Lcom/daaw/gm6;)V

    iget-object v1, p0, Lcom/daaw/vm6;->c:Lcom/daaw/f77;

    new-instance v2, Lcom/daaw/mm6;

    invoke-direct {v2, p0, v0}, Lcom/daaw/mm6;-><init>(Lcom/daaw/vm6;Lcom/daaw/gm6;)V

    sget-object v3, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-interface {v1, v2, v3}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    new-instance v1, Lcom/daaw/qm6;

    invoke-direct {v1, p0, v0}, Lcom/daaw/qm6;-><init>(Lcom/daaw/vm6;Lcom/daaw/gm6;)V

    invoke-static {v0, v1, v3}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lcom/daaw/vm6;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/wm6;->b(Ljava/lang/Object;Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Class;Lcom/daaw/w57;)Lcom/daaw/vm6;
    .locals 8

    new-instance v7, Lcom/daaw/vm6;

    iget-object v1, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    iget-object v2, p0, Lcom/daaw/vm6;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/vm6;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/vm6;->c:Lcom/daaw/f77;

    iget-object v5, p0, Lcom/daaw/vm6;->d:Ljava/util/List;

    iget-object v0, p0, Lcom/daaw/vm6;->e:Lcom/daaw/f77;

    invoke-static {v1}, Lcom/daaw/wm6;->e(Lcom/daaw/wm6;)Lcom/daaw/g77;

    move-result-object v6

    invoke-static {v0, p1, p2, v6}, Lcom/daaw/s67;->g(Lcom/daaw/f77;Ljava/lang/Class;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;)V

    return-object v7
.end method

.method public final d(Lcom/daaw/f77;)Lcom/daaw/vm6;
    .locals 1

    new-instance v0, Lcom/daaw/nm6;

    invoke-direct {v0, p1}, Lcom/daaw/nm6;-><init>(Lcom/daaw/f77;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/vm6;->g(Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/vm6;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lcom/daaw/em6;)Lcom/daaw/vm6;
    .locals 1

    new-instance v0, Lcom/daaw/pm6;

    invoke-direct {v0, p1}, Lcom/daaw/pm6;-><init>(Lcom/daaw/em6;)V

    invoke-virtual {p0, v0}, Lcom/daaw/vm6;->f(Lcom/daaw/w57;)Lcom/daaw/vm6;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lcom/daaw/w57;)Lcom/daaw/vm6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    invoke-static {v0}, Lcom/daaw/wm6;->e(Lcom/daaw/wm6;)Lcom/daaw/g77;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/vm6;->g(Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/vm6;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/vm6;
    .locals 8

    new-instance v7, Lcom/daaw/vm6;

    iget-object v1, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    iget-object v2, p0, Lcom/daaw/vm6;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/vm6;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/vm6;->c:Lcom/daaw/f77;

    iget-object v5, p0, Lcom/daaw/vm6;->d:Ljava/util/List;

    iget-object v0, p0, Lcom/daaw/vm6;->e:Lcom/daaw/f77;

    invoke-static {v0, p1, p2}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;)V

    return-object v7
.end method

.method public final h(Ljava/lang/String;)Lcom/daaw/vm6;
    .locals 8

    new-instance v7, Lcom/daaw/vm6;

    iget-object v1, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    iget-object v2, p0, Lcom/daaw/vm6;->a:Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/vm6;->c:Lcom/daaw/f77;

    iget-object v5, p0, Lcom/daaw/vm6;->d:Ljava/util/List;

    iget-object v6, p0, Lcom/daaw/vm6;->e:Lcom/daaw/f77;

    move-object v0, v7

    move-object v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;)V

    return-object v7
.end method

.method public final i(JLjava/util/concurrent/TimeUnit;)Lcom/daaw/vm6;
    .locals 8

    new-instance v7, Lcom/daaw/vm6;

    iget-object v1, p0, Lcom/daaw/vm6;->f:Lcom/daaw/wm6;

    iget-object v2, p0, Lcom/daaw/vm6;->a:Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/vm6;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/vm6;->c:Lcom/daaw/f77;

    iget-object v5, p0, Lcom/daaw/vm6;->d:Ljava/util/List;

    iget-object v0, p0, Lcom/daaw/vm6;->e:Lcom/daaw/f77;

    invoke-static {v1}, Lcom/daaw/wm6;->g(Lcom/daaw/wm6;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    invoke-static {v0, p1, p2, p3, v6}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;)V

    return-object v7
.end method
