.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/LibraryQueueUIDesign;-><init>()V
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
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 373
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 2

    .line 376
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_followCurrentState:I

    if-ne v0, v1, :cond_0

    .line 377
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onFollowCurrentValueChanged(Z)V

    goto :goto_0

    .line 378
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_showAlbumArtInstead:I

    if-ne v0, v1, :cond_1

    .line 379
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onShowAlbumArtValueChanged(Z)V

    .line 381
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateLibraryItems()V

    .line 382
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateQueueItems()V

    goto :goto_0

    .line 383
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_disableHeaderAds:I

    if-ne p1, p2, :cond_2

    .line 384
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateLibraryItems()V

    .line 385
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateQueueItems()V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 373
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;->invoke(Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method
