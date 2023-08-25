.class public final Lcom/daaw/ws5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Lcom/daaw/zj4;

.field public final b:Lcom/daaw/as5;

.field public final c:Lcom/daaw/g77;

.field public final d:Lcom/daaw/nq4;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;


# direct methods
.method public constructor <init>(Lcom/daaw/zj4;Lcom/daaw/as5;Lcom/daaw/nq4;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/g77;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ws5;->a:Lcom/daaw/zj4;

    iput-object p2, p0, Lcom/daaw/ws5;->b:Lcom/daaw/as5;

    iput-object p3, p0, Lcom/daaw/ws5;->d:Lcom/daaw/nq4;

    iput-object p4, p0, Lcom/daaw/ws5;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p5, p0, Lcom/daaw/ws5;->c:Lcom/daaw/g77;

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/ws5;)Lcom/daaw/zj4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ws5;->a:Lcom/daaw/zj4;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/ws5;)Lcom/daaw/nq4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ws5;->d:Lcom/daaw/nq4;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 1

    iget-object v0, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v0, v0, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    invoke-virtual {v0}, Lcom/daaw/ri6;->a()Lcom/daaw/se3;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ws5;->b:Lcom/daaw/as5;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/as5;->a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ws5;->c:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/ts5;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/ts5;-><init>(Lcom/daaw/ws5;Lcom/daaw/fi6;Lcom/daaw/th6;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/zi4;
    .locals 5

    iget-object v0, p0, Lcom/daaw/ws5;->a:Lcom/daaw/zj4;

    new-instance v1, Lcom/daaw/rm4;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance v2, Lcom/daaw/mk4;

    iget-object v3, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v3, v3, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    invoke-virtual {v3}, Lcom/daaw/ri6;->a()Lcom/daaw/se3;

    move-result-object v3

    new-instance v4, Lcom/daaw/us5;

    invoke-direct {v4, p0, p1, p2}, Lcom/daaw/us5;-><init>(Lcom/daaw/ws5;Lcom/daaw/fi6;Lcom/daaw/th6;)V

    invoke-direct {v2, v3, v4}, Lcom/daaw/mk4;-><init>(Lcom/daaw/se3;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/zj4;->b(Lcom/daaw/rm4;Lcom/daaw/mk4;)Lcom/daaw/lk4;

    move-result-object p1

    invoke-interface {p1}, Lcom/daaw/lk4;->zza()Lcom/daaw/zi4;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic f(Lcom/daaw/fi6;Lcom/daaw/th6;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ws5;->b:Lcom/daaw/as5;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/as5;->b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;

    move-result-object p1

    iget p2, p2, Lcom/daaw/th6;->S:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lcom/daaw/ws5;->e:Ljava/util/concurrent/ScheduledExecutorService;

    int-to-long v2, p2

    invoke-static {p1, v2, v3, v0, v1}, Lcom/daaw/s67;->o(Lcom/daaw/f77;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/f77;

    move-result-object p1

    new-instance p2, Lcom/daaw/vs5;

    invoke-direct {p2, p0}, Lcom/daaw/vs5;-><init>(Lcom/daaw/ws5;)V

    iget-object v0, p0, Lcom/daaw/ws5;->c:Lcom/daaw/g77;

    invoke-static {p1, p2, v0}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    return-void
.end method
