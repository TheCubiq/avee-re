.class public final synthetic Lcom/daaw/iw8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/jw8;

.field public final synthetic q:I

.field public final synthetic r:J

.field public final synthetic s:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/jw8;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/iw8;->p:Lcom/daaw/jw8;

    iput p2, p0, Lcom/daaw/iw8;->q:I

    iput-wide p3, p0, Lcom/daaw/iw8;->r:J

    iput-wide p5, p0, Lcom/daaw/iw8;->s:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/iw8;->p:Lcom/daaw/jw8;

    iget v2, p0, Lcom/daaw/iw8;->q:I

    iget-wide v3, p0, Lcom/daaw/iw8;->r:J

    iget-wide v5, p0, Lcom/daaw/iw8;->s:J

    invoke-static {v0}, Lcom/daaw/jw8;->b(Lcom/daaw/jw8;)Lcom/daaw/lw8;

    move-result-object v1

    invoke-interface/range {v1 .. v6}, Lcom/daaw/lw8;->P(IJJ)V

    return-void
.end method
