.class public final synthetic Lcom/daaw/ia1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ha1$b;

.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:I

.field public final synthetic t:F

.field public final synthetic u:[Lcom/daaw/yc1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ha1$b;IIIF[Lcom/daaw/yc1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ia1;->p:Lcom/daaw/ha1$b;

    iput p2, p0, Lcom/daaw/ia1;->q:I

    iput p3, p0, Lcom/daaw/ia1;->r:I

    iput p4, p0, Lcom/daaw/ia1;->s:I

    iput p5, p0, Lcom/daaw/ia1;->t:F

    iput-object p6, p0, Lcom/daaw/ia1;->u:[Lcom/daaw/yc1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ia1;->p:Lcom/daaw/ha1$b;

    iget v1, p0, Lcom/daaw/ia1;->q:I

    iget v2, p0, Lcom/daaw/ia1;->r:I

    iget v3, p0, Lcom/daaw/ia1;->s:I

    iget v4, p0, Lcom/daaw/ia1;->t:F

    iget-object v5, p0, Lcom/daaw/ia1;->u:[Lcom/daaw/yc1;

    invoke-static/range {v0 .. v5}, Lcom/daaw/ha1$b;->c(Lcom/daaw/ha1$b;IIIF[Lcom/daaw/yc1;)V

    return-void
.end method
