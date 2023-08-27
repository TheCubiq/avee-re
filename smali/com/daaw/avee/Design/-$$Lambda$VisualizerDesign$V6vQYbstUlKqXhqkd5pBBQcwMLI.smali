.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;


# static fields
.field public static final synthetic INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI;

    invoke-direct {v0}, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$VisualizerDesign$V6vQYbstUlKqXhqkd5pBBQcwMLI;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/avee/ContextData;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/VisualizerDesign;->lambda$new$0(Lcom/daaw/avee/ContextData;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
