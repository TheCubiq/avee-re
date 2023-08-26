.class public Lcom/daaw/avee/Design/WidgetAndNotificationDesign;
.super Ljava/lang/Object;
.source "WidgetAndNotificationDesign.java"


# static fields
.field static instance:Lcom/daaw/avee/Design/WidgetAndNotificationDesign;


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
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Lcom/daaw/avee/Design/WidgetAndNotificationDesign;

    invoke-direct {v0}, Lcom/daaw/avee/Design/WidgetAndNotificationDesign;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/WidgetAndNotificationDesign;->instance:Lcom/daaw/avee/Design/WidgetAndNotificationDesign;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/WidgetAndNotificationDesign;->listenerRefHolder:Ljava/util/List;

    .line 27
    sget-object v0, Lcom/daaw/avee/comp/playback/view/MediaPlaybackNotification;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v1, Lcom/daaw/avee/Design/WidgetAndNotificationDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/WidgetAndNotificationDesign$1;-><init>(Lcom/daaw/avee/Design/WidgetAndNotificationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/WidgetAndNotificationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    return-void
.end method

.method public static createInstance()Lcom/daaw/avee/Design/WidgetAndNotificationDesign;
    .locals 1

    .line 54
    sget-object v0, Lcom/daaw/avee/Design/WidgetAndNotificationDesign;->instance:Lcom/daaw/avee/Design/WidgetAndNotificationDesign;

    return-object v0
.end method
