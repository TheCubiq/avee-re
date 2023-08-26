.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
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

.field final synthetic val$bar:[Landroid/widget/SeekBar;

.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$detailed:Z

.field final synthetic val$editTxt:[Landroid/widget/EditText;

.field final synthetic val$lineBarBg:Landroid/view/View;

.field final synthetic val$lineBarValue:Landroid/view/View;

.field final synthetic val$max:F

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$step:F

.field final synthetic val$txtValue:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;FLandroid/widget/TextView;Landroid/view/View;Landroid/view/View;FFZ[Landroid/widget/SeekBar;[Landroid/widget/EditText;)V
    .locals 0

    .line 883
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$name:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$min:F

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$txtValue:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$lineBarBg:Landroid/view/View;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$lineBarValue:Landroid/view/View;

    iput p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$max:F

    iput p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$step:F

    iput-boolean p9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$detailed:Z

    iput-object p10, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$bar:[Landroid/widget/SeekBar;

    iput-object p11, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$editTxt:[Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 885
    iput-boolean p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->updating:Z

    return-void
.end method


# virtual methods
.method public onInvoke(Ljava/lang/Object;)V
    .locals 9

    .line 889
    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->updating:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 890
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->updating:Z

    .line 892
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$name:Ljava/lang/String;

    iget v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$min:F

    invoke-virtual {v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyFloat(Ljava/lang/String;F)F

    move-result v1

    .line 893
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$txtValue:Landroid/widget/TextView;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "%.3f"

    invoke-static {v3, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 894
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$lineBarBg:Landroid/view/View;

    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$lineBarValue:Landroid/view/View;

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$max:F

    iget v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$min:F

    sub-float/2addr v4, v7

    iget v8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$step:F

    div-float/2addr v4, v8

    sub-float v7, v1, v7

    div-float/2addr v7, v8

    invoke-static {v2, v3, v4, v7}, Lcom/daaw/avee/comp/Common/View/SimpleViewProgressBar;->SetProgress(Landroid/view/View;Landroid/view/View;FF)V

    .line 896
    iget-boolean v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$detailed:Z

    if-eqz v2, :cond_2

    .line 897
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$bar:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$bar:[Landroid/widget/SeekBar;

    aget-object v2, v2, v6

    iget v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$min:F

    sub-float v3, v1, v3

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$step:F

    div-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 898
    :cond_1
    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$editTxt:[Landroid/widget/EditText;

    aget-object v2, v2, v6

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->val$editTxt:[Landroid/widget/EditText;

    aget-object p1, p1, v6

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v6

    invoke-static {v2, v5, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 901
    :cond_2
    iput-boolean v6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$15;->updating:Z

    return-void
.end method
