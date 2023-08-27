.class Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;
.super Ljava/lang/Object;
.source "SystemUiHiderHoneycomb.java"

# interfaces
.implements Landroid/view/View$OnSystemUiVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;->this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSystemUiVisibilityChange(I)V
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;->this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    invoke-static {v0}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->access$000(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;)I

    move-result v0

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    .line 56
    iget-object p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;->this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    iget-object p1, p1, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mOnVisibilityChangeListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;->onVisibilityChange(Z)V

    .line 57
    iget-object p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;->this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->access$102(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;Z)Z

    goto :goto_0

    .line 60
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;->this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    iget-object p1, p1, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mAnchorView:Landroid/view/View;

    iget-object v0, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;->this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    invoke-static {v0}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->access$200(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 72
    iget-object p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;->this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    iget-object p1, p1, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->mOnVisibilityChangeListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;->onVisibilityChange(Z)V

    .line 73
    iget-object p1, p0, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb$1;->this$0:Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;

    invoke-static {p1, v0}, Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;->access$102(Lcom/daaw/avee/Common/SystemUiHiderHoneycomb;Z)Z

    :goto_0
    return-void
.end method
