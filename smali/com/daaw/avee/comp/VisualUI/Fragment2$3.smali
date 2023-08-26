.class Lcom/daaw/avee/comp/VisualUI/Fragment2$3;
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

    .line 103
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$3;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 106
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onCustomizeAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/ContextData;

    invoke-direct {v1, p1}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
