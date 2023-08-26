.class Lorg/junit/runners/Parameterized$AssumptionViolationRunner;
.super Lorg/junit/runner/Runner;
.source "Parameterized.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runners/Parameterized;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AssumptionViolationRunner"
.end annotation


# instance fields
.field private final description:Lorg/junit/runner/Description;

.field private final exception:Lorg/junit/internal/AssumptionViolatedException;


# direct methods
.method constructor <init>(Lorg/junit/runners/model/TestClass;Ljava/lang/String;Lorg/junit/internal/AssumptionViolatedException;)V
    .locals 1

    .line 342
    invoke-direct {p0}, Lorg/junit/runner/Runner;-><init>()V

    .line 343
    invoke-virtual {p1}, Lorg/junit/runners/model/TestClass;->getJavaClass()Ljava/lang/Class;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "() assumption violation"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lorg/junit/runner/Description;->createTestDescription(Ljava/lang/Class;Ljava/lang/String;)Lorg/junit/runner/Description;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/runners/Parameterized$AssumptionViolationRunner;->description:Lorg/junit/runner/Description;

    .line 346
    iput-object p3, p0, Lorg/junit/runners/Parameterized$AssumptionViolationRunner;->exception:Lorg/junit/internal/AssumptionViolatedException;

    return-void
.end method


# virtual methods
.method public getDescription()Lorg/junit/runner/Description;
    .locals 1

    .line 351
    iget-object v0, p0, Lorg/junit/runners/Parameterized$AssumptionViolationRunner;->description:Lorg/junit/runner/Description;

    return-object v0
.end method

.method public run(Lorg/junit/runner/notification/RunNotifier;)V
    .locals 3

    .line 356
    new-instance v0, Lorg/junit/runner/notification/Failure;

    iget-object v1, p0, Lorg/junit/runners/Parameterized$AssumptionViolationRunner;->description:Lorg/junit/runner/Description;

    iget-object v2, p0, Lorg/junit/runners/Parameterized$AssumptionViolationRunner;->exception:Lorg/junit/internal/AssumptionViolatedException;

    invoke-direct {v0, v1, v2}, Lorg/junit/runner/notification/Failure;-><init>(Lorg/junit/runner/Description;Ljava/lang/Throwable;)V

    invoke-virtual {p1, v0}, Lorg/junit/runner/notification/RunNotifier;->fireTestAssumptionFailed(Lorg/junit/runner/notification/Failure;)V

    return-void
.end method
