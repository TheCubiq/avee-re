.class public Lcom/daaw/k70;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lcom/daaw/fx;

.field public c:Lcom/daaw/bc;

.field public d:Lcom/daaw/ep0;

.field public e:Ljava/util/concurrent/ExecutorService;

.field public f:Ljava/util/concurrent/ExecutorService;

.field public g:Lcom/daaw/cq;

.field public h:Lcom/daaw/ut$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/k70;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/e70;
    .locals 7

    iget-object v0, p0, Lcom/daaw/k70;->e:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-instance v2, Lcom/daaw/r00;

    invoke-direct {v2, v0}, Lcom/daaw/r00;-><init>(I)V

    iput-object v2, p0, Lcom/daaw/k70;->e:Ljava/util/concurrent/ExecutorService;

    :cond_0
    iget-object v0, p0, Lcom/daaw/k70;->f:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/r00;

    invoke-direct {v0, v1}, Lcom/daaw/r00;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/k70;->f:Ljava/util/concurrent/ExecutorService;

    :cond_1
    new-instance v0, Lcom/daaw/fp0;

    iget-object v1, p0, Lcom/daaw/k70;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/daaw/fp0;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/daaw/k70;->c:Lcom/daaw/bc;

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lcom/daaw/fp0;->a()I

    move-result v1

    new-instance v2, Lcom/daaw/ul0;

    invoke-direct {v2, v1}, Lcom/daaw/ul0;-><init>(I)V

    iput-object v2, p0, Lcom/daaw/k70;->c:Lcom/daaw/bc;

    :cond_2
    iget-object v1, p0, Lcom/daaw/k70;->d:Lcom/daaw/ep0;

    if-nez v1, :cond_3

    new-instance v1, Lcom/daaw/yl0;

    invoke-virtual {v0}, Lcom/daaw/fp0;->c()I

    move-result v0

    invoke-direct {v1, v0}, Lcom/daaw/yl0;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/k70;->d:Lcom/daaw/ep0;

    :cond_3
    iget-object v0, p0, Lcom/daaw/k70;->h:Lcom/daaw/ut$a;

    if-nez v0, :cond_4

    new-instance v0, Lcom/daaw/rg0;

    iget-object v1, p0, Lcom/daaw/k70;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/daaw/rg0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/daaw/k70;->h:Lcom/daaw/ut$a;

    :cond_4
    iget-object v0, p0, Lcom/daaw/k70;->b:Lcom/daaw/fx;

    if-nez v0, :cond_5

    new-instance v0, Lcom/daaw/fx;

    iget-object v1, p0, Lcom/daaw/k70;->d:Lcom/daaw/ep0;

    iget-object v2, p0, Lcom/daaw/k70;->h:Lcom/daaw/ut$a;

    iget-object v3, p0, Lcom/daaw/k70;->f:Ljava/util/concurrent/ExecutorService;

    iget-object v4, p0, Lcom/daaw/k70;->e:Ljava/util/concurrent/ExecutorService;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/fx;-><init>(Lcom/daaw/ep0;Lcom/daaw/ut$a;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, Lcom/daaw/k70;->b:Lcom/daaw/fx;

    :cond_5
    iget-object v0, p0, Lcom/daaw/k70;->g:Lcom/daaw/cq;

    if-nez v0, :cond_6

    sget-object v0, Lcom/daaw/cq;->s:Lcom/daaw/cq;

    iput-object v0, p0, Lcom/daaw/k70;->g:Lcom/daaw/cq;

    :cond_6
    new-instance v0, Lcom/daaw/e70;

    iget-object v2, p0, Lcom/daaw/k70;->b:Lcom/daaw/fx;

    iget-object v3, p0, Lcom/daaw/k70;->d:Lcom/daaw/ep0;

    iget-object v4, p0, Lcom/daaw/k70;->c:Lcom/daaw/bc;

    iget-object v5, p0, Lcom/daaw/k70;->a:Landroid/content/Context;

    iget-object v6, p0, Lcom/daaw/k70;->g:Lcom/daaw/cq;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/e70;-><init>(Lcom/daaw/fx;Lcom/daaw/ep0;Lcom/daaw/bc;Landroid/content/Context;Lcom/daaw/cq;)V

    return-object v0
.end method
