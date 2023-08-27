.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewInt(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;II)V
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

.field final synthetic val$max:I

.field final synthetic val$min:I

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$txtValue:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;ILandroid/widget/TextView;Landroid/view/View;Landroid/view/View;IZ[Landroid/widget/SeekBar;[Landroid/widget/EditText;)V
    .locals 0

    .line 657
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$name:Ljava/lang/String;

    iput p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$min:I

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$txtValue:Landroid/widget/TextView;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$lineBarBg:Landroid/view/View;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$lineBarValue:Landroid/view/View;

    iput p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$max:I

    iput-boolean p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$detailed:Z

    iput-object p9, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$bar:[Landroid/widget/SeekBar;

    iput-object p10, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$editTxt:[Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 658
    iput-boolean p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->updating:Z

    return-void
.end method


# virtual methods
.method public onInvoke(Ljava/lang/Object;)V
    .locals 6

    .line 662
    iget-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->updating:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 663
    iput-boolean v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->updating:Z

    .line 665
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$name:Ljava/lang/String;

    iget v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$min:I

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v0

    .line 666
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$txtValue:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 667
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$lineBarBg:Landroid/view/View;

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$lineBarValue:Landroid/view/View;

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$max:I

    iget v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$min:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    sub-int v5, v0, v5

    int-to-float v5, v5

    invoke-static {v1, v2, v4, v5}, Lcom/daaw/avee/comp/Common/View/SimpleViewProgressBar;->SetProgress(Landroid/view/View;Landroid/view/View;FF)V

    .line 669
    iget-boolean v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$detailed:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 670
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$bar:[Landroid/widget/SeekBar;

    aget-object v1, v1, v2

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$bar:[Landroid/widget/SeekBar;

    aget-object v1, v1, v2

    iget v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$min:I

    sub-int v4, v0, v4

    invoke-virtual {v1, v4}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 671
    :cond_1
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$editTxt:[Landroid/widget/EditText;

    aget-object v1, v1, v2

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->val$editTxt:[Landroid/widget/EditText;

    aget-object p1, p1, v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 674
    :cond_2
    iput-boolean v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$12;->updating:Z

    return-void
.end method
