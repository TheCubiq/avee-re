.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewVec2f(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$editTxtX:[Landroid/widget/EditText;

.field final synthetic val$max:F

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$updateValue:Lcom/daaw/avee/Common/Action1;

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;


# direct methods
.method constructor <init>(FFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/EditText;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    .line 1099
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$min:F

    iput p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$max:F

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$name:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iput-object p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$editTxtX:[Landroid/widget/EditText;

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 1117
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1120
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$min:F

    iget v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$max:F

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float v1, v1, v2

    add-float/2addr v0, v1

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/Utils;->strToFloatSafe(Ljava/lang/String;F)F

    move-result p1

    .line 1121
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$name:Ljava/lang/String;

    new-instance v2, Lcom/daaw/avee/Common/Vec2f;

    iget v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$min:F

    invoke-direct {v2, v3, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v0

    .line 1122
    new-instance v1, Lcom/daaw/avee/Common/Vec2f;

    iget v0, v0, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-direct {v1, p1, v0}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    .line 1124
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$name:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyVec2fValue(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)V

    .line 1125
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    .line 1127
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$editTxtX:[Landroid/widget/EditText;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p1, v0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 1129
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$21;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 1130
    invoke-interface {p1, v0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public hashCode()I
    .locals 1

    .line 1103
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
