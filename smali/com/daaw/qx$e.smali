.class public Lcom/daaw/qx$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


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

    iput-object p1, p0, Lcom/daaw/qx$e;->a:Lcom/daaw/qx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/qx$e;->a:Lcom/daaw/qx;

    int-to-float p2, p2

    const/high16 p3, 0x42c80000    # 100.0f

    div-float/2addr p2, p3

    const/4 p3, 0x1

    invoke-static {p1, p2, p3}, Lcom/daaw/qx;->o(Lcom/daaw/qx;FZ)V

    iget-object p1, p0, Lcom/daaw/qx$e;->a:Lcom/daaw/qx;

    invoke-static {p1}, Lcom/daaw/qx;->g(Lcom/daaw/qx;)V

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
