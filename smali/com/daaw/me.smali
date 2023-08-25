.class public abstract Lcom/daaw/me;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uh1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/me$c;,
        Lcom/daaw/me$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/me$b;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lcom/daaw/yh1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Lcom/daaw/me$b;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/me$b;

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Lcom/daaw/me;->a:Ljava/util/ArrayDeque;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0xa

    const/4 v3, 0x0

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/daaw/me;->a:Ljava/util/ArrayDeque;

    new-instance v4, Lcom/daaw/me$b;

    invoke-direct {v4, v3}, Lcom/daaw/me$b;-><init>(Lcom/daaw/me$a;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v1, p0, Lcom/daaw/me;->b:Ljava/util/ArrayDeque;

    :goto_1
    const/4 v1, 0x2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/daaw/me;->b:Ljava/util/ArrayDeque;

    new-instance v2, Lcom/daaw/me$c;

    invoke-direct {v2, p0, v3}, Lcom/daaw/me$c;-><init>(Lcom/daaw/me;Lcom/daaw/me$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/PriorityQueue;

    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    iput-object v0, p0, Lcom/daaw/me;->c:Ljava/util/PriorityQueue;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(J)V
    .locals 0

    iput-wide p1, p0, Lcom/daaw/me;->e:J

    return-void
.end method

.method public bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/me;->i()Lcom/daaw/yh1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/me;->h()Lcom/daaw/xh1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/xh1;

    invoke-virtual {p0, p1}, Lcom/daaw/me;->k(Lcom/daaw/xh1;)V

    return-void
.end method

.method public abstract f()Lcom/daaw/th1;
.end method

.method public flush()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/me;->f:J

    iput-wide v0, p0, Lcom/daaw/me;->e:J

    :goto_0
    iget-object v0, p0, Lcom/daaw/me;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/me;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/me$b;

    invoke-virtual {p0, v0}, Lcom/daaw/me;->l(Lcom/daaw/me$b;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/daaw/me;->l(Lcom/daaw/me$b;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    :cond_1
    return-void
.end method

.method public abstract g(Lcom/daaw/xh1;)V
.end method

.method public h()Lcom/daaw/xh1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/me;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/daaw/me;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/me$b;

    iput-object v0, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    return-object v0
.end method

.method public i()Lcom/daaw/yh1;
    .locals 9

    iget-object v0, p0, Lcom/daaw/me;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/daaw/me;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/me;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/me$b;

    iget-wide v2, v0, Lcom/daaw/gq;->s:J

    iget-wide v4, p0, Lcom/daaw/me;->e:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/me;->c:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/me$b;

    invoke-virtual {v0}, Lcom/daaw/rc;->j()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v1, p0, Lcom/daaw/me;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/yh1;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/daaw/rc;->e(I)V

    :goto_1
    invoke-virtual {p0, v0}, Lcom/daaw/me;->l(Lcom/daaw/me$b;)V

    return-object v1

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/me;->g(Lcom/daaw/xh1;)V

    invoke-virtual {p0}, Lcom/daaw/me;->j()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/daaw/me;->f()Lcom/daaw/th1;

    move-result-object v6

    invoke-virtual {v0}, Lcom/daaw/rc;->i()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v1, p0, Lcom/daaw/me;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/yh1;

    iget-wide v4, v0, Lcom/daaw/gq;->s:J

    const-wide v7, 0x7fffffffffffffffL

    move-object v3, v1

    invoke-virtual/range {v3 .. v8}, Lcom/daaw/yh1;->n(JLcom/daaw/th1;J)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v0}, Lcom/daaw/me;->l(Lcom/daaw/me$b;)V

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public abstract j()Z
.end method

.method public k(Lcom/daaw/xh1;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lcom/daaw/s6;->a(Z)V

    invoke-virtual {p1}, Lcom/daaw/rc;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    invoke-virtual {p0, p1}, Lcom/daaw/me;->l(Lcom/daaw/me$b;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    iget-wide v0, p0, Lcom/daaw/me;->f:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/daaw/me;->f:J

    invoke-static {p1, v0, v1}, Lcom/daaw/me$b;->s(Lcom/daaw/me$b;J)J

    iget-object p1, p0, Lcom/daaw/me;->c:Ljava/util/PriorityQueue;

    iget-object v0, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    :goto_1
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/me;->d:Lcom/daaw/me$b;

    return-void
.end method

.method public final l(Lcom/daaw/me$b;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/gq;->f()V

    iget-object v0, p0, Lcom/daaw/me;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public m(Lcom/daaw/yh1;)V
    .locals 1

    invoke-virtual {p1}, Lcom/daaw/yh1;->f()V

    iget-object v0, p0, Lcom/daaw/me;->b:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method
