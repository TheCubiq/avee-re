.class public final synthetic Lcom/daaw/h41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/i41;

.field public final synthetic q:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/i41;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h41;->p:Lcom/daaw/i41;

    iput-object p2, p0, Lcom/daaw/h41;->q:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h41;->p:Lcom/daaw/i41;

    iget-object v1, p0, Lcom/daaw/h41;->q:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lcom/daaw/i41;->b(Lcom/daaw/i41;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
