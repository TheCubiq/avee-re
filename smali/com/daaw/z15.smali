.class public final synthetic Lcom/daaw/z15;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic q:I

.field public final synthetic r:Lcom/daaw/c35;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILcom/daaw/c35;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z15;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Lcom/daaw/z15;->q:I

    iput-object p3, p0, Lcom/daaw/z15;->r:Lcom/daaw/c35;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/z15;->p:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget v1, p0, Lcom/daaw/z15;->q:I

    iget-object v2, p0, Lcom/daaw/z15;->r:Lcom/daaw/c35;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/h55;

    invoke-virtual {v3, v1, v2}, Lcom/daaw/h55;->a(ILcom/daaw/c35;)V

    goto :goto_0

    :cond_0
    return-void
.end method
