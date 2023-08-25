.class public Lcom/daaw/ha1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ha1;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ha1;


# direct methods
.method public constructor <init>(Lcom/daaw/ha1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ha1$a;->p:Lcom/daaw/ha1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :catch_0
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/daaw/ha1$a;->p:Lcom/daaw/ha1;

    iget-object v0, v0, Lcom/daaw/ha1;->c:Ljava/util/concurrent/BlockingQueue;

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/BlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ha1$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/daaw/ha1$a;->p:Lcom/daaw/ha1;

    iget-object v1, v1, Lcom/daaw/ha1;->b:Lcom/daaw/ha1$b;

    iget v2, v0, Lcom/daaw/ha1$c;->a:F

    iget-object v0, v0, Lcom/daaw/ha1$c;->b:Lcom/daaw/sg0;

    invoke-virtual {v1, v2, v0}, Lcom/daaw/ha1$b;->u(FLcom/daaw/sg0;)[F

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ha1$a;->p:Lcom/daaw/ha1;

    iget-object v1, v1, Lcom/daaw/ha1;->d:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v1, v0}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method
