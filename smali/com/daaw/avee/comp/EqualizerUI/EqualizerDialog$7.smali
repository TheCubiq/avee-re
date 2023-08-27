.class Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;
.super Ljava/lang/Object;
.source "EqualizerDialog.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


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


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const/4 p1, 0x1

    sub-int/2addr p3, p1

    if-ltz p3, :cond_0

    .line 281
    iget-object p2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p2}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$1000(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->presets:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    array-length p2, p2

    if-ge p3, p2, :cond_0

    .line 282
    iget-object p2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p2}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$1000(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/avee/comp/EqualizerUI/EqualizerUIDesc;->presets:[Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    aget-object p2, p2, p3

    iget-object p3, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p3}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$1100(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)Lcom/daaw/avee/comp/EqualizerUI/EQPreset;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/daaw/avee/comp/EqualizerUI/Equalization;->getEqBandsPresetsConvert(Lcom/daaw/avee/comp/EqualizerUI/EQPreset;Lcom/daaw/avee/comp/EqualizerUI/EQPreset;)V

    .line 283
    iget-object p2, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-static {p2, p4, p4, p3, p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$700(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;FFZZ)V

    .line 286
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog$7;->this$0:Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;->access$200(Lcom/daaw/avee/comp/EqualizerUI/EqualizerDialog;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
