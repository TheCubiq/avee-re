.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewVec2f(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$barY:[Landroid/widget/SeekBar;

.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$step:F

.field final synthetic val$updateValue:Lcom/daaw/avee/Common/Action1;

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FFLcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    .line 1069
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$name:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$min:F

    iput p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$step:F

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iput-object p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$barY:[Landroid/widget/SeekBar;

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    if-eqz p3, :cond_0

    .line 1074
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$name:Ljava/lang/String;

    new-instance v0, Lcom/daaw/avee/Common/Vec2f;

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$min:F

    invoke-direct {v0, v1, v1}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    invoke-virtual {p1, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object p1

    .line 1075
    new-instance p3, Lcom/daaw/avee/Common/Vec2f;

    iget p1, p1, Lcom/daaw/avee/Common/Vec2f;->x:F

    int-to-float p2, p2

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$step:F

    mul-float p2, p2, v0

    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$min:F

    add-float/2addr p2, v0

    invoke-direct {p3, p1, p2}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 1078
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$name:Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fValue(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)V

    .line 1079
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    .line 1081
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$barY:[Landroid/widget/SeekBar;

    const/4 p3, 0x0

    aget-object p2, p2, p3

    invoke-interface {p1, p2}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 1083
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$20;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 1084
    invoke-interface {p1, p2}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

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
