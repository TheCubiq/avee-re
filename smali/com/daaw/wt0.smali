.class public abstract Lcom/daaw/wt0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/daaw/td;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/daaw/uj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/uj<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/wt0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput-boolean p1, p0, Lcom/daaw/wt0;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/td;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/wt0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract b()V
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wt0;->a:Z

    return v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wt0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/td;

    invoke-interface {v1}, Lcom/daaw/td;->cancel()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Lcom/daaw/td;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/wt0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/daaw/wt0;->a:Z

    iget-object v0, p0, Lcom/daaw/wt0;->c:Lcom/daaw/uj;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/daaw/uj;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public g(Lcom/daaw/uj;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/uj<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/wt0;->c:Lcom/daaw/uj;

    return-void
.end method
