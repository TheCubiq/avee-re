.class public Lcom/daaw/avee/Design/RingtoneDesign;
.super Ljava/lang/Object;
.source "RingtoneDesign.java"


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/Design/RingtoneDesign;->listenerRefHolder:Ljava/util/List;

    .line 28
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onSetAsRingtone:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/RingtoneDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/RingtoneDesign$1;-><init>(Lcom/daaw/avee/Design/RingtoneDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/RingtoneDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    return-void
.end method
