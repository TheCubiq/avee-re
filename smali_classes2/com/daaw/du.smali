.class public final Lcom/daaw/du;
.super Lcom/daaw/h91;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/h91<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final synthetic s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic _decision:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/daaw/du;

    const-string v1, "_decision"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/du;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method


# virtual methods
.method public h(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/du;->i0(Ljava/lang/Object;)V

    return-void
.end method

.method public i0(Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/du;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    invoke-static {v0}, Lcom/daaw/vg0;->a(Lcom/daaw/gl;)Lcom/daaw/gl;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/h91;->r:Lcom/daaw/gl;

    invoke-static {p1, v1}, Lcom/daaw/rh;->a(Ljava/lang/Object;Lcom/daaw/gl;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lcom/daaw/cu;->c(Lcom/daaw/gl;Ljava/lang/Object;Lcom/daaw/z40;ILjava/lang/Object;)V

    return-void
.end method

.method public final l0()Z
    .locals 4

    :cond_0
    iget v0, p0, Lcom/daaw/du;->_decision:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-ne v0, v2, :cond_1

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already resumed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object v0, Lcom/daaw/du;->s:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v3, 0x2

    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2
.end method
