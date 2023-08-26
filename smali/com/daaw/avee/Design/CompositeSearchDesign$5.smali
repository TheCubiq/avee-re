.class Lcom/daaw/avee/Design/CompositeSearchDesign$5;
.super Ljava/lang/Object;
.source "CompositeSearchDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/daaw/avee/Design/CompositeSearchDesign$5;->this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;)V
    .locals 5

    .line 100
    invoke-static {}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->getInstance()Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 103
    :cond_0
    sget-object v1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    .line 105
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-nez v2, :cond_1

    .line 106
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 107
    invoke-virtual {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->getSearchEntryOptions()Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    move-result-object v1

    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    .line 110
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment1Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 111
    invoke-virtual {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->getSearchEntryOptions()Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    move-result-object v1

    .line 114
    :cond_2
    :goto_0
    sget-object v2, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->refuse:Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;

    if-eq v1, v2, :cond_4

    if-eqz v1, :cond_3

    .line 116
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-boolean v3, v1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->enabled:Z

    iget-object v4, v1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->hint:Ljava/lang/String;

    iget-object v1, v1, Lcom/daaw/avee/comp/GlobalSearch/SearchEntryOptions;->containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->onUpdateSearchOptions(IZLjava/lang/String;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    goto :goto_1

    .line 118
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    invoke-virtual {v0, v1, v2, v4, v3}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->onUpdateSearchOptions(IZLjava/lang/String;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 121
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->onSetCurrentSearchIndex(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 96
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/CompositeSearchDesign$5;->invoke(Ljava/lang/Integer;)V

    return-void
.end method
