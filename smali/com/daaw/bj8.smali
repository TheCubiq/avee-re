.class public final synthetic Lcom/daaw/bj8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/dj8;

.field public final synthetic q:I

.field public final synthetic r:J

.field public final synthetic s:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dj8;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bj8;->p:Lcom/daaw/dj8;

    iput p2, p0, Lcom/daaw/bj8;->q:I

    iput-wide p3, p0, Lcom/daaw/bj8;->r:J

    iput-wide p5, p0, Lcom/daaw/bj8;->s:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/bj8;->p:Lcom/daaw/dj8;

    iget v1, p0, Lcom/daaw/bj8;->q:I

    iget-wide v2, p0, Lcom/daaw/bj8;->r:J

    iget-wide v4, p0, Lcom/daaw/bj8;->s:J

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/dj8;->q(IJJ)V

    return-void
.end method
