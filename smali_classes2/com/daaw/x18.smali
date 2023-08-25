.class public final Lcom/daaw/x18;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/cd2;

.field public final synthetic q:J

.field public final synthetic r:I

.field public final synthetic s:J

.field public final synthetic t:Z

.field public final synthetic u:Lcom/daaw/cd2;

.field public final synthetic v:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Lcom/daaw/cd2;JIJZLcom/daaw/cd2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/x18;->v:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/x18;->p:Lcom/daaw/cd2;

    iput-wide p3, p0, Lcom/daaw/x18;->q:J

    iput p5, p0, Lcom/daaw/x18;->r:I

    iput-wide p6, p0, Lcom/daaw/x18;->s:J

    iput-boolean p8, p0, Lcom/daaw/x18;->t:Z

    iput-object p9, p0, Lcom/daaw/x18;->u:Lcom/daaw/cd2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget-object v0, p0, Lcom/daaw/x18;->v:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/x18;->p:Lcom/daaw/cd2;

    invoke-virtual {v0, v1}, Lcom/daaw/p28;->J(Lcom/daaw/cd2;)V

    iget-object v0, p0, Lcom/daaw/x18;->v:Lcom/daaw/p28;

    iget-wide v1, p0, Lcom/daaw/x18;->q:J

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/p28;->z(JZ)V

    iget-object v4, p0, Lcom/daaw/x18;->v:Lcom/daaw/p28;

    iget-object v5, p0, Lcom/daaw/x18;->p:Lcom/daaw/cd2;

    iget v6, p0, Lcom/daaw/x18;->r:I

    iget-wide v7, p0, Lcom/daaw/x18;->s:J

    iget-boolean v10, p0, Lcom/daaw/x18;->t:Z

    const/4 v9, 0x1

    invoke-static/range {v4 .. v10}, Lcom/daaw/p28;->c0(Lcom/daaw/p28;Lcom/daaw/cd2;IJZZ)V

    invoke-static {}, Lcom/daaw/zm8;->b()Z

    iget-object v0, p0, Lcom/daaw/x18;->v:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    sget-object v1, Lcom/daaw/m75;->o0:Lcom/daaw/j65;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/x18;->v:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/x18;->p:Lcom/daaw/cd2;

    iget-object v2, p0, Lcom/daaw/x18;->u:Lcom/daaw/cd2;

    invoke-static {v0, v1, v2}, Lcom/daaw/p28;->b0(Lcom/daaw/p28;Lcom/daaw/cd2;Lcom/daaw/cd2;)V

    :cond_0
    return-void
.end method
