.class public final enum Lcom/daaw/qt;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/daaw/qt;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum p:Lcom/daaw/qt;

.field public static final synthetic q:[Lcom/daaw/qt;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/qt;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/qt;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/daaw/qt;->p:Lcom/daaw/qt;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/daaw/qt;

    aput-object v0, v1, v2

    sput-object v1, Lcom/daaw/qt;->q:[Lcom/daaw/qt;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/daaw/qt;
    .locals 1

    const-class v0, Lcom/daaw/qt;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/daaw/qt;

    return-object p0
.end method

.method public static values()[Lcom/daaw/qt;
    .locals 1

    sget-object v0, Lcom/daaw/qt;->q:[Lcom/daaw/qt;

    invoke-virtual {v0}, [Lcom/daaw/qt;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/qt;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "DirectExecutor"

    return-object v0
.end method
