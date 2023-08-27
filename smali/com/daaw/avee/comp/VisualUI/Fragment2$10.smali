.class Lcom/daaw/avee/comp/VisualUI/Fragment2$10;
.super Ljava/lang/Object;
.source "Fragment2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualUI/Fragment2;->setVideoSizeTh(F)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

.field final synthetic val$widthHeightRatio:F


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;F)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$10;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    iput p2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$10;->val$widthHeightRatio:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 283
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$10;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    iget v1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$10;->val$widthHeightRatio:F

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->access$602(Lcom/daaw/avee/comp/VisualUI/Fragment2;F)F

    .line 284
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$10;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->access$000(Lcom/daaw/avee/comp/VisualUI/Fragment2;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$10;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-static {v2}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->access$000(Lcom/daaw/avee/comp/VisualUI/Fragment2;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateVideoSize(FF)V

    return-void
.end method
