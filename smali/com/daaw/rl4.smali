.class public final Lcom/daaw/rl4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/jt4;

.field public final b:Lcom/daaw/wv4;


# direct methods
.method public constructor <init>(Lcom/daaw/jt4;Lcom/daaw/wv4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rl4;->a:Lcom/daaw/jt4;

    iput-object p2, p0, Lcom/daaw/rl4;->b:Lcom/daaw/wv4;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/jt4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rl4;->a:Lcom/daaw/jt4;

    return-object v0
.end method

.method public final b()Lcom/daaw/wv4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rl4;->b:Lcom/daaw/wv4;

    return-object v0
.end method

.method public final c()Lcom/daaw/ly4;
    .locals 3

    iget-object v0, p0, Lcom/daaw/rl4;->b:Lcom/daaw/wv4;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/ly4;

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-direct {v1, v0, v2}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1

    :cond_0
    new-instance v0, Lcom/daaw/ly4;

    new-instance v1, Lcom/daaw/ql4;

    invoke-direct {v1, p0}, Lcom/daaw/ql4;-><init>(Lcom/daaw/rl4;)V

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-direct {v0, v1, v2}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
