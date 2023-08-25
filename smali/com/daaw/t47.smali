.class public final Lcom/daaw/t47;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/t47;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/t47;

    new-instance v1, Lcom/daaw/t47$a;

    const-string v2, "Failure occurred while trying to finish a future."

    invoke-direct {v1, v2}, Lcom/daaw/t47$a;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/daaw/t47;-><init>(Ljava/lang/Throwable;)V

    sput-object v0, Lcom/daaw/t47;->b:Lcom/daaw/t47;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/t47;->a:Ljava/lang/Throwable;

    return-void
.end method
