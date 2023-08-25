.class public final Lcom/daaw/sv8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/r84;

.field public final b:[I


# direct methods
.method public constructor <init>(Lcom/daaw/r84;[II)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length p3, p2

    if-nez p3, :cond_0

    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-direct {p3}, Ljava/lang/IllegalArgumentException;-><init>()V

    const-string v0, "ETSDefinition"

    const-string v1, "Empty tracks are not allowed"

    invoke-static {v0, v1, p3}, Lcom/daaw/s95;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput-object p1, p0, Lcom/daaw/sv8;->a:Lcom/daaw/r84;

    iput-object p2, p0, Lcom/daaw/sv8;->b:[I

    return-void
.end method
