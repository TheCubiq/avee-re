.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$3;
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
        "Ljava/lang/Boolean;",
        "Ljava/lang/Class<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$3;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 138
    const-class v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened0:I

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    goto :goto_0

    .line 140
    :cond_0
    const-class v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 141
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_uiSectionOpened1:I

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    .line 143
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$3;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateLibraryItems()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 134
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$3;->invoke(Ljava/lang/Boolean;Ljava/lang/Class;)V

    return-void
.end method
