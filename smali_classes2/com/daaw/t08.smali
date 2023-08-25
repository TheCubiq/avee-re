.class public final Lcom/daaw/t08;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/t08;->s:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/t08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lcom/daaw/t08;->q:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/t08;->r:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/t08;->s:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->L()Lcom/daaw/x78;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/t08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lcom/daaw/t08;->q:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/t08;->r:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/daaw/x78;->U(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
