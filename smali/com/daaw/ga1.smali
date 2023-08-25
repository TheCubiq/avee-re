.class public Lcom/daaw/ga1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fe0;
.implements Lcom/daaw/rd0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ga1$c;,
        Lcom/daaw/ga1$b;
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/h40;

.field public final b:Lcom/daaw/ga1$b;

.field public final c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/daaw/ga1$c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "[F>;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/h40;

    invoke-direct {v0}, Lcom/daaw/h40;-><init>()V

    iput-object v0, p0, Lcom/daaw/ga1;->a:Lcom/daaw/h40;

    new-instance v0, Lcom/daaw/ga1$b;

    invoke-direct {v0}, Lcom/daaw/ga1$b;-><init>()V

    iput-object v0, p0, Lcom/daaw/ga1;->b:Lcom/daaw/ga1$b;

    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ga1;->c:Ljava/util/concurrent/BlockingQueue;

    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/ga1;->d:Ljava/util/concurrent/BlockingQueue;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/ga1;->e:Ljava/lang/Thread;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/un;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga1;->b:Lcom/daaw/ga1$b;

    invoke-virtual {v0, p1}, Lcom/daaw/ga1$b;->a(Lcom/daaw/un;)V

    return-void
.end method

.method public c()F
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga1;->b:Lcom/daaw/ga1$b;

    invoke-virtual {v0}, Lcom/daaw/ga1$b;->q()F

    move-result v0

    return v0
.end method

.method public f(IIILcom/daaw/je0;)Lcom/daaw/je0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga1;->a:Lcom/daaw/h40;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/h40;->c(IIILcom/daaw/je0;)Lcom/daaw/je0;

    move-result-object p1

    return-object p1
.end method

.method public j()F
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga1;->b:Lcom/daaw/ga1$b;

    invoke-virtual {v0}, Lcom/daaw/ga1$b;->r()F

    move-result v0

    return v0
.end method

.method public n(Lcom/daaw/de0;Lcom/daaw/sg0;)V
    .locals 4

    invoke-interface {p1}, Lcom/daaw/de0;->c()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ga1;->b:Lcom/daaw/ga1$b;

    invoke-interface {p1}, Lcom/daaw/de0;->d()F

    move-result p1

    invoke-static {v0, p1, p2}, Lcom/daaw/ga1$b;->c(Lcom/daaw/ga1$b;FLcom/daaw/sg0;)[F

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/ga1;->a:Lcom/daaw/h40;

    invoke-virtual {p2, p1}, Lcom/daaw/h40;->b([F)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ga1;->q()V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ga1;->d:Ljava/util/concurrent/BlockingQueue;

    const-wide/16 v1, 0x64

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/ga1;->a:Lcom/daaw/h40;

    invoke-virtual {v1, v0}, Lcom/daaw/h40;->b([F)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    iget-object v0, p0, Lcom/daaw/ga1;->c:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lcom/daaw/ga1$c;

    invoke-interface {p1}, Lcom/daaw/de0;->d()F

    move-result p1

    invoke-direct {v1, p1, p2}, Lcom/daaw/ga1$c;-><init>(FLcom/daaw/sg0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->offer(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public o(Lcom/daaw/un;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ga1;->b:Lcom/daaw/ga1$b;

    invoke-virtual {v0, p1}, Lcom/daaw/ga1$b;->o(Lcom/daaw/un;)V

    return-void
.end method

.method public final q()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ga1;->e:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Starting audioProcessTh"

    invoke-static {v0}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/daaw/ga1$a;

    invoke-direct {v1, p0}, Lcom/daaw/ga1$a;-><init>(Lcom/daaw/ga1;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/daaw/ga1;->e:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
