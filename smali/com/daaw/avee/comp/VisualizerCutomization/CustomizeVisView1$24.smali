.class final Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->createPropertyViewText(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Landroid/view/LayoutInflater;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;ZLcom/daaw/avee/Common/Func/Func;Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

.field final synthetic val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field final synthetic val$name:Ljava/lang/String;

.field final synthetic val$txtValue:Landroid/widget/TextView;

.field final synthetic val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;


# direct methods
.method constructor <init>(Landroid/widget/TextView;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/Common/Func/Func;)V
    .locals 0

    .line 1195
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$txtValue:Landroid/widget/TextView;

    iput-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iput-object p3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$name:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iput-object p5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1215
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 1217
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$txtValue:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1219
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$customData:Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$name:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringValue(Ljava/lang/String;Ljava/lang/String;)V

    .line 1220
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onPropertyChanged()V

    .line 1222
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$24;->val$updateView1ValueCb:Lcom/daaw/avee/Common/Func/Func;

    invoke-interface {p1}, Lcom/daaw/avee/Common/Func/Func;->onInvoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/Common/Action1;

    if-eqz p1, :cond_0

    .line 1223
    invoke-interface {p1, p0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public hashCode()I
    .locals 1

    .line 1199
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
