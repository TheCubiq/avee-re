.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$10;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 278
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$10;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 281
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefRemoveLibraryFolder(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 282
    iget-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$10;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-virtual {p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateLibraryItems()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 278
    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$10;->invoke(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
