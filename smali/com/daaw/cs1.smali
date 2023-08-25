.class public Lcom/daaw/cs1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static c:Lcom/daaw/cs1;

.field public static d:Lcom/daaw/cs1;

.field public static e:Lcom/daaw/cs1;


# instance fields
.field public a:I

.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/cs1;

    const v1, -0x7fffffff

    invoke-direct {v0, v1, v1}, Lcom/daaw/cs1;-><init>(II)V

    sput-object v0, Lcom/daaw/cs1;->c:Lcom/daaw/cs1;

    new-instance v0, Lcom/daaw/cs1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lcom/daaw/cs1;-><init>(II)V

    sput-object v0, Lcom/daaw/cs1;->d:Lcom/daaw/cs1;

    new-instance v0, Lcom/daaw/cs1;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Lcom/daaw/cs1;-><init>(II)V

    sput-object v0, Lcom/daaw/cs1;->e:Lcom/daaw/cs1;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/cs1;->a:I

    iput p2, p0, Lcom/daaw/cs1;->b:I

    return-void
.end method
