.class Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;
.super Ljava/lang/Object;
.source "EqualizerDialog.java"

# interfaces
.implements Lcom/triggertrap/seekarc/SeekArc$OnSeekArcChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Lcom/triggertrap/seekarc/SeekArc;IZ)V
    .locals 1

    if-eqz p3, :cond_0

    .line 142
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$300(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Landroid/widget/Spinner;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p3}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 143
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$500()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    sub-int/2addr p2, p3

    int-to-float p2, p2

    invoke-static {}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$500()I

    move-result p3

    int-to-float p3, p3

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p3, v0

    div-float/2addr p2, p3

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$402(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;F)F

    .line 144
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$400(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)F

    move-result p2

    iget-object p3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p3}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$600(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)F

    move-result p3

    const/4 v0, 0x1

    invoke-static {p1, p2, p3, v0, v0}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$700(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;FFZZ)V

    .line 145
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$3;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$200(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    :cond_0
    return-void
.end method

.method public onStartTrackingTouch(Lcom/triggertrap/seekarc/SeekArc;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Lcom/triggertrap/seekarc/SeekArc;)V
    .locals 0

    return-void
.end method
