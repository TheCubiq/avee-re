.class public final synthetic Lcom/daaw/q34;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/t34;

.field public final synthetic q:I

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/t34;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q34;->p:Lcom/daaw/t34;

    iput p2, p0, Lcom/daaw/q34;->q:I

    iput p3, p0, Lcom/daaw/q34;->r:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/q34;->p:Lcom/daaw/t34;

    iget v1, p0, Lcom/daaw/q34;->q:I

    iget v2, p0, Lcom/daaw/q34;->r:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/t34;->L(II)V

    return-void
.end method
