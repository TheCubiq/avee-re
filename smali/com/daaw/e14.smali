.class public Lcom/daaw/e14;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/f77;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final p:Lcom/daaw/o77;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/o77;->D()Lcom/daaw/o77;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    return-void
.end method

.method public static final a(Z)Z
    .locals 3

    if-nez p0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Provided SettableFuture with multiple values."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    const-string v2, "SettableFuture"

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qz3;->t(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_0
    return p0
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    invoke-virtual {v0, p1}, Lcom/daaw/o77;->h(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lcom/daaw/e14;->a(Z)Z

    return p1
.end method

.method public final c(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    invoke-virtual {v0, p1}, Lcom/daaw/o77;->i(Ljava/lang/Throwable;)Z

    move-result p1

    invoke-static {p1}, Lcom/daaw/e14;->a(Z)Z

    return p1
.end method

.method public cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public final f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/c57;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    invoke-virtual {v0}, Lcom/daaw/c57;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/c57;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    invoke-virtual {v0}, Lcom/daaw/c57;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public final isDone()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/e14;->p:Lcom/daaw/o77;

    invoke-virtual {v0}, Lcom/daaw/c57;->isDone()Z

    move-result v0

    return v0
.end method
