.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewVec2f(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
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
.field updating:Z

.field final synthetic val$barX:[Landroid/widget/SeekBar;

.field final synthetic val$barY:[Landroid/widget/SeekBar;

.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$detailed:Z

.field final synthetic val$editTxtX:[Landroid/widget/EditText;

.field final synthetic val$editTxtY:[Landroid/widget/EditText;

.field final synthetic val$lineBarBgX:Landroid/view/View;

.field final synthetic val$lineBarBgY:Landroid/view/View;

.field final synthetic val$lineBarValueX:Landroid/view/View;

.field final synthetic val$lineBarValueY:Landroid/view/View;

.field final synthetic val$max:F

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$step:F

.field final synthetic val$txtValue:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FLandroid/widget/TextView;Landroid/view/View;Landroid/view/View;FFLandroid/view/View;Landroid/view/View;Z[Landroid/widget/SeekBar;[Landroid/widget/SeekBar;[Landroid/widget/EditText;[Landroid/widget/EditText;)V
    .locals 0

    .line 1009
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$name:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$min:F

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$txtValue:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$lineBarBgX:Landroid/view/View;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$lineBarValueX:Landroid/view/View;

    iput p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$max:F

    iput p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$step:F

    iput-object p9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$lineBarBgY:Landroid/view/View;

    iput-object p10, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$lineBarValueY:Landroid/view/View;

    iput-boolean p11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$detailed:Z

    iput-object p12, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$barX:[Landroid/widget/SeekBar;

    iput-object p13, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$barY:[Landroid/widget/SeekBar;

    iput-object p14, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$editTxtX:[Landroid/widget/EditText;

    iput-object p15, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$editTxtY:[Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 1011
    iput-boolean p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->updating:Z

    return-void
.end method


# virtual methods
.method public onInvoke(Ljava/lang/Object;)V
    .locals 8

    .line 1015
    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->updating:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1016
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->updating:Z

    .line 1018
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$name:Ljava/lang/String;

    new-instance v3, Lcom/daaw/avee/Common/Vec2f;

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$min:F

    invoke-direct {v3, v4, v4}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    invoke-virtual {v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyVec2f(Ljava/lang/String;Lcom/daaw/avee/Common/Vec2f;)Lcom/daaw/avee/Common/Vec2f;

    move-result-object v1

    .line 1019
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$txtValue:Landroid/widget/TextView;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    iget v5, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v4, v0

    const-string v5, "%.3f   %.3f"

    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1020
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$lineBarBgX:Landroid/view/View;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$lineBarValueX:Landroid/view/View;

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$max:F

    iget v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$min:F

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$step:F

    div-float/2addr v4, v5

    iget v5, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$min:F

    sub-float/2addr v5, v7

    iget v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$step:F

    div-float/2addr v5, v7

    invoke-static {v2, v3, v4, v5}, Lcom/daaw/avee/comp/Common/View/SimpleViewProgressBar;->SetProgress(Landroid/view/View;Landroid/view/View;FF)V

    .line 1021
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$lineBarBgY:Landroid/view/View;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$lineBarValueY:Landroid/view/View;

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$max:F

    iget v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$min:F

    sub-float/2addr v4, v5

    iget v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$step:F

    div-float/2addr v4, v5

    iget v5, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$min:F

    sub-float/2addr v5, v7

    iget v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$step:F

    div-float/2addr v5, v7

    invoke-static {v2, v3, v4, v5}, Lcom/daaw/avee/comp/Common/View/SimpleViewProgressBar;->SetProgress(Landroid/view/View;Landroid/view/View;FF)V

    .line 1023
    iget-boolean v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$detailed:Z

    if-eqz v2, :cond_4

    .line 1024
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$barX:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$barX:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    iget v3, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$min:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$step:F

    div-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 1025
    :cond_1
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$barY:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$barY:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    iget v3, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$min:F

    sub-float/2addr v3, v4

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$step:F

    div-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 1026
    :cond_2
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$editTxtX:[Landroid/widget/EditText;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "%.3f"

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$editTxtX:[Landroid/widget/EditText;

    aget-object v2, v2, v6

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v5, v0, [Ljava/lang/Object;

    iget v7, v1, Lcom/daaw/avee/Common/Vec2f;->x:F

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v4, v3, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1027
    :cond_3
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$editTxtY:[Landroid/widget/EditText;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->val$editTxtY:[Landroid/widget/EditText;

    aget-object p1, p1, v6

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, v1, Lcom/daaw/avee/Common/Vec2f;->y:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-static {v2, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 1030
    :cond_4
    iput-boolean v6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$18;->updating:Z

    return-void
.end method
