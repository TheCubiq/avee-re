.class public final Lcom/daaw/a28;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/cd2;

.field public final synthetic q:I

.field public final synthetic r:J

.field public final synthetic s:Z

.field public final synthetic t:Lcom/daaw/cd2;

.field public final synthetic u:Lcom/daaw/p28;


# direct methods
.method public constructor <init>(Lcom/daaw/p28;Lcom/daaw/cd2;IJZLcom/daaw/cd2;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a28;->u:Lcom/daaw/p28;

    iput-object p2, p0, Lcom/daaw/a28;->p:Lcom/daaw/cd2;

    iput p3, p0, Lcom/daaw/a28;->q:I

    iput-wide p4, p0, Lcom/daaw/a28;->r:J

    iput-boolean p6, p0, Lcom/daaw/a28;->s:Z

    iput-object p7, p0, Lcom/daaw/a28;->t:Lcom/daaw/cd2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    iget-object v0, p0, Lcom/daaw/a28;->u:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/a28;->p:Lcom/daaw/cd2;

    invoke-virtual {v0, v1}, Lcom/daaw/p28;->J(Lcom/daaw/cd2;)V

    iget-object v2, p0, Lcom/daaw/a28;->u:Lcom/daaw/p28;

    iget-object v3, p0, Lcom/daaw/a28;->p:Lcom/daaw/cd2;

    iget v4, p0, Lcom/daaw/a28;->q:I

    iget-wide v5, p0, Lcom/daaw/a28;->r:J

    iget-boolean v8, p0, Lcom/daaw/a28;->s:Z

    const/4 v7, 0x0

    invoke-static/range {v2 .. v8}, Lcom/daaw/p28;->c0(Lcom/daaw/p28;Lcom/daaw/cd2;IJZZ)V

    invoke-static {}, Lcom/daaw/zm8;->b()Z

    iget-object v0, p0, Lcom/daaw/a28;->u:Lcom/daaw/p28;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v0

    sget-object v1, Lcom/daaw/m75;->o0:Lcom/daaw/j65;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lcom/daaw/qa2;->B(Ljava/lang/String;Lcom/daaw/j65;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a28;->u:Lcom/daaw/p28;

    iget-object v1, p0, Lcom/daaw/a28;->p:Lcom/daaw/cd2;

    iget-object v2, p0, Lcom/daaw/a28;->t:Lcom/daaw/cd2;

    invoke-static {v0, v1, v2}, Lcom/daaw/p28;->b0(Lcom/daaw/p28;Lcom/daaw/cd2;Lcom/daaw/cd2;)V

    :cond_0
    return-void
.end method
