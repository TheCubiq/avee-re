.class Lcom/daaw/avee/Design/CompositeSearchDesign$2;
.super Ljava/lang/Object;
.source "CompositeSearchDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/daaw/avee/Design/CompositeSearchDesign$2;->this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-static {}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->getInstance()Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 72
    :cond_0
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->onSearchQueryTextChange(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 66
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/CompositeSearchDesign$2;->invoke(Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method
