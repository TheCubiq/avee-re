.class public final Lcom/daaw/f67;
.super Lcom/daaw/o57;
.source ""


# instance fields
.field public E:Lcom/daaw/e67;
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/t17;ZLjava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/o57;-><init>(Lcom/daaw/t17;ZZ)V

    new-instance p1, Lcom/daaw/d67;

    invoke-direct {p1, p0, p4, p3}, Lcom/daaw/d67;-><init>(Lcom/daaw/f67;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/daaw/f67;->E:Lcom/daaw/e67;

    invoke-virtual {p0}, Lcom/daaw/o57;->S()V

    return-void
.end method

.method public static bridge synthetic W(Lcom/daaw/f67;Lcom/daaw/e67;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/f67;->E:Lcom/daaw/e67;

    return-void
.end method


# virtual methods
.method public final Q(ILjava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    return-void
.end method

.method public final R()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/f67;->E:Lcom/daaw/e67;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/e67;->i()V

    :cond_0
    return-void
.end method

.method public final V(I)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/o57;->V(I)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/f67;->E:Lcom/daaw/e67;

    :cond_0
    return-void
.end method

.method public final u()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/f67;->E:Lcom/daaw/e67;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/e77;->g()V

    :cond_0
    return-void
.end method
