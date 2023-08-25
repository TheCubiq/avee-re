.class public final Lcom/daaw/ek6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/LinkedList;

.field public final b:I

.field public final c:I

.field public final d:Lcom/daaw/fl6;


# direct methods
.method public constructor <init>(II)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    iput p1, p0, Lcom/daaw/ek6;->b:I

    iput p2, p0, Lcom/daaw/ek6;->c:I

    new-instance p1, Lcom/daaw/fl6;

    invoke-direct {p1}, Lcom/daaw/fl6;-><init>()V

    iput-object p1, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v0}, Lcom/daaw/fl6;->a()I

    move-result v0

    return v0
.end method

.method public final b()I
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ek6;->i()V

    iget-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    return v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v0}, Lcom/daaw/fl6;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v0}, Lcom/daaw/fl6;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e()Lcom/daaw/qk6;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v0}, Lcom/daaw/fl6;->f()V

    invoke-virtual {p0}, Lcom/daaw/ek6;->i()V

    iget-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qk6;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v1}, Lcom/daaw/fl6;->h()V

    :cond_1
    return-object v0
.end method

.method public final f()Lcom/daaw/el6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v0}, Lcom/daaw/fl6;->d()Lcom/daaw/el6;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v0}, Lcom/daaw/fl6;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lcom/daaw/qk6;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v0}, Lcom/daaw/fl6;->f()V

    invoke-virtual {p0}, Lcom/daaw/ek6;->i()V

    iget-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    iget v1, p0, Lcom/daaw/ek6;->b:I

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final i()V
    .locals 5

    :goto_0
    iget-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qk6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->a()J

    move-result-wide v1

    iget-wide v3, v0, Lcom/daaw/qk6;->d:J

    sub-long/2addr v1, v3

    iget v0, p0, Lcom/daaw/ek6;->c:I

    int-to-long v3, v0

    cmp-long v0, v1, v3

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ek6;->d:Lcom/daaw/fl6;

    invoke-virtual {v0}, Lcom/daaw/fl6;->g()V

    iget-object v0, p0, Lcom/daaw/ek6;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
