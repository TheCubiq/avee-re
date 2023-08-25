.class public abstract Lcom/daaw/fy;
.super Lcom/daaw/dy;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/dy;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract f0()Ljava/lang/Thread;
.end method

.method public g0(JLcom/daaw/ey$a;)V
    .locals 1

    sget-object v0, Lcom/daaw/uq;->v:Lcom/daaw/uq;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/ey;->s0(JLcom/daaw/ey$a;)V

    return-void
.end method

.method public final h0()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/fy;->f0()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    invoke-static {}, Lcom/daaw/r;->a()Lcom/daaw/q;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
