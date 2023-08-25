.class public Lcom/daaw/by1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lcom/daaw/ly;

.field public final c:Lcom/daaw/py1;

.field public final d:Lcom/daaw/ri1;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/ly;Lcom/daaw/py1;Lcom/daaw/ri1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/by1;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/by1;->b:Lcom/daaw/ly;

    iput-object p3, p0, Lcom/daaw/by1;->c:Lcom/daaw/py1;

    iput-object p4, p0, Lcom/daaw/by1;->d:Lcom/daaw/ri1;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/by1;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lcom/daaw/by1;->d()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/by1;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/by1;->e()V

    return-void
.end method

.method private synthetic d()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/by1;->b:Lcom/daaw/ly;

    invoke-interface {v0}, Lcom/daaw/ly;->o()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/sn1;

    iget-object v2, p0, Lcom/daaw/by1;->c:Lcom/daaw/py1;

    const/4 v3, 0x1

    invoke-interface {v2, v1, v3}, Lcom/daaw/py1;->a(Lcom/daaw/sn1;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic e()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/by1;->d:Lcom/daaw/ri1;

    new-instance v1, Lcom/daaw/zx1;

    invoke-direct {v1, p0}, Lcom/daaw/zx1;-><init>(Lcom/daaw/by1;)V

    invoke-interface {v0, v1}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/by1;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/ay1;

    invoke-direct {v1, p0}, Lcom/daaw/ay1;-><init>(Lcom/daaw/by1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
