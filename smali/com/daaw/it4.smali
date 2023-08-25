.class public final Lcom/daaw/it4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Ljava/lang/ref/WeakReference;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/jt4;Lcom/daaw/ht4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/daaw/it4;->p:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/it4;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/jt4;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/daaw/dt4;->a:Lcom/daaw/dt4;

    invoke-virtual {v0, v1}, Lcom/daaw/kw4;->B0(Lcom/daaw/jw4;)V

    :cond_0
    return-void
.end method
