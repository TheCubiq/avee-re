.class public Lcom/daaw/t81;
.super Lcom/daaw/bz;
.source ""


# instance fields
.field public final r:I

.field public final s:I

.field public final t:J

.field public final u:Ljava/lang/String;

.field public v:Lcom/daaw/tl;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/bz;-><init>()V

    iput p1, p0, Lcom/daaw/t81;->r:I

    iput p2, p0, Lcom/daaw/t81;->s:I

    iput-wide p3, p0, Lcom/daaw/t81;->t:J

    iput-object p5, p0, Lcom/daaw/t81;->u:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/t81;->W()Lcom/daaw/tl;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/t81;->v:Lcom/daaw/tl;

    return-void
.end method


# virtual methods
.method public T(Lcom/daaw/nl;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, Lcom/daaw/t81;->v:Lcom/daaw/tl;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Lcom/daaw/tl;->D(Lcom/daaw/tl;Ljava/lang/Runnable;Lcom/daaw/uj1;ZILjava/lang/Object;)V

    return-void
.end method

.method public final W()Lcom/daaw/tl;
    .locals 7

    new-instance v6, Lcom/daaw/tl;

    iget v1, p0, Lcom/daaw/t81;->r:I

    iget v2, p0, Lcom/daaw/t81;->s:I

    iget-wide v3, p0, Lcom/daaw/t81;->t:J

    iget-object v5, p0, Lcom/daaw/t81;->u:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/tl;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method

.method public final X(Ljava/lang/Runnable;Lcom/daaw/uj1;Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/t81;->v:Lcom/daaw/tl;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/tl;->w(Ljava/lang/Runnable;Lcom/daaw/uj1;Z)V

    return-void
.end method
