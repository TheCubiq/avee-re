.class public Lcom/daaw/d70$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/d70;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/r60$a;)Lcom/daaw/r60;
    .locals 1

    new-instance v0, Lcom/daaw/r60;

    invoke-direct {v0, p1}, Lcom/daaw/r60;-><init>(Lcom/daaw/r60$a;)V

    return-object v0
.end method

.method public b()Lcom/daaw/c3;
    .locals 1

    new-instance v0, Lcom/daaw/c3;

    invoke-direct {v0}, Lcom/daaw/c3;-><init>()V

    return-object v0
.end method

.method public c(Landroid/graphics/Bitmap;Lcom/daaw/bc;)Lcom/daaw/z41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/bc;",
            ")",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/dc;

    invoke-direct {v0, p1, p2}, Lcom/daaw/dc;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/bc;)V

    return-object v0
.end method

.method public d()Lcom/daaw/b70;
    .locals 1

    new-instance v0, Lcom/daaw/b70;

    invoke-direct {v0}, Lcom/daaw/b70;-><init>()V

    return-object v0
.end method
