.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewAsset(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$bitmapResId:I

.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$twoPartsOut:[Ljava/lang/String;

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

.field final synthetic val$valueBtnElement:Landroid/widget/ImageButton;

.field final synthetic val$valueTxt0:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;[Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/widget/ImageButton;ILandroid/widget/TextView;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    .line 1524
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$name:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$twoPartsOut:[Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$valueBtnElement:Landroid/widget/ImageButton;

    iput p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$bitmapResId:I

    iput-object p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$valueTxt0:Landroid/widget/TextView;

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1528
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$name:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$twoPartsOut:[Ljava/lang/String;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 1529
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    .line 1531
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$valueBtnElement:Landroid/widget/ImageButton;

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$bitmapResId:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 1532
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$valueTxt0:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1534
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$32;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_0

    .line 1535
    invoke-interface {p1, p0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
