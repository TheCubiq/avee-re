.class public final synthetic Lcom/daaw/fz;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gi;


# static fields
.field public static final synthetic a:Lcom/daaw/fz;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/fz;

    invoke-direct {v0}, Lcom/daaw/fz;-><init>()V

    sput-object v0, Lcom/daaw/fz;->a:Lcom/daaw/fz;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/bi;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->f(Lcom/daaw/bi;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    return-object p1
.end method
