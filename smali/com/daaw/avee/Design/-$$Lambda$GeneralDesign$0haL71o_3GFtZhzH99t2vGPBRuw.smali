.class public final synthetic Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


# static fields
.field public static final synthetic INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw;

    invoke-direct {v0}, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$GeneralDesign$0haL71o_3GFtZhzH99t2vGPBRuw;

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

    invoke-static {p1}, Lcom/daaw/avee/Design/GeneralDesign;->lambda$new$1(Ljava/lang/Object;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method
