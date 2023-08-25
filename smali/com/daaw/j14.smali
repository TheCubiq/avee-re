.class public final Lcom/daaw/j14;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/l14;


# direct methods
.method public constructor <init>(Lcom/daaw/l14;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j14;->a:Lcom/daaw/l14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/j14;->a:Lcom/daaw/l14;

    invoke-static {p1}, Lcom/daaw/l14;->b(Lcom/daaw/l14;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/j14;->a:Lcom/daaw/l14;

    invoke-static {p1}, Lcom/daaw/l14;->b(Lcom/daaw/l14;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    return-void
.end method
