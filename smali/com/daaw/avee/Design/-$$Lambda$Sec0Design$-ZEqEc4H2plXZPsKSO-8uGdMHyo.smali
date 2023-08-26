.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakDelegateR1$Handler;


# static fields
.field public static final synthetic INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/avee/Design/-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo;

    invoke-direct {v0}, Lcom/daaw/avee/Design/-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/avee/Design/Sec0Design;->lambda$new$0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
