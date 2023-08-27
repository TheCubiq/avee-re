.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR3$Handler;


# static fields
.field public static final synthetic INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68;

    invoke-direct {v0}, Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    check-cast p3, Ljava/lang/String;

    invoke-static {p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->lambda$new$0(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;

    move-result-object p1

    return-object p1
.end method
