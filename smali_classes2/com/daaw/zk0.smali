.class public Lcom/daaw/zk0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final synthetic a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _cur:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/daaw/zk0;

    const-class v1, Ljava/lang/Object;

    const-string v2, "_cur"

    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lcom/daaw/zk0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/al0;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p1}, Lcom/daaw/al0;-><init>(IZ)V

    iput-object v0, p0, Lcom/daaw/zk0;->_cur:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    :goto_0
    iget-object v0, p0, Lcom/daaw/zk0;->_cur:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/al0;

    invoke-virtual {v0, p1}, Lcom/daaw/al0;->a(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    const/4 v0, 0x2

    if-eq v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    sget-object v1, Lcom/daaw/zk0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Lcom/daaw/al0;->i()Lcom/daaw/al0;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final b()V
    .locals 3

    :goto_0
    iget-object v0, p0, Lcom/daaw/zk0;->_cur:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/al0;

    invoke-virtual {v0}, Lcom/daaw/al0;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    sget-object v1, Lcom/daaw/zk0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Lcom/daaw/al0;->i()Lcom/daaw/al0;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/zk0;->_cur:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/al0;

    invoke-virtual {v0}, Lcom/daaw/al0;->f()I

    move-result v0

    return v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    :goto_0
    iget-object v0, p0, Lcom/daaw/zk0;->_cur:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/al0;

    invoke-virtual {v0}, Lcom/daaw/al0;->j()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/daaw/al0;->h:Lcom/daaw/pi1;

    if-eq v1, v2, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Lcom/daaw/zk0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0}, Lcom/daaw/al0;->i()Lcom/daaw/al0;

    move-result-object v2

    invoke-static {v1, p0, v0, v2}, Lcom/daaw/j;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_0
.end method
