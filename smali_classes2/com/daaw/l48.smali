.class public final Lcom/daaw/l48;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/t38;

.field public final synthetic q:J

.field public final synthetic r:Lcom/daaw/r48;


# direct methods
.method public constructor <init>(Lcom/daaw/r48;Lcom/daaw/t38;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/l48;->r:Lcom/daaw/r48;

    iput-object p2, p0, Lcom/daaw/l48;->p:Lcom/daaw/t38;

    iput-wide p3, p0, Lcom/daaw/l48;->q:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/l48;->r:Lcom/daaw/r48;

    iget-object v1, p0, Lcom/daaw/l48;->p:Lcom/daaw/t38;

    iget-wide v2, p0, Lcom/daaw/l48;->q:J

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/daaw/r48;->x(Lcom/daaw/r48;Lcom/daaw/t38;ZJ)V

    iget-object v0, p0, Lcom/daaw/l48;->r:Lcom/daaw/r48;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/daaw/r48;->e:Lcom/daaw/t38;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->L()Lcom/daaw/x78;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/x78;->u(Lcom/daaw/t38;)V

    return-void
.end method
