.class public final Lcom/daaw/j75;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lcom/daaw/nh4;

.field public final c:Lcom/daaw/ny4;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/nh4;Lcom/daaw/ny4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j75;->a:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/j75;->c:Lcom/daaw/ny4;

    iput-object p2, p0, Lcom/daaw/j75;->b:Lcom/daaw/nh4;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/a74;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/j75;->c:Lcom/daaw/ny4;

    invoke-interface {p1}, Lcom/daaw/a74;->g()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ny4;->C0(Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/j75;->c:Lcom/daaw/ny4;

    new-instance v1, Lcom/daaw/f75;

    invoke-direct {v1, p1}, Lcom/daaw/f75;-><init>(Lcom/daaw/a74;)V

    iget-object v2, p0, Lcom/daaw/j75;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lcom/daaw/j75;->c:Lcom/daaw/ny4;

    new-instance v1, Lcom/daaw/g75;

    invoke-direct {v1, p1}, Lcom/daaw/g75;-><init>(Lcom/daaw/a74;)V

    iget-object v2, p0, Lcom/daaw/j75;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lcom/daaw/j75;->c:Lcom/daaw/ny4;

    iget-object v1, p0, Lcom/daaw/j75;->b:Lcom/daaw/nh4;

    iget-object v2, p0, Lcom/daaw/j75;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Lcom/daaw/j75;->b:Lcom/daaw/nh4;

    invoke-virtual {v0, p1}, Lcom/daaw/nh4;->k(Lcom/daaw/a74;)V

    new-instance v0, Lcom/daaw/h75;

    invoke-direct {v0, p0}, Lcom/daaw/h75;-><init>(Lcom/daaw/j75;)V

    const-string v1, "/trackActiveViewUnit"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    new-instance v0, Lcom/daaw/i75;

    invoke-direct {v0, p0}, Lcom/daaw/i75;-><init>(Lcom/daaw/j75;)V

    const-string v1, "/untrackActiveViewUnit"

    invoke-interface {p1, v1, v0}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void
.end method

.method public final synthetic b(Lcom/daaw/a74;Ljava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/j75;->b:Lcom/daaw/nh4;

    invoke-virtual {p1}, Lcom/daaw/nh4;->c()V

    return-void
.end method

.method public final synthetic c(Lcom/daaw/a74;Ljava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/j75;->b:Lcom/daaw/nh4;

    invoke-virtual {p1}, Lcom/daaw/nh4;->b()V

    return-void
.end method
