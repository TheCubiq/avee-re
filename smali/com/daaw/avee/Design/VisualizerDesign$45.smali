.class Lcom/daaw/avee/Design/VisualizerDesign$45;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent5$Handler<",
        "Landroid/app/Fragment;",
        "Landroid/widget/TextView;",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 1131
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$45;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/app/Fragment;Landroid/widget/TextView;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Fragment;",
            "Landroid/widget/TextView;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1134
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p5

    invoke-virtual {p5}, Landroid/app/Activity;->isFinishing()Z

    move-result p5

    if-eqz p5, :cond_0

    goto :goto_0

    .line 1136
    :cond_0
    iget-object p5, p0, Lcom/daaw/avee/Design/VisualizerDesign$45;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {p5, v0}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1802(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    .line 1137
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$45;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p2, p3}, Lcom/daaw/avee/Design/VisualizerDesign;->access$1902(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/util/List;)Ljava/util/List;

    .line 1138
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerDesign$45;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-static {p2, p4}, Lcom/daaw/avee/Design/VisualizerDesign;->access$2002(Lcom/daaw/avee/Design/VisualizerDesign;Ljava/lang/String;)Ljava/lang/String;

    .line 1140
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x13

    const-string p4, "image/*"

    if-ge p2, p3, :cond_1

    .line 1141
    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    .line 1142
    invoke-virtual {p2, p4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string p3, "android.intent.action.GET_CONTENT"

    .line 1143
    invoke-virtual {p2, p3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1145
    invoke-virtual {p1}, Landroid/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const p4, 0x7f1001a3

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p2

    const/16 p3, 0x2b

    .line 1144
    invoke-virtual {p1, p2, p3}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    .line 1148
    :cond_1
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.intent.action.OPEN_DOCUMENT"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p3, "android.intent.category.OPENABLE"

    .line 1149
    invoke-virtual {p2, p3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1150
    invoke-virtual {p2, p4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const/4 p3, 0x1

    .line 1151
    invoke-virtual {p2, p3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const/16 p3, 0x2c

    .line 1155
    invoke-virtual {p1, p2, p3}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1131
    check-cast p1, Landroid/app/Fragment;

    check-cast p2, Landroid/widget/TextView;

    check-cast p3, Ljava/util/List;

    check-cast p4, Ljava/lang/String;

    check-cast p5, Ljava/lang/String;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/Design/VisualizerDesign$45;->invoke(Landroid/app/Fragment;Landroid/widget/TextView;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
