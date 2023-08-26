.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;
.super Ljava/lang/Object;
.source "CustomizeVisView1MVar.java"

# interfaces
.implements Landroid/text/TextWatcher;


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

.field final synthetic val$max:F

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$updateValue:Lcom/daaw/avee/Common/Action1;

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

.field final synthetic val$updatingValue:[Z

.field final synthetic val$varEditTxts2:[Landroid/widget/EditText;


# direct methods
.method constructor <init>([ZFFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ILcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    .line 346
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$updatingValue:[Z

    iput p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$min:F

    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$max:F

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$name:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iput p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$iFinal:I

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iput-object p10, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$varEditTxts2:[Landroid/widget/EditText;

    iput-object p11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    .line 363
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$updatingValue:[Z

    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_0

    return-void

    .line 364
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 366
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$min:F

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$max:F

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result p1

    .line 368
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$name:Ljava/lang/String;

    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    .line 369
    iget v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$iFinal:I

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVarCount()I

    move-result v2

    if-lt v1, v2, :cond_1

    return-void

    .line 370
    :cond_1
    iget v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$iFinal:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVar(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v1

    .line 372
    iget v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$iFinal:I

    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasure()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasureArgVec2f()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v1

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-direct {v3, v4, v1, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v0, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->setMeasuredVar(ILcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 377
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$name:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloatValue(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    .line 378
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    .line 380
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$varEditTxts2:[Landroid/widget/EditText;

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$iFinal:I

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 382
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$7;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    .line 383
    invoke-interface {p1, v0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public hashCode()I
    .locals 1

    .line 350
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
