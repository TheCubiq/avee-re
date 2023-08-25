.class public Lcom/daaw/qx$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/triggertrap/seekarc/SeekArc$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qx;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/qx;


# direct methods
.method public constructor <init>(Lcom/daaw/qx;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qx$c;->a:Lcom/daaw/qx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/triggertrap/seekarc/SeekArc;)V
    .locals 0

    return-void
.end method

.method public b(Lcom/triggertrap/seekarc/SeekArc;)V
    .locals 0

    return-void
.end method

.method public c(Lcom/triggertrap/seekarc/SeekArc;IZ)V
    .locals 1

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/daaw/qx$c;->a:Lcom/daaw/qx;

    invoke-static {p1}, Lcom/daaw/qx;->h(Lcom/daaw/qx;)Landroid/widget/Spinner;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p3}, Landroid/widget/Spinner;->setSelection(IZ)V

    iget-object p1, p0, Lcom/daaw/qx$c;->a:Lcom/daaw/qx;

    invoke-static {}, Lcom/daaw/qx;->k()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    sub-int/2addr p2, p3

    int-to-float p2, p2

    invoke-static {}, Lcom/daaw/qx;->k()I

    move-result p3

    int-to-float p3, p3

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p3, v0

    div-float/2addr p2, p3

    invoke-static {p1, p2}, Lcom/daaw/qx;->j(Lcom/daaw/qx;F)F

    iget-object p1, p0, Lcom/daaw/qx$c;->a:Lcom/daaw/qx;

    invoke-static {p1}, Lcom/daaw/qx;->i(Lcom/daaw/qx;)F

    move-result p2

    iget-object p3, p0, Lcom/daaw/qx$c;->a:Lcom/daaw/qx;

    invoke-static {p3}, Lcom/daaw/qx;->l(Lcom/daaw/qx;)F

    move-result p3

    const/4 v0, 0x1

    invoke-static {p1, p2, p3, v0, v0}, Lcom/daaw/qx;->n(Lcom/daaw/qx;FFZZ)V

    iget-object p1, p0, Lcom/daaw/qx$c;->a:Lcom/daaw/qx;

    invoke-static {p1}, Lcom/daaw/qx;->g(Lcom/daaw/qx;)V

    :cond_0
    return-void
.end method
