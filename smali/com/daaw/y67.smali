.class public final Lcom/daaw/y67;
.super Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Lcom/daaw/e77;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/e77;Lcom/daaw/x67;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;-><init>()V

    iput-object p1, p0, Lcom/daaw/y67;->p:Lcom/daaw/e77;

    return-void
.end method

.method public static synthetic a(Lcom/daaw/y67;Ljava/lang/Thread;)V
    .locals 0

    invoke-super {p0, p1}, Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;->setExclusiveOwnerThread(Ljava/lang/Thread;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/y67;->p:Lcom/daaw/e77;

    invoke-virtual {v0}, Lcom/daaw/e77;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
