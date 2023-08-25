.class public final synthetic Lcom/daaw/iz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b01;


# static fields
.field public static final synthetic a:Lcom/daaw/iz;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/iz;

    invoke-direct {v0}, Lcom/daaw/iz;-><init>()V

    sput-object v0, Lcom/daaw/iz;->a:Lcom/daaw/iz;

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

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
