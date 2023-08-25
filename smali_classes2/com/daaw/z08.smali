.class public final Lcom/daaw/z08;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Z

.field public final synthetic t:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z08;->t:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/z08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lcom/daaw/z08;->q:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/z08;->r:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/daaw/z08;->s:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/z08;->t:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->L()Lcom/daaw/x78;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/z08;->p:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v4, p0, Lcom/daaw/z08;->q:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/z08;->r:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/daaw/z08;->s:Z

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/x78;->W(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
