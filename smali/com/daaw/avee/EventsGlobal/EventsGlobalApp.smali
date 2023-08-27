.class public Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;
.super Ljava/lang/Object;
.source "EventsGlobalApp.java"


# static fields
.field public static onUITick1:Lcom/daaw/avee/Common/Events/WeakEvent;

.field public static onUITick10:Lcom/daaw/avee/Common/Events/WeakEvent;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;->onUITick1:Lcom/daaw/avee/Common/Events/WeakEvent;

    .line 12
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent;-><init>()V

    sput-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalApp;->onUITick10:Lcom/daaw/avee/Common/Events/WeakEvent;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
