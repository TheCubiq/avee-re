.class public final Lcom/daaw/jm3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/jl3;

.field public b:Lcom/daaw/f77;


# direct methods
.method public constructor <init>(Lcom/daaw/jl3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jm3;->a:Lcom/daaw/jl3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/mm3;
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/jm3;->d()V

    new-instance p1, Lcom/daaw/mm3;

    iget-object v0, p0, Lcom/daaw/jm3;->b:Lcom/daaw/f77;

    const-string v1, "google.afma.activeView.handleUpdate"

    invoke-direct {p1, v0, v1, p2, p3}, Lcom/daaw/mm3;-><init>(Lcom/daaw/f77;Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)V

    return-object p1
.end method

.method public final b(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/jm3;->d()V

    iget-object v0, p0, Lcom/daaw/jm3;->b:Lcom/daaw/f77;

    new-instance v1, Lcom/daaw/cm3;

    invoke-direct {v1, p1, p2}, Lcom/daaw/cm3;-><init>(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/jm3;->b:Lcom/daaw/f77;

    return-void
.end method

.method public final c(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jm3;->b:Lcom/daaw/f77;

    new-instance v1, Lcom/daaw/dm3;

    invoke-direct {v1, p1, p2}, Lcom/daaw/dm3;-><init>(Ljava/lang/String;Lcom/daaw/zg3;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/jm3;->b:Lcom/daaw/f77;

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/jm3;->b:Lcom/daaw/f77;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    iput-object v0, p0, Lcom/daaw/jm3;->b:Lcom/daaw/f77;

    iget-object v1, p0, Lcom/daaw/jm3;->a:Lcom/daaw/jl3;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/daaw/jl3;->b(Lcom/daaw/sl2;)Lcom/daaw/al3;

    move-result-object v1

    new-instance v2, Lcom/daaw/hm3;

    invoke-direct {v2, v0}, Lcom/daaw/hm3;-><init>(Lcom/daaw/e14;)V

    new-instance v3, Lcom/daaw/im3;

    invoke-direct {v3, v0}, Lcom/daaw/im3;-><init>(Lcom/daaw/e14;)V

    invoke-virtual {v1, v2, v3}, Lcom/daaw/l14;->e(Lcom/daaw/i14;Lcom/daaw/g14;)V

    :cond_0
    return-void
.end method
