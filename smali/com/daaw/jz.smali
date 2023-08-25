.class public final synthetic Lcom/daaw/jz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b01;


# static fields
.field public static final synthetic a:Lcom/daaw/jz;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/jz;

    invoke-direct {v0}, Lcom/daaw/jz;-><init>()V

    sput-object v0, Lcom/daaw/jz;->a:Lcom/daaw/jz;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
