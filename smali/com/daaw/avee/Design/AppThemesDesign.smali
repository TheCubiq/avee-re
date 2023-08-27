.class public Lcom/daaw/avee/Design/AppThemesDesign;
.super Ljava/lang/Object;
.source "AppThemesDesign.java"


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

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/AppThemesDesign;->listenerRefHolder:Ljava/util/List;

    .line 25
    sget-object v0, Lcom/daaw/avee/SettingsActivity;->onPrefAppThemeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/AppThemesDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/AppThemesDesign$1;-><init>(Lcom/daaw/avee/Design/AppThemesDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AppThemesDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 35
    sget-object v0, Lcom/daaw/avee/MainActivity;->onCreate:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/AppThemesDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/AppThemesDesign$2;-><init>(Lcom/daaw/avee/Design/AppThemesDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/AppThemesDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    return-void
.end method
