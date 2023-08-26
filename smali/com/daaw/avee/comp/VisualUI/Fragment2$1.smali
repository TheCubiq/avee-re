.class Lcom/daaw/avee/comp/VisualUI/Fragment2$1;
.super Ljava/lang/Object;
.source "Fragment2.java"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


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

    .line 73
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    .line 80
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualUI/Fragment2$1;->this$0:Lcom/daaw/avee/comp/VisualUI/Fragment2;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->access$000(Lcom/daaw/avee/comp/VisualUI/Fragment2;)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;

    invoke-direct {p2, p0, p4, p5}, Lcom/daaw/avee/comp/VisualUI/Fragment2$1$1;-><init>(Lcom/daaw/avee/comp/VisualUI/Fragment2$1;II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
