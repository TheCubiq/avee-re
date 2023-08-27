.class Lcom/daaw/avee/Design/MainUIDesign$9;
.super Ljava/lang/Object;
.source "MainUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Float;",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/MainUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 0

    .line 142
    iput-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$9;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Float;Landroid/content/Context;)V
    .locals 0

    .line 148
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 149
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->navigateForBackwardProgress(F)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 142
    check-cast p1, Ljava/lang/Float;

    check-cast p2, Landroid/content/Context;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/MainUIDesign$9;->invoke(Ljava/lang/Float;Landroid/content/Context;)V

    return-void
.end method
