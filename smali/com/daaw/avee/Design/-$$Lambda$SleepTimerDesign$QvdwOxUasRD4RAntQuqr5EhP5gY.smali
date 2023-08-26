.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$SleepTimerDesign$QvdwOxUasRD4RAntQuqr5EhP5gY;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# static fields
.field public static final synthetic INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$SleepTimerDesign$QvdwOxUasRD4RAntQuqr5EhP5gY;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/avee/Design/-$$Lambda$SleepTimerDesign$QvdwOxUasRD4RAntQuqr5EhP5gY;

    invoke-direct {v0}, Lcom/daaw/avee/Design/-$$Lambda$SleepTimerDesign$QvdwOxUasRD4RAntQuqr5EhP5gY;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/-$$Lambda$SleepTimerDesign$QvdwOxUasRD4RAntQuqr5EhP5gY;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$SleepTimerDesign$QvdwOxUasRD4RAntQuqr5EhP5gY;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/daaw/avee/Design/SleepTimerDesign;->lambda$new$0()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    return-object v0
.end method
