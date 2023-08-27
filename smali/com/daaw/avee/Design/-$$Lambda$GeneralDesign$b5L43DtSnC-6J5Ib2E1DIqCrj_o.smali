.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;


# static fields
.field public static final synthetic INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o;

    invoke-direct {v0}, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$b5L43DtSnC-6J5Ib2E1DIqCrj_o;

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

    check-cast p2, Landroid/content/Intent;

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/GeneralDesign;->lambda$new$2(Lcom/daaw/avee/ContextData;Landroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
