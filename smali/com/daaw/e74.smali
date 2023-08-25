.class public final Lcom/daaw/e74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic p:Lcom/daaw/cx3;

.field public final synthetic q:Lcom/daaw/h74;


# direct methods
.method public constructor <init>(Lcom/daaw/h74;Lcom/daaw/cx3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/e74;->q:Lcom/daaw/h74;

    iput-object p2, p0, Lcom/daaw/e74;->p:Lcom/daaw/cx3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/e74;->q:Lcom/daaw/h74;

    iget-object v1, p0, Lcom/daaw/e74;->p:Lcom/daaw/cx3;

    const/16 v2, 0xa

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/h74;->d0(Lcom/daaw/h74;Landroid/view/View;Lcom/daaw/cx3;I)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
