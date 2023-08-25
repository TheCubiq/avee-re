.class public final Lcom/daaw/uu7;
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

    iput-object p1, p0, Lcom/daaw/uu7;->q:Lcom/daaw/p28;

    iput-wide p2, p0, Lcom/daaw/uu7;->p:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/uu7;->q:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/l36;->k:Lcom/daaw/xy5;

    iget-wide v1, p0, Lcom/daaw/uu7;->p:J

    invoke-virtual {v0, v1, v2}, Lcom/daaw/xy5;->b(J)V

    iget-object v0, p0, Lcom/daaw/uu7;->q:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->p()Lcom/daaw/hk5;

    move-result-object v0

    iget-wide v1, p0, Lcom/daaw/uu7;->p:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Session timeout duration set"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
