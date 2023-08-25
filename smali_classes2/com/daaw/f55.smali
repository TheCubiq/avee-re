.class public final Lcom/daaw/f55;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Ljava/lang/Long;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Landroid/os/Bundle;

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f55;->z:Lcom/daaw/gk5;

    iput-object p2, p0, Lcom/daaw/f55;->t:Ljava/lang/Long;

    iput-object p3, p0, Lcom/daaw/f55;->u:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/f55;->v:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/f55;->w:Landroid/os/Bundle;

    iput-boolean p6, p0, Lcom/daaw/f55;->x:Z

    iput-boolean p7, p0, Lcom/daaw/f55;->y:Z

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    iget-object v0, p0, Lcom/daaw/f55;->t:Ljava/lang/Long;

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/daaw/l75;->p:J

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    :goto_0
    move-wide v8, v0

    iget-object v0, p0, Lcom/daaw/f55;->z:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/daaw/ju3;

    iget-object v3, p0, Lcom/daaw/f55;->u:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/f55;->v:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/f55;->w:Landroid/os/Bundle;

    iget-boolean v6, p0, Lcom/daaw/f55;->x:Z

    iget-boolean v7, p0, Lcom/daaw/f55;->y:Z

    invoke-interface/range {v2 .. v9}, Lcom/daaw/ju3;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method
