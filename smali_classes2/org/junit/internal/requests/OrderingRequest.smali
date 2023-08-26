.class public Lorg/junit/internal/requests/OrderingRequest;
.super Lorg/junit/internal/requests/MemoizingRequest;
.source "OrderingRequest.java"


# instance fields
.field private final ordering:Lorg/junit/runner/manipulation/Ordering;

.field private final request:Lorg/junit/runner/Request;


# direct methods
.method public constructor <init>(Lorg/junit/runner/Request;Lorg/junit/runner/manipulation/Ordering;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lorg/junit/internal/requests/MemoizingRequest;-><init>()V

    .line 15
    iput-object p1, p0, Lorg/junit/internal/requests/OrderingRequest;->request:Lorg/junit/runner/Request;

    .line 16
    iput-object p2, p0, Lorg/junit/internal/requests/OrderingRequest;->ordering:Lorg/junit/runner/manipulation/Ordering;

    return-void
.end method


# virtual methods
.method protected createRunner()Lorg/junit/runner/Runner;
    .locals 3

    .line 21
    iget-object v0, p0, Lorg/junit/internal/requests/OrderingRequest;->request:Lorg/junit/runner/Request;

    invoke-virtual {v0}, Lorg/junit/runner/Request;->getRunner()Lorg/junit/runner/Runner;

    move-result-object v0

    .line 23
    :try_start_0
    iget-object v1, p0, Lorg/junit/internal/requests/OrderingRequest;->ordering:Lorg/junit/runner/manipulation/Ordering;

    invoke-virtual {v1, v0}, Lorg/junit/runner/manipulation/Ordering;->apply(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/junit/runner/manipulation/InvalidOrderingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 25
    new-instance v1, Lorg/junit/internal/runners/ErrorReportingRunner;

    iget-object v2, p0, Lorg/junit/internal/requests/OrderingRequest;->ordering:Lorg/junit/runner/manipulation/Ordering;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/junit/internal/runners/ErrorReportingRunner;-><init>(Ljava/lang/Class;Ljava/lang/Throwable;)V

    return-object v1
.end method
