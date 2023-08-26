.class Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;
.super Ljava/lang/Object;
.source "Fragment2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualUI/Fragment2$1;->onLayoutChange(Landroid/view/View;IIIIIIII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/comp/VisualUI/Fragment2$1;

.field final synthetic val$h:I

.field final synthetic val$w:I


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualUI/Fragment2$1;II)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;->this$1:Lcom/daaw/avee/comp/VisualUI/Fragment2$1;

    iput p2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;->val$w:I

    iput p3, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;->val$h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 83
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;->this$1:Lcom/daaw/avee/comp/VisualUI/Fragment2$1;

    iget-object v0, v0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    iget v1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;->val$w:I

    int-to-float v1, v1

    iget v2, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;->val$h:I

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateVideoSize(FF)V

    return-void
.end method
