.class Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2$2;
.super Ljava/lang/Object;
.source "LogoMark2.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func1<",
        "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
        "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;
    .locals 0

    .line 75
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2$2;->this$0:Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;->access$100(Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2;)Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic onInvoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 72
    check-cast p1, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/LogoMark2$2;->onInvoke(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;)Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    move-result-object p1

    return-object p1
.end method
