.class public final Lcom/daaw/d14;
.super Lcom/daaw/e14;
.source ""


# instance fields
.field public final q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/e14;-><init>()V

    iput-object p1, p0, Lcom/daaw/d14;->q:Ljava/lang/Object;

    return-void
.end method

.method public static e(Ljava/lang/Object;)Lcom/daaw/d14;
    .locals 1

    new-instance v0, Lcom/daaw/d14;

    invoke-direct {v0, p0}, Lcom/daaw/d14;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final g()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/d14;->q:Ljava/lang/Object;

    invoke-virtual {p0, v0}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    return-void
.end method
