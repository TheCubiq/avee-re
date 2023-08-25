.class public Lcom/daaw/yk0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/yk0$a;
    }
.end annotation


# static fields
.field public static final synthetic p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile synthetic _next:Ljava/lang/Object;

.field public volatile synthetic _prev:Ljava/lang/Object;

.field private volatile synthetic _removedRef:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-class v1, Lcom/daaw/yk0;

    const-string v2, "_next"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lcom/daaw/yk0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "_prev"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    sput-object v2, Lcom/daaw/yk0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v2, "_removedRef"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/yk0;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/daaw/yk0;->_next:Ljava/lang/Object;

    iput-object p0, p0, Lcom/daaw/yk0;->_prev:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/yk0;->_removedRef:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic f(Lcom/daaw/yk0;Lcom/daaw/yk0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/yk0;->j(Lcom/daaw/yk0;)V

    return-void
.end method


# virtual methods
.method public final g(Lcom/daaw/yk0;)Z
    .locals 1

    sget-object v0, Lcom/daaw/yk0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/daaw/yk0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/yk0;->k()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v0, Lcom/daaw/yk0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v0, p0, p0, p1}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, Lcom/daaw/yk0;->j(Lcom/daaw/yk0;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final h(Lcom/daaw/pu0;)Lcom/daaw/yk0;
    .locals 7

    :goto_0
    iget-object v0, p0, Lcom/daaw/yk0;->_prev:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/yk0;

    const/4 v1, 0x0

    move-object v2, v0

    :goto_1
    move-object v3, v1

    :goto_2
    iget-object v4, v2, Lcom/daaw/yk0;->_next:Ljava/lang/Object;

    if-ne v4, p0, :cond_2

    if-ne v0, v2, :cond_0

    return-object v2

    :cond_0
    sget-object v1, Lcom/daaw/yk0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p0, v0, v2}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    return-object v2

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/yk0;->n()Z

    move-result v5

    if-eqz v5, :cond_3

    return-object v1

    :cond_3
    if-ne v4, p1, :cond_4

    return-object v2

    :cond_4
    instance-of v5, v4, Lcom/daaw/pu0;

    if-eqz v5, :cond_6

    if-eqz p1, :cond_5

    move-object v0, v4

    check-cast v0, Lcom/daaw/pu0;

    invoke-virtual {p1, v0}, Lcom/daaw/pu0;->b(Lcom/daaw/pu0;)Z

    move-result v0

    if-eqz v0, :cond_5

    return-object v1

    :cond_5
    check-cast v4, Lcom/daaw/pu0;

    invoke-virtual {v4, v2}, Lcom/daaw/pu0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    instance-of v5, v4, Lcom/daaw/u31;

    if-eqz v5, :cond_9

    if-eqz v3, :cond_8

    sget-object v5, Lcom/daaw/yk0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    check-cast v4, Lcom/daaw/u31;

    iget-object v4, v4, Lcom/daaw/u31;->a:Lcom/daaw/yk0;

    invoke-static {v5, v3, v2, v4}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    move-object v2, v3

    goto :goto_1

    :cond_8
    iget-object v2, v2, Lcom/daaw/yk0;->_prev:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/yk0;

    goto :goto_2

    :cond_9
    move-object v3, v4

    check-cast v3, Lcom/daaw/yk0;

    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    goto :goto_2
.end method

.method public final i(Lcom/daaw/yk0;)Lcom/daaw/yk0;
    .locals 1

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/yk0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p1, Lcom/daaw/yk0;->_prev:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/yk0;

    goto :goto_0
.end method

.method public final j(Lcom/daaw/yk0;)V
    .locals 2

    :cond_0
    iget-object v0, p1, Lcom/daaw/yk0;->_prev:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/yk0;

    invoke-virtual {p0}, Lcom/daaw/yk0;->k()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, p1, :cond_1

    return-void

    :cond_1
    sget-object v1, Lcom/daaw/yk0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v1, p1, v0, p0}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/yk0;->n()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/yk0;->h(Lcom/daaw/pu0;)Lcom/daaw/yk0;

    :cond_2
    return-void
.end method

.method public final k()Ljava/lang/Object;
    .locals 2

    :goto_0
    iget-object v0, p0, Lcom/daaw/yk0;->_next:Ljava/lang/Object;

    instance-of v1, v0, Lcom/daaw/pu0;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    check-cast v0, Lcom/daaw/pu0;

    invoke-virtual {v0, p0}, Lcom/daaw/pu0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public final l()Lcom/daaw/yk0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/yk0;->k()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/xk0;->b(Ljava/lang/Object;)Lcom/daaw/yk0;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lcom/daaw/yk0;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/yk0;->h(Lcom/daaw/pu0;)Lcom/daaw/yk0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/yk0;->_prev:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/yk0;

    invoke-virtual {p0, v0}, Lcom/daaw/yk0;->i(Lcom/daaw/yk0;)Lcom/daaw/yk0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public n()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/yk0;->k()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/daaw/u31;

    return v0
.end method

.method public o()Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/yk0;->p()Lcom/daaw/yk0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p()Lcom/daaw/yk0;
    .locals 4

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/yk0;->k()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/u31;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/daaw/u31;

    iget-object v0, v0, Lcom/daaw/u31;->a:Lcom/daaw/yk0;

    return-object v0

    :cond_1
    if-ne v0, p0, :cond_2

    check-cast v0, Lcom/daaw/yk0;

    return-object v0

    :cond_2
    move-object v1, v0

    check-cast v1, Lcom/daaw/yk0;

    invoke-virtual {v1}, Lcom/daaw/yk0;->q()Lcom/daaw/u31;

    move-result-object v2

    sget-object v3, Lcom/daaw/yk0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, p0, v0, v2}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/daaw/yk0;->h(Lcom/daaw/pu0;)Lcom/daaw/yk0;

    return-object v0
.end method

.method public final q()Lcom/daaw/u31;
    .locals 2

    iget-object v0, p0, Lcom/daaw/yk0;->_removedRef:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/u31;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/u31;

    invoke-direct {v0, p0}, Lcom/daaw/u31;-><init>(Lcom/daaw/yk0;)V

    sget-object v1, Lcom/daaw/yk0;->r:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public final r(Lcom/daaw/yk0;Lcom/daaw/yk0;Lcom/daaw/yk0$a;)I
    .locals 1

    sget-object v0, Lcom/daaw/yk0;->q:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lcom/daaw/yk0;->p:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p3, Lcom/daaw/yk0$a;->c:Lcom/daaw/yk0;

    invoke-static {v0, p0, p2, p3}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p3, p0}, Lcom/daaw/e7;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Lcom/daaw/yk0$b;

    invoke-direct {v1, p0}, Lcom/daaw/yk0$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lcom/daaw/aq;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
