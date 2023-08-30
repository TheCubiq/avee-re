.class Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$4;
.super Ljava/lang/Object;
.source "VisualizerChooseDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$4;->this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    # # // get the text from the edit text
    # # String text = VisualizerChooseDialog.this.textCustomVizName.getText().toString();   
   
    
    # .line 173

    # iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$4;->this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    # # access1000

    # invoke-static {v0}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->access$1000(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;)Landroid/widget/EditText;

    # move-result-object v0

    # invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    # move-result-object v0

    # invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    # move-result-object v0

    # # // if the text is empty, set it to "empty"
    # # if (text.isEmpty()) {
    # #     text = "empty";
    # # }

    # const/4 v2, 0x0

    # invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    # move-result v2

    # # // if the text is empty, set v0 to "empty" instead

    # if-eqz v2, :cond_0

    # const-string v0, "empty"

    # :cond_0

    # # log the text (log.d("cubiq-dialogName", str);)

    # const-string v2, "cubiq-dialogName"

    # invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->onSaveToFileVisTemplateAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog$4;->this$0:Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->access$000(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;)Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
