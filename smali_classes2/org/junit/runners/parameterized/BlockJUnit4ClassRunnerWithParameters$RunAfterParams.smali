.class Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters$RunAfterParams;
.super Lorg/junit/internal/runners/statements/RunAfters;
.source "BlockJUnit4ClassRunnerWithParameters.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RunAfterParams"
.end annotation


# instance fields
.field final synthetic this$0:Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters;


# direct methods
.method constructor <init>(Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters;Lorg/junit/runners/model/Statement;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/runners/model/Statement;",
            "Ljava/util/List<",
            "Lorg/junit/runners/model/FrameworkMethod;",
            ">;)V"
        }
    .end annotation

    .line 179
    iput-object p1, p0, Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters$RunAfterParams;->this$0:Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters;

    const/4 p1, 0x0

    .line 180
    invoke-direct {p0, p2, p3, p1}, Lorg/junit/internal/runners/statements/RunAfters;-><init>(Lorg/junit/runners/model/Statement;Ljava/util/List;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected invokeMethod(Lorg/junit/runners/model/FrameworkMethod;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 185
    invoke-virtual {p1}, Lorg/junit/runners/model/FrameworkMethod;->getMethod()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 186
    move-object v0, v1

    check-cast v0, [Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters$RunAfterParams;->this$0:Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters;

    invoke-static {v0}, Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters;->access$000(Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParameters;)[Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v1, v0}, Lorg/junit/runners/model/FrameworkMethod;->invokeExplosively(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
