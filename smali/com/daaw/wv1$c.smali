.class public Lcom/daaw/wv1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wv1;-><init>(Landroid/view/LayoutInflater;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/lo1;

.field public final synthetic b:Lcom/daaw/wv1;


# direct methods
.method public constructor <init>(Lcom/daaw/wv1;Lcom/daaw/lo1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wv1$c;->b:Lcom/daaw/wv1;

    iput-object p2, p0, Lcom/daaw/wv1$c;->a:Lcom/daaw/lo1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/wv1$c;->b:Lcom/daaw/wv1;

    iget-object p3, p0, Lcom/daaw/wv1$c;->a:Lcom/daaw/lo1;

    iget-object p3, p3, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    const/4 v0, 0x1

    invoke-static {p1, p2, p3, v0}, Lcom/daaw/wv1;->b(Lcom/daaw/wv1;IIZ)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/wv1$c;->b:Lcom/daaw/wv1;

    invoke-static {p1}, Lcom/daaw/wv1;->a(Lcom/daaw/wv1;)Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/wv1$c;->b:Lcom/daaw/wv1;

    invoke-static {p1}, Lcom/daaw/wv1;->a(Lcom/daaw/wv1;)Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x0

    const-wide/16 v1, 0x384

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
