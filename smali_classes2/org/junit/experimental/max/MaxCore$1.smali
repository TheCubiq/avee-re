.class Lorg/junit/experimental/max/MaxCore$1;
.super Lorg/junit/runner/Request;
.source "MaxCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/experimental/max/MaxCore;->constructLeafRequest(Ljava/util/List;)Lorg/junit/runner/Request;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/junit/experimental/max/MaxCore;

.field final synthetic val$runners:Ljava/util/List;


# direct methods
.method constructor <init>(Lorg/junit/experimental/max/MaxCore;Ljava/util/List;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lorg/junit/experimental/max/MaxCore$1;->this$0:Lorg/junit/experimental/max/MaxCore;

    iput-object p2, p0, Lorg/junit/experimental/max/MaxCore$1;->val$runners:Ljava/util/List;

    invoke-direct {p0}, Lorg/junit/runner/Request;-><init>()V

    return-void
.end method


# virtual methods
.method public getRunner()Lorg/junit/runner/Runner;
    .locals 4

    const/4 v0, 0x0

    .line 114
    :try_start_0
    new-instance v1, Lorg/junit/experimental/max/MaxCore$1$1;

    move-object v2, v0

    check-cast v2, Ljava/lang/Class;

    iget-object v3, p0, Lorg/junit/experimental/max/MaxCore$1;->val$runners:Ljava/util/List;

    invoke-direct {v1, p0, v2, v3}, Lorg/junit/experimental/max/MaxCore$1$1;-><init>(Lorg/junit/experimental/max/MaxCore$1;Ljava/lang/Class;Ljava/util/List;)V
    :try_end_0
    .catch Lorg/junit/runners/model/InitializationError; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    .line 117
    new-instance v2, Lorg/junit/internal/runners/ErrorReportingRunner;

    invoke-direct {v2, v0, v1}, Lorg/junit/internal/runners/ErrorReportingRunner;-><init>(Ljava/lang/Class;Ljava/lang/Throwable;)V

    return-object v2
.end method
