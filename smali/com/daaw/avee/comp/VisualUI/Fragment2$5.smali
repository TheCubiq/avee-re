.class Lcom/daaw/avee/comp/VisualUI/Fragment2$5;
.super Ljava/lang/Object;
.source "Fragment2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualUI/Fragment2;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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

    .line 125
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$5;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 128
    sget-object p1, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onVideoElementInteracted:Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-virtual {p1}, Lcom/daaw/avee/Common/Events/WeakEvent;->invoke()V

    return-void
.end method
