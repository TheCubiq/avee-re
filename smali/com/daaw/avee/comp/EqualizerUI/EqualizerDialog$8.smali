.class Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;
.super Ljava/lang/Object;
.source "EqualizerDialog.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->updateEqualizerDesc(Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

.field final synthetic val$barIndex:I


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;I)V
    .locals 0

    .line 319
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    iput p2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;->val$barIndex:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    if-eqz p3, :cond_0

    .line 324
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$300(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Landroid/widget/Spinner;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p3, p3}, Landroid/widget/Spinner;->setSelection(IZ)V

    .line 325
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    iget v0, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;->val$barIndex:I

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$1200(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr p2, v1

    const/4 v1, 0x1

    invoke-static {p1, v0, p2, v1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$1300(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;IIZ)V

    .line 326
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$1100(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->setEqPresetFromBandBars(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)V

    .line 327
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2, p3, p3}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$700(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;FFZZ)V

    .line 328
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$8;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$200(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

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
