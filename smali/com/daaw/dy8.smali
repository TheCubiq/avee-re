.class public final synthetic Lcom/daaw/dy8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vy8;

.field public final synthetic q:I

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vy8;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dy8;->p:Lcom/daaw/vy8;

    iput p2, p0, Lcom/daaw/dy8;->q:I

    iput-wide p3, p0, Lcom/daaw/dy8;->r:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/dy8;->p:Lcom/daaw/vy8;

    iget v1, p0, Lcom/daaw/dy8;->q:I

    iget-wide v2, p0, Lcom/daaw/dy8;->r:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/vy8;->j(IJ)V

    return-void
.end method
