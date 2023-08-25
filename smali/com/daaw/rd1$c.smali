.class public Lcom/daaw/rd1$c;
.super Lcom/daaw/ra;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/rd1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/ra<",
        "Lcom/daaw/rd1$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ra;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/daaw/ay0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rd1$c;->d()Lcom/daaw/rd1$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/daaw/rd1$b;
    .locals 1

    new-instance v0, Lcom/daaw/rd1$b;

    invoke-direct {v0, p0}, Lcom/daaw/rd1$b;-><init>(Lcom/daaw/rd1$c;)V

    return-object v0
.end method

.method public e(ILandroid/graphics/Bitmap$Config;)Lcom/daaw/rd1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ra;->b()Lcom/daaw/ay0;

    move-result-object v0

    check-cast v0, Lcom/daaw/rd1$b;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/rd1$b;->c(ILandroid/graphics/Bitmap$Config;)V

    return-object v0
.end method
