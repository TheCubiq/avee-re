.class Lcom/daaw/avee/Design/LibraryQueueUIDesign$14;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
        "Landroid/widget/ImageView;",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 327
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$14;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 1

    .line 330
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign$14;->this$0:Lcom/daaw/avee/Design/LibraryQueueUIDesign;

    invoke-static {v0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->access$300(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 327
    check-cast p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    check-cast p2, Landroid/widget/ImageView;

    check-cast p3, Ljava/lang/Boolean;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$14;->invoke(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method
