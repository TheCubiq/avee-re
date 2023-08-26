.class Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$5;
.super Ljava/lang/Object;
.source "EqualizerDialog.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


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

    .line 189
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$5;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    .line 192
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$5;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    int-to-float p2, p2

    const/high16 p3, 0x42c80000    # 100.0f

    div-float/2addr p2, p3

    const/4 p3, 0x1

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$800(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;FZ)V

    .line 193
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$5;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$200(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

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
