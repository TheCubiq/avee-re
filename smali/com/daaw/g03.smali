.class public final Lcom/daaw/g03;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:I

.field public final synthetic q:J

.field public final synthetic r:Lcom/daaw/k03;


# direct methods
.method public constructor <init>(Lcom/daaw/k03;IJ)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g03;->r:Lcom/daaw/k03;

    iput p2, p0, Lcom/daaw/g03;->p:I

    iput-wide p3, p0, Lcom/daaw/g03;->q:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/g03;->r:Lcom/daaw/k03;

    invoke-static {v0}, Lcom/daaw/k03;->a(Lcom/daaw/k03;)Lcom/daaw/l03;

    move-result-object v0

    iget v1, p0, Lcom/daaw/g03;->p:I

    iget-wide v2, p0, Lcom/daaw/g03;->q:J

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/l03;->A(IJ)V

    return-void
.end method
