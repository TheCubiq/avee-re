.class public final synthetic Lcom/daaw/ge4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ie4;

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ie4;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ge4;->p:Lcom/daaw/ie4;

    iput-object p2, p0, Lcom/daaw/ge4;->q:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ge4;->p:Lcom/daaw/ie4;

    iget-object v1, p0, Lcom/daaw/ge4;->q:Ljava/lang/Runnable;

    sget-object v2, Lcom/daaw/z04;->e:Lcom/daaw/g77;

    new-instance v3, Lcom/daaw/he4;

    invoke-direct {v3, v0, v1}, Lcom/daaw/he4;-><init>(Lcom/daaw/ie4;Ljava/lang/Runnable;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
