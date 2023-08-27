.class Lcom/daaw/avee/comp/VisualUI/Fragment2$8;
.super Ljava/lang/Object;
.source "Fragment2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualUI/Fragment2;->updateSurfaceVisibility(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualUI/Fragment2;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$8;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 219
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$8;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->access$200(Lcom/daaw/avee/comp/VisualUI/Fragment2;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 220
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$8;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->access$300(Lcom/daaw/avee/comp/VisualUI/Fragment2;)Landroid/view/SurfaceView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setVisibility(I)V

    .line 221
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$8;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->access$300(Lcom/daaw/avee/comp/VisualUI/Fragment2;)Landroid/view/SurfaceView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    .line 222
    sget-object v1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoSurfaceHolderCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
