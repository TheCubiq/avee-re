.class public final synthetic Lcom/daaw/d74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/h74;

.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Lcom/daaw/cx3;

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/h74;Landroid/view/View;Lcom/daaw/cx3;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/d74;->p:Lcom/daaw/h74;

    iput-object p2, p0, Lcom/daaw/d74;->q:Landroid/view/View;

    iput-object p3, p0, Lcom/daaw/d74;->r:Lcom/daaw/cx3;

    iput p4, p0, Lcom/daaw/d74;->s:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/d74;->p:Lcom/daaw/h74;

    iget-object v1, p0, Lcom/daaw/d74;->q:Landroid/view/View;

    iget-object v2, p0, Lcom/daaw/d74;->r:Lcom/daaw/cx3;

    iget v3, p0, Lcom/daaw/d74;->s:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/h74;->l0(Landroid/view/View;Lcom/daaw/cx3;I)V

    return-void
.end method
