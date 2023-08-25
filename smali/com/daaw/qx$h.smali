.class public Lcom/daaw/qx$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qx;->A(Lcom/daaw/rx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/daaw/qx;


# direct methods
.method public constructor <init>(Lcom/daaw/qx;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qx$h;->b:Lcom/daaw/qx;

    iput p2, p0, Lcom/daaw/qx$h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    if-eqz p3, :cond_0

    iget-object p1, p0, Lcom/daaw/qx$h;->b:Lcom/daaw/qx;

    invoke-static {p1}, Lcom/daaw/qx;->h(Lcom/daaw/qx;)Landroid/widget/Spinner;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p3}, Landroid/widget/Spinner;->setSelection(IZ)V

    iget-object p1, p0, Lcom/daaw/qx$h;->b:Lcom/daaw/qx;

    iget v0, p0, Lcom/daaw/qx$h;->a:I

    invoke-static {p1}, Lcom/daaw/qx;->e(Lcom/daaw/qx;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr p2, v1

    const/4 v1, 0x1

    invoke-static {p1, v0, p2, v1}, Lcom/daaw/qx;->f(Lcom/daaw/qx;IIZ)V

    iget-object p1, p0, Lcom/daaw/qx$h;->b:Lcom/daaw/qx;

    invoke-static {p1}, Lcom/daaw/qx;->d(Lcom/daaw/qx;)Lcom/daaw/lv;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/qx;->z(Lcom/daaw/lv;)V

    iget-object p1, p0, Lcom/daaw/qx$h;->b:Lcom/daaw/qx;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2, p3, p3}, Lcom/daaw/qx;->n(Lcom/daaw/qx;FFZZ)V

    iget-object p1, p0, Lcom/daaw/qx$h;->b:Lcom/daaw/qx;

    invoke-static {p1}, Lcom/daaw/qx;->g(Lcom/daaw/qx;)V

    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
