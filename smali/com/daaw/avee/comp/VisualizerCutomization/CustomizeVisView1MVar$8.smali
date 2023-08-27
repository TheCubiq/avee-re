.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;
.super Ljava/lang/Object;
.source "CustomizeVisView1MVar.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


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

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$updateValue:Lcom/daaw/avee/Common/Action1;

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

.field final synthetic val$validValues:[Ljava/lang/String;

.field final synthetic val$varSpinnerTypes:[Landroid/widget/Spinner;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;[Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ILcom/daaw/avee/Common/Action1;[Landroid/widget/Spinner;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    .line 388
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$validValues:[Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$name:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iput p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$iFinal:I

    iput-object p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$varSpinnerTypes:[Landroid/widget/Spinner;

    iput-object p9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

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

    .line 392
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->ApplySpinnerTheme(Landroid/widget/AdapterView;)V

    if-ltz p3, :cond_0

    .line 404
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$validValues:[Ljava/lang/String;

    array-length p2, p1

    if-ge p3, p2, :cond_0

    .line 405
    aget-object p1, p1, p3

    goto :goto_0

    :cond_0
    const-string p1, "Constant"

    .line 408
    :goto_0
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$name:Ljava/lang/String;

    new-instance p4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iget-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-direct {p4, p5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    invoke-virtual {p2, p3, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object p2

    .line 409
    iget p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$iFinal:I

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVarCount()I

    move-result p4

    if-lt p3, p4, :cond_1

    return-void

    .line 410
    :cond_1
    iget p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$iFinal:I

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVar(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object p3

    .line 411
    iget p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$iFinal:I

    new-instance p5, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasureArgVec2f()Lcom/daaw/avee/Common/Vec2f;

    move-result-object p3

    invoke-direct {p5, p1, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)V

    invoke-virtual {p2, p4, p5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->setMeasuredVar(ILcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 413
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$name:Ljava/lang/String;

    invoke-virtual {p1, p3, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloatValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    .line 414
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    .line 416
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$varSpinnerTypes:[Landroid/widget/Spinner;

    iget p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$iFinal:I

    aget-object p2, p2, p3

    invoke-interface {p1, p2}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 418
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$8;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_2

    const/4 p2, 0x0

    .line 419
    invoke-interface {p1, p2}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_2
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
