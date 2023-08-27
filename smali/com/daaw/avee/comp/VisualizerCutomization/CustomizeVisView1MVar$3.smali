.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;
.super Ljava/lang/Object;
.source "CustomizeVisView1MVar.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar;->createPropertyViewMVarFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;ZLjava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action1<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$count:I

.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

.field final synthetic val$detailed:Z

.field final synthetic val$isVec2:Z

.field final synthetic val$lineBarBg:Landroid/view/View;

.field final synthetic val$lineBarValue:Landroid/view/View;

.field final synthetic val$max:F

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$step:F

.field final synthetic val$txtValue:Landroid/widget/TextView;

.field final synthetic val$updatingValue:[Z

.field final synthetic val$validValues:[Ljava/lang/String;

.field final synthetic val$varBars:[Landroid/widget/SeekBar;

.field final synthetic val$varBarsY:[Landroid/widget/SeekBar;

.field final synthetic val$varEditTxts:[Landroid/widget/EditText;

.field final synthetic val$varEditTxts2:[Landroid/widget/EditText;

.field final synthetic val$varHintTxts:[Landroid/widget/TextView;

.field final synthetic val$varHintTxts2:[Landroid/widget/TextView;

.field final synthetic val$varSpinnerTypes:[Landroid/widget/Spinner;


# direct methods
.method constructor <init>([ZLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;ZLandroid/widget/TextView;Landroid/view/View;Landroid/view/View;FFFZI[Landroid/widget/SeekBar;[Landroid/widget/SeekBar;[Landroid/widget/EditText;[Landroid/widget/EditText;[Landroid/widget/Spinner;[Ljava/lang/String;[Landroid/widget/TextView;[Landroid/widget/TextView;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    .line 166
    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$updatingValue:[Z

    move-object v1, p2

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-object v1, p3

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$name:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move v1, p5

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$isVec2:Z

    move-object v1, p6

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$txtValue:Landroid/widget/TextView;

    move-object v1, p7

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$lineBarBg:Landroid/view/View;

    move-object v1, p8

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$lineBarValue:Landroid/view/View;

    move v1, p9

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$max:F

    move v1, p10

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$min:F

    move v1, p11

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$step:F

    move v1, p12

    iput-boolean v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$detailed:Z

    move v1, p13

    iput v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$count:I

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBars:[Landroid/widget/SeekBar;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBarsY:[Landroid/widget/SeekBar;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts:[Landroid/widget/EditText;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts2:[Landroid/widget/EditText;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varSpinnerTypes:[Landroid/widget/Spinner;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$validValues:[Ljava/lang/String;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varHintTxts:[Landroid/widget/TextView;

    move-object/from16 v1, p21

    iput-object v1, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varHintTxts2:[Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Ljava/lang/Object;)V
    .locals 13

    .line 172
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$updatingValue:[Z

    const/4 v1, 0x0

    aget-boolean v2, v0, v1

    if-eqz v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    .line 173
    aput-boolean v2, v0, v1

    .line 175
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$name:Ljava/lang/String;

    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$defaultVal:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-direct {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)V

    invoke-virtual {v0, v3, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0

    .line 176
    iget-boolean v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$isVec2:Z

    if-eqz v3, :cond_1

    .line 177
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$txtValue:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getDisplayString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 179
    :cond_1
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$txtValue:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getDisplayString1d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$lineBarBg:Landroid/view/View;

    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$lineBarValue:Landroid/view/View;

    iget v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$max:F

    iget v6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$min:F

    sub-float/2addr v5, v6

    iget v6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$step:F

    div-float/2addr v5, v6

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getDisplayValueX()F

    move-result v6

    iget v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$min:F

    sub-float/2addr v6, v7

    iget v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$step:F

    div-float/2addr v6, v7

    invoke-static {v3, v4, v5, v6}, Lcom/daaw/avee/comp/Common/View/SimpleViewProgressBar;->SetProgress(Landroid/view/View;Landroid/view/View;FF)V

    .line 182
    iget-boolean v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$detailed:Z

    if-eqz v3, :cond_f

    const/4 v3, 0x0

    .line 184
    :goto_1
    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$count:I

    if-ge v3, v4, :cond_f

    .line 186
    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->getMeasuredVar(I)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    move-result-object v4

    .line 188
    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasure()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/daaw/avee/comp/Common/MeasureDefs;->getMeasureDefByName(Ljava/lang/String;)Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 189
    iget-boolean v6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$isVec2:Z

    if-nez v6, :cond_3

    iget-boolean v6, v5, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->isBUsedFor1d:Z

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v6, 0x1

    :goto_3
    const-string v7, "%.3f"

    if-eqz v6, :cond_7

    .line 192
    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasureArgVec2f()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v8

    .line 193
    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBars:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBars:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    iget v10, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$min:F

    sub-float/2addr v10, v11

    iget v11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$step:F

    div-float/2addr v10, v11

    float-to-int v10, v10

    invoke-virtual {v9, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 194
    :cond_4
    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBarsY:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBarsY:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    iget v10, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$min:F

    sub-float/2addr v10, v11

    iget v11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$step:F

    div-float/2addr v10, v11

    float-to-int v10, v10

    invoke-virtual {v9, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 195
    :cond_5
    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v11, v2, [Ljava/lang/Object;

    iget v12, v8, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    aput-object v12, v11, v1

    invoke-static {v10, v7, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 196
    :cond_6
    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts2:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts2:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v11, v2, [Ljava/lang/Object;

    iget v8, v8, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v11, v1

    invoke-static {v10, v7, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 198
    :cond_7
    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasureArgF()F

    move-result v8

    .line 199
    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBars:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBars:[Landroid/widget/SeekBar;

    aget-object v9, v9, v3

    iget v10, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$min:F

    sub-float v10, v8, v10

    iget v11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$step:F

    div-float/2addr v10, v11

    float-to-int v10, v10

    invoke-virtual {v9, v10}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 200
    :cond_8
    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    invoke-virtual {v9, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    iget-object v9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts:[Landroid/widget/EditText;

    aget-object v9, v9, v3

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v11, v2, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    aput-object v8, v11, v1

    invoke-static {v10, v7, v11}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v7}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 203
    :cond_9
    :goto_4
    iget-object v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varSpinnerTypes:[Landroid/widget/Spinner;

    aget-object v7, v7, v3

    invoke-virtual {v7, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 204
    iget-object v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$validValues:[Ljava/lang/String;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;->getMeasure()Ljava/lang/String;

    move-result-object v4

    invoke-static {v7, v4}, Lcom/daaw/avee/Common/Utils;->StringToIndex([Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 205
    iget-object v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varSpinnerTypes:[Landroid/widget/Spinner;

    aget-object v7, v7, v3

    invoke-virtual {v7, v4, v1}, Landroid/widget/Spinner;->setSelection(IZ)V

    :cond_a
    if-eqz v5, :cond_b

    .line 209
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varHintTxts:[Landroid/widget/TextView;

    aget-object v4, v4, v3

    iget-object v7, v5, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->argAHint:Ljava/lang/String;

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varHintTxts2:[Landroid/widget/TextView;

    aget-object v4, v4, v3

    iget-object v5, v5, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->argBHint:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_5

    .line 212
    :cond_b
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varHintTxts:[Landroid/widget/TextView;

    aget-object v4, v4, v3

    const-string v5, ""

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 213
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varHintTxts2:[Landroid/widget/TextView;

    aget-object v4, v4, v3

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    :goto_5
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varBarsY:[Landroid/widget/SeekBar;

    aget-object v4, v4, v3

    const/16 v5, 0x8

    if-eqz v6, :cond_c

    const/4 v7, 0x0

    goto :goto_6

    :cond_c
    const/16 v7, 0x8

    :goto_6
    invoke-virtual {v4, v7}, Landroid/widget/SeekBar;->setVisibility(I)V

    .line 217
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varEditTxts2:[Landroid/widget/EditText;

    aget-object v4, v4, v3

    if-eqz v6, :cond_d

    const/4 v7, 0x0

    goto :goto_7

    :cond_d
    const/16 v7, 0x8

    :goto_7
    invoke-virtual {v4, v7}, Landroid/widget/EditText;->setVisibility(I)V

    .line 218
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$varHintTxts2:[Landroid/widget/TextView;

    aget-object v4, v4, v3

    if-eqz v6, :cond_e

    const/4 v5, 0x0

    :cond_e
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setVisibility(I)V

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1

    .line 225
    :cond_f
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1MVar$3;->val$updatingValue:[Z

    aput-boolean v1, p1, v1

    return-void
.end method
