.class public final Lcom/daaw/u77;
.super Lcom/daaw/e77;
.source ""


# instance fields
.field public final r:Ljava/util/concurrent/Callable;

.field public final synthetic s:Lcom/daaw/v77;


# direct methods
.method public constructor <init>(Lcom/daaw/v77;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/u77;->s:Lcom/daaw/v77;

    invoke-direct {p0}, Lcom/daaw/e77;-><init>()V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/u77;->r:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u77;->r:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/u77;->r:Ljava/util/concurrent/Callable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final d(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u77;->s:Lcom/daaw/v77;

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->i(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/u77;->s:Lcom/daaw/v77;

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->h(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/u77;->s:Lcom/daaw/v77;

    invoke-virtual {v0}, Lcom/daaw/c57;->isDone()Z

    move-result v0

    return v0
.end method
