.class public final Lcom/daaw/o51;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/o51$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/daaw/i01<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final g:Lcom/daaw/bi;


# direct methods
.method public constructor <init>(Lcom/daaw/vh;Lcom/daaw/bi;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vh<",
            "*>;",
            "Lcom/daaw/bi;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/vh;->g()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/ys;

    invoke-virtual {v6}, Lcom/daaw/ys;->e()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v6}, Lcom/daaw/ys;->g()Z

    move-result v7

    invoke-virtual {v6}, Lcom/daaw/ys;->c()Lcom/daaw/i01;

    move-result-object v6

    if-eqz v7, :cond_0

    invoke-interface {v3, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v6}, Lcom/daaw/ys;->d()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6}, Lcom/daaw/ys;->c()Lcom/daaw/i01;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, Lcom/daaw/ys;->g()Z

    move-result v7

    invoke-virtual {v6}, Lcom/daaw/ys;->c()Lcom/daaw/i01;

    move-result-object v6

    if-eqz v7, :cond_3

    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v1, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lcom/daaw/vh;->k()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_5

    const-class v5, Lcom/daaw/e01;

    invoke-static {v5}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/o51;->a:Ljava/util/Set;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/o51;->b:Ljava/util/Set;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/o51;->c:Ljava/util/Set;

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/o51;->d:Ljava/util/Set;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/o51;->e:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/daaw/vh;->k()Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/o51;->f:Ljava/util/Set;

    iput-object p2, p0, Lcom/daaw/o51;->g:Lcom/daaw/bi;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/o51;->a:Ljava/util/Set;

    invoke-static {p1}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/o51;->g:Lcom/daaw/bi;

    invoke-interface {v0, p1}, Lcom/daaw/bi;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-class v1, Lcom/daaw/e01;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance p1, Lcom/daaw/o51$a;

    iget-object v1, p0, Lcom/daaw/o51;->f:Ljava/util/Set;

    check-cast v0, Lcom/daaw/e01;

    invoke-direct {p1, v1, v0}, Lcom/daaw/o51$a;-><init>(Ljava/util/Set;Lcom/daaw/e01;)V

    return-object p1

    :cond_1
    new-instance v0, Lcom/daaw/dt;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Attempting to request an undeclared dependency %s."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/dt;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lcom/daaw/i01;)Lcom/daaw/b01;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/i01<",
            "TT;>;)",
            "Lcom/daaw/b01<",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/o51;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/o51;->g:Lcom/daaw/bi;

    invoke-interface {v0, p1}, Lcom/daaw/bi;->b(Lcom/daaw/i01;)Lcom/daaw/b01;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/dt;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Attempting to request an undeclared dependency Provider<Set<%s>>."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/dt;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Lcom/daaw/i01;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/i01<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/o51;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/o51;->g:Lcom/daaw/bi;

    invoke-interface {v0, p1}, Lcom/daaw/bi;->c(Lcom/daaw/i01;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/dt;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Attempting to request an undeclared dependency %s."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/dt;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d(Ljava/lang/Class;)Lcom/daaw/b01;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/daaw/b01<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/o51;->g(Lcom/daaw/i01;)Lcom/daaw/b01;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/daaw/i01;)Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/i01<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/o51;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/o51;->g:Lcom/daaw/bi;

    invoke-interface {v0, p1}, Lcom/daaw/bi;->e(Lcom/daaw/i01;)Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/dt;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Attempting to request an undeclared dependency Set<%s>."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/dt;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public synthetic f(Ljava/lang/Class;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/ai;->f(Lcom/daaw/bi;Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/daaw/i01;)Lcom/daaw/b01;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/i01<",
            "TT;>;)",
            "Lcom/daaw/b01<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/o51;->b:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/o51;->g:Lcom/daaw/bi;

    invoke-interface {v0, p1}, Lcom/daaw/bi;->g(Lcom/daaw/i01;)Lcom/daaw/b01;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/dt;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Attempting to request an undeclared dependency Provider<%s>."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/dt;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public h(Lcom/daaw/i01;)Lcom/daaw/es;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/i01<",
            "TT;>;)",
            "Lcom/daaw/es<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/o51;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/o51;->g:Lcom/daaw/bi;

    invoke-interface {v0, p1}, Lcom/daaw/bi;->h(Lcom/daaw/i01;)Lcom/daaw/es;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/dt;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "Attempting to request an undeclared dependency Deferred<%s>."

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/dt;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(Ljava/lang/Class;)Lcom/daaw/es;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/daaw/es<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/daaw/i01;->b(Ljava/lang/Class;)Lcom/daaw/i01;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/o51;->h(Lcom/daaw/i01;)Lcom/daaw/es;

    move-result-object p1

    return-object p1
.end method
