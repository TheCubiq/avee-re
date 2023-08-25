.class public final Lcom/daaw/h03;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:F

.field public final synthetic t:Lcom/daaw/k03;


# direct methods
.method public constructor <init>(Lcom/daaw/k03;IIIF)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/h03;->t:Lcom/daaw/k03;

    iput p2, p0, Lcom/daaw/h03;->p:I

    iput p3, p0, Lcom/daaw/h03;->q:I

    iput p4, p0, Lcom/daaw/h03;->r:I

    iput p5, p0, Lcom/daaw/h03;->s:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/h03;->t:Lcom/daaw/k03;

    invoke-static {v0}, Lcom/daaw/k03;->a(Lcom/daaw/k03;)Lcom/daaw/l03;

    move-result-object v0

    iget v1, p0, Lcom/daaw/h03;->p:I

    iget v2, p0, Lcom/daaw/h03;->q:I

    iget v3, p0, Lcom/daaw/h03;->r:I

    iget v4, p0, Lcom/daaw/h03;->s:F

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/daaw/l03;->g(IIIF)V

    return-void
.end method
