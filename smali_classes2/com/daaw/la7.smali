.class public final Lcom/daaw/la7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:J

.field public final synthetic t:Lcom/daaw/ob7;


# direct methods
.method public constructor <init>(Lcom/daaw/ob7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/la7;->t:Lcom/daaw/ob7;

    iput-object p2, p0, Lcom/daaw/la7;->p:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/la7;->q:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/la7;->r:Ljava/lang/String;

    iput-wide p5, p0, Lcom/daaw/la7;->s:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/la7;->p:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/la7;->t:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/la7;->q:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/daaw/yb8;->w(Ljava/lang/String;Lcom/daaw/t38;)V

    return-void

    :cond_0
    new-instance v1, Lcom/daaw/t38;

    iget-object v2, p0, Lcom/daaw/la7;->r:Ljava/lang/String;

    iget-wide v3, p0, Lcom/daaw/la7;->s:J

    invoke-direct {v1, v2, v0, v3, v4}, Lcom/daaw/t38;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/daaw/la7;->t:Lcom/daaw/ob7;

    invoke-static {v0}, Lcom/daaw/ob7;->g3(Lcom/daaw/ob7;)Lcom/daaw/yb8;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/la7;->q:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lcom/daaw/yb8;->w(Ljava/lang/String;Lcom/daaw/t38;)V

    return-void
.end method
