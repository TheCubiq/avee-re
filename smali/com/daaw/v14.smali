.class public final Lcom/daaw/v14;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Lcom/daaw/c24;


# direct methods
.method public constructor <init>(Lcom/daaw/c24;II)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v14;->r:Lcom/daaw/c24;

    iput p2, p0, Lcom/daaw/v14;->p:I

    iput p3, p0, Lcom/daaw/v14;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/v14;->r:Lcom/daaw/c24;

    invoke-static {v0}, Lcom/daaw/c24;->G(Lcom/daaw/c24;)Lcom/daaw/d24;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/daaw/c24;->G(Lcom/daaw/c24;)Lcom/daaw/d24;

    move-result-object v0

    iget v1, p0, Lcom/daaw/v14;->p:I

    iget v2, p0, Lcom/daaw/v14;->q:I

    invoke-interface {v0, v1, v2}, Lcom/daaw/d24;->a(II)V

    :cond_0
    return-void
.end method
