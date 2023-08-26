.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;
.super Ljava/lang/Object;
.source "CustomizeVisView1MVar.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar;->createPropertyViewMVarFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field final synthetic val$iFinal:I

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$step:F

.field final synthetic val$updateValue:Lcom/daaw/avee/Common/Action1;

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

.field final synthetic val$updatingValue:[Z

.field final synthetic val$varBarsY:[Landroid/widget/SeekBar;


# direct methods
.method constructor <init>([ZFFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ILcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$updatingValue:[Z

    iput p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$step:F

    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$min:F

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$name:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iput p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$iFinal:I

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iput-object p10, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$varBarsY:[Landroid/widget/SeekBar;

    iput-object p11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    .line 274
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$updatingValue:[Z

    const/4 v0, 0x0

    aget-boolean p1, p1, v0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    if-eqz p3, :cond_2

    int-to-float p1, p2

    .line 276
    iget p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$step:F

    mul-float p1, p1, p2

    iget p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$min:F

    add-float/2addr p1, p2

    .line 281
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$name:Ljava/lang/String;

    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    invoke-virtual {p2, p3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object p2

    .line 282
    iget p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$iFinal:I

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVarCount()I

    move-result v0

    if-lt p3, v0, :cond_1

    return-void

    .line 283
    :cond_1
    iget p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$iFinal:I

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVar(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object p3

    .line 284
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$iFinal:I

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasure()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasureArgVec2f()Lcom/daaw/avee/Common/Vec2f;

    move-result-object p3

    iget p3, p3, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-direct {v1, v2, p3, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {p2, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->setMeasuredVar(ILcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 286
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$name:Ljava/lang/String;

    invoke-virtual {p1, p3, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloatValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    .line 287
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    .line 289
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$varBarsY:[Landroid/widget/SeekBar;

    iget p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$iFinal:I

    aget-object p2, p2, p3

    invoke-interface {p1, p2}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 291
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$5;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_2

    const/4 p2, 0x0

    .line 292
    invoke-interface {p1, p2}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_2
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
