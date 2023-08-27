.class Lcom/daaw/avee/MainActivity$4;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    .line 398
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$4;->this$0:Lcom/daaw/avee/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVisibilityChange(Z)V
    .locals 3

    if-eqz p1, :cond_0

    .line 402
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$4;->this$0:Lcom/daaw/avee/MainActivity;

    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestShouldShowControls:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v2, p0, Lcom/daaw/avee/MainActivity$4;->this$0:Lcom/daaw/avee/MainActivity;

    iget v2, v2, Lcom/daaw/avee/MainActivity;->currentFragmentPage:I

    invoke-static {p1, v0, v2, v1}, Lcom/daaw/avee/MainActivity;->access$100(Lcom/daaw/avee/MainActivity;ZIZ)V

    :cond_0
    return-void
.end method
