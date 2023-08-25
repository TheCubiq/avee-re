.class public abstract Lcom/daaw/o57;
.super Lcom/daaw/u57;
.source ""


# static fields
.field public static final D:Ljava/util/logging/Logger;


# instance fields
.field public A:Lcom/daaw/t17;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field public final B:Z

.field public final C:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/daaw/o57;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/daaw/o57;->D:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/t17;ZZ)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/daaw/u57;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    iput-boolean p2, p0, Lcom/daaw/o57;->B:Z

    iput-boolean p3, p0, Lcom/daaw/o57;->C:Z

    return-void
.end method

.method public static O(Ljava/lang/Throwable;)V
    .locals 7

    instance-of v0, p0, Ljava/lang/Error;

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    const-string v0, "Got more than one input Future failure. Logging failures after the first"

    goto :goto_0

    :cond_0
    const-string v0, "Input Future failed with Error"

    :goto_0
    move-object v5, v0

    sget-object v1, Lcom/daaw/o57;->D:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "com.google.common.util.concurrent.AggregateFuture"

    const-string v4, "log"

    move-object v6, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static P(Ljava/util/Set;Ljava/lang/Throwable;)Z
    .locals 1

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final K(Ljava/util/Set;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/daaw/c57;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/c57;->a()Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Lcom/daaw/o57;->P(Ljava/util/Set;Ljava/lang/Throwable;)Z

    :cond_0
    return-void
.end method

.method public final L(ILjava/util/concurrent/Future;)V
    .locals 0

    :try_start_0
    invoke-static {p2}, Lcom/daaw/s67;->p(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o57;->Q(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/o57;->N(Ljava/lang/Throwable;)V

    return-void

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/o57;->N(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final M(Lcom/daaw/t17;)V
    .locals 4
    .param p1    # Lcom/daaw/t17;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/daaw/u57;->E()I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Less than 0 remaining futures"

    invoke-static {v2, v3}, Lcom/daaw/sy6;->i(ZLjava/lang/Object;)V

    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/daaw/t17;->j()Lcom/daaw/c47;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p0, v1, v0}, Lcom/daaw/o57;->L(ILjava/util/concurrent/Future;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/u57;->J()V

    invoke-virtual {p0}, Lcom/daaw/o57;->R()V

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lcom/daaw/o57;->V(I)V

    :cond_3
    return-void
.end method

.method public final N(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lcom/daaw/o57;->B:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/c57;->i(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/u57;->G()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/daaw/o57;->P(Ljava/util/Set;Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/daaw/o57;->O(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :goto_0
    instance-of v0, p1, Ljava/lang/Error;

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/daaw/o57;->O(Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method

.method public abstract Q(ILjava/lang/Object;)V
.end method

.method public abstract R()V
.end method

.method public final S()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/o57;->R()V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/o57;->B:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    invoke-virtual {v0}, Lcom/daaw/t17;->j()Lcom/daaw/c47;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/f77;

    add-int/lit8 v3, v1, 0x1

    new-instance v4, Lcom/daaw/m57;

    invoke-direct {v4, p0, v2, v1}, Lcom/daaw/m57;-><init>(Lcom/daaw/o57;Lcom/daaw/f77;I)V

    sget-object v1, Lcom/daaw/g67;->p:Lcom/daaw/g67;

    invoke-interface {v2, v4, v1}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move v1, v3

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/o57;->C:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    new-instance v1, Lcom/daaw/n57;

    invoke-direct {v1, p0, v0}, Lcom/daaw/n57;-><init>(Lcom/daaw/o57;Lcom/daaw/t17;)V

    iget-object v0, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    invoke-virtual {v0}, Lcom/daaw/t17;->j()Lcom/daaw/c47;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/f77;

    sget-object v3, Lcom/daaw/g67;->p:Lcom/daaw/g67;

    invoke-interface {v2, v1, v3}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final synthetic T(Lcom/daaw/f77;I)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    iput-object v0, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/c57;->cancel(Z)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2, p1}, Lcom/daaw/o57;->L(ILjava/util/concurrent/Future;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/daaw/o57;->M(Lcom/daaw/t17;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, v0}, Lcom/daaw/o57;->M(Lcom/daaw/t17;)V

    throw p1
.end method

.method public final synthetic U(Lcom/daaw/t17;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/o57;->M(Lcom/daaw/t17;)V

    return-void
.end method

.method public V(I)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 2
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "futures="

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/daaw/c57;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/o57;->A:Lcom/daaw/t17;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/daaw/o57;->V(I)V

    invoke-virtual {p0}, Lcom/daaw/c57;->isCancelled()Z

    move-result v2

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/c57;->x()Z

    move-result v1

    invoke-virtual {v0}, Lcom/daaw/t17;->j()Lcom/daaw/c47;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;

    invoke-interface {v2, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    goto :goto_1

    :cond_1
    return-void
.end method
