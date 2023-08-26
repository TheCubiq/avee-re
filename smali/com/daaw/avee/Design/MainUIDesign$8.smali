.class Lcom/daaw/avee/Design/MainUIDesign$8;
.super Ljava/lang/Object;
.source "MainUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/MainUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/MainUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$8;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;)V
    .locals 0

    .line 135
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 136
    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateForBackwardLibraryAddress()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 129
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/MainUIDesign$8;->invoke(Landroid/content/Context;)V

    return-void
.end method
