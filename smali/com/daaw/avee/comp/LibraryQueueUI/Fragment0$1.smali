.class Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$1;
.super Ljava/lang/Object;
.source "Fragment0.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 97
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateLibraryAddress(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;Ljava/lang/String;)V

    return-void
.end method
