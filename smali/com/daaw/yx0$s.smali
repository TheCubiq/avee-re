.class public Lcom/daaw/yx0$s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o81$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yx0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/o81$b<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yx0$s;->c(Ljava/lang/String;Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/String;Ljava/io/File;)Z
    .locals 0

    invoke-static {p2}, Lcom/daaw/cr1;->i(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/kx0;->a(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
