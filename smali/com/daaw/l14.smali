.class public Lcom/daaw/l14;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:Lcom/daaw/e14;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    iput-object v0, p0, Lcom/daaw/l14;->a:Lcom/daaw/e14;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Lcom/daaw/l14;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Lcom/daaw/j14;

    invoke-direct {v1, p0}, Lcom/daaw/j14;-><init>(Lcom/daaw/l14;)V

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, v2}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/l14;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    iget-object p0, p0, Lcom/daaw/l14;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/l14;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final c()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/l14;->a:Lcom/daaw/e14;

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/l14;->a:Lcom/daaw/e14;

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e(Lcom/daaw/i14;Lcom/daaw/g14;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/daaw/l14;->a:Lcom/daaw/e14;

    new-instance v1, Lcom/daaw/k14;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/k14;-><init>(Lcom/daaw/l14;Lcom/daaw/i14;Lcom/daaw/g14;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method
