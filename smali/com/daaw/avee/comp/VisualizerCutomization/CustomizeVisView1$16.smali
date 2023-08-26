.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewFloat(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;FFF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$bar:[Landroid/widget/SeekBar;

.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$min:F

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$step:F

.field final synthetic val$updateValue:Lcom/daaw/avee/Common/Action1;

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;


# direct methods
.method constructor <init>(FFLcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Action1;[Landroid/widget/SeekBar;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    .line 909
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$step:F

    iput p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$min:F

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$name:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iput-object p7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$bar:[Landroid/widget/SeekBar;

    iput-object p8, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 0

    if-eqz p3, :cond_0

    int-to-float p1, p2

    .line 914
    iget p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$step:F

    mul-float p1, p1, p2

    iget p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$min:F

    add-float/2addr p1, p2

    .line 917
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$name:Ljava/lang/String;

    invoke-virtual {p2, p3, p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyFloatValue(Ljava/lang/String;F)V

    .line 918
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    .line 920
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$updateValue:Lcom/daaw/avee/Common/Action1;

    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$bar:[Landroid/widget/SeekBar;

    const/4 p3, 0x0

    aget-object p2, p2, p3

    invoke-interface {p1, p2}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 922
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$16;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    .line 923
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
