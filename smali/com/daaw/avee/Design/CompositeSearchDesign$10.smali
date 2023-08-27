.class Lcom/daaw/avee/Design/CompositeSearchDesign$10;
.super Ljava/lang/Object;
.source "CompositeSearchDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/CompositeSearchDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Landroid/os/AsyncTask;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/daaw/avee/Design/CompositeSearchDesign$10;->this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/os/AsyncTask;Ljava/lang/Integer;Ljava/lang/Object;)V
    .locals 0

    .line 171
    invoke-static {}, Lcom/daaw/avee/Design/CompositeSearchDesign;->access$000()Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p3, p1, p2}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;->setTask(Landroid/os/AsyncTask;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 168
    check-cast p1, Landroid/os/AsyncTask;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/CompositeSearchDesign$10;->invoke(Landroid/os/AsyncTask;Ljava/lang/Integer;Ljava/lang/Object;)V

    return-void
.end method
