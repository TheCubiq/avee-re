.class public final Lcom/daaw/fz7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:J

.field public final synthetic q:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fz7;->q:Lcom/daaw/p28;

    iput-wide p2, p0, Lcom/daaw/fz7;->p:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/fz7;->q:Lcom/daaw/p28;

    iget-wide v1, p0, Lcom/daaw/fz7;->p:J

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/p28;->z(JZ)V

    iget-object v0, p0, Lcom/daaw/fz7;->q:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->L()Lcom/daaw/x78;

    move-result-object v0

    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    invoke-virtual {v0, v1}, Lcom/daaw/x78;->S(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
