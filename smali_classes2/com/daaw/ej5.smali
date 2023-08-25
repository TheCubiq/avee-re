.class public final Lcom/daaw/ej5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:I

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lcom/daaw/om5;


# direct methods
.method public constructor <init>(Lcom/daaw/om5;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ej5;->u:Lcom/daaw/om5;

    iput p2, p0, Lcom/daaw/ej5;->p:I

    iput-object p3, p0, Lcom/daaw/ej5;->q:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/ej5;->r:Ljava/lang/Object;

    iput-object p5, p0, Lcom/daaw/ej5;->s:Ljava/lang/Object;

    iput-object p6, p0, Lcom/daaw/ej5;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/ej5;->u:Lcom/daaw/om5;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ud7;->m()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/daaw/ej5;->u:Lcom/daaw/om5;

    invoke-static {v1}, Lcom/daaw/om5;->n(Lcom/daaw/om5;)C

    move-result v2

    if-nez v2, :cond_1

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/qa2;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/ej5;->u:Lcom/daaw/om5;

    iget-object v2, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->a()Lcom/daaw/b52;

    const/16 v2, 0x43

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/ej5;->u:Lcom/daaw/om5;

    iget-object v2, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->a()Lcom/daaw/b52;

    const/16 v2, 0x63

    :goto_0
    invoke-static {v1, v2}, Lcom/daaw/om5;->E(Lcom/daaw/om5;C)V

    :cond_1
    iget-object v1, p0, Lcom/daaw/ej5;->u:Lcom/daaw/om5;

    invoke-static {v1}, Lcom/daaw/om5;->o(Lcom/daaw/om5;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-gez v6, :cond_2

    iget-object v2, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->z()Lcom/daaw/qa2;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/qa2;->p()J

    const-wide/32 v2, 0x1212d

    invoke-static {v1, v2, v3}, Lcom/daaw/om5;->D(Lcom/daaw/om5;J)V

    :cond_2
    iget v1, p0, Lcom/daaw/ej5;->p:I

    const-string v2, "01VDIWEA?"

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    iget-object v2, p0, Lcom/daaw/ej5;->u:Lcom/daaw/om5;

    invoke-static {v2}, Lcom/daaw/om5;->n(Lcom/daaw/om5;)C

    move-result v3

    invoke-static {v2}, Lcom/daaw/om5;->o(Lcom/daaw/om5;)J

    move-result-wide v4

    iget-object v2, p0, Lcom/daaw/ej5;->q:Ljava/lang/String;

    iget-object v6, p0, Lcom/daaw/ej5;->r:Ljava/lang/Object;

    iget-object v7, p0, Lcom/daaw/ej5;->s:Ljava/lang/Object;

    iget-object v8, p0, Lcom/daaw/ej5;->t:Ljava/lang/Object;

    const/4 v9, 0x1

    invoke-static {v9, v2, v6, v7, v8}, Lcom/daaw/om5;->A(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "2"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x400

    if-le v2, v3, :cond_3

    iget-object v1, p0, Lcom/daaw/ej5;->q:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_3
    iget-object v0, v0, Lcom/daaw/l36;->d:Lcom/daaw/e16;

    if-eqz v0, :cond_4

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/e16;->b(Ljava/lang/String;J)V

    :cond_4
    return-void

    :cond_5
    const/4 v0, 0x6

    iget-object v1, p0, Lcom/daaw/ej5;->u:Lcom/daaw/om5;

    invoke-virtual {v1}, Lcom/daaw/om5;->C()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Persisted config not initialized. Not logging error/warn"

    invoke-static {v0, v1, v2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    return-void
.end method
