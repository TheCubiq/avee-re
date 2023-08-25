.class public final Lcom/daaw/d67;
.super Lcom/daaw/e67;
.source ""


# instance fields
.field public final t:Ljava/util/concurrent/Callable;

.field public final synthetic u:Lcom/daaw/f67;


# direct methods
.method public constructor <init>(Lcom/daaw/f67;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/d67;->u:Lcom/daaw/f67;

    invoke-direct {p0, p1, p3}, Lcom/daaw/e67;-><init>(Lcom/daaw/f67;Ljava/util/concurrent/Executor;)V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/d67;->t:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d67;->t:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/d67;->t:Ljava/util/concurrent/Callable;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d67;->u:Lcom/daaw/f67;

    invoke-virtual {v0, p1}, Lcom/daaw/c57;->h(Ljava/lang/Object;)Z

    return-void
.end method
