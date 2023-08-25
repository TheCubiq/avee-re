.class public Lcom/daaw/nc1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/nc1$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/daaw/nc1$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(IZ)V

    iput-object v0, p0, Lcom/daaw/nc1;->a:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method


# virtual methods
.method public a(IJ)Lcom/daaw/nc1$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/nc1;->a:Ljava/util/concurrent/BlockingQueue;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p2, p3, v1}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/nc1$a;

    if-eqz p2, :cond_0

    iget-object p3, p2, Lcom/daaw/nc1$a;->a:[S

    array-length p3, p3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p3, p1, :cond_0

    return-object p2

    :catch_0
    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/nc1;->b(I)Lcom/daaw/nc1$a;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Lcom/daaw/nc1$a;
    .locals 1

    new-instance v0, Lcom/daaw/nc1$a;

    new-array p1, p1, [S

    invoke-direct {v0, p0, p1}, Lcom/daaw/nc1$a;-><init>(Lcom/daaw/nc1;[S)V

    return-object v0
.end method

.method public c(Lcom/daaw/nc1$a;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/nc1;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    return-void
.end method
